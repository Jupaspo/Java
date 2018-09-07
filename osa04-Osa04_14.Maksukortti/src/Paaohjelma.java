
public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);
        
        // Tee tänne koodia jolla testaat että Maksukortti toimii halutulla tavalla
        // muista kuitenkin pyyhkiä ylimääräinen koodi pois tehtävän viimeisessä osassa!
    // Luo Pekan kortti. Kortin alkusaldo on 20 euroa
//Luo Matin kortti. Kortin alkusaldo on 30 euroa
//Pekka syö maukkaasti
//Matti syö edullisesti
//Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
//Pekka lataa rahaa 20 euroa
//Matti syö maukkaasti
//Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
//Pekka syö edullisesti
//Pekka syö edullisesti
//Matti lataa rahaa 50 euroa
//Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi
        Maksukortti pekanKortti = new Maksukortti(20);
        Maksukortti matinKortti = new Maksukortti(30);
    
        pekanKortti.syoMaukkaasti();
        matinKortti.syoEdullisesti();
    
        System.out.println("Pekka:" +pekanKortti);
        System.out.println("Matti:" +matinKortti);
        
        pekanKortti.lataaRahaa(20);
        matinKortti.syoMaukkaasti();
    
        System.out.println("Pekka:" +pekanKortti);
        System.out.println("Matti:" +matinKortti);

        pekanKortti.syoEdullisesti();
        pekanKortti.syoEdullisesti();
    
        matinKortti.lataaRahaa(50);
    
        System.out.println("Pekka:" +pekanKortti);
        System.out.println("Matti:" +matinKortti);
    }
}
