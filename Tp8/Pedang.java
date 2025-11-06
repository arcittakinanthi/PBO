public class Pedang extends Senjata {
    private double critBonus;

    public Pedang(String nama, int power, double critBonus) {
        super(nama, power);
        this.critBonus = critBonus;
    }

    @Override
    public void attack() {
        System.out.println("Pedang " + getNama() + " menebas dengan kekuatan " + getPower() + ".");
    }

    @Override
    public void attack(String jurus) {
        double totalPower = getPower() * critBonus;
        System.out.println("Pedang " + getNama() + " menebas dengan " + jurus + " dengan kekuatan " + totalPower + "!");
    }
}
