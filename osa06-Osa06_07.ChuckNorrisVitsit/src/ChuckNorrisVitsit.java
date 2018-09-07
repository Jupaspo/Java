import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ChuckNorrisVitsit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta vitsien lukeminen tässä
        ArrayList<String> rivit = new ArrayList<>();

        while (true) {
            System.out.print("Mitä tehdään? ");
            String tehtava = lukija.nextLine();
            
            
//            if (tehtava.equals("satunnainen")) {
//                String osoite = "http://api.icndb.com/jokes/random";
//            } else if (tehtava.equals("vitsi")) {
//                System.out.println("Numero?");
//                int numero = Integer.parseInt(lukija.nextLine());
//                osoite = "http://api.icndb.com/jokes/"+ numero;
//            } else if (tehtava.equals("lopeta")) {
//                break;
//            }
//            System.out.println(osoite);
            try (Scanner webbilukija = new Scanner(new URL("http://api.icndb.com/jokes/random").openStream())) {
                
            while (webbilukija.hasNextLine()) {
                rivit.add(webbilukija.nextLine());
            }
            } catch (Exception e) {
                System.out.println("Virhe: " + e.getMessage());
            }
            for (int i =0; i < rivit.size(); i++) {
                System.out.println(rivit.get(i));
            } 

        }
    }
}
