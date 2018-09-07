public class Kirja {
    private String nimi;
    private int sivut;
    private int vuosi;
    
    public Kirja(String nimi, int sivut, int vuosi) {
        this.nimi = nimi;
        this.sivut = sivut;
        this.vuosi = vuosi;
    }
    public String tulostaNimet () {
        return this.nimi;
    }
    
    @Override
    public String toString(){
        return this.nimi +", " + this.sivut + " sivua, " + this.vuosi;
    }
}
