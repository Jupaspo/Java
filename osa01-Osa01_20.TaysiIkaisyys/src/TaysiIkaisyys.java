
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kuinka vanha olet? ");
        int ika = Integer.parseInt(lukija.nextLine());// Toteuta ohjelmasi tähän. 
 
        if (ika <= 17) {
            System.out.println("Et ole täysi-ikäinen!");
        } else {
            System.out.println("Olet täysi-ikäinen!");
        } // Toteuta ohjelmasi tähän. 
    }
}
