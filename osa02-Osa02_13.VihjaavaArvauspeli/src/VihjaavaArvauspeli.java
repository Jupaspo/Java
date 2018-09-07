
import java.util.Scanner;

public class VihjaavaArvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kun olet palauttanut tehtävän ja saanut siitä pisteet,
        // kokeile myös seuraavaa: 
        // int arvattava = (int) (1 + Math.random() * 100);

        int arvattava = 42;
        int askeltaja = 0;
        
        System.out.println("Minäpä tiedän luvun väliltä 1-100, jota sinä et tiedä!");
        
        while (true) {
        
            System.out.print("Arvaa luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
        
            if (luku == arvattava) {
                askeltaja = askeltaja +1;
                break;
            }
            
            
            if (luku > arvattava && luku <= 100) {
                System.out.println("Lukuni on piemenpi!");
                askeltaja = askeltaja +1;
            }   else if (luku < arvattava && luku >= 1) {
                System.out.println("Lukuni on isompi!");
                askeltaja = askeltaja +1;
            }   else {
                System.out.println("Epäkelpo luku!");
            }
            
        }
        System.out.println("Oikein! Arvauksia yhteensä: " +askeltaja);
    }
}
