/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loading;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SampleController implements Initializable {

    @FXML
    private ProgressBar pbar;
    @FXML
    private ProgressIndicator pindicator;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Task task = worker(2);
        pbar.progressProperty().unbind();
        pindicator.progressProperty().unbind();
        pbar.progressProperty().bind(task.progressProperty());
        pindicator.progressProperty().bind(task.progressProperty());
       /* task.setOnSucceeded(e ->{
            Stage stage = (Stage) AnchorPane.getScene().getWindow();
        });*/
        Thread thread = new Thread(task);
        thread.start();
        
    }    
     private Task worker(int sec){
        return new Task() {
            @Override
            protected Object call() throws Exception {
                for (int i=0;i<sec;i++){
                    updateProgress(i+1,sec);
                    Thread.sleep(1000);
                }
                return true;
            }; 
        };
        
    };
}//initialize