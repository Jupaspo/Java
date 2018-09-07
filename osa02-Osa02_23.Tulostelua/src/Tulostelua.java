
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        int askeltaja = 0;
        while (askeltaja <maara) {
            System.out.print("*");
            askeltaja++;
        }// 22.1
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        int askeltaja2 = 0;
        while (askeltaja2 <sivunpituus){
            while (askeltaja2 < sivunpituus) {
                tulostaTahtia(sivunpituus);
                askeltaja2++;
            }

            System.out.println("");

        }// 22.2
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        int askeltaja3 = 0;
        while (askeltaja3 < korkeus) {
            tulostaTahtia(leveys);
            askeltaja3++;
        }// 22.3
    }

    public static void tulostaKolmio(int koko) {
        int askeltaja4 = 0;
        while (askeltaja4 < koko) {
            askeltaja4++;
            tulostaTahtia(askeltaja4);
        }// 22.4
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

}
