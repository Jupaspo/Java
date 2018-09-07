public class Maksukortti {
    private double saldo;
    
    public Maksukortti(double saldoAlussa) {
        this.saldo = saldoAlussa;
    }
    public String toString (){
        return "Kortilla on rahaa "+this.saldo+ " euroa";
    }
    public void syoEdullisesti (){
        if ((this.saldo-2.60)>= 0){
            this.saldo=this.saldo -2.60;
        }
    }
    public void syoMaukkaasti (){
        if ((this.saldo-4.60)>= 0){
            this.saldo=this.saldo -4.60;
        }
    }
    public void lataaRahaa(double rahamaara) {
        if (rahamaara > 0){
            this.saldo=this.saldo + rahamaara;
        
            if (this.saldo >= 150) {
                this.saldo = 150;
            }
        }
    }    
}
