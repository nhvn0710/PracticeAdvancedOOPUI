package oop.dictionary.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

public class Controller {

    @FXML
    public Button backButton;

    @FXML
    private VBox chatBox;

    @FXML
    private Label userName;

    @FXML
    private Label status;

    @FXML
    private Button callButton1;

    @FXML
    private Button callButton2;

    @FXML
    private Label dayMessage;

    @FXML
    private Rectangle oppBubble;

    @FXML
    private Label oppMessage;

    @FXML
    private Rectangle yourBubble;

    @FXML
    private Label yourMessage;

    @FXML
    private Label sendInformation;

    @FXML
    private Button mediaButton;

    @FXML
    private TextField inputField;

    @FXML
    private Button voiceButton;

    @FXML
    private Rectangle sendButton;

    public void sendMessage() {
    }

}