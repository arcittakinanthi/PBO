public class MainLingkaran {
    public static void main(String[] args) {
        System.out.println("=== HITUNG LINGKARAN ===");

        float r1 = 7f;
        float r2 = 5.5f;
        double d1 = 20.4;

        System.out.println("\nLingkaran dengan jari-jari " + r1);
        System.out.println("Luas      : " + Lingkaran.hitungLuas(r1));   
        System.out.println("Keliling  : " + Lingkaran.hitungKeliling(r1)); 

        System.out.println("\nLingkaran dengan jari-jari " + r2);
        System.out.println("Luas      : " + Lingkaran.hitungLuas(r2));     
        System.out.println("Keliling  : " + Lingkaran.hitungKeliling(r2)); 

        System.out.println("\nLingkaran dengan diameter " + d1);
        System.out.println("Luas      : " + Lingkaran.hitungLuas(d1));  
        System.out.println("Keliling  : " + Lingkaran.hitungKeliling(d1)); 
    }
}