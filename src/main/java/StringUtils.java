public class StringUtils {

    // Methode die retourneert de omgekeerde string
    public static String reverse (String s){
        if (s == null){
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }

    // Methode die controleert of een string een palindroom is
    public static boolean isPalindrome(String s){
        if(s == null){
            return false;
        }
        String reversed = reverse(s);
        return s.equals(reversed);
    }

    // Methode die de eerste letter van een string omzet naar hoofdletter
    public static String capitalize(String s){
        if (s == null || s.isEmpty()){
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    // Methode die het aantal klinkers in een string telt
    public static int countVowels(String s){
        if (s == null) {
            return 0;
        }
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++){
            if(vowels.indexOf(s.charAt(i)) != -1){
                count++;
            }
        }
        return count;
    }

}
