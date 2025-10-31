package Refactor;

/**
 * Kelas {@code Battle} digunakan untuk menjalankan pertarungan antara dua Pokémon.
 * <p>
 * Kelas ini menampilkan hasil pertarungan berdasarkan kekuatan akhir Pokémon.
 * Refactoring yang diterapkan:
 * <ul>
 *     <li><b>Rename Method</b> - nama method diubah menjadi {@code mulaiPertarungan()} untuk lebih deskriptif.</li>
 *     <li><b>Extract Method</b> - method {@link #tampilkanPemenang(Pokemon)} memisahkan logika pemenang.</li>
 * </ul>
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Battle {

    /**
     * Memulai pertarungan antara dua Pokémon.
     * <p>Menentukan pemenang berdasarkan kekuatan akhir masing-masing Pokémon.</p>
     *
     * @param p1 Pokémon pertama
     * @param p2 Pokémon kedua
     */
    public void mulaiPertarungan(Pokemon p1, Pokemon p2) {
        System.out.println("\n=== Pertarungan Dimulai! ===");
        System.out.println(p1.getNama() + " vs " + p2.getNama());
        System.out.println("-----------------------------");

        int power1 = p1.getKekuatanAkhir();
        int power2 = p2.getKekuatanAkhir();

        if (power1 > power2) {
            tampilkanPemenang(p1);
        } else if (power1 < power2) {
            tampilkanPemenang(p2);
        } else {
            System.out.println("Pertarungan berakhir seri!");
        }

        System.out.println("=============================\n");
    }

    /**
     * Menampilkan pemenang pertarungan.
     *
     * @param pemenang Pokémon yang memenangkan pertarungan
     */
    private void tampilkanPemenang(Pokemon pemenang) {
        System.out.println("🔥 Pemenang adalah: " + pemenang.getNama() + "!");
    }
}
