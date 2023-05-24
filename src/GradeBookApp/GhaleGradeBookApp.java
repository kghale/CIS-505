package GradeBookApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GhaleGradeBookApp extends Application {
    private TextField firstNameField;
    private TextField lastNameField;
    private TextField courseField;
    private ComboBox<String> gradeComboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Grade Book App");

        // Create form fields
        Label firstNameLabel = new Label("First Name:");
        firstNameField = new TextField();

        Label lastNameLabel = new Label("Last Name:");
        lastNameField = new TextField();

        Label courseLabel = new Label("Course:");
        courseField = new TextField();

        Label gradeLabel = new Label("Grade:");
        gradeComboBox = new ComboBox<>(FXCollections.observableArrayList("A", "B", "C", "D", "F"));

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> clearFormFields());

        Button viewButton = new Button("View Entries");

        Button saveButton = new Button("Save Entry");

        // Create layout and add components
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(firstNameLabel, 0, 0);
        gridPane.add(firstNameField, 1, 0);

        gridPane.add(lastNameLabel, 0, 1);
        gridPane.add(lastNameField, 1, 1);

        gridPane.add(courseLabel, 0, 2);
        gridPane.add(courseField, 1, 2);

        gridPane.add(gradeLabel, 0, 3);
        gridPane.add(gradeComboBox, 1, 3);

        gridPane.add(clearButton, 0, 4);
        gridPane.add(viewButton, 1, 4);
        gridPane.add(saveButton, 2, 4);

        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void clearFormFields() {
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeComboBox.getSelectionModel().clearSelection();
    }
}
