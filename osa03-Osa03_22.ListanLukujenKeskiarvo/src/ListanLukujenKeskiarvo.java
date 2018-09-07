
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

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
        
        System.out.print("Mitä etsitään? ");
        int kysytty = Integer.parseInt(lukija.nextLine());
        
        int indeksi = 0;
        int summa = 0;
        while (indeksi<lista.size()) {
            
            if (lista.get(indeksi) == kysytty) {
                System.out.println("Luku " + kysytty +" on indeksissä " + indeksi);
            }
            
            indeksi++;
        }
        if (lista.contains(kysytty) == false) {
            System.out.println("Lukua " +kysytty+" ei löydy.");
        }

    }
}
