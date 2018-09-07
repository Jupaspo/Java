
public class Main {

    public static void main(String[] args) {
        // voit kirjoittaa testikoodia tänne
        Asunto eiraYksio = new Asunto(1, 20, 1000);
        Asunto kallioKaksio = new Asunto(2, 30, 2000);
        Asunto jakomakiKolmio = new Asunto(2, 23, 1500);
        System.out.println(eiraYksio.suurempi(kallioKaksio));       // false
        System.out.println(jakomakiKolmio.suurempi(kallioKaksio));
        System.out.println(eiraYksio.hintaero(kallioKaksio));        // 71600
        System.out.println(jakomakiKolmio.hintaero(kallioKaksio));   // 35400
    }
}
