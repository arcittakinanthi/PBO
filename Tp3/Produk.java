public class Produk {
    private int id;
    private String nama;
    private String produsen;
    private double berat;
    private String jenis;
    private double harga;
    private String lokasiRak;
    private int stok;

    public Produk(int id, String nama, String produsen, double berat, String jenis, double harga, String lokasiRak, int stok) {
        this.id = id;
        this.nama = nama;
        this.produsen = produsen;
        this.berat = berat;
        this.jenis = jenis;
        this.harga = harga;
        this.lokasiRak = lokasiRak;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdusen() {
        return produsen;
    }

    public void setProdusen(String produsen) {
        this.produsen = produsen;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getLokasiRak() {
        return lokasiRak;
    }

    public void setLokasiRak(String lokasiRak) {
        this.lokasiRak = lokasiRak;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nama: %s | Produsen: %s | Berat: %.2f | Jenis: %s | Harga: %.2f | Rak: %s | Stok: %d",
                id, nama, produsen, berat, jenis, harga, lokasiRak, stok);
    }

    
}
