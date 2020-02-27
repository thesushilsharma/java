/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculators;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Raone
 */
public class FXMLDocumentController implements Initializable {

    Float var=null;
    
    int validate=-1;
    @FXML
    private Button nine;
    
    @FXML
    private Button minus;
    
    @FXML
    private Button six;
    
    @FXML
    private Button one;
    
    @FXML
    private Button clear;
    
    @FXML
    private Button seven;
    
    @FXML
    private TextField screen;
    
    @FXML
    private Label label;
    
    @FXML
    private Button two;
    
    @FXML
    private Button three;
    
    @FXML
    private Button plus;
    
    @FXML
    private Button eight;
    
    @FXML
    private Button zero;
    
    @FXML
    private Button four;
    
    @FXML
    private Button equals;
    
    @FXML
    private Button divide;
    
    @FXML
    private Button multiply;
    
    @FXML
    private Button five;
    
    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            screen.setText(screen.getText() + "1");
        }
        else 
            if (event.getSource() == two) {
            screen.setText(screen.getText() + "2");
        }
        else 
            if (event.getSource() == three) {
            screen.setText(screen.getText() + "3");
        }
        else 
            if (event.getSource() == four) {
            screen.setText(screen.getText() + "4");
        }
        else 
            if (event.getSource() == five) {
            screen.setText(screen.getText() + "5");
        }
        else 
            if (event.getSource() == six) {
            screen.setText(screen.getText() + "6");
        }
        else 
            if (event.getSource() == seven) {
            screen.setText(screen.getText() + "7");
        }
        else 
            if (event.getSource() == eight) {
            screen.setText(screen.getText() + "8");
        }
            else 
            if (event.getSource() == nine) {
            screen.setText(screen.getText() + "9");
        }
        else 
            if (event.getSource() == zero) {
            screen.setText(screen.getText() + "0");
        }
        else 
            if (event.getSource() == clear) {
            screen.setText(" ");
        }
        else 
            if (event.getSource() == plus) {
            var=Float.parseFloat(screen.getText());
            validate=1;
            screen.setText("");
        }
        else 
            if (event.getSource() == minus) {
            var=Float.parseFloat(screen.getText());
            validate=2;
            screen.setText("");
        }
        else 
            if (event.getSource() == multiply) {
            var=Float.parseFloat(screen.getText());
            validate=3 ;
            screen.setText("");
        }
        else 
            if (event.getSource() == divide) {
            var=Float.parseFloat(screen.getText());
            validate=4;
            screen.setText("");
        }
        else 
            if (event.getSource() == equals) {
          Float var2=Float.parseFloat(screen.getText());
            Float result=null; 
            switch(validate)
             {
                 case 1: 
                   result=var+var2;
                   screen.setText(String.valueOf(result));
                   break;
                 case 2:
                     result=var-var2;
                   screen.setText(String.valueOf(result));
                   break;
                 case 3:
                     result=var*var2;
                   screen.setText(String.valueOf(result));
                   break;
                 case 4:
                     result=var/var2;
                   screen.setText(String.valueOf(result));
                   break;
             }
        }  
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
