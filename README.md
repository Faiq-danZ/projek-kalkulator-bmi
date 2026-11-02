# Kalkulator BMI (Body Mass Index) - JavaFX

Aplikasi desktop interaktif untuk menghitung Indeks Massa Tubuh (Body Mass Index / BMI) secara cepat dan akurat. Proyek ini dibangun menggunakan JavaFX, Maven, serta menerapkan pola arsitektur Model-View-Controller (MVC) dengan antarmuka (UI) yang modern dan responsif.

---

## Tampilan Aplikasi

<img width="869" height="635" alt="image" src="https://github.com/user-attachments/assets/f7d18876-a68a-4b7d-b5e9-f1b6644d4fce" />


---

## Fitur Utama

- **Kalkulasi BMI Akurat:** Menghitung nilai BMI berdasarkan tinggi (cm) dan berat badan (kg).
- **Kategori Kesehatan:** Menentukan status BMI secara otomatis (Kurus, Normal, Kelebihan Berat Badan, Obesitas).
- **Validasi Input:** Penanganan error otomatis jika pengguna menginput teks non-angka atau membiarkan kolom kosong.
- **Tombol Reset:** Mengosongkan form input dan hasil perhitungan dengan satu klik.
- **UI Modern & Clean:** Tampilan antarmuka yang bersih, responsif, dan nyaman digunakan.

---

## Cara Menjalankan Proyek

### 1. Menggunakan Apache NetBeans (Cara Termudah)
1. Buka proyek `projek-kalkulator-bmi` di Apache NetBeans.
2. Klik tombol **Run** (atau tekan tombol **F6** di keyboard).
3. Jika sebelumnya ada perbaikan kode/FXML, tekan **Clean and Build** (`Shift + F11`) terlebih dahulu, lalu klik **Run** (`F6`).

### 2. Menggunakan Terminal / Command Prompt
```bash
git clone [https://github.com/Faiq-danZ/projek-kalkulator-bmi.git](https://github.com/Faiq-danZ/projek-kalkulator-bmi.git)
cd projek-kalkulator-bmi
mvn clean javafx:run
