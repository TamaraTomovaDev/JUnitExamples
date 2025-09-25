import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberEvenOrOddTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, -6})
    void testEvenNumbers(int number) {
        assertEquals(number + " is Even", NumberEvenOrOdd.checkNumberParity(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,5,9,11,-9,-11})
    void testOddNumbers(int number){
        assertEquals(number + " is Oneven", NumberEvenOrOdd.checkNumberParity(number));
    }
}
