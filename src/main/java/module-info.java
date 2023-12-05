module oop.dictionary {
    requires javafx.controls;
    requires javafx.fxml;

    opens oop.dictionary to javafx.fxml;
    opens oop.dictionary.controller to javafx.fxml;

    exports oop.dictionary;
    exports oop.dictionary.controller;
}