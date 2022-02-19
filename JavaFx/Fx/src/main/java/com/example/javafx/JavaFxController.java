package com.example.javafx;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class JavaFxController implements Initializable {

    @FXML
    private TableView<User> table;
    @FXML
    private TableColumn<User, Integer> age;

    @FXML
    private TableColumn<User, String> animals;

    @FXML
    private TableColumn<User, String> name;


    @FXML
    private TextField nameIn;

    @FXML
    private Text nameOut;

    ObservableList<User> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
            name.setCellValueFactory(new PropertyValueFactory<User, String>("name"));
            age.setCellValueFactory(new PropertyValueFactory<User, Integer>("age"));
            animals.setCellValueFactory(new PropertyValueFactory<User, String>("animal"));
            table.setItems(list);
    }
    @FXML
    void nameChange(MouseEvent event) {
        nameOut.setText(nameIn.getText());
        User user = new User(nameIn.getText(),20, "cat");
         list.add(user);
         table.setItems(list);

    }

}
