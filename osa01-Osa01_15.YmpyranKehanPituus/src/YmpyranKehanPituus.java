
import java.util.Scanner;

public class YmpyranKehanPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna ympyrän säde: ");
        int sade = Integer.parseInt(lukija.nextLine());
        
        double keha = 2 * sade * Math.PI;
        
        System.out.println("Ympyrän kehä: " + keha);
// Toteuta ohjelmasi tähän. 
    }
}
