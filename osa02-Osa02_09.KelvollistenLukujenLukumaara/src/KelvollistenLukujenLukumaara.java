
import java.util.Scanner;

public class KelvollistenLukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int askeltaja = 0;
        
        while (true) {
        
            System.out.print("Syötä luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
        
            if (luku == 9999) {
                break;
            }            
            
            if (luku > 20 || luku < -140) {
                System.out.println("Kelvoton luku");
            } else {
                askeltaja = askeltaja + 1;
            }
            
         
        }
        System.out.println("");
        System.out.println("Kelvollisia lukuja yhteensä: " + askeltaja);
    }
}
