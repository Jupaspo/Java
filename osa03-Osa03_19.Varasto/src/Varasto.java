
import java.util.ArrayList;
import java.util.Scanner;

public class Varasto {

    public static void main(String[] args) {
        ArrayList<String> varastolista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
      
        while (true) {
            System.out.println("Syötä komento (lisaa, poista, hae, lopeta):");
            String vastaus = lukija.nextLine();
        
            if (vastaus.equals("lopeta")) {
                break;
            }
        
            System.out.println("Syötä esine:");
            String esine = lukija.nextLine();
        
                    
            if (vastaus.equals("lisaa")) {
                varastolista.add(esine);
            } else if (vastaus.equals("poista")) {
                varastolista.remove(esine);
            } else if (vastaus.equals("hae") && varastolista.contains(esine) == true) {
                System.out.println("Esine " + esine + " löytyy varastosta.");
            } else if (vastaus.equals("hae") && varastolista.contains(esine) == false) {
                System.out.println("Esine " + esine + " ei löydy varastosta.");
            }
            
        }
    }    
}
