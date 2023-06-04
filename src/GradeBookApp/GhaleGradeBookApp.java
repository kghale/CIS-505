package GradeBookApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

/**
 * Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
 * Comprehensive Version (12th ed.). Pearson Education, Inc.
 * Modified by R. Krasso 2021
 * Additional modifications by Kabir Ghale 2023
 */
public class GhaleGradeBookApp extends Application {
    private TextField firstNameField;
    private TextField lastNameField;
    private TextField courseField;
    private ComboBox<String> gradeComboBox;
    private TextArea resultsArea;
    private ArrayList<Student> gradeBook;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Grade Book");

        // Create form elements
        Label firstNameLabel = new Label("First Name:");
        Label lastNameLabel = new Label("Last Name:");
        Label courseLabel = new Label("Course:");
        Label gradeLabel = new Label("Grade:");

        firstNameField = new TextField();
        lastNameField = new TextField();
        courseField = new TextField();
        gradeComboBox = new ComboBox<>();
        gradeComboBox.getItems().addAll("A", "B", "C", "D", "F");

        Button clearButton = new Button("Clear");
        Button viewButton = new Button("View Grades");
        Button saveButton = new Button("Save");

        resultsArea = new TextArea();
        resultsArea.setEditable(false);

        // Create event handlers
        clearButton.setOnAction(e -> clearForm());
        viewButton.setOnAction(e -> viewGrades());
        saveButton.setOnAction(e -> saveGrade());

        // Create layout
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

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
        gridPane.add(saveButton, 0, 5, 2, 1);

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(gridPane, resultsArea);

        // Create scene and show the stage
        Scene scene = new Scene(vbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        gradeBook = new ArrayList<>();
    }

    private void clearForm() {
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeComboBox.getSelectionModel().clearSelection();
    }

    private void viewGrades() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("grades.csv"));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
            resultsArea.setText(content.toString());
        } catch (IOException e) {
            showAlert("Error", "Error reading grades.csv file.");
        }
    }

    private void saveGrade() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String course = courseField.getText();
        String grade = gradeComboBox.getSelectionModel().getSelectedItem();

        Student student = new Student(firstName, lastName, course, grade);
        gradeBook.add(student);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("grades.csv", true));
            if (gradeBook.size() == 1) {
                writer.write("First Name, Last Name, Course, Grade\n");
            }
            writer.write(firstName + ", " + lastName + ", " + course + ", " + grade + "\n");
            writer.close();
            resultsArea.appendText(student.toString() + "\n");
            clearForm();
        } catch (IOException e) {
            showAlert("Error", "Error writing to grades.csv file.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}