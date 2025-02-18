package com.example.chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AiChat extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Загрузка FXML файла
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/AiChatApp.fxml"));
        AnchorPane root = loader.load();
        
        // Настройка сцены
        primaryStage.setTitle("AiChat");
        primaryStage.setScene(new Scene(root, 494, 653));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
