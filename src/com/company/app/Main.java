package com.company.app;

import com.company.view.Controller;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/rozhrani.fxml"));
        primaryStage.setTitle("Clobrdo");

        vytvoritCestu();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void vytvoritCestu() {
        int pocetHracu = 4, delkaTrasy = 10;

        Button[] policka = new Button[pocetHracu * delkaTrasy];

        policka[0] = new Button("Policko");
        Controller.getGridPane().add(policka[0], 0, 0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
