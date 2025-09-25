import java.util.ArrayList;
import java.util.Scanner;

public class nilaiPBO {
        private static ArrayList<Double> kelas01 = new ArrayList<>();
        private static ArrayList<Double> kelas02 = new ArrayList<>();
        private static ArrayList<Double> kelas03 = new ArrayList<>();
        private static ArrayList<Double> kelas04 = new ArrayList<>();
        private static Scanner arcitt = new Scanner(System.in);
    
        public static void main(String[] args) {
            int menu;
            do {
                System.out.println("1. Input Nilai Kelas: ");
                System.out.println("2. Lihat Nilai Tiap Kelas: ");
                System.out.println("3. Rata-rata Tiap Kelas: ");
                System.out.println("4. Rata-rata Keseluruhan: ");
                System.out.println("5. Keluar");
                System.out.print(" ");
                menu = arcitt.nextInt();
 
                switch (menu) {
                    case 1: inputNilai(arcitt); break;
                    case 2: lihatNilai(arcitt); break;
                    case 3: rataRataKelas(arcitt); break;
                    case 4: rataRataSemua(arcitt); break;
                    default: break;
                }
                System.out.println();
            } while (menu != 5);

            arcitt.close();
        }

        public static void inputNilai(Scanner arcitt) {
            System.out.println("Pilih kelas (01/02/03/04): ");
            String kelas = arcitt.next();
            System.out.println("Masukkan nilai: ");
            double nilai = arcitt.nextDouble();

            switch (kelas) {
                case "01": kelas01.add(nilai); break;
                case "02": kelas02.add(nilai); break;
                case "03": kelas03.add(nilai); break;
                case "04": kelas04.add(nilai); break;
                default: System.out.println("Kelas tidak valid"); break;
            }
            System.out.println("Input selesai untuk kelas " + kelas);
        }

        private static void lihatNilai(Scanner arcitt) {
            System.out.println("Daftar nilai tiap kelas");
            System.out.println("Nilai Kelas 01: " + kelas01);
            System.out.println("Nilai Kelas 02: " + kelas02);
            System.out.println("Nilai Kelas 03: " + kelas03);
            System.out.println("Nilai Kelas 04: " + kelas04);
        }

        private static void rataRataKelas(Scanner arcitt) {
            tampilStatis("Kelas 01", kelas01);
            tampilStatis("Kelas 02", kelas02);
            tampilStatis("Kelas 03", kelas03);
            tampilStatis("Kelas 04", kelas04);
        }

        private static void rataRataSemua(Scanner arcitt) {
            ArrayList<Double> semua = new ArrayList<>();
            semua.addAll(kelas01);
            semua.addAll(kelas02);
            semua.addAll(kelas03);
            semua.addAll(kelas04);

            tampilStatis("Keseluruhan", semua);
        }

        private static void tampilStatis(String namaKelas, ArrayList<Double> data) {
            if (data.isEmpty()) {
                System.out.println(namaKelas + ": belum ada data.");
                return;
            }

            double total = 0, min = data.get(0), max = data.get(0);
            for (double n : data) {
                total += n;
                if (n < min) min = n;
                if (n > max) max = n;
            }
            double rata = total / data.size();

            System.out.println(namaKelas);
            System.out.println("Rata-rata: " + rata);
            System.out.println("Tertinggi: " + max);
            System.out.println("Terendah: " + min);
        }

}
