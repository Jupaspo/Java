
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        int askeltaja = 0;
        while (askeltaja <maara) {
            System.out.print("*");
            askeltaja++;
        }// 22.1
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        int askeltaja2 = 0;
        while (askeltaja2 <maara) {
            System.out.print(" ");// 02-24.1
            askeltaja2++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int askeltaja3 = 0;// 02-24.2
        while (askeltaja3 <koko) {
            askeltaja3++;
            tulostaTyhjaa((koko - askeltaja3));
            tulostaTahtia(askeltaja3);
        }
        
    }

    public static void jouluKuusi(int korkeus) {
        int askeltaja4 = 0;// 02-24.3
        
        while (askeltaja4 < korkeus) {
            askeltaja4++;
            tulostaTyhjaa((korkeus - askeltaja4));
            tulostaTahtia(askeltaja4 + (askeltaja4 -1));
        }
        int kanta = 2;
        tulostaTyhjaa((korkeus - kanta));
        tulostaTahtia(kanta +(kanta-1));

        tulostaTyhjaa((korkeus - kanta));
        tulostaTahtia(kanta +(kanta-1));

    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
