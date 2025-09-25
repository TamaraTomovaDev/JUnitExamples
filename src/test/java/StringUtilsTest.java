import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    // Test voor reverse
    @Test
    public void testReverseAllCases(){
        assertEquals("olleH", StringUtils.reverse("Hello")); // normale string
        assertEquals("olleh", StringUtils.reverse("hello")); // kleine letters
        assertEquals("", StringUtils.reverse("")); // lege string
        assertNull(StringUtils.reverse(null)); // null input
        assertEquals("lepel", StringUtils.reverse("lepel")); // palindroom
    }

    // Test voor isPalindrome
    @ParameterizedTest
    @ValueSource(strings = {"lepel", "LEPEL", "a","12321",""})
    public void testIsPalindromeTrueCases(String input){
        assertTrue(StringUtils.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Java", "Hello", "Lepel"})
    public void testIsPalindromeFalseCases(String input){
        assertFalse(StringUtils.isPalindrome(input));
    }

    @Test
    public void testIsPalindromeNull(){
        assertFalse(StringUtils.isPalindrome(null));
    }

    // Test voor capitalize
    @ParameterizedTest
    @CsvSource({
            "hello, Hello",
            "Java, Java",
            "'',''",
            "a, A",
            "'lepel', 'Lepel'"
    })
    public void testCapitalize(String input, String expected){
        assertEquals(expected,StringUtils.capitalize(input));
    }
    @Test
    public void testCapitalizeNull(){
        assertNull(StringUtils.capitalize(null));
    }

    // Test voor CountVowels
    @Test
    public void testCountVowelsAllCases(){
        assertEquals(2, StringUtils.countVowels("Hello")); // normale string met klinkers
        assertEquals(0, StringUtils.countVowels("zrtpsd")); // string zonder klinkers
        assertEquals(0, StringUtils.countVowels("")); // lege string
        assertEquals(0, StringUtils.countVowels(null)); // null input
        assertEquals(5, StringUtils.countVowels("AEoUI")); // hofdletters
    }
}
