
import java.util.Scanner;
import java.util.ArrayList;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Tilasto tilasto = new Tilasto();
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        while (true) {
            
            int luettu = Integer.parseInt(lukija.nextLine());// Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
    
            if (luettu == -1) {
                break;
            }
            tilasto.laskePisteet(luettu);
        }
        tilasto.tulostaTiedot();
    }
        
}
