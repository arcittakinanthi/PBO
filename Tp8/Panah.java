public class Panah extends Senjata {
    private int rangeBonus;

    public Panah(String nama, int power, int rangeBonus) {
        super(nama, power);
        this.rangeBonus = rangeBonus;
    }

    @Override
    public void attack() {
        System.out.println("Panah " + getNama() + " menembakkan anak panah dengan kekuatan " + getPower() + ".");
    }

    @Override
    public void attack(String jurus) {
        double totalPower = getPower() * rangeBonus;
        System.out.println("Panah " + getNama() + " menembakkan anak panah khusus dengan " + jurus + " dengan kekuatan " + totalPower + "!");
    }
}
