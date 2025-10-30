public class Main {
    public static void main(String[] args) {
        Produsen produsen1 = new Produsen("Yamaha", "Jepang");
        Produsen produsen2 = new Produsen("Porsche", "Jerman");

        Kendaraan motor = new Kendaraan("Mio Gear", 2022, produsen1);
        Tank tank = new Tank("Tiger II", 1944, produsen2, 88, 1);
        Pesawat pesawat = new Pesawat("Messerschmitt Bf 109", 1936, produsen2, 250);

        motor.infoDasar();
        System.out.println();

        tank.infoTank();
        System.out.println();
        tank.tembak();
        System.out.println();
        tank.putarMeriam(450);
        System.out.println();
        tank.tembak();
        System.out.println();
        tank.tambahPeluru(45);
        System.out.println();
        tank.tembak();
        System.out.println();

        pesawat.infoPesawat();
        System.out.println();
        pesawat.setKetinggian(400);
        pesawat.setKetinggian(300);
        System.out.println();
        pesawat.tembak(30);
        System.out.println();
        pesawat.tembak(220);
        System.out.println();
        pesawat.tambahPeluru(40);
        System.out.println();
        pesawat.setKetinggian(0);
        System.out.println();
        pesawat.tambahPeluru(40);
        System.out.println();
    }
}
