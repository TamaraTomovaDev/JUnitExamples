public class StringUtils {

    // Methode die retourneert de omgekeerde string
    public static String reverse (String s){
        if (s == null){
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }

    // Methode die retourneert true als de string een palindroom is, anders false
    public static boolean isPalindrome(String s){
        if(s == null){
            return false;
        }
        String reversed = reverse(s);
        return s.equals(reversed);
    }

    // Methode maakt de eerste letter van de string hoofdletter
    public static String capitalize(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    // Methode retourneert het aantal klinkers (a,e,i,o,u) in de string
//    public static String countVowels(String s){
//
//    }

}
