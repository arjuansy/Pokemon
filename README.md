# Pokémon Battle (Refactoring Project)

Program ini merupakan contoh sederhana dari implementasi **Object-Oriented Programming (OOP)** dan **Refactoring** dalam bahasa Java, menggunakan tema pertarungan Pokémon.

---

## 🧱 Struktur Proyek


---

## 🧩 Deskripsi Kelas

### 1. `Pokemon`
Merepresentasikan karakter Pokémon dengan atribut:
- `nama` (String)
- `tipe` (String)
- `kekuatan` (int)

Refactoring yang diterapkan:
- **Encapsulate Field** → atribut diakses melalui getter.
- **Introduce Constant** → konstanta `POWER_MULTIPLIER` menambah bonus kekuatan.
- **Extract Method** → `calculateFinalPower()` memisahkan logika perhitungan kekuatan akhir.

---

### 2. `Battle`
Menjalankan pertarungan antara dua Pokémon dan menampilkan pemenang.

Refactoring yang diterapkan:
- **Rename Method** → `mulaiPertarungan()` menggantikan nama sebelumnya.
- **Extract Method** → `tampilkanPemenang()` memisahkan logika pemenang.

---

### 3. `Main`
Menjalankan program utama:
- Membuat beberapa Pokémon.
- Menampilkan data mereka.
- Memulai dua pertarungan menggunakan objek `Battle`.

---

## 🧠 Contoh Output


---

## 🧩 Cara Menjalankan Program

1. Pastikan Java sudah terinstal.
2. Masuk ke folder `src`.
3. Jalankan perintah berikut di terminal:

```bash
javac Refactor/*.java
java Refactor.Main
