package com.example.house;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HouseController {

    @FXML
    private Label chosenHome;

    @FXML
    private TextField chosenOutput;

    @FXML
    private Button findAnother;

    @FXML
    private Button findBtn;

    @FXML
    private Label maxBeds;

    @FXML
    private TextField maxBedsInput;

    @FXML
    private Label maximumArea;

    @FXML
    private TextField maximumAreaInput;

    @FXML
    private Label maximumPrice;

    @FXML
    private TextField maximumPriceInput;

    @FXML
    private Label minBeds;

    @FXML
    private TextField minBedsInput;

    @FXML
    private Label minimumArea;

    @FXML
    private TextField minimumAreaInput;

    @FXML
    private Label minimumPrice;

    @FXML
    private TextField minimumPriceInput;

    @FXML
    private Button reset;

    @FXML
    void resetBtn(ActionEvent event) {
        maximumPriceInput.setText(" ");
        minimumPriceInput.setText(" ");
        minBedsInput.setText(" ");
        maxBedsInput.setText(" ");
        minimumAreaInput.setText(" ");
        maximumAreaInput.setText(" ");
        chosenOutput.setText(" ");
        findAnother.setTextFill(Color.GRAY);

    }

    String error = " ";
    String file = "src/main/java/com/example/project2/houseList.txt";
    HouseList houseList = new HouseList(file);

    @FXML
    void setFindBtn(ActionEvent event) {
        findAnother.setTextFill(Color.BLACK);
        int minPrice = Integer.parseInt(minimumPriceInput.getText());
        int maxPrice = Integer.parseInt(maximumPriceInput.getText());
        int minBed = Integer.parseInt(minBedsInput.getText());
        int maxBed = Integer.parseInt(maxBedsInput.getText());
        int minArea = Integer.parseInt(minimumAreaInput.getText());
        int maxArea = Integer.parseInt(maximumAreaInput.getText());
        Requirement requirement = new Requirement(minPrice, maxPrice, minArea, maxArea, minBed, maxBed);

        chosenOutput.setText(houseList.printHouses(requirement));
    }

    @FXML
    void findNext(ActionEvent event){
        int minPrice = Integer.parseInt(minimumPriceInput.getText());
        int maxPrice = Integer.parseInt(maximumPriceInput.getText());
        int minBed = Integer.parseInt(minBedsInput.getText());
        int maxBed = Integer.parseInt(maxBedsInput.getText());
        int minArea = Integer.parseInt(minimumAreaInput.getText());
        int maxArea = Integer.parseInt(maximumAreaInput.getText());
        Requirement requirement = new Requirement(minPrice, maxPrice, minArea, maxArea, minBed, maxBed);
        chosenOutput.setText(houseList.printAnotherHouse(requirement));

    }

}



