public class Kendaraan {
    private String nama;
    private int tahunProduksi;
    private Produsen produsen;

    public Kendaraan(String nama, int tahunProduksi, Produsen produsen) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
        this.produsen = produsen;
    }

    public void infoDasar() {
        System.out.println("\n=== INFO DASAR KENDARAAN ===");
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        produsen.infoProdusen();
    }

    public Produsen getProdusen() {
        return produsen;
    }    
}