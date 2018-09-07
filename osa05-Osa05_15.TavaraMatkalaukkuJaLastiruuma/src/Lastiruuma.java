
import java.util.ArrayList;

public class Lastiruuma {
    private int maksimipaino;
    private int kokoPaino;
    private ArrayList<Matkalaukku> matkalaukut;
    
    public Lastiruuma(int maksimi) {
        this.maksimipaino = maksimi;
        this.matkalaukut = new ArrayList<>();
    }
    public void lisaaMatkalaukku(Matkalaukku laukku) {
        if ((laukku.yhteispaino() + this.kokoPaino) <= this.maksimipaino) {
            this.matkalaukut.add(laukku);
            this.kokoPaino = laukku.yhteispaino() + this.kokoPaino;
        }
       
    }
    public void tulostaTavarat() {
        for (Matkalaukku tulostettava : matkalaukut)
            tulostettava.tulostaTavarat();
    }
    @Override
    public String toString() {
        return matkalaukut.size() + " matkalaukkua ("+ this.kokoPaino +" kg)";
    }
}
