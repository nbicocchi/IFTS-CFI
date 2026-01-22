package org.example.demobb;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Canvas root;
    AnimationTimer timer;
    double x = 100;
    double y = 100;
    double xSpeed = 0.1;
    double ySpeed = 0.0;

    @FXML
    public void initialize() {
        initializeTimer();
        initializeKeys();
    }

    void initializeKeys() {
        root.setFocusTraversable(true);
        root.requestFocus();

        root.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.A) {
                xSpeed = -0.1;
            } else if (event.getCode() == KeyCode.S) {
                xSpeed = 0.1;
            }
        });
    }

    void initializeTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                mainLoop();
            }
        };
        timer.start();
    }

    public void mainLoop() {
        GraphicsContext gc = root.getGraphicsContext2D();

        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, root.getWidth(), root.getHeight());

        gc.setFill(Color.RED);
        gc.fillOval(x, y,10, 10);
        x += xSpeed;
        y += ySpeed;
    }
}
