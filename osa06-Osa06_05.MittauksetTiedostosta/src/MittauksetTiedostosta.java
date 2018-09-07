
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.parseInt(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.parseInt(lukija.nextLine());
        
        ArrayList<Integer> lista = new ArrayList<> ();
        try (Scanner lukija2 = new Scanner(new File(tiedosto))) {
            
            while (lukija2.hasNextLine()) {
                lista.add(Integer.parseInt(lukija2.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Virhe" + e.getMessage());
        }
        int lkm = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) >= alaraja && lista.get(i)<= ylaraja){
                lkm++;
            }
        }
        System.out.println("Lukuja: " + lkm);
    }

}
