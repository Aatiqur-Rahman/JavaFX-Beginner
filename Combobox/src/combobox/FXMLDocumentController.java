/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    public ComboBox<String> combobox;
    ObservableList<String> List = FXCollections.observableArrayList("Atiq","Opu","Rahat","Naim");
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        combobox.setItems(List);
    }    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText(combobox.getValue());
    }
}
 