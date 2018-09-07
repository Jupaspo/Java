
import java.util.Scanner;

public class Wanha {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

 
        System.out.print("Anna vuosiluku: ");
        int vuosi = Integer.parseInt(lukija.nextLine());// Toteuta ohjelmasi tähän. 
 
        if (vuosi < 2015) {
            System.out.println("Wanha!");
        }// Toteuta ohjelmasi tähän. 
    }
}
