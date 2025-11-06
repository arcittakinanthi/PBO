public class Senjata {
    private String nama;
    private int power;

    public Senjata(String nama, int power) {
        this.nama = nama;
        this.power = power;
    }

    public String getNama() {
        return nama;
    }

    public int getPower() {
        return power;
    }

    public void attack() {
        System.out.println("Senjata " + nama + " menyerang dengan kekuatan " + power);
    }

    public void attack(String jurus) {
        System.out.println("Senjata " + nama + " menggunakan jurus " + jurus + " dengan kekuatan " + (power * 2) + "!");
    }
}