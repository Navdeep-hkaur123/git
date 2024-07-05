package com.example.hrmanagementnav;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.Objects;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private void handleLogin(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();

        String jdbcUrl = "jdbc:mysql://localhost:3306/hr_management"; // Replace with your actual database URL
        String dbUser = "root"; // Replace with your actual database username
        String dbPassword = ""; // Replace with your actual database password

        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
            String query = "SELECT * FROM login WHERE email = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                try {

                    Parent secondScene = FXMLLoader.load(getClass().getResource("Dasboard.fxml"));

                    Stage secondStage = new Stage();
                    secondStage.setTitle("User Scene");
                    secondStage.setScene(new Scene(secondScene));
                    Stage firstSceneStage = (Stage) loginButton.getScene().getWindow();
                    firstSceneStage.close();


                    secondStage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                // Handle invalid login credentials
                System.out.println("Invalid login. Please check your email and password.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}