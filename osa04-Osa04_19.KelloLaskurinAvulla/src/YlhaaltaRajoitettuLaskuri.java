public class YlhaaltaRajoitettuLaskuri {
    private int laskuri;
    private int ylaraja;
    
    public YlhaaltaRajoitettuLaskuri(int ylaraja) {
        this.laskuri = 0;
        this.ylaraja = ylaraja;
    }
    public void seuraava() {
        if (this.laskuri < this.ylaraja) {
            this.laskuri++;
        } else {
            this.laskuri = 0;
        }
    }
    public String toString (){
        if (laskuri < 10){
            return "0" +this.laskuri;
        } else {
            return "" +this.laskuri;
        }
        
    }
    public int arvo() {
        return this.laskuri;
    }
    public void asetaArvo(int arvo){
        if (arvo >0 && arvo <= this.ylaraja) {
            this.laskuri = arvo;
        }
        
    }
}
