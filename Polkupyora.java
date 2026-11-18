public class Polkupyora extends Ajoneuvo {

    private int polkupyoranKoko;

public Polkupyora(String merkki, int polkupyoranKoko){
    super(merkki);
    this.polkupyoranKoko = polkupyoranKoko;
}

public void naytaPolkupyoranKoko(){
    System.out.println("Polkupyörän koko: " + polkupyoranKoko + "\"");
}
    
}
