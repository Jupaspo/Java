
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna luku: ");
        int vuosi = Integer.parseInt(lukija.nextLine());// Toteuta ohjelmasi tähän. 
 
        if (vuosi == 1984) {
            System.out.println("Orwell");// Toteuta ohjelmasi tähän. 
        }
    }
}
