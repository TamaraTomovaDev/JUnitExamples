import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @Test
    public void testPalindrome(){
        assertTrue(Palindrome.isPalindrome("lepel"));
    }

    @Test
    public void testPalindromeHoofdletter(){
        assertFalse(Palindrome.isPalindrome("LePel"));
    }

    @Test
    public void testPalindromeMetSpaties(){
        assertFalse(Palindrome.isPalindrome("le pel"));
    }

    @Test
    public void testPalindromeMetLegeString(){
        assertFalse(Palindrome.isPalindrome(""));
    }

    @Test
    public void testPalindromeMetNull(){
        assertFalse(Palindrome.isPalindrome(null));
    }

    @Test
    public void testGeenPalindrome(){
        assertFalse(Palindrome.isPalindrome("java"));
    }

    @Test
    public void testPalindromeMetCijfers() {
        assertTrue(Palindrome.isPalindrome("12321"));
    }
}

