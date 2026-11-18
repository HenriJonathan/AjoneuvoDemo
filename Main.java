public class Main {
    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Toyota", 5);
        Moottoripyora pyora1 = new Moottoripyora("Honda", 600);
        Moottoripyora pyora2 = new Moottoripyora("Yamaha", 1000);
        Polkupyora fillari1 = new Polkupyora("Tunturi", 27);

        auto1.naytaTiedot();
        auto1.naytaOvienMaara();

    System.out.println(""); // Väli

        pyora1.naytaTiedot();
        pyora1.naytaMoottorinTilavuus();

    System.out.println(""); // Väli

        pyora2.naytaTiedot();
        pyora2.naytaMoottorinTilavuus();

    System.out.println(""); // Väli

        fillari1.naytaTiedot();
        fillari1.naytaPolkupyoranKoko();

    }
}
