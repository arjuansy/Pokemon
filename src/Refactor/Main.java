package Refactor;

/**
 * Kelas {@code Main} berfungsi sebagai titik awal (entry point) program Pokémon Battle.
 * <p>
 * Program ini menampilkan daftar Pokémon dan melakukan beberapa pertarungan contoh.
 * </p>
 *
 * @arjuansy
 * @version 1.0
 */
public class Main {

    /**
     * Method utama untuk menjalankan program Pokémon Battle.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Listrik", 85);
        Pokemon charmander = new Pokemon("Charmander", "Api", 78);
        Pokemon squirtle = new Pokemon("Squirtle", "Air", 80);

        System.out.println("=== Daftar Pokémon ===");
        pikachu.displayInfo();
        charmander.displayInfo();
        squirtle.displayInfo();

        Battle battle = new Battle();
        battle.mulaiPertarungan(pikachu, charmander);
        battle.mulaiPertarungan(squirtle, pikachu);
    }
}
