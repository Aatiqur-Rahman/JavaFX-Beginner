/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titlepane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author USER
 */
public class Titlepane extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        AnchorPane ap= new AnchorPane();
        
        Label label = new Label();
        Button btn = new Button();
        Button B = new Button();
        btn.setText("Say 'Hello World'");
        B.setText("B1");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        B.setOnAction(e ->{
            System.exit(1);
        });
        TitledPane t1 = new TitledPane("Add",B);
        t1.animatedProperty();
        t1.contentProperty(ap);
        StackPane root = new StackPane();
        root.getChildren().addAll(btn,t1,label);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
