
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        
        int askeltaja = 0;
        int summa = 0;
        int kerta = 0;
        int parillinen = 0;
        int pariton = 0;
        System.out.println("Syötä luvut: ");

        while (askeltaja != -1){    
            int luku = Integer.parseInt(lukija.nextLine());
            summa = summa + luku;
            askeltaja=luku;
            kerta++;
            if (luku % 2 == 0 && luku != -1) {
                parillinen++;
            } else if (luku % 2 != 0 && luku != -1) {
                pariton++;
            }
        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " +(summa + 1));
        System.out.println("Lukuja: " +(kerta -1));
        System.out.println("Keskiarvo: " + ((double) (summa+1)/ (double) (kerta-1)));
        System.out.println("Parillisia: " + parillinen);
        System.out.println("Parittomia: " + pariton);
    }
}
