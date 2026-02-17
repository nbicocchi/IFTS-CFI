package org.example.demobb;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import org.example.demobb.persistence.model.Person;
import org.example.demobb.persistence.repository.PersonRepository;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class HelloController {
    @FXML private ListView<Person> lvPersons;
    @FXML private TextField tfLastname;
    @FXML private TextField tfName;
    @FXML private TextField tfPhone;
    PersonRepository personRepository;

    public void initialize() {
        personRepository = new PersonRepository();
    }

    @FXML
    void onAddClicked(ActionEvent event) {
        Person p = new Person(tfName.getText(),
                tfLastname.getText(),
                tfPhone.getText());
        lvPersons.getItems().add(p);
        personRepository.save(p);
    }

    @FXML
    void onModilyClicked(ActionEvent event) {
        Person p = new Person(tfName.getText(),
                tfLastname.getText(),
                tfPhone.getText());
        int indexToUpdate = lvPersons.getSelectionModel().getSelectedIndex();
        Person personToUpdate = lvPersons.getItems().get(indexToUpdate);
        lvPersons.getItems().set(indexToUpdate, p);
        personRepository.save(p);
    }

    @FXML
    void onRemoveClicked(ActionEvent event) {
        int indexToRemovre = lvPersons.getSelectionModel().getSelectedIndex();
        Person p = lvPersons.getItems().get(indexToRemovre);
        lvPersons.getItems().remove(p);
        personRepository.delete(p);
    }

    @FXML
    void onOpenClicked(ActionEvent event) {
        // Crea un FileChooser per scegliere il file da aprire
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Apri file JSON");

        // Mostra la finestra di dialogo per aprire
        File file = fileChooser.showOpenDialog(null);

        if (file != null) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                // Legge la lista di persone dal file JSON
                List<Person> persons = mapper.readValue(
                        file,
                        new TypeReference<List<Person>>() {}
                );

                // Aggiorna la ListView
                lvPersons.getItems().setAll(persons);

                System.out.println("File caricato da: " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void onCloseClicked(ActionEvent event) {
        System.out.println("close");
    }

    @FXML
    void onSaveClicked(ActionEvent event) {
        // Crea un FileChooser per far scegliere dove salvare
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Salva file JSON");

        // Mostra la finestra di dialogo per salvare
        File file = fileChooser.showSaveDialog(null);

        if (file != null) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                // Scrivi la lista di persone in JSON
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, lvPersons.getItems());
                System.out.println("File salvato in: " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
