package edu.missouriwestern.wwuerfele.homework04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane root = new Pane();

        stage.setTitle("yeeeOUCHHHHHH");
        Scene primaryScene = new Scene(root, 500, 200);


        stage.setScene(primaryScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}