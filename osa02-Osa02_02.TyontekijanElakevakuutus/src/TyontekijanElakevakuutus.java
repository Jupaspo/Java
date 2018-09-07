
import java.util.Scanner;

public class TyontekijanElakevakuutus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
    
        System.out.print("Syötä bruttopalkka: ");
        double palkka = Double.parseDouble(lukija.nextLine());
        
        double tyonantajatyel = palkka * 0.18;
        double tyonantajakust = palkka + tyonantajatyel;
        
        double tyontekijatyel = palkka * 0.06;
        double tyontekijakust = palkka - tyontekijatyel;
        
        double tyelkulu = tyonantajatyel + tyontekijatyel;
        
        System.out.println("Työnantaja maksaa TyEL-maksuja: " + tyonantajatyel);
        System.out.println("Työntekijän kustannus työnantajalle vähintään: " + tyonantajakust);
        System.out.println("");
        System.out.println("Työntekijä maksaa TyEL-maksuja: " + tyontekijatyel);
        System.out.println("Työntekijän palkka TyEL-maksun jälkee: " + tyontekijakust);
        System.out.println("");
        System.out.println("TyEL-kulut yhteensä: " +tyelkulu);
    }
}
