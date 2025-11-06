public class TongkatSihir extends Senjata{
    private boolean isEffective;

    public TongkatSihir(String nama, int power, boolean isEffective) {
        super(nama, power);
        this.isEffective = isEffective;
    }

    @Override
    public void attack() {
        System.out.println("Tongkat Sihir " + getNama() + " melancarkan mantra dengan kekuatan " + getPower() + ".");
    }

    @Override
    public void attack(String jurus) {
        if (isEffective) {
            System.out.println("Tongkat Sihir " + getNama() + " mengeluarkan mantra " + jurus + " dengan kekuatan " + getPower() * 10 + "!" + " Efektif? : Ya");
        } else {
            System.out.println("Tongkat Sihir " + getNama() + " mengeluarkan mantra " + jurus + " dengan kekuatan " + getPower() / 2 + "!" + " Efektif? : Tidak");
        }
    }
}
