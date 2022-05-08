package com.example.invoice;

import com.example.invoice.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


/**
 * This class is for login UI where person can log in
 *  -------moon is username and password
 **/
public class InvoiceController {
    private Stage stage;
    private Scene scene;
    private Parent parent;

    @FXML
    private PasswordField password;

    @FXML
    private Label error;

    @FXML
    private Button signIn;

    @FXML
    private TextField userID;



    /**
     *  This method process login information
     **/
    @FXML
    void setSignIn (ActionEvent event)throws IOException {

        /******************************* User Account *******************************/
        ArrayList<Account> accountList = new ArrayList<>();
        accountList.add(new Account("moon", "moon"));
        accountList.add(new Account("trao", "RaoT1"));
        accountList.add(new Account("smitra", "MitraS1"));
        accountList.add(new Account("mcoleman", "Melissa1"));
        accountList.add(new Account("rnsmith", "Rebekah1"));

        if(userID.getText().equals("") || password.getText().equals("")){
            error.setText("ID or Password is empty");
            error.setTextFill(Color.RED);
        }
        for (int i = 0; i < accountList.size(); i++) {

            if (userID.getText().equals(accountList.get(i).getUsername()) && password.getText().equals(accountList.get(i).getPassword())) {  //moon is username and password
                FXMLLoader loader = new FXMLLoader(getClass().getResource("shop.fxml"));
                parent = loader.load();
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); //Resizing window in passes parameter
                scene = new Scene(parent);
                stage.setScene(scene);
                stage.show();
            }

            //output error if username or password or both are wrong
            error.setText("Wrong ID or Password");
            error.setTextFill(Color.RED);

        }
    }

}