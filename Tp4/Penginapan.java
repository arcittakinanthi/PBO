import java.util.ArrayList;

public class Penginapan {
    private String namaPenginapan;
    private String alamat;
    private ArrayList<Tamu> daftarTamu;

    public Penginapan(String namaPenginapan, String alamat, Tamu tamu) {
        this.namaPenginapan = namaPenginapan;
        this.alamat = alamat;
        this.daftarTamu = new ArrayList<>();
    }

    public String getNamaPenginapan() {
        return namaPenginapan;
    }

    public void setNamaPenginapan(String namaPenginapan) {
        this.namaPenginapan = namaPenginapan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void catatMasuk(Tamu tamu) {
        daftarTamu.add(tamu);
        System.out.println(tamu.getNamaTamu() + " masuk ke penginapan " + namaPenginapan);
    }

    public void catatKeluar(String namaTamu) {
        for (int i = 0; i < daftarTamu.size(); i++) {
            if (daftarTamu.get(i).getNamaTamu().equalsIgnoreCase(namaTamu)) {
                System.out.println(namaTamu + " keluar dari penginapan " + namaPenginapan);
                daftarTamu.remove(i);
                return;
            }
        }
    }

    public void tampilkanDaftarTamu() {
        System.out.println("Daftar tamu di " + namaPenginapan + "(Alamat: " + alamat + "): ");
        for (Tamu t : daftarTamu) {
            t.tampilInfo();
        }
    }
}
