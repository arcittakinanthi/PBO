public class Tank extends Kendaraan {
    private int kaliber;
    private int derajatRotasi;
    private int amunisi;

    public Tank(String nama, int tahunProduksi, Produsen produsen, int kaliber, int jumlahPeluru) {
        super(nama, tahunProduksi, produsen);
        this.kaliber = kaliber;
        this.amunisi = jumlahPeluru;
        this.derajatRotasi = 0;
    }

    private String getArah() {
        if (derajatRotasi >= 337 || derajatRotasi < 23) return "Depan";
        else if (derajatRotasi < 68) return "Depan Kanan";
        else if (derajatRotasi < 113) return "Kanan";
        else if (derajatRotasi < 158) return "Belakang Kanan";
        else if (derajatRotasi < 203) return "Belakang";
        else if (derajatRotasi < 248) return "Belakang Kiri";
        else if (derajatRotasi < 293) return "Kiri";
        else return "Depan Kiri";
    }

    public void infoTank() {
        infoDasar();
        System.out.println("=== INFO MERIAM TANK ===");
        System.out.println("Kaliber: " + kaliber + " mm");
        System.out.println("Jumlah Amunisi: " + amunisi + " buah");
        System.out.println("Derajat Rotasi: " + derajatRotasi + " derajat");
        System.out.println("Arah Rotasi : " + getArah());
    }

    public void putarMeriam(int derajat) {
        derajatRotasi = (derajatRotasi + derajat) % 360;
        if (derajatRotasi < 0) derajatRotasi += 360;
        System.out.println("Memutar tank ke " + derajat + " derajat");
        System.out.println("Arah Rotasi : " + getArah());
    }

    public void tembak() {
        if (amunisi > 0) {
            amunisi--;
            System.out.println("Tank Menembak...");
            System.out.println("Sisa Amunisi: " + amunisi + " buah");
        } else {
            System.out.println("Amunisi habis, tidak bisa menembak.");
        }
    }

    public void tambahPeluru(int jumlahPeluru) {
        amunisi += jumlahPeluru;
        System.out.println("Menambah Amunisi sebanyak " + jumlahPeluru + " Buah");
        System.out.println("Jumlah Amunisi Sekarang: " + amunisi + " buah");
    }
}
