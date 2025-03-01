package edu.missouriwestern.wwuerfele.homework04;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class ScratchPad extends Application {
    private Stage stage;
    private Scene scene;
    private BorderPane root;
    private VBox center;
    private HBox bottom;
    private Button firstButton;
    private Button secondButton;
    private Button thirdButton;
    private Label statusLabel;
    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        stage.setTitle("Event Handler Example");

        setupScene();
        //Create anonymous Inner Class for the first button
        firstButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                statusLabel.setText("First Button clicked!");
                statusLabel.setTextFill(Color.RED);
            }
        });

        secondButton.setOnAction(event -> statusLabel.setText("Second Button clicked!"));

        thirdButton.setOnAction(event -> {
            statusLabel.setText("Third button clicked!");
            statusLabel.setTextFill(Color.DARKGOLDENROD);
        });

        stage.show();

    }

    private void setupScene() {
        firstButton = new Button("Click me");
        secondButton = new Button("Me too");
        thirdButton = new Button("and again");
        statusLabel = new Label("Waiting...");

        center = new VBox();
        bottom = new HBox();

        center.getChildren().addAll(firstButton,secondButton,thirdButton);
        bottom.getChildren().addAll(statusLabel);

        center.setAlignment(Pos.CENTER);
        center.setSpacing(5);
        bottom.setSpacing(10);
        center.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));
        bottom.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));



        root = new BorderPane();
        root.setCenter(center);
        root.setBottom(bottom);

        scene = new Scene(root, 300, 250);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}

