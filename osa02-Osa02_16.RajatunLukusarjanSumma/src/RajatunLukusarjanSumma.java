
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int askeltaja = 0;
        int summa = 0;
        
        System.out.print("Ensimmäinen: ");
        int eka = Integer.parseInt(lukija.nextLine());

        System.out.print("Viimeinen: ");
        int vika = Integer.parseInt(lukija.nextLine());
        
        while (eka <= vika) {
            askeltaja=  eka++;
            summa = askeltaja + summa;
        }
        System.out.println("Summa on " + summa);
    }
}
