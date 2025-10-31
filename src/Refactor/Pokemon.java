package Refactor;

/**
 * Kelas {@code Pokemon} merepresentasikan sebuah karakter Pokémon
 * dengan atribut nama, tipe, dan kekuatan.
 * <p>
 * Kelas ini menerapkan konsep refactoring:
 * <ul>
 *     <li><b>Encapsulate Field</b> - atribut bersifat private dan diakses melalui getter.</li>
 *     <li><b>Introduce Constant</b> - konstanta {@code POWER_MULTIPLIER} digunakan untuk bonus kekuatan.</li>
 *     <li><b>Extract Method</b> - method {@link #calculateFinalPower()} memisahkan logika perhitungan kekuatan akhir.</li>
 * </ul>
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Pokemon {
    private String nama;
    private String tipe;
    private int kekuatan;
    private int level;
    private String elemen
    private String a

    public String a() {
    return a;
}
    public String getElemen(){
        return elemen;
    }
    
    public void naikLevel() {
        this.level++;
        System.out.println(nama + " naik ke level " + level + "!");
    }

    /** Konstanta pengali kekuatan (bonus tetap). */
    private static final double POWER_MULTIPLIER = 1.2;

    /**
     * Konstruktor untuk membuat objek Pokémon baru.
     *
     * @param nama      nama Pokémon
     * @param tipe      tipe Pokémon (misalnya: Api, Air, Listrik)
     * @param kekuatan  kekuatan dasar Pokémon
     */
    public Pokemon(String nama, String tipe, int kekuatan) {
        this.nama = nama;
        this.tipe = tipe;
        this.kekuatan = kekuatan;
    }

    /**
     * Menghitung kekuatan akhir Pokémon berdasarkan konstanta {@code POWER_MULTIPLIER}.
     *
     * @return nilai kekuatan akhir Pokémon
     */
    public int calculateFinalPower() {
        return (int) (kekuatan * POWER_MULTIPLIER);
    }

    /**
     * Menampilkan informasi lengkap Pokémon ke konsol.
     * Termasuk nama, tipe, kekuatan dasar, dan kekuatan akhir.
     */
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tipe: " + tipe);
        System.out.println("Kekuatan Dasar: " + kekuatan);
        System.out.println("Kekuatan Akhir (bonus): " + calculateFinalPower());
        System.out.println("---------------------------");
    }

    /** @return nama Pokémon */
    public String getNama() {
        return nama;
    }

    /** @return kekuatan dasar Pokémon */
    public int getKekuatan() {
        return kekuatan;
    }

    /** @return kekuatan akhir Pokémon (setelah bonus) */
    public int getKekuatanAkhir() {
        return calculateFinalPower();
    }
}
