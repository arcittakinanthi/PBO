import java.util.InputMismatchException;
import java.util.Scanner;

public class avarageApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            double hasil = avarageHitung.hitungAvarage(input);
            System.out.println("Nilai rata-rata adalah: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input bukan angka!");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan lain: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
