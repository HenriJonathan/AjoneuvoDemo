public class Moottoripyora extends Ajoneuvo{

    private int moottorinTilavuus;

public Moottoripyora(String merkki, int moottorinTilavuus){
    super(merkki);
    this.moottorinTilavuus = moottorinTilavuus;
}

public void naytaMoottorinTilavuus(){
    System.out.println("Moottorin tilavuus: " + moottorinTilavuus + " cm3");
}
    
}
