/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author USER
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Student Attendance Management System");
        //Parent root = FXMLLoader.load(getClass().getResource("Load.fxml"));
       //Parent root = FXMLLoader.load(getClass().getResource("/Loading/sample.fxml"));
       Parent root = FXMLLoader.load(getClass().getResource("manyscene.fxml"));
        //Color c = Color.rgb(0,0,255);
        Color c = Color.web("0x0000FF",1.0);
        Scene scene = new Scene(root,800,500,c);
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
