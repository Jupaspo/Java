
import java.util.HashMap;

public class Velkakirja {
    private HashMap<String, Double> velalliset;
    
    public Velkakirja () {
        this.velalliset = new HashMap<> ();
    }
    public void asetaLaina(String kenelle, double maara) {
        this.velalliset.put(kenelle, maara);
    }
    public double paljonkoVelkaa (String kuka) {
        return this.velalliset.getOrDefault(kuka, 0.0);
    }
}
