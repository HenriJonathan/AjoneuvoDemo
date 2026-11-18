public class Auto extends Ajoneuvo {
    
    private int ovienMaara;

public Auto(String merkki, int ovienMaara){
    super(merkki);
    this.ovienMaara = ovienMaara;

}

public void naytaOvienMaara() {
    System.out.println("Ovien määrä: " + ovienMaara);
}



}
