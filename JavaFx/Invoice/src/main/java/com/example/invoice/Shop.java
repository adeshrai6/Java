

package com.example.invoice;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


/**
 * This class is for shop UI where person can process invoice
 *
 **/
public class Shop implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent parent;

    @FXML
    private TextField dipCoffee;

    @FXML
    private TextField mochaLatte;

    @FXML
    private ComboBox<String> saleTax;

    @FXML
    private TextField sandwich;

    @FXML
    private TextField scones;

    @FXML
    private TextField totalBill;


    /**
     * This method will take you back to login UI
     **/
    @FXML
    void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Invoice-view.fxml"));
        parent = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow(); //Resizing window in passes parameter
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

    /**
     * This method is for initialize tax rate where you can select any tax rate otherwise it will select 3.00 as default rate
     *
     **/

    @Override
    public void initialize(URL url, ResourceBundle rb){
        saleTax.setItems(FXCollections.observableArrayList("3.00", "3.25", "3.50", "3.75", "4.00", "4.25", "4.50",
                "4.75", "5.00", "5.25", "5.50", "5.75", "6.00.", "6.25", "6.50",
                "6.75", "7.00", "7.25", "7.50", "7.75", "8.00", "8.25", "8.50", "8.75", "9.00", "9.25", "9.50"));
        saleTax.setValue("3.00");
    }

    /**
     * This method is for selecting tax rate where you can select any tax rate otherwise it will select 3.00 as default rate
     *
     **/
    @FXML
    void select(ActionEvent event){
        saleTax.getItems();
    }

    /**
     * This class will calculate total bill as per user input
     *
     **/
    @FXML
    void calculate(ActionEvent event) {

        double total = Double.parseDouble(sandwich.getText()) + Double.parseDouble(dipCoffee.getText()) + Double.parseDouble(mochaLatte.getText())
                + Double.parseDouble(scones.getText()) + Double.parseDouble(saleTax.getValue());
        String string = "" + total ;
        totalBill.setText(string);
    }

}
