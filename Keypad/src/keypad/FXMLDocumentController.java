/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keypad;

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

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button star;

    @FXML
    private Button one;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private TextField screen;
    
   @FXML
    private Label country;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button hash;

    @FXML
    private Button dial;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            screen.setText(screen.getText() + "1");
        } else if (event.getSource() == two) {
            screen.setText(screen.getText() + "2");
        } else if (event.getSource() == three) {
            screen.setText(screen.getText() + "3");
        } else if (event.getSource() == four) {
            screen.setText(screen.getText() + "4");
        } else if (event.getSource() == five) {
            screen.setText(screen.getText() + "5");
        } else if (event.getSource() == six) {
            screen.setText(screen.getText() + "6");
        } else if (event.getSource() == seven) {
            screen.setText(screen.getText() + "7");
        } else if (event.getSource() == eight) {
            screen.setText(screen.getText() + "8");
        } else if (event.getSource() == nine) {
            screen.setText(screen.getText() + "9");
        } else if (event.getSource() == zero) {
            screen.setText(screen.getText() + "0");
        } else if (event.getSource() == clear) {
            screen.setText("");
            country.setText("");
        } else if (event.getSource() == plus) {
            screen.setText(screen.getText() + "+");
        } else if (event.getSource() == star) {
            screen.setText(screen.getText() + "*");
        } else if (event.getSource() == hash) {
            screen.setText(screen.getText() + "#");
        }
        else if(screen.getText().indexOf("+971")!=-1)
        {
            country.setText("UAE");
        }
        else if(screen.getText().contains("+977"))
        {
            country.setText("Nepal");
        }
        else if(screen.getText().contains("+91"))
        {
            country.setText("India");
        }else if(screen.getText().contains("+92"))
        {
            country.setText("Pakistan");
        }     
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
