package edu.missouriwestern.wwuerfele.homework04;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;


public class HelloApplication extends Application {
    static private Stage stage;
    static private Scene scene;
    static private VBox root;
    static private Label stateChosenLabel;
    static private ComboBox<String> StateComboBox;
    static private ObservableList<String> stateList;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        root = new VBox(50);

        scene = new Scene(root, 200 * 1.619, 200);
        stage.setTitle("Picking States");
        stage.setScene(scene);
        stage.show();

    }//end of start

    @Override
    public void init() throws Exception {
        super.init();
        LoremIpsum lorem = new LoremIpsum();
    }//end of init

    public static void main(String[] args) {
        launch();
    }//end of main
}//end of HelloApplication