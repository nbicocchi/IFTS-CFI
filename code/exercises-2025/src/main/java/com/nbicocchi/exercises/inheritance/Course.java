package com.nbicocchi.exercises.inheritance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    String code;
    String name;
    double lenght;
    Teacher teacher;
    List<Student> students;

    public Course(String code, String name, double lenght, Teacher teacher, List<Student> students) {
        this.code = code;
        this.name = name;
        this.lenght = lenght;
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", lenght=" + lenght +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }

    public static void main(String[] args) {
        List<Student> l = List.of(
          new Student("Luca", "Verdi", "College", LocalDate.of(2000, 1, 1)),
          new Student("Gianni", "Rossi", "College", LocalDate.of(2002, 1, 1))
        );

        Course c1 = new Course("CS001",
                "Machine Learning Adv.",
                80,
                new Teacher("Mario", "Rossi", "Math", 70),
                l);
        System.out.println(c1);
    }
}
