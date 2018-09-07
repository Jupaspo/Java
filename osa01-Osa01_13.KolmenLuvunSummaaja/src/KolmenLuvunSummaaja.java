
import java.util.Scanner;

public class KolmenLuvunSummaaja {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna ensimmäinen luku: ");
        int eka = Integer.parseInt(lukija.nextLine());
        
        System.out.print("Anna toinen luku: ");
        int toka = Integer.parseInt(lukija.nextLine());

        System.out.print("Anna kolmas luku: ");
        int kolmas = Integer.parseInt(lukija.nextLine());
        
        System.out.println("Lukujen summa: " + (eka + toka + kolmas));// Toteuta ohjelmasi tähän. Muista kysyä kolmea lukua käyttäjältä!
    }
}
