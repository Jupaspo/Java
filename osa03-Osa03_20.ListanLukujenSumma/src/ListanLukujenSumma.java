
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // älä koske tässä olevaan koodiin
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.parseInt(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        
        
        int indeksi = 0;
        int summa = 0;
        while (indeksi<lista.size()) {
            summa = summa + lista.get(indeksi);
            indeksi++;
        }// toteuta listan lukujen summan laskeminen tänne
        System.out.println("Summa: " +summa);
    }
    
}
