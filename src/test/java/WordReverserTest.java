import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class WordReverserTest {

    @ParameterizedTest
    @CsvSource({
            "Java, avaJ",
            "Tamara, aramaT",
            "lepel, lepel",
            "'', ''",
            "'-', '-'",
            "a1, 1a",
            "'Hello World', 'dlroW olleH'"
    })
    void testReverse(String input, String expected) {
        assertEquals(expected, WordReverser.reverse(input));
    }
}

