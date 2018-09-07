
import java.util.ArrayList;

public class Tilasto {
    private ArrayList<Lintu> havainnot;
    
    public Tilasto(){
        this.havainnot = new ArrayList<> ();
        
    }
    
    public void lisaaHavainto (String havaittuLintu) {
        boolean onkoOlemassa = false;
        for (Lintu lintu: this.havainnot) {
            if (havaittuLintu.equals(lintu.getNimi())) {
                lintu.setHavainto();
                onkoOlemassa = true;
            }
            
        }
        if (!onkoOlemassa) {
            System.out.println("Ei ole lintu!");
        }
    }
    public void lisaa (Lintu lintu) {
        this.havainnot.add(lintu);
    }
    public void tulostaTilastotiedot() {
        for (Lintu lintu: this.havainnot) {
            System.out.println(lintu.getNimi() +" ("+lintu.getlatinaNimi()+") "+lintu.gethavainnot()+" havaintoa.");
        }
    }
    public void nayta(String nimi) {
        for (Lintu lintu: this.havainnot) {
            if (lintu.getNimi().equals(nimi)) {
                System.out.println(lintu.getNimi() +" ("+lintu.getlatinaNimi()+") "+lintu.gethavainnot()+" havaintoa.");
            }
        }
    }
}
