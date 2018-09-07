
import java.util.ArrayList;

public class Tilasto {
    private ArrayList<Integer> luvut;

    
    public Tilasto() {
        this.luvut = new ArrayList<> ();

    }
    public void laskePisteet (int pisteet) {
        if (pisteet < 0 || pisteet >100) {
            return;
        } else {
            this.luvut.add(pisteet); 
        }
    }



    public void tulostaTiedot () {
        System.out.println("Pisteiden keskiarvo (kaikki): " + this.luvut.stream().mapToInt(i -> i).average().getAsDouble());
        System.out.println("Pisteiden keskiarvo (hyväksytyt): " + this.luvut.stream().filter(i -> i > 69).mapToInt(i -> i).average().getAsDouble());
        System.out.println("Hyväksymisprosentti: " + 100.00 * ((int) this.luvut.stream().filter(i -> i > 69).count()) / this.luvut.size());
        System.out.println("Arvosanajakauma: ");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + maarienTulostus(i));
        }
    }
        

    private String maarienTulostus(int arvosana) {
        int tahtienLukumaara = (int) luvut.stream().map(p -> laskeArvosana(p)).filter(a -> a == arvosana).count();
        String tahdet = "";
        for (int i = 0; i < tahtienLukumaara; i++) {
            tahdet += "*";
        }
        return tahdet;
    }

    private int laskeArvosana(int pisteet) {
        int arvosana = 5;

        if (pisteet < 70) {
            arvosana = 0;
        } else if (pisteet < 76) {
            arvosana = 1;
        } else if (pisteet < 81) {
            arvosana = 2;
        } else if (pisteet < 86) {
            arvosana = 3;
        } else if (pisteet < 91) {
            arvosana = 4;
        }
        return arvosana;
    }
}
