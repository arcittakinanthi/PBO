import java.util.InputMismatchException;
import java.util.Scanner;

public class avarageHitung {
    public static double hitungAvarage(Scanner input) throws ArithmeticException, InputMismatchException {
        System.out.println("Berapa banyak nilai yang ingin dimasukkan?");
        int banyakNilai = input.nextInt();

        if (banyakNilai == 0) {
            throw new ArithmeticException("Tidak ada masukkan nilai!");
        }

        double total = 0;
        for (int i = 1; i <= banyakNilai; i++) {
            System.out.println("Masukkan nilai ke-" + i + ": ");
            double nilai = input.nextDouble();
            total += nilai;
        }

        return total / banyakNilai;
    }
}