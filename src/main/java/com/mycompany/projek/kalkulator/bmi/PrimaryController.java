package com.mycompany.projek.kalkulator.bmi;

import com.mycompany.projek.kalkulator.bmi.model.BMIModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private Label lblNilaiBMI;

    @FXML
    private Label lblKategori;

    private final BMIModel model = new BMIModel();

    @FXML
    private void handleHitung(ActionEvent event) {
        try {
            String inputBerat = txtBerat.getText().trim();
            String inputTinggi = txtTinggi.getText().trim();

            if (inputBerat.isEmpty() || inputTinggi.isEmpty()) {
                lblNilaiBMI.setText("Nilai BMI : Error");
                lblKategori.setText("Kategori : Mohon isi semua kolom!");
                return;
            }

            double berat = Double.parseDouble(inputBerat);
            double tinggiCm = Double.parseDouble(inputTinggi);
            double tinggiMeter = tinggiCm / 100.0;

            model.setBerat(berat);
            model.setTinggi(tinggiMeter);

            double bmi = model.hitungBMI();
            String kategori = model.getKategori();

            lblNilaiBMI.setText(String.format("Nilai BMI : %.2f", bmi));
            lblKategori.setText("Kategori : " + kategori);

        } catch (NumberFormatException e) {
            lblNilaiBMI.setText("Nilai BMI : Error");
            lblKategori.setText("Kategori : Input harus angka!");
        }
    }

    @FXML
    private void handleReset(ActionEvent event) {
        txtBerat.clear();
        txtTinggi.clear();
        lblNilaiBMI.setText("Nilai BMI : -");
        lblKategori.setText("Kategori : -");
        txtBerat.requestFocus();
    }
}