import java.util.ArrayList;
import java.util.Scanner;

public class MiniMarket {
    private static ArrayList<Produk> produkList = new ArrayList<>();
    private static Scanner arcitt = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("MENU MINIMARKET");
            System.out.println("1. Tambah Produk ");
            System.out.println("2. Edit Produk ");
            System.out.println("3. Hapus Produk ");
            System.out.println("4. Tampilkan Semua Produk ");
            System.out.println("5. Tampilkan Produk Berdasarkan Jenis ");
            System.out.println("6. Tampilkan Produk Berdasarkan Rentang Harga: ");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            choice = arcitt.nextInt();
            arcitt.nextLine();

            switch (choice) {
                case 1 : 
                    tambahProduk();
                    break;
                case 2 : 
                    editProduk();
                    break;
                case 3 : 
                    hapusProduk();
                    break;
                case 4 : 
                    tampilkanSemua();
                    break;
                case 5 : 
                    tampilkanByJenis();
                    break;
                case 6 : 
                    tampilkanByHarga();
                    break;
                case 0 : 
                    System.out.println("Keluar");
                default : 
                    System.out.println("Menu tidak valid!");
            }
        } while (choice != 0);
    }

    private static void tambahProduk() {
        System.out.println("ID: ");
        int id = arcitt.nextInt(); arcitt.nextLine();
        System.out.println("Nama: ");
        String nama = arcitt.nextLine();
        System.out.println("Produsen: ");
        String produsen = arcitt.nextLine();
        System.out.println("Berat: ");
        double berat = arcitt.nextInt(); arcitt.nextLine();
        System.out.println("Jenis (Makanan/Minuman/Kosmetik): ");
        String jenis = arcitt.nextLine();
        System.out.println("Harga: ");
        double harga = arcitt.nextInt(); arcitt.nextLine();
        System.out.println("Lokasi Rak: ");
        String lokasiRak = arcitt.nextLine();
        System.out.println("Stok: ");
        int stok = arcitt.nextInt(); arcitt.nextLine();

        produkList.add(new Produk(id, nama, produsen, berat, jenis, harga, lokasiRak, stok));
        System.out.println("Produk berhasil ditambahkan!");
    }

    private static void editProduk() {
        System.out.println("Masukkan ID produk yang ingin diedit: ");
        int id = arcitt.nextInt(); arcitt.nextLine();

        for (Produk p : produkList) {
            if (p.getId() == id) {
                System.out.println("Nama Baru: ");
                p.setNama(arcitt.nextLine());
                System.out.println("Produsen Baru: ");
                p.setProdusen(arcitt.nextLine());
                System.out.println("Berat Baru: ");
                p.setBerat(arcitt.nextDouble()); arcitt.nextLine();
                System.out.println("Jenis Baru: ");
                p.setJenis(arcitt.nextLine());
                System.out.println("Harga Baru: ");
                p.setHarga(arcitt.nextDouble()); arcitt.nextLine();
                System.out.println("Rak Baru: ");
                p.setLokasiRak(arcitt.nextLine());
                System.out.println("Stok Baru: ");
                p.setStok(arcitt.nextInt()); arcitt.nextLine();
                System.out.println("Produk berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Produk tidak ditemukan.");
    }

    private static void hapusProduk() {
        System.out.println("Masukkan ID produk yang ingin dihapus: ");
        int id = arcitt.nextInt(); arcitt.nextLine();

        produkList.removeIf(p -> p.getId() == id);
        System.out.println("Produk berhasil dihapus.");
    }

        private static void tampilkanSemua() {
            if (produkList.isEmpty()) {
                System.out.println("Belum ada produk.");
                return; 
        }
        for (Produk p : produkList) {
            System.out.println(p);
        }
    }

    private static void tampilkanByJenis() {
        System.out.println("Masukkan jenis (Makanan/Minuman/Kosmetik): ");
        String jenis = arcitt.nextLine();
        for (Produk p : produkList) {
            if (p.getJenis().equalsIgnoreCase(jenis)) {
                System.out.println(p);
            }
        }
    }

    private static void tampilkanByHarga() {
        System.out.println("Masukkan harga minimum: ");
        double min = arcitt.nextDouble();
        System.out.println("Masukkan harga maksimum: ");
        double max = arcitt.nextDouble(); arcitt.nextLine();

        for (Produk p : produkList) {
            if (p.getHarga() >= min && p.getHarga() <= max) {
                System.out.println(p);
            }
        }
    }
}

