import java.util.Scanner;

public class userApp {
    public static void main(String[] args) {
        Scanner arcitt = new Scanner(System.in);
        userSistem auth = new userSistem();
        int pilihan;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Lihat Profile");
            System.out.println("4. Logout");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = arcitt.nextInt();
            arcitt.nextLine();

            try {
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan email : ");
                        String email = arcitt.nextLine();
                        System.out.print("Masukkan fullname : ");
                        String fullName = arcitt.nextLine();
                        System.out.print("Masukkan password : ");
                        String password = arcitt.nextLine();
                        auth.register(email, fullName, password);
                        break;
                    case 2:
                        System.out.print("Masukkan email : ");
                        String logEmail = arcitt.nextLine();
                        System.out.print("Masukkan password : ");
                        String logPass = arcitt.nextLine();
                        auth.login(logEmail, logPass);
                        break;
                    case 3:
                        auth.tampilProfil();
                        break;
                    case 4:
                        auth.logout();
                        break;
                    case 0:
                        System.out.println("Program selesai. Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (BadRequestException | ConflictException | UnAuthorizedException e) {
                System.out.println(e.getMessage());
            }
        } while (pilihan != 0);
    }
}
