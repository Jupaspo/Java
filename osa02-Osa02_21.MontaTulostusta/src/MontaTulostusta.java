import java.util.Scanner;

public class MontaTulostusta {
    // HUOM: älä muuta metodin määrittelevää eli seuraavaa riviä!
    // (tässä tehtävässä ei ole vielä tarkoitus laittaa metodille parametria)
    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");// kirjoita koodia tähän
    }

    public static void main(String[] args) {
        // kysy käyttäjältä, montako kertaa teksti tulostetaan
        // kutsu metodia tulostaTeksti while-komennon avulla useita kertoja
        Scanner lukija = new Scanner(System.in);
        
        int askeltaja=0;
        
        System.out.println("Kuinka monta?");
        int luku = Integer.parseInt(lukija.nextLine());
        
        while (askeltaja < luku ) {
            tulostaTeksti();
            askeltaja++;
        }
    }
}
