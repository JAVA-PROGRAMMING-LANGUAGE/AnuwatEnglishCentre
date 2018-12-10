/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aec;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author SRUN VANNARA
 */
public class MainController implements Initializable {
    
    @FXML
    private AnchorPane paneTeacher;
    @FXML
    private AnchorPane paneStudent;
    @FXML
    private AnchorPane paneMain;
    @FXML
    private AnchorPane panePayment;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            AnchorPane teacher = FXMLLoader.load(getClass().getResource("/fxml/Teacher.fxml"));
            paneTeacher.getChildren().add(teacher);
            
            AnchorPane student = FXMLLoader.load(getClass().getResource("/fxml/Student.fxml"));
            paneStudent.getChildren().add(student);
            
            AnchorPane payment = FXMLLoader.load(getClass().getResource("/fxml/Payment.fxml"));
            panePayment.getChildren().add(payment);
            
        } catch (Exception e) {
            
        }
    }
    
    private void hidePane() {
        paneMain.setVisible(false);
        paneTeacher.setVisible(false);
        paneStudent.setVisible(false);
        panePayment.setVisible(false);
    }
    
    @FXML
    private void clickTeacher(MouseEvent event) {
        hidePane();
        paneTeacher.setVisible(true);
    }
    
    @FXML
    private void clickStudent(MouseEvent event) {
        hidePane();
        paneStudent.setVisible(true);
    }
    
    @FXML
    private void clickPayment(MouseEvent event) {
        hidePane();
        panePayment.setVisible(true);
    }
    
    @FXML
    private void clickExpense(MouseEvent event) {
    }
    
    @FXML
    private void clickReport(MouseEvent event) {
    }
    
    @FXML
    private void clickBack(MouseEvent event) {
        hidePane();
        paneMain.setVisible(true);
    }
    
}
