public class Pahlawan {
    private String namaPahlawan;
    private int health;
    private int level;
    private Senjata senjata;

    public Pahlawan(String namaPahlawan, int health, int level, Senjata senjata) {
        this.namaPahlawan = namaPahlawan;
        this.health = health;
        this.level = level;
        this.senjata = senjata;
    }

    public String getNamaPahlawan() {
        return namaPahlawan;
    }

    public void setNamaPahlawan(String namaPahlawan) {
        this.namaPahlawan = namaPahlawan;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void menyerang() {
        System.out.println(namaPahlawan + " menyerang dengan " +
            senjata.getNamaSenjata() + " (Power: " + senjata.getPower() + " )");
    }

    public void upgrade(int power) {
        senjata.upgrade(power);
    }
}