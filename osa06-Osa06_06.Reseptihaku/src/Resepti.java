
import java.util.ArrayList;

public class Resepti {

    private String nimi;
    private int aika;
    private ArrayList<String> raakaAineet;
    
    public Resepti(String nimi) {
        this.nimi = nimi;
        this.raakaAineet = new ArrayList<> ();
    }
    public void lisaaRaakaAine (String raakaAine) {
        this.raakaAineet.add(raakaAine);
    }
    public void lisaaKeittoaika (int aika) {
        this.aika = aika;
    }
    public int getKeittoaika (){
        return this.aika;
    }
    public String getNimi (){
        return this.nimi;
    }
    public boolean haeRaakaAine (String raakaAine) {
        for (String aine : this.raakaAineet) {
            if (aine.equals(raakaAine)) {
                return true;
            } 
            
        }
        return false;
    }
    
    public String toString (){
        return this.getNimi() + ", keittoaika: " + this.getKeittoaika();
    }

} 
