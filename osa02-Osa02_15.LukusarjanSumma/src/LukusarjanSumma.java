
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int askeltaja = 0;
        int summa = 0;
        
        System.out.print("Mihin asti? ");
        int luku = Integer.parseInt(lukija.nextLine());
        
        while (askeltaja < luku) {
            askeltaja++;
            summa = askeltaja + summa;
        }
        System.out.println("Summa on " + summa);
    }
}
