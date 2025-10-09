public class Main2 {
    public static void main(String[] args) {
        Penginapan Indigo = new Penginapan("Indigo Hotel Bandung", "Jl. Dago Pakar Raya No. 3, Resor Dago Pakar", null);

        Tamu arcitt = new Tamu("Arcitt", 5);
        Tamu farras = new Tamu("Farras", 3);

        System.out.println("Status tamu masuk");
        Indigo.catatMasuk(arcitt);
        Indigo.catatMasuk(farras);

        System.out.println("\n");
        Indigo.tampilkanDaftarTamu();

        System.out.println("\nStatus tamu keluar");
        Indigo.catatKeluar("Farras");

        System.out.println("\n");
        Indigo.tampilkanDaftarTamu();
    }
}
