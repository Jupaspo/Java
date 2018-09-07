
import java.util.ArrayList;

public class Kirjasto {
    private ArrayList<Kirja> kirjat;    
    
    public Kirjasto() {
        this.kirjat = new ArrayList<> ();
    }
    public void lisaaKirja(Kirja uusiKirja) {
        this.kirjat.add(uusiKirja);
    }
    public void tulostaKirjat() {
        for (Kirja kirjat: this.kirjat) {
            System.out.println(kirjat);
        }
    }
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke) {
        ArrayList<Kirja> loydetyt = new ArrayList<>(); // luodaan uusi lista löydettettyjä kirjoja varten
        
        for (Kirja kirjat: this.kirjat) { // käydään läpi kaikki kirjat ja jos sama nimeke niin lisätään listaan
            if (StringUtils.sisaltaa(kirjat.nimeke(), nimeke)) {
                loydetyt.add(kirjat);
            }
        }
        return loydetyt;
    
    }
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija) {
        ArrayList<Kirja> loydetyt = new ArrayList<>(); // luodaan uusi lista löydettettyjä kirjoja varten
        
        for (Kirja kirjat: this.kirjat) { // käydään läpi kaikki kirjat ja jos sama nimeke niin lisätään listaan
            if (StringUtils.sisaltaa(kirjat.julkaisija(), julkaisija)) {
                loydetyt.add(kirjat);
            }
        }
        return loydetyt;
    
    }
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi) {
        ArrayList<Kirja> loydetyt = new ArrayList<>(); // luodaan uusi lista löydettettyjä kirjoja varten
        
        for (Kirja kirjat: this.kirjat) { // käydään läpi kaikki kirjat ja jos sama nimeke niin lisätään listaan
            if (kirjat.julkaisuvuosi() == julkaisuvuosi) {
                loydetyt.add(kirjat);
            }
        }
        return loydetyt;
    
    }

}
