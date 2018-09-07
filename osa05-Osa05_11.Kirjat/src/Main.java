
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            
            if (nimi.equals("")) {
                break;
            }
            System.out.print("Sivuja: ");
            int sivut = Integer.parseInt(lukija.nextLine());
            System.out.print("Kirjoitusvuosi: ");
            int vuosi = Integer.parseInt(lukija.nextLine());
            kirjat.add(new Kirja(nimi, sivut, vuosi));
        }
        
        System.out.print("Mitä tulostetaan? ");
        String komento = lukija.nextLine();
        if (komento.equals("kaikki")) {
            int i = 0;
            while (i < kirjat.size()) {
                System.out.println(kirjat.get(i));
                i++;    
            }
                
            
        } else if (komento.equals("nimi")) {
            int a = 0;
            while (a < kirjat.size()) {
                System.out.println(kirjat.get(a).tulostaNimet());
                a++;
            }
        }    
    }
}
