
import java.util.ArrayList;
import java.util.HashMap;

public class Sanakirja {
        private HashMap<String, String> sanakirja;
        
    public Sanakirja() {
        this.sanakirja = new HashMap<> ();
    }
    public String kaanna(String sana) {
        return this.sanakirja.getOrDefault(sana, null);
    }
    public void lisaa(String sana, String kaannos) {
        this.sanakirja.put(sana, kaannos);
    }
    public int sanojenLukumaara(){
        return this.sanakirja.size();
    }
    public ArrayList<String> kaannoksetListana() {
        ArrayList<String> sanalista = new ArrayList<> ();
        for (String avain: this.sanakirja.keySet()) {
            sanalista.add(avain+ " = " + sanakirja.get(avain));
        }
        return sanalista;
    }
}
