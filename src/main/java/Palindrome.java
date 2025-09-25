public class Palindrome {
    public static boolean isPalindrome(String input) {
        // Controleer of de input null is of alleen uit spaties bestaat
        if (input == null || input.trim().isEmpty()) {
            return false;
        }

        // Verwijder spaties aan het begin en einde van de string
        String trimmed = input.trim();

        // Draai de string om met StringBuilder
        String reversed = new StringBuilder(trimmed).reverse().toString();

        // Vergelijk de originele string met de omgekeerde string
        return trimmed.equals(reversed);
    }
}