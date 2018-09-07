public class StringUtils {


    public static boolean sisaltaa(String sana, String haettava) {
        String sanaTrimmattuna = sana.trim().toUpperCase();
        String haettavaTrimmattuna = haettava.trim().toUpperCase();
        if (sanaTrimmattuna.contains(haettavaTrimmattuna)) {
            return true;
        } else if (sanaTrimmattuna == "" || haettavaTrimmattuna == "") {
            return false;
        }
        return false;
        
    }

    
}
