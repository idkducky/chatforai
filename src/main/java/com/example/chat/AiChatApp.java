package com.example.chat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AiChatApp {

    @FXML
    private TextArea outputArea;
    @FXML
    private TextField inputField;
    @FXML
    private Button sendButton;

    @FXML
    private void initialize() {
        sendButton.setOnAction(event -> {
            String userInput = inputField.getText();
            outputArea.appendText("Вы: " + userInput + "\n");
            inputField.clear();
        });
    }
}
