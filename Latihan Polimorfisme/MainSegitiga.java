import java.util.Scanner;

public class MainSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SegitigaSiku s = new SegitigaSiku();
        int pilihan;

        do {
            System.out.println("\n=== HITUNG SEGITIGA SIKU-SIKU ===");
            System.out.println("1. Berdasarkan alas & tinggi");
            System.out.println("2. Berdasarkan alas & sisi miring");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan alas: ");
                    double alas1 = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();
                    System.out.printf("Luas      : %.2f\n", s.hitungLuas(alas1, tinggi));
                    System.out.printf("Keliling  : %.2f\n", s.hitungKeliling(alas1, tinggi));
                    break;

                case 2:
                    System.out.print("Masukkan alas: ");
                    double alas2 = input.nextDouble();
                    System.out.print("Masukkan sisi miring: ");
                    double miring = input.nextDouble();

                    if (miring <= alas2) {
                        System.out.println("Error: sisi miring harus lebih panjang dari alas!");
                    } else {
                        System.out.printf("Luas      : %.2f\n", s.hitungLuasDenganMiring(alas2, miring));
                        System.out.printf("Keliling  : %.2f\n", s.hitungKelilingDenganMiring(alas2, miring));
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}