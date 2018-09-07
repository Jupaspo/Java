public class Kirja {
    private String nimeke;
    private String julkaisija;
    private int julkaisuVuosi;
    
    public Kirja(String nimeke, String julkaisija, int julkaisuvuosi) {
        this.nimeke = nimeke;
        this.julkaisija = julkaisija;
        this.julkaisuVuosi = julkaisuvuosi;
    }
    public String nimeke() {
        return this.nimeke;
    }
    public String julkaisija () {
        return this.julkaisija;
    }
    public int julkaisuvuosi() {
        return this.julkaisuVuosi;
    }
    public String toString() {
        return this.nimeke()+", "+this.julkaisija()+ ", "+this.julkaisuvuosi();
    }
    
}
