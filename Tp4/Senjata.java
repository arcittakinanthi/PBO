public class Senjata {
    private String namaSenjata;
    private int power;

    public Senjata(String namaSenjata, int power) {
        this.namaSenjata = namaSenjata;
        this.power = power;
    }

    public String getNamaSenjata() {
        return namaSenjata;
    }

    public void setNamaSenjata(String namaSenjata) {
        this.namaSenjata = namaSenjata;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void upgrade(int power) {
        this.power += power;
        System.out.println("Senjata " + namaSenjata + " di-upgrade! Power sekarang " + this.power);
    }
}
