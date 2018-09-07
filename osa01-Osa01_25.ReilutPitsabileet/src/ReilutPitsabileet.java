
import java.util.Scanner;

public class ReilutPitsabileet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
    
        
        System.out.print("Montako osallistujaa? ");
        int osal = Integer.parseInt(lukija.nextLine());// Toteuta ohjelmasi tähän. 
        
        System.out.print("Montako pitsaa? ");
        int pizza = Integer.parseInt(lukija.nextLine());
        
        System.out.print("Montako palaa per pitsa? ");
        int pala = Integer.parseInt(lukija.nextLine());
        
        int jakojaannos = (pizza * pala) % osal;
            
        System.out.println("Paloja jää yli: " +jakojaannos);
        
    }
}
