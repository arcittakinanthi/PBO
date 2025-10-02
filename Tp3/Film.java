import java.util.ArrayList;

public class Film {
    private String nama;
    private String negara;
    private ArrayList<String> daftarAktor;
    private int durasi;
    private int tahunRilis;

    public Film(String nama, String negara, int durasi, int tahunRilis) {
        this.nama = nama;
        this.negara = negara;
        this.durasi = durasi;
        this.tahunRilis = tahunRilis;
        this.daftarAktor = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public void tambahAktor(String aktor) {
        daftarAktor.add(aktor);
    }

    public void hapusAktor(String aktor) {
        daftarAktor.remove(aktor);
    }

    public void tampilkanDaftarAktor() {
        System.out.println("Daftar Aktor: " + daftarAktor);
    }

    public void tampilkanDataFilm() {
        System.out.println("Nama Film: " + nama);
        System.out.println("Negara: " + negara);
        System.out.println("Durasi Film: " + durasi + " menit");
        System.out.println("Tahun Rilis: " + tahunRilis);
        tampilkanDaftarAktor();
        System.out.println(" ");
    }
}
