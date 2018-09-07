
import java.util.Scanner;

public class PositiivinenLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());// Toteuta ohjelmasi tähän. 
 
        if (luku < 1) {
            System.out.println("Luku ei ole positiivinen.");
        } else {
            System.out.println("Luku on positiivinen.");
        }// Toteuta ohjelmasi tähän. 
    }
}
