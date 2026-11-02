package com.mycompany.projek.kalkulator.bmi.model;

public class BMIModel {
    private double berat;
    private double tinggi; // Dalam satuan meter

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungBMI() {
        if (tinggi <= 0) return 0;
        return berat / (tinggi * tinggi);
    }

    public String getKategori() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            return "Kurus (Kekurangan Berat)";
        } else if (bmi < 25.0) {
            return "Normal (Ideal)";
        } else if (bmi < 30.0) {
            return "Kelebihan Berat Badan";
        } else {
            return "Obesitas";
        }
    }
}