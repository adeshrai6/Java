package com.example.javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class JavaFxController implements Initializable {

    @FXML
    private TableView<User> table;
    @FXML
    private TableColumn<User, Integer> age;

    @FXML
    private TextField ageIn;

    @FXML
    private TextField animalIn;

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
    public void initialize(URL url, ResourceBundle resourceBundle) {
//                new PropertyValueFactory<User, String>("name") etc
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        animals.setCellValueFactory(new PropertyValueFactory<>("animal"));
        table.setItems(list);
    }

    @FXML
    void nameChange() {
        String myName = nameIn.getText();
        int myAge = Integer.parseInt(ageIn.getText());
        String myAnimal = animalIn.getText();
        User user = new User(myName, myAge, myAnimal);
        list.add(user);
        table.setItems(list);

    }

}
