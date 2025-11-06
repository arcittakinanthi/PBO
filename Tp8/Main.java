public class Main {
    public static void main(String[] args) {
        Senjata s1 = new Pedang("Roukanken", 50, 3.5);
        Senjata s2 = new Panah("Moon Bow", 30, 2);
        Senjata s3 = new TongkatSihir("Gohei", 40, true);

        s1.attack();
        s2.attack();
        s3.attack();

        System.out.println();

        s1.attack("Hesitation-Cutting 'Slash of Departing from Hesitation'");
        s2.attack("Heaven's Curse 'Apollo 13'");
        s3.attack("Spirit Sign 'Fantasy Seal'");
    }
}
