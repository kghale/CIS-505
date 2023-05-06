package Module_7.FutureValueApp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GhaleFutureValueApp extends Application {
    private TextField txtInvestmentAmount = new TextField();
    private TextField txtInterestRate = new TextField();
    private TextArea txtFutureValue = new TextArea();
    private Label lblInvestmentAmount = new Label("Monthly Payment:");
    private Label lblNumberOfYears = new Label("Number of Years:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private ComboBox<Integer> cmbNumberOfYears = new ComboBox<>();
    private Button btnClear = new Button("Clear");
    private Button btnCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new javafx.geometry.Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        gridPane.add(lblInvestmentAmount, 0, 0);
        gridPane.add(txtInvestmentAmount, 1, 0);

        gridPane.add(lblInterestRate, 0, 1);
        gridPane.add(txtInterestRate, 1, 1);
        gridPane.add(lblInterestRateFormat, 1, 2);
        lblInterestRateFormat.setTextFill(Color.RED);
        GridPane.setHalignment(lblInterestRateFormat, javafx.geometry.HPos.RIGHT);

        gridPane.add(lblNumberOfYears, 0, 3);
        cmbNumberOfYears.getItems().addAll(1,2,3);
        cmbNumberOfYears.setValue(1);
        gridPane.add(cmbNumberOfYears, 1, 3);

        HBox hBox = new HBox(10);
        hBox.setPadding(new javafx.geometry.Insets(15, 0, 15, 30));
        hBox.setAlignment(Pos.TOP_RIGHT);
        hBox.getChildren().addAll(btnClear, btnCalculate);
        gridPane.add(hBox,1,4);

        gridPane.add(txtFutureValue, 0,5 ,2,1);

        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        column1.setPercentWidth(50);
        column2.setPercentWidth(50);


        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().add(gridPane);

        primaryStage.setTitle("Ghale Future Value App");
        primaryStage.setScene(new Scene(vBox, 400, 300));
        primaryStage.show();
    }
}