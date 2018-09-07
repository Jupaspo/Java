
import java.util.Scanner;

public class KelvollistenLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa = 0;
        int hyvaksytytluvut = 0;
        int hylatytluvut = 0;
        
        while (true) {
        
            System.out.print("Syötä luku: ");
            int luku = Integer.parseInt(lukija.nextLine());
        
            if (luku == 9999) {
                break;
            }            
            
            if (luku > 20 || luku < -140) {
                System.out.println("Kelvoton luku");
            } else {
                summa = luku + summa;
            }
            
         
        }
        System.out.println("");
        System.out.println("Kelvollisten lukujen summa: " + summa);

    }
}
