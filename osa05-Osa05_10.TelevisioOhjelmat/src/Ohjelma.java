
public class Ohjelma {

    private String nimi;
    private int pituus;

    public Ohjelma(String nimi, int pituus) {
        this.nimi = nimi;
        this.pituus = pituus;
    }

    public boolean onHuippu() {
        return this.nimi.contains("MasterChef");
    }
    
    public boolean maksimi (int maksimi) {

        
        if (this.pituus <= maksimi)  {
            return true;
        }
        return false;
    } 

    public String getNimi() {
        return nimi;
    }

    public int getPituus() {
        return pituus;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.pituus + " minuuttia";
    }
}
