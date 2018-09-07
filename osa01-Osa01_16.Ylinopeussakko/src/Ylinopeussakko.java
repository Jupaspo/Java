
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kerro nopeus: ");
        int nopeus = Integer.parseInt(lukija.nextLine());// Toteuta ohjelmasi tähän. 
 
        if (nopeus > 120) {
            System.out.println("Ylinopeussakko!");
        }
    }
}
