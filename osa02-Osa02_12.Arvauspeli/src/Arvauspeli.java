
import java.util.Scanner;

public class Arvauspeli {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvattava = 7;
        int askeltaja = 0;
        System.out.println("Minäpä tiedän luvun väliltä 1-10, jota sinä et tiedä!");
        
        while (true) {
        
            System.out.print("Arvaa luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == arvattava) {
                askeltaja = askeltaja +1;
                break;
            }
            
            if (luku > 10  || luku < 1) {
                System.out.println("Epäkelpo luku!");
            } else {
                System.out.println("Ei ollut!");
                askeltaja= askeltaja +1;
            }
            
        }
        System.out.print("Oikein! ");
        System.out.println("Arvauksia yhteensä: " + askeltaja); 
    }
}
