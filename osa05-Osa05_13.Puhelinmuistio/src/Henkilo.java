public class Henkilo {
    private String nimi;
    private String numero;
    
    public Henkilo(String nimi, String numero) {
        this.nimi = nimi;
        this.numero = numero;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public String getNumero(){
        return this.numero;
    }
    public void vaihdaNumeroa(String uusiNumero) {
        this.numero = uusiNumero;
    }
    public String toString() {
        return getNimi() + " " + "puh: " + getNumero();
    }
}
