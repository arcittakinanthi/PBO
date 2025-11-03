public class Lingkaran {

    // Method overloading #1
    // Menghitung luas berdasarkan jari-jari (float)
    public static double hitungLuas(float r) {
        return Math.PI * r * r;
    }

    // Method overloading #2
    // Menghitung luas berdasarkan diameter (double)
    public static double hitungLuas(double diameter) {
        double r = diameter / 2;
        return Math.PI * r * r;
    }

    // Method overloading #3
    // Menghitung keliling berdasarkan jari-jari
    public static double hitungKeliling(float r) {
        return 2 * Math.PI * r;
    }

    // Method overloading #4
    // Menghitung keliling berdasarkan diameter
    public static double hitungKeliling(double diameter) {
        return Math.PI * diameter;
    }
}