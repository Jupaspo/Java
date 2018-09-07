
import java.util.Scanner;

public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma (Scanner lukija, Sanakirja sanakirja) {
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    public void kaynnista() {
        System.out.println("Komennot");
        System.out.println("lisaa - lisää sanaparin sanakirjaan");
        System.out.println("kaanna - kysyy sanan ja tulostaa sen käännöksen");
        System.out.println("lopeta - poistuu käyttöliittymästä");
        while (true) {
            
            System.out.println("");
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                System.out.println("Hei hei!");;
                break;
            }
            valinta(komento);
        }
    }
    public void valinta(String komento) {
        if (komento.equals("lisaa")) {
            System.out.print("Suomeksi: ");
            String suomeksi = lukija.nextLine();
            System.out.print("Käännös: ");
            String kaannos = lukija.nextLine();
            sanakirja.lisaa(suomeksi, kaannos);
            return;
        } else if (komento.equals("kaanna")) {
            System.out.print("Anna sana:");
            String annettuSana = lukija.nextLine();
            String kaannettuSana = sanakirja.kaanna(annettuSana);
            System.out.println("Käännös: " + kaannettuSana);
            return;
        } else {
            System.out.println("Tuntematon komento.");
            return;
        }
    }
}
