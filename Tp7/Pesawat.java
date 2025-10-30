public class Pesawat extends Kendaraan {
    private int ketinggian;
    private int jumlahPeluru;

    public Pesawat(String nama, int tahunProduksi, Produsen produsen, int jumlahPeluru) {
        super(nama, tahunProduksi, produsen);
        this.jumlahPeluru = jumlahPeluru;
        this.ketinggian = 0;
    }

    public void setKetinggian(int ketinggian) {
        this.ketinggian = ketinggian;
        System.out.println("Mengubah ketinggian ke: " + ketinggian + " meter");
    }

    public void infoPesawat() {
        infoDasar();
        System.out.println("=== INFO PESAWAT ===");
        System.out.println("Jumlah Peluru: " + jumlahPeluru + " buah");
        System.out.println("Ketinggian: " + ketinggian + " meter");
    }

    public void tembak(int tembak) {
        if (jumlahPeluru >= tembak && ketinggian > 0) {
            jumlahPeluru -= tembak;
            System.out.println("Pesawat Menembakkan " + tembak + " butir peluru");
            System.out.println("Sisa Peluru: " + jumlahPeluru + " butir");
        } else if (ketinggian == 0) {
            System.out.println("Pesawat di darat, tidak bisa menembak!");
        } else {
            System.out.println("peluru sudah ditembakkan semua");
        }
    }

    public void tambahPeluru(int jumlahPeluru) {
        if (ketinggian == 0) {
            this.jumlahPeluru += jumlahPeluru;
            System.out.println("Menambah Peluru sebanyak " + jumlahPeluru + " Buah");
            System.out.println("Jumlah Peluru Sekarang: " + this.jumlahPeluru + " buah");
        } else {
            System.out.println("Tidak bisa isi peluru, Pesawat belum mendarat");
        }
    }
}
