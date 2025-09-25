import java.util.Scanner;

public class balokBolaApp {
    public static void main(String[] args) {
        Scanner arcitt = new Scanner(System.in);
        int menu;

        do {
            System.out.println("1. Balok");
            System.out.println("2. Bola");
            System.out.println("3. Keluar");
            System.out.print(" ");
            menu = arcitt.nextInt();

            switch (menu) {
                case 1:
                    hitungBalok(arcitt);
                    break;
                case 2:
                    hitungBola(arcitt);
                    break;
            }
            System.out.println();
        } while (menu != 3);    

        arcitt.close();
    }

    public static void hitungBalok(Scanner arcitt) {
        System.out.println("Masukkan Panjang: ");
        double p = arcitt.nextDouble();
        System.out.println("Masukkan Lebar: ");
        double l = arcitt.nextDouble();
        System.out.println("Masukkan Tinggi: ");
        double t = arcitt.nextDouble();

        double lpBalok = 2 * ((p * l) + (p * t) + (l * t));
        double volumeBalok = p * l * t;

        System.out.println("Luas Permukaan Balok: " + lpBalok);
        System.out.println("Volume Balok: " + volumeBalok);
    }

    public static void hitungBola(Scanner arcitt) {
        System.out.println("Masukkan jari-jari: ");
        double r = arcitt.nextDouble();

        double lpBola = 4 * 22/7 * r * r;
        double volumeBola = 4/3 * 22/7 * r * r * r;

        System.out.println("Luas Permukaan Bola: " + lpBola);
        System.out.println("Volume Bola: " + volumeBola);
    }
}