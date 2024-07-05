package com.example.hrmanagementnav;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DasboardController {


    public Button adminbutton;
    public Button employeebutton;
    public Button logoutbutton;

    public void admin(ActionEvent actionEvent) {


        try {

            Parent secondScene = FXMLLoader.load(getClass().getResource("Admin.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("ADMIN SCENE");
            secondStage.setScene(new Scene(secondScene));


            Stage firstSceneStage = (Stage) adminbutton.getScene().getWindow();
            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();


        }


    }

    public void employee(ActionEvent actionEvent) {

        try {

            Parent secondScene = FXMLLoader.load(getClass().getResource("employee.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("EMPLOYEE SCENE");
            secondStage.setScene(new Scene(secondScene));


            Stage firstSceneStage = (Stage) employeebutton.getScene().getWindow();
            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();


        }

    }

    public void logout(ActionEvent actionEvent) {

        try {

            Parent secondScene = FXMLLoader.load(getClass().getResource("Dasboard.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("LOGOUT SCENE");
            secondStage.setScene(new Scene(secondScene));


            Stage firstSceneStage = (Stage) logoutbutton.getScene().getWindow();
            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();


        }
    }

    public void exit(ActionEvent actionEvent) {

        System.exit(0);
    }
}