/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piechart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private PieChart piechart;
    
    @FXML
    private void load (ActionEvent event) {
        PieChart.Data s1=new PieChart.Data("java",50); 
        PieChart.Data s2=new PieChart.Data("c++",20); 
        PieChart.Data s3=new PieChart.Data("python",30); 
        PieChart.Data s4=new PieChart.Data("Go",30); 
        PieChart.Data s5=new PieChart.Data("C",30); 
        PieChart.Data s6=new PieChart.Data("C#",10); 
        piechart.getData().addAll(s1,s2,s3,s4,s5,s6);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            
        // TODO
    }    
    
}
