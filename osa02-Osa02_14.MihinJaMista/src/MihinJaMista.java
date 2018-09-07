
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int askeltaja = 0;
        
        System.out.print("Mihin asti? ");// KIRJOITA OHJELMASI TÄNNE
        int lukuyla = Integer.parseInt(lukija.nextLine());
        
        System.out.print("Mistä lähtien? ");// KIRJOITA OHJELMASI TÄNNE
        int lukuala = Integer.parseInt(lukija.nextLine());
        
        while (lukuyla > askeltaja) {
            
            if (lukuyla < lukuala) {
                break;
            }
            
            askeltaja = lukuala ;
            System.out.println(askeltaja);
            askeltaja = lukuala++;
        }
            
    }
}
