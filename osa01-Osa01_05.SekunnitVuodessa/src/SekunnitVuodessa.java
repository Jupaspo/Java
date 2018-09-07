
public class SekunnitVuodessa {

    public static void main(String[] args) {

        // Tässä on hieman puolitiehen jäänyt versio vuoden sekunnit
        // laskevasta ohjelmasta. Korjaapa se!
        int paiviaVuodessa = 365;
        int tuntejaPaivassa = 24;
        int minuuttejaTunnissa = 60;
        int sekuntejaMinuutissa = 60;
        int sekuntejaTunnissa = minuuttejaTunnissa * sekuntejaMinuutissa;
        int sekuntejaVuodessa = paiviaVuodessa * tuntejaPaivassa * sekuntejaTunnissa;

        // Älä muuta alla olevaa tulostuslausetta (muokkaa vain yllä olevia muuttujia ja laskua)
        System.out.println("Vuodessa on " + sekuntejaVuodessa + " sekuntia.");
    }

}
