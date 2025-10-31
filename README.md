# Pokémon Battle (Refactoring Project)

Program ini merupakan contoh sederhana dari implementasi **Object-Oriented Programming (OOP)** dan **Refactoring** dalam bahasa Java, menggunakan tema pertarungan Pokémon.

---

## 🧱 Struktur Proyek
Pokemon/
├── src/
│ └── Refactor/
│ ├── Pokemon.java # Kelas untuk mendefinisikan data dan kemampuan Pokémon
│ ├── Battle.java # Kelas untuk mengatur logika pertarungan antar Pokémon
│ └── Main.java # Program utama untuk menjalankan simulasi
├── README.md # Dokumentasi proyek ini

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

=== Daftar Pokémon ===
Nama: Pikachu
Tipe: Listrik
Kekuatan Dasar: 85
Kekuatan Akhir (bonus): 102
---------------------------
Nama: Charmander
Tipe: Api
Kekuatan Dasar: 78
Kekuatan Akhir (bonus): 93
---------------------------
Nama: Squirtle
Tipe: Air
Kekuatan Dasar: 80
Kekuatan Akhir (bonus): 96
---------------------------

=== Pertarungan Dimulai! ===
Pikachu vs Charmander
-----------------------------
🔥 Pemenang adalah: Pikachu!
=============================


=== Pertarungan Dimulai! ===
Squirtle vs Pikachu
-----------------------------
🔥 Pemenang adalah: Pikachu!
=============================


---


---

## 🚀 Cara Menjalankan Program

1. **Clone repositori:**
   ```bash
   git clone https://github.com/username/PokemonRefactor.git
2, **Buka Intellij:**
 ```bash
   Open folder repository yang telah diclone lalu klik main dan run
