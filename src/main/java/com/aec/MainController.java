/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aec;

import de.jensd.fx.glyphs.materialicons.MaterialIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SRUN VANNARA
 */
public class MainController implements Initializable {
    
    @FXML
    private VBox paneTeacher;
    @FXML
    private VBox paneStudent;
    @FXML
    private VBox panePayment;
    @FXML
    private MaterialIconView btnBack;
    @FXML
    private StackPane stackPane;
    @FXML
    private AnchorPane paneHome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            //AnchorPane home = FXMLLoader.load(getClass().getResource("/fxml/Home.fxml"));
            //  paneHome.getChildren().add(home);

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
        btnBack.setVisible(true);
        paneHome.setVisible(false);
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
    private void clickBack(MouseEvent event) {
        hidePane();
        paneHome.setVisible(true);
        btnBack.setVisible(false);
    }

    @FXML
    private void clickClose(MouseEvent event) {
        Platform.exit();
    }

    @FXML
    private void clickLock(MouseEvent event) {
    }

    @FXML
    private void clickMinimize(MouseEvent event) {
        Stage stage = (Stage) stackPane.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void clickExpense(MouseEvent event) {
    }

    @FXML
    private void clickReport(MouseEvent event) {
    }

}
