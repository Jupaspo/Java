
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.Reflex;
import java.lang.reflect.Field;
import org.junit.Test;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;

@Points("04-04")
public class LuokkahuoneTest {

    @Test
    public void luokkaOlemassa() {
        try {
            Reflex.reflect("Luokkahuone").requirePublic();
        } catch (Throwable t) {
            Assert.fail("Olethan luonut luokan Luokkahuone? Tarkista, että nimi on kirjoitettu täsmälleen oikein.");
        }
    }

    @Test
    public void kaksiOliomuuttujaa() {
        luokkaOlemassa();
        int olioMuuttujia = Reflex.reflect("Luokkahuone").cls().getDeclaredFields().length;
        Assert.assertTrue("Teithän luokalle Luokkahuone kaksi oliomuuttujaa? Nyt oliomuuttujia oli " + olioMuuttujia, olioMuuttujia == 2);
    }

    @Test
    public void oliomuuttujaStringKoodiJokaPrivate() {
        oliomuuttujanTarkistus("koodi", String.class, "private String koodi");
    }

    @Test
    public void oliomuuttujaIntIstumapaikatJokaPrivate() {
        oliomuuttujanTarkistus("istumapaikat", int.class, "private int istumapaikat");
    }

    @Test
    public void onKonstruktori() {
        luokkaOlemassa();

        try {
            Reflex.reflect("Luokkahuone").constructor().taking(String.class, int.class).requireExists();
        } catch (Throwable t) {
            Assert.fail("Olethan luonut luokalle Luokkahuone konstruktorin public Luokkahuone(String luokanKoodi, int istumapaikkojenMaara)? Tarkista, että nimi on kirjoitettu täsmälleen oikein.");
        }
    }

    @Test
    public void konstruktoriAsettaaArvonKoodille() {
        onKonstruktori();

        Object luokka = null;
        try {
            luokka = Reflex.reflect("Luokkahuone").constructor().taking(String.class, int.class).invoke("b221", 25);
        } catch (Throwable t) {
            Assert.fail("Konstruktorikutsu new Luokkahuone(\"b221\", 25); epäonnistui. Tarkista konstruktorin toiminta.");
        }

        Assert.assertEquals("Konstruktorin tulee asettaa parametrina annettu arvo oliomuuttujan arvoksi. Nyt oliomuuttujaa \"koodi\" ei asetettu.", "b221", oliomuuttujanArvo(luokka, "koodi"));
    }

    @Test
    public void konstruktoriAsettaaArvonKoodilleOsa2() {
        onKonstruktori();

        Object luokka = null;
        try {
            luokka = Reflex.reflect("Luokkahuone").constructor().taking(String.class, int.class).invoke("b215", 75);
        } catch (Throwable t) {
            Assert.fail("Konstruktorikutsu new Luokkahuone(\"b215\", 75); epäonnistui. Tarkista konstruktorin toiminta.");
        }

        Assert.assertEquals("Konstruktorin tulee asettaa parametrina annettu arvo oliomuuttujan arvoksi. Nyt oliomuuttujaa \"koodi\" ei asetettu.", "b215", oliomuuttujanArvo(luokka, "koodi"));
    }

    @Test
    public void konstruktoriAsettaaArvonIstumapaikoille() {
        onKonstruktori();

        Object luokka = null;
        try {
            luokka = Reflex.reflect("Luokkahuone").constructor().taking(String.class, int.class).invoke("b221", 25);
        } catch (Throwable t) {
            Assert.fail("Konstruktorikutsu new Luokkahuone(\"b221\", 25); epäonnistui. Tarkista konstruktorin toiminta.");
        }

        Assert.assertEquals("Konstruktorin tulee asettaa parametrina annettu arvo oliomuuttujan arvoksi. Nyt oliomuuttujaa \"istumapaikat\" ei asetettu.", 25, oliomuuttujanArvoInt(luokka, "istumapaikat"));
    }

    @Test
    public void konstruktoriAsettaaArvonIstumapaikoilleOsa2() {
        onKonstruktori();

        Object luokka = null;
        try {
            luokka = Reflex.reflect("Luokkahuone").constructor().taking(String.class, int.class).invoke("b215", 75);
        } catch (Throwable t) {
            Assert.fail("Konstruktorikutsu new Luokkahuone(\"b215\", 75); epäonnistui. Tarkista konstruktorin toiminta.");
        }

        Assert.assertEquals("Konstruktorin tulee asettaa parametrina annettu arvo oliomuuttujan arvoksi. Nyt oliomuuttujaa \"istumapaikat\" ei asetettu.", 75, oliomuuttujanArvoInt(luokka, "istumapaikat"));
    }

    private void oliomuuttujanTarkistus(String muuttujanNimi, Class tyyppi, String merkkijonona) {
        kaksiOliomuuttujaa();

        Field nimi = null;

        try {
            nimi = Reflex.reflect("Luokkahuone").cls().getDeclaredField(muuttujanNimi);
        } catch (NoSuchFieldException e) {
            Assert.fail("Onhan luokalla Luokkahuone oliomuuttuja \"" + merkkijonona + ";\"?");
        }

        Assert.assertTrue("Onhan luokalla Luokkahuone oliomuuttuja \"" + merkkijonona + ";\"?", nimi.getType().equals(tyyppi));
        Assert.assertFalse("Onhan luokalla Luokkahuone oliomuuttuja \"" + merkkijonona + ";\"?", nimi.isAccessible());
    }

    public String oliomuuttujanArvo(Object object, String muuttujanNimi) {

        Field kentta = null;

        try {
            kentta = Reflex.reflect("Luokkahuone").cls().getDeclaredField(muuttujanNimi);
        } catch (NoSuchFieldException e) {
            Assert.fail("Onhan luokalla Luokkahuone oliomuuttuja nimeltä " + muuttujanNimi + "?");
        }

        kentta.setAccessible(true);

        try {
            return (String) kentta.get(object);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(LuokkahuoneTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LuokkahuoneTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public int oliomuuttujanArvoInt(Object object, String muuttujanNimi) {

        Field kentta = null;

        try {
            kentta = Reflex.reflect("Luokkahuone").cls().getDeclaredField(muuttujanNimi);
        } catch (NoSuchFieldException e) {
            Assert.fail("Onhan luokalla Luokkahuone oliomuuttuja nimeltä " + muuttujanNimi + "?");
        }

        kentta.setAccessible(true);

        try {
            return (int) kentta.get(object);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(LuokkahuoneTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LuokkahuoneTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }
}
