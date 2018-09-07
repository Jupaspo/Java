
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mikä tulostetaan? ");
        String merkkijono = lukija.nextLine();// Toteuta ohjelmasi tähän.
        System.out.println(merkkijono + merkkijono + merkkijono);
    }
}
