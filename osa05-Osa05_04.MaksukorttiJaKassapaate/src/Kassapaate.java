
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        this.rahaa = 1000;// kassassa on aluksi 1000 euroa rahaa
    }

    public double syoEdullisesti(double maksu) {
        if (maksu>=2.50) {
            double vaihtoraha = maksu - 2.50;// edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
            this.rahaa = this.rahaa + 2.50;
            this.edulliset++;
            return vaihtoraha;
        }
        return maksu;
    }

    public double syoMaukkaasti(double maksu) {
        if (maksu>=4.30) {
            double vaihtoraha = maksu -4.30;
            this.rahaa = this.rahaa + 4.30; // edullinen lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
            this.maukkaat++;
            return vaihtoraha;
        }
        return maksu;
    }
    public boolean syoEdullisesti(Maksukortti kortti) {
        if (kortti.otaRahaa(2.50)) {
            this.edulliset++;
            return true;
        }// edullinen lounas maksaa 2.50 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        return false;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        if (kortti.otaRahaa(4.30)) {
            this.maukkaat++;
            return true;
        }// maukas lounas maksaa 4.30 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        return false;
    }
    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0) {
            kortti.lataaRahaa(summa);
            this.rahaa = this.rahaa + summa;// ...
        }
    }


    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
