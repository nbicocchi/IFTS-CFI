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
    Ball ball;

    @FXML
    public void initialize() {
        initializeObjects();
        initializeTimer();
        initializeKeys();
    }

    void initializeObjects() {
        ball = new Ball(0,0,0,0);
    }

    void initializeKeys() {
        root.setFocusTraversable(true);
        root.requestFocus();

        root.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.A) {
                ball.speedX = -0.1;
            } else if (event.getCode() == KeyCode.S) {
                ball.speedX = 0.1;
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
        gc.fillOval(ball.x, ball.y,10, 10);
        ball.x += ball.speedX;
        ball.y += ball.speedY;
    }
}
