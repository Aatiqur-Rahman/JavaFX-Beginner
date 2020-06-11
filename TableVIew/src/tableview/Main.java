/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableview;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TableView table = new TableView();
        TableColumn <String,person> C1 = new TableColumn<>("FirstName"); 
        C1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
       
        TableColumn <String,person> C2 = new TableColumn<>("LastName");
        C2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        
        table.getColumns().add(C1);
        table.getColumns().add(C2);
        
       table.getItems().add(new person("john","nex"));
        table.getItems().add(new person("john","nex"));
        
        StackPane root = new StackPane();
        VBox vbox= new VBox(table);
    root.getChildren().add(vbox);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
