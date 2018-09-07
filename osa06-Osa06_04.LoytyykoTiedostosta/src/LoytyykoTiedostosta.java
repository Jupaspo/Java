
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;


public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();
        
        ArrayList<String> lista = new ArrayList<> ();
        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        
        try (Scanner lukija2 = new Scanner(new File(tiedosto))) {
            
            while (lukija2.hasNextLine()) {
                lista.add(lukija2.nextLine());
            }
        } catch (Exception e) {
            System.out.println("");
        }

        if (lista.isEmpty()) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        } else if (lista.contains(etsittava)) {
            System.out.println("Löytyi!");
        } else {
            System.out.println("Ei löytynyt!");
        }
        

    }
}
