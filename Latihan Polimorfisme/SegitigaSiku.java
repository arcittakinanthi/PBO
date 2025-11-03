public class SegitigaSiku {

    // Method overloading #1
    // Luas berdasarkan alas dan tinggi
    public double hitungLuas(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    // Method overloading #2
    // Luas berdasarkan alas dan sisi miring
    public double hitungLuasDenganMiring(double alas, double miring) {
        double tinggi = Math.sqrt(Math.pow(miring, 2) - Math.pow(alas, 2));
        return 0.5 * alas * tinggi;
    }

    // Method overloading #3
    // Keliling berdasarkan alas dan tinggi
    public double hitungKeliling(double alas, double tinggi) {
        double miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + miring;
    }

    // Method overloading #4
    // Keliling berdasarkan alas dan sisi miring
    public double hitungKelilingDenganMiring(double alas, double miring) {
        double tinggi = Math.sqrt(Math.pow(miring, 2) - Math.pow(alas, 2));
        return alas + tinggi + miring;
    }
}