package com.company.view;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.*;

public class Controller {

    @FXML
    private static Pane pathPane;

    public static Pane getPathPane() {
        return pathPane;
    }

    @FXML
    private static GridPane gridPane;

    public static GridPane getGridPane() {
        return gridPane;
    }

    @FXML
    private static AnchorPane aPane;

    public static AnchorPane getFlowPane() {
        return aPane;
    }
}
