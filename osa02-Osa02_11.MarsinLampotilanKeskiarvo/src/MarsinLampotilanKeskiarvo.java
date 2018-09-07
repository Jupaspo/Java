
import java.util.Scanner;

public class MarsinLampotilanKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int askeltaja = 0;
        int summa = 0;
        int hyvaksytytluvut = 0;
        int hylatytluvut = 0;
        
        while (true) {
        
            System.out.print("Syötä mittaus: ");
            int luku = Integer.parseInt(lukija.nextLine());
        
            if (luku == 9999) {
                break;
            }            
            
            if (luku > 20 || luku < -140) {
                continue;
            } else {
                summa = luku + summa;
                askeltaja= askeltaja +1;
            }
            
         
        }
        System.out.println("");
        System.out.println("Mittausten keskiarvo: " + ((double) summa / (double) askeltaja));
        
    }
}
