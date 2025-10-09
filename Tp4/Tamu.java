public class Tamu {
    private String namaTamu;
    private int durasiMenginap;

    public Tamu(String namaTamu, int durasiMenginap) {
        this.namaTamu = namaTamu;
        this.durasiMenginap = durasiMenginap;
    }

    public String getNamaTamu() {
        return namaTamu;
    }

    public void setNamaTamu(String namaTamu) {
        this.namaTamu = namaTamu;
    }

    public int getDurasiMenginap() {
        return durasiMenginap;
    }

    public void setDurasiMenginap(int durasiMenginap) {
        this.durasiMenginap = durasiMenginap;
    }

    public void tampilInfo() {
        System.out.println("- " + namaTamu + " (" + durasiMenginap + " hari)");
    }
}
