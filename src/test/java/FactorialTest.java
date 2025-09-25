import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class FactorialTest {

    @TestFactory
    public Collection<DynamicTest> testFactorial() {
        return Arrays.asList(
                dynamicTest("Factorial van 0 is 1",() ->
                        assertEquals(1, Factorial.calculate(0))),
                dynamicTest("Factorial van 1 is 1", () ->
                        assertEquals(1, Factorial.calculate(1))),
                dynamicTest("Factorial van 2 is 2", () ->
                        assertEquals(2, Factorial.calculate(2))),
                dynamicTest("Factorial van 3 is 6", () ->
                        assertEquals(6, Factorial.calculate(3))),
                dynamicTest("Factorial van 4 is 24", () ->
                        assertEquals(24, Factorial.calculate(4))),
                dynamicTest("Factorial van 5 is 120", ()->
                        assertEquals(120, Factorial.calculate(5)))
        );
    }
}

