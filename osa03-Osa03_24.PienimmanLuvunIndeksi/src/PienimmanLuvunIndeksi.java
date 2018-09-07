
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == 9999) {
                break;
            }// toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
            lista.add(luettu);// kunnes käyttäjä syöttää luvun 9999
        }
        int indeksi = 0;// tämän jälkeen ohjelma tulostaa pienimmän luvun
        int pienin = lista.get(0);
           
        while (indeksi < lista.size()) {
            int luku = lista.get(indeksi);
            if (luku < pienin) {
                pienin = luku;
            }
            indeksi++;
        }// sekä sen indeksin -- pienin luku voi esiintyä
        System.out.println("Pienin luku on " +pienin);// useammassa indeksissä
        
        indeksi = 0;
        while (indeksi<lista.size()) {
            
            if (lista.get(indeksi) == pienin) {
                System.out.println("Luku " + pienin +" on indeksissä " + indeksi);
            }
            
            indeksi++;
        }
    }
}
