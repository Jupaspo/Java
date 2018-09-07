    
import java.util.Random;
import java.util.Scanner;

public class Numerovisa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvottuLuku = arvoLuku();
        int arvauskrt = 0;
        while (true) {
        
            System.out.print("Arvaa luku: ");// ÄLÄ MUOKKAA YLLÄOLEVIA ASIOITA -- OHJELMOI OHJELMASI ALLE
            int arvaus = Integer.parseInt(lukija.nextLine());
            arvauskrt++;
            if (arvaus == arvottuLuku) {
                System.out.println("Onneksi olkoon, oikein arvattu!");
                break;
            } else if (arvaus < arvottuLuku) {
                System.out.println("Luku on suurempi, tehtyjä arvauksia: " +arvauskrt);
            } else if (arvaus > arvottuLuku) {
                System.out.println("Luku on pienempi, tehtyjä arvauksia: " +arvauskrt);
            }
        }
    }

    // ÄLÄ MUOKKAA METODIA arvoLuku
    private static int arvoLuku() {
        return new Random().nextInt(101);
    }
}
