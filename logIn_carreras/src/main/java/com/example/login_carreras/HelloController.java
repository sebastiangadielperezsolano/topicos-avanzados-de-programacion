package com.example.login_carreras;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField textFieldEquipo;
    @FXML
    private RadioButton rbHypercar;
    @FXML
    private RadioButton rbLMP2;
    @FXML
    private RadioButton rbLMGT3;

    @FXML
    private TextArea textAreaRegistro;

    @FXML
    private CheckBox checkBoxHibrido;

    @FXML
    private ComboBox<String> comboBoxMarca;

    @FXML
    private Spinner<Integer> spinnerConductores;
    @FXML
    private Label labelRegistro;
    @FXML
    public void initialize() {
        comboBoxMarca.getItems().addAll("Toyota", "Ferrari", "Porsche", "Mercedes", "Audi");
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 6, 1);
        spinnerConductores.setValueFactory(valueFactory);
        ToggleGroup toggleGroup = new ToggleGroup();rbHypercar.setToggleGroup(toggleGroup);rbLMP2.setToggleGroup(toggleGroup);rbLMGT3.setToggleGroup(toggleGroup);
    }

    @FXML
    protected void onRegistrarEquipoClick() {

        String equipo = textFieldEquipo.getText();
        if (!equipo.isEmpty()) {
            String categoria = "";
            if (rbHypercar.isSelected()) {
                categoria = rbHypercar.getText();
            } else if (rbLMP2.isSelected()) {
                categoria = rbLMP2.getText();
            } else if (rbLMGT3.isSelected()) {
                categoria = rbLMGT3.getText();
            }
            boolean esHibrido = checkBoxHibrido.isSelected();
            String marca = comboBoxMarca.getSelectionModel().getSelectedItem();
            Integer numConductores = spinnerConductores.getValue();
            String registro = String.format("%s - %s (Híbrido: %s, Marca: %s, Conductores: %d)\n",
                    equipo, categoria, esHibrido, marca, numConductores);
            textAreaRegistro.appendText(registro);
            labelRegistro.setText("Equipo registrado");
            textFieldEquipo.clear();
        } else {
            labelRegistro.setText("Por favor, ingrese un equipo.");
        }
    }
}