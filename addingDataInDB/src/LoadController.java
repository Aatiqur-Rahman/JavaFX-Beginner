/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class LoadController implements Initializable {

    @FXML
    private AnchorPane AnchorPane;
    @FXML private ProgressBar pbar;
    @FXML private ProgressBar pindicator;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Task task = worker(5);
        pbar.progressProperty().bind(task.progressProperty());
        pindicator.progressProperty().bind(task.progressProperty());
    }
    
    private Task worker(int sec){
        return new Task() {
            @Override
            protected Object call() throws Exception {
                for (int i=0;i<sec;i++){
                    updateProgress(i,sec);
                    Thread.sleep(1000);
                }
                return true;
            }; 
        };
        
    }
    
    
}
