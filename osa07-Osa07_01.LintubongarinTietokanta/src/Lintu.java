public class Lintu {
    private String nimi;
    private String latinaNimi;
    private int havainto;
    
    public Lintu(String nimi, String latinaNimi) {
        this.nimi = nimi;
        this.latinaNimi = latinaNimi;
        this.havainto = 0;
    }
    
    public void lisaaHavainto () {
        this.havainto++;
    }
    
    public String getNimi () {
        return this.nimi;
    }
    
    public String getlatinaNimi () {
        return this.latinaNimi;
    }    
    
    public int gethavainnot () {
        return this.havainto;
    }
    
    public void setHavainto () {
        this.havainto++;
    }
    
    @Override
    public String toString(){
        return this.nimi + " ("+ this.latinaNimi + (" ) :" + this.havainto + "havaintoa."); 
    }
}
