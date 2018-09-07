public class Lukutilasto {
    private int lukujenmaara;
    private int summa;
    
    public Lukutilasto(){
        this.lukujenmaara = 0;
        this.summa = 0;
    }
    
    public void lisaaLuku(int luku){
        this.summa = this.summa + luku; 
        this.lukujenmaara++;
    }
    public int haeLukujenMaara(){
        return lukujenmaara;
    }
    public int summa(){
        if (lukujenmaara > 0){
            return summa;
        }
        return 0;
    }
    public double keskiarvo(){
        if (lukujenmaara>0){
            return (double) summa / (double) lukujenmaara;
        }
        return 0;
    }
}
