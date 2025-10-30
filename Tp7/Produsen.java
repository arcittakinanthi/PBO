public class Produsen {
    private String nama;
    private String negaraAsal;

    public Produsen(String nama, String negaraAsal) {
        this.nama = nama;
        this.negaraAsal = negaraAsal;
    }

    public void infoProdusen() {
        System.out.println("=== INFO PRODUSEN ===");
        System.out.println("Nama Produsen: " + nama);
        System.out.println("Negara Asal: " + negaraAsal);
    }

    public void setNamaProdusen(String namaProdusen) {
        this.nama = namaProdusen;
    }
}