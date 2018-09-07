
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;

        System.out.print("Anna ensimmäinen luku: " );// KIRJOITA OHJELMA TÄHÄN
        summa = summa + Integer.parseInt(lukija.nextLine());

        System.out.print("Anna toinen luku: " );// KIRJOITA OHJELMA TÄHÄN
        summa = summa + Integer.parseInt(lukija.nextLine());

        System.out.print("Anna kolmas luku: " );// KIRJOITA OHJELMA TÄHÄN
        summa = summa + Integer.parseInt(lukija.nextLine());



// ÄLÄ KÄYTÄ MUITA MUUTTUJIA KUIN lukija ja summa !
        System.out.println("Summa: " + summa);
    }
}
