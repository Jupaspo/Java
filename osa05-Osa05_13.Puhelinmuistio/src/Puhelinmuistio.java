
import java.util.ArrayList;

public class Puhelinmuistio {
    private ArrayList<Henkilo> puhelinmuistio;
    
    
    public Puhelinmuistio() {
        this.puhelinmuistio = new ArrayList<>();
    }
    public void lisaa(String nimi, String numero) {
        Henkilo henkilo = new Henkilo(nimi, numero);
        this.puhelinmuistio.add(henkilo);
    }
    public void tulostaKaikki () {
        for (Henkilo puhelinmuistio : this.puhelinmuistio) {
            System.out.println(puhelinmuistio);
        }
    }
    public String haeNumero(String nimi) {
        int i = 0;
        while (i < this.puhelinmuistio.size()) {
        
            Henkilo henkilo = this.puhelinmuistio.get(i);
            if (henkilo.getNimi().equals(nimi)) {
                return henkilo.getNumero();
            }
            i++;
        }
        return "numero ei tiedossa";
    
        
    }
}
