
import java.util.ArrayList;
import java.util.Scanner;

public class ListanSuurinLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        
        int pienin = lista.get(0);

        int indeksi = 0;
        while (indeksi < lista.size()) {
            int luku = lista.get(indeksi);
            if (pienin < luku) {
                pienin = luku;
            }

            indeksi++;
        }   

        System.out.println("Listan suurin luku: " + pienin);
        // toteuta listan lukujen summan laskeminen tänne
    }
}
