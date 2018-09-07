
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattavana) {
        if (verrattavana.nelioita < this.nelioita) {
            return true;
        }
        return false;
    }
    public int hintaero(Asunto verrattava) {
        return Math.abs(verrattava.neliohinta*verrattava.nelioita - this.neliohinta*this.nelioita);
    }
    public boolean kalliimpi(Asunto verrattava) {
        int asunto1 = verrattava.neliohinta*verrattava.nelioita;
        int asunto2 =  this.neliohinta*this.nelioita;
        if (asunto2 > asunto1) {
            return true;
        }
        return false;
    }

}
