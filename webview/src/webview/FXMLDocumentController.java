/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML private WebView webview;
    @FXML private WebEngine engine;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       webview.getEngine().load("https://www.google.com");
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine=webview.getEngine();
        // TODO
    }    
    
}
