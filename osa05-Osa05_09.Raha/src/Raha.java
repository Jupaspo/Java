
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa += senttia / 100;
            senttia %= 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return euroa;
    }

    public int sentit() {
        return senttia;
    }
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(lisattava.euroa + this.euroa, lisattava.senttia+ this.senttia);
        return uusi;
    }
    public boolean vahemman(Raha verrattava) {
        double luku1 = (double) verrattava.euroa + (double) verrattava.senttia/100;
        double luku2 = (double) this.euroa + (double) this.senttia/100; 
        if (luku1 >= luku2) {
            return true;
        }
        return false;
    }
    public Raha miinus(Raha vahentaja) {

        
        if ((-vahentaja.euroa + this.euroa) <0) {
            Raha uusi = new Raha (0,0);
            return uusi; 
        } else if (this.senttia - vahentaja.senttia <0){
            Raha uusi = new Raha((this.euroa- vahentaja.euroa-1),(100 - vahentaja.senttia));
            
            return uusi;
        } else {
            Raha uusi = new Raha((this.euroa- vahentaja.euroa),(this.senttia- vahentaja.senttia));
            
            return uusi;            

        }
    }

    public String toString() {
        String nolla = "";
        if (senttia < 10) {
            nolla = "0";
        }

        return euroa + "." + nolla + senttia + "e";
    }

}
