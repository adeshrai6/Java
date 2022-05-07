package com.example.invoice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InvoiceController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}