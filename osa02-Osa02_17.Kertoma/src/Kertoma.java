import java.util.Scanner;

public class Kertoma {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int kertoma = 1;
        int askeltaja = 1;
        
        System.out.print("Anna luku: ");
        int luku = Integer.parseInt(lukija.nextLine());
        
        while (askeltaja < luku) {
            kertoma = kertoma * (askeltaja +1);
            askeltaja++;
        }
        
        System.out.println("Kertoma on " + kertoma);
    }
}
