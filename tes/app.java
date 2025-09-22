import java.util.ArrayList;
import java.util.Scanner;

public class app {
    private static ArrayList<person> data = new ArrayList<>();
    private static Scanner arcitt = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Ubah Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            choice = arcitt.nextInt();
            arcitt.nextLine();

            switch (choice) {
                case 1 -> tambahData();
                case 2 -> tampilSemua();
                case 3 -> cariData();
                case 4 -> ubahData();
                case 5 -> System.out.println("Keluar");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 5);
    }

    private static void tambahData() {
        System.out.print("Masukkan ID: ");
        int id = arcitt.nextInt();
        arcitt.nextLine();

        if (findPersonById(id) != null) {
            System.out.println("ID sudah tercatat, silakan input ID unik!");
            return;
        }

        System.out.print("Masukkan Nama: ");
        String nama = arcitt.nextLine();

        data.add(new person(id, nama));
        System.out.println("Data tersimpan!");
    }

    private static void tampilSemua() {
        if (data.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            System.out.println("\nData Tersimpan");
            for (person p : data) {
                tampilData(p); 
            }
        }
    }

    private static void cariData() {
        System.out.print("Masukkan ID yang dicari: ");
        int id = arcitt.nextInt();

        person p = findPersonById(id);
        if (p != null) {
            System.out.println("Data ditemukan:");
            tampilData(p);
        } else {
            System.out.println("Data dengan ID " + id + " tidak ditemukan.");
        }
    }

    private static void ubahData() {
        System.out.print("Masukkan ID yang ingin diubah: ");
        int id = arcitt.nextInt();
        arcitt.nextLine();

        person p = findPersonById(id);
        if (p != null) {
            System.out.print("Masukkan Nama baru: ");
            String newNama = arcitt.nextLine();
            p.setNama(newNama);
            System.out.println("Data diubah");
        } else {
            System.out.println("Data dengan ID " + id + " tidak ditemukan.");
        }
    }

    private static person findPersonById(int id) {
        for (person p : data) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    private static void tampilData(person p) {
        System.out.println("ID: " + p.getId() + " | Nama: " + p.getNama());
    }
}
