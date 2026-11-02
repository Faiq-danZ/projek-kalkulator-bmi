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

## Teknologi & Tools

- **Bahasa Pemrograman:** Java (JDK 21)
- **GUI Framework:** JavaFX 21
- **Layout Manager:** FXML & Scene Builder
- **Build Tool:** Apache Maven
- **IDE:** Apache NetBeans

---

## Struktur Proyek (MVC Architecture)

```text
projek-kalkulator-bmi/
├── src/
│   └── main/
│       ├── java/
│       │   ├── com/mycompany/projek/kalkulator/bmi/
│       │   │   ├── App.java                   # Main Application Class
│       │   │   └── PrimaryController.java     # Controller (Logika UI)
│       │   ├── com/mycompany/projek/kalkulator/bmi/model/
│       │   │   └── BMIModel.java              # Model (Logika Bisnis/Hitungan)
│       │   └── module-info.java               # Konfigurasi Modul JavaFX
│       └── resources/
│           └── com/mycompany/projek/kalkulator/bmi/
│               └── primary.fxml               # View (Desain Tampilan FXML)
└── pom.xml                                    # Konfigurasi Maven Dependency
