
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna pisteet [0-100]: ");
        int piste = Integer.parseInt(lukija.nextLine());// Toteuta ohjelmasi tähän. 
        
        if (piste < 0) {
            System.out.println("mahdotonta!");
        } else if (piste < 70) {
            System.out.println("hylätty");
        } else if (piste < 75) {
            System.out.println("1");
        } else if (piste < 81) {
            System.out.println("2");
        } else if (piste < 86) {
            System.out.println("3");
        } else if (piste < 91) {
            System.out.println("4");
        } else if (piste < 101) {
            System.out.println("5");
        } else if (piste < 999) {
            System.out.println("uskomatonta!");
        }
    }
}
