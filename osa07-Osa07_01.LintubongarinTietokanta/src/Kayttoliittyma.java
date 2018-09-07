
import java.util.Scanner;

public class Kayttoliittyma {
    private Scanner lukija;
    private Lintu lintu;
    private Tilasto tilasto;
    
    public Kayttoliittyma(Scanner lukija, Tilasto tilasto){
        this.lukija = lukija;
        
        this.tilasto = tilasto;
    }
    public void kaynnista(){
        while (true) {
           
            System.out.print("? ");
            String komento = lukija.nextLine();

            if (komento.equals("Lopeta")) {
                break;
            }
            komento(komento);
        }
    }
    public void komento(String komento){
        if (komento.equals("Lisaa")){
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            System.out.print("Latinankielinen nimi: ");
            String nimiLatina = lukija.nextLine();
            
            lintu = new Lintu(nimi, nimiLatina);
            tilasto.lisaa(lintu);
        } else if (komento.equals("Havainto")) {
            System.out.print("Mikä havaittu? ");
            String havaittuLintu = lukija.nextLine();
            tilasto.lisaaHavainto(havaittuLintu);
        } else if (komento.equals("Tilasto")) {
            tilasto.tulostaTilastotiedot();
        } else if (komento.equals("Nayta")) {
            System.out.print("Mikä? ");
            String naytettavaLintu = lukija.nextLine();
            tilasto.nayta(naytettavaLintu);
        } 
    }
}
