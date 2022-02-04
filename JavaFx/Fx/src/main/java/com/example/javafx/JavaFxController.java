package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class JavaFxController {

    @FXML
    private TextField nameIn;

    @FXML
    private Text nameOut;

    @FXML
    void nameChange(MouseEvent event) {
        nameOut.setText(nameIn.getText());
    }

}
