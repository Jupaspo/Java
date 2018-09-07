
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa Ohjelma käyttävä ohjelmasi tänne

        ArrayList<Ohjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            
            if (nimi.equals("")) {
                break;
            }
            System.out.print("Pituus: ");
            int pituus = Integer.parseInt(lukija.nextLine());
            ohjelmat.add(new Ohjelma(nimi, pituus));
        }
        
        System.out.print("Ohjelman maksimipituus? ");
        int maksimi = Integer.parseInt(lukija.nextLine());
        int i = 0;
        while (i < ohjelmat.size()) {
            if (ohjelmat.get(i).maksimi(maksimi)) {
                System.out.println(ohjelmat.get(i));
            }
            i++;
        }
        
 
        
    }
}
