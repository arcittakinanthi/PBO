public class Main1 {
    public static void main(String[] args) {
        Senjata paluAjaib = new Senjata("Palu Mjolnir", 2500);
        Senjata perisaiBintang = new Senjata("Perisai Vibranium", 2000);

        Pahlawan thor = new Pahlawan("Thor", 100, 10, paluAjaib);
        Pahlawan captainAmerica = new Pahlawan("Captain America", 100, 9, perisaiBintang);

        System.out.println("Pertarungan dimulai");
        thor.menyerang();
        captainAmerica.menyerang();

        System.out.println("\nUpgrade senjata");
        thor.upgrade(3000);
        captainAmerica.upgrade(3500);

        System.out.println("\nSetelah upgrade");
        thor.menyerang();
        captainAmerica.menyerang();
    }
}
