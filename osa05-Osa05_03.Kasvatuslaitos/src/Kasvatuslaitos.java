
public class Kasvatuslaitos {
    private int lkm;

    public Kasvatuslaitos(){
        lkm = 0;
    }
    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        lkm++;
        return henkilo.getPaino();
        
    }
    public void syota(Henkilo henkilo) {
        henkilo.setPaino(henkilo.getPaino()+1);
    }
    public int punnitukset(){
        return lkm;
    }
}
