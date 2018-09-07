
import java.util.ArrayList;
import java.util.Scanner;

public class Ajatustenlukija {

    public static void main(String[] args) {
        ArrayList<String> arvaukset = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        int indeksi = -1;
        int tietokoneVoitto = 0;
        int pelaajaVoitto = 0;
        int hoota = 0;
        int teeta = 0;
        
        while (true) {
            indeksi++;
            System.out.print("Syötä h tai t: ");
            String arvaus = lukija.nextLine();
            arvaukset.add(arvaus);
            
            if (arvaus.equals("h")){
                hoota++;
            } else {
                teeta++;
            }
            
            String konearvaus = "t";
        
            if (arvaukset.size() <= 3) {
                konearvaus = "h";
                System.out.println("Syötit " + arvaus + ", arvasin "+ konearvaus +".");

            } else if (arvaukset.size() > 3) {
            
                String vika = arvaukset.get(arvaukset.size()-2);
                String tokavika = arvaukset.get(arvaukset.size()-3);
                System.out.println("***VIKA " +vika);
                System.out.println("****TOKAVIKA " +tokavika);
                System.out.println("***INDEKSI" +arvaukset.get(indeksi-1));
                System.out.println("***INDEKSI-1" +arvaukset.get(indeksi-2));
                if (tokavika.equals(arvaukset.get(indeksi-1)) == true && vika.equals(arvaukset.get(indeksi-2)) == true) {
                    System.out.println("***HEP");
                    if (teeta > hoota || teeta == hoota) {
                        System.out.println("***TEeta ENEMMÄN");
                        konearvaus = "t";
                    } else if (hoota > teeta) {
                        System.out.println("***HOota ENEMMÄN");
                        konearvaus = "h";
                    }
                }    
                System.out.println("Syötit " + arvaus + ", arvasin "+ konearvaus +".");
            } else {
                System.out.println("Syötit " + arvaus + ", arvasin "+ konearvaus +".");
            }
            
            if (konearvaus.equals(arvaukset.get(indeksi)) == true) {
                tietokoneVoitto++;
            } else {
                pelaajaVoitto++;
            }
            
        
            System.out.println("Tietokoneen voitot: " + tietokoneVoitto);
            System.out.println("Pelaajan voitot: " + pelaajaVoitto);
            System.out.println("");
            
            System.out.println("***Indeksin arvo. " +indeksi);
            System.out.println("***H. " +hoota);
            System.out.println("***T. " +teeta);
            System.out.println("***Konearvaus. " +konearvaus);
            System.out.println("***Koko " +arvaukset.size());
            System.out.println("***");
            
            if (tietokoneVoitto >= 25 || pelaajaVoitto >= 25) {
                break;
            }
        
        
        }
                            
    }
}