
import java.util.HashMap;
import java.util.Scanner;

public class KiviPaperiSakset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        HashMap<String, Integer> muisti = new HashMap<>();
        String viimeisimmat = "";

        int voitot = 0;
        int tappiot = 0;
        int tasapelit = 0;

        while (true) {
            // peli päättyy kun jommalla kummalla on yli 25 pistettä
            if (voitot >= 25 || tappiot >= 25) {
                break;
            }


            String tietokoneenArvaus = seuraavaArvaus(muisti, viimeisimmat);

            System.out.print("Syötä k, p tai s: ");
            String pelaajanSyote = lukija.nextLine();
            if (!pelaajanSyote.equals("k") && !pelaajanSyote.equals("p") && !pelaajanSyote.equals("s")) {
                System.out.println("höpönlöpön..");
                continue;
            }

            if (tasapeli(pelaajanSyote, tietokoneenArvaus)) {
                tasapelit++;
            } else if (pelaajaVoitti(pelaajanSyote, tietokoneenArvaus)) {
                tappiot++;
            } else if (pelaajaHavisi(pelaajanSyote, tietokoneenArvaus)) {
                voitot++;
            } else {
                System.out.println("Epämääräinen pelitilanne. Pelaaja valitsi " + pelaajanSyote + ", tietokone arvasi " + tietokoneenArvaus);
            }


            System.out.println("Pelaaja: " + pelaajanSyote + ", tekoäly: " + tietokoneenArvaus + ".");
            System.out.println("Tietokoneen voitot: " + voitot);
            System.out.println("Pelaajan voitot: " + tappiot);
            System.out.println("Tasapelit: " + tasapelit);

            System.out.println();
        }

        System.out.println("Peli päättyi.");
    }

    public static String seuraavaArvaus(HashMap<String, Integer> muisti, String viimeisimmat) {
        return "k";
    }

    public static boolean tasapeli(String pelaaja, String tietokone) {
        return pelaaja.equals(tietokone);
    }

    public static boolean pelaajaVoitti(String pelaaja, String tietokone) {
        return ekaVoitti(pelaaja, tietokone);
    }

    public static boolean pelaajaHavisi(String pelaaja, String tietokone) {
        return ekaVoitti(tietokone, pelaaja);
    }

    public static boolean ekaVoitti(String eka, String toka) {
        if (eka.equals("k") && toka.equals("s")) {
            return true;
        }

        if (eka.equals("p") && toka.equals("k")) {
            return true;
        }

        if (eka.equals("s") && toka.equals("p")) {
            return true;
        }

        return false;
    }
}
