import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositiveNumberTest {

    @Test
    public void testPositiefGetal() {
        assertTrue(PositiveNumber.isPositief(5));
    }

    @Test
    public void testNegatiefGetal() {
        assertFalse(PositiveNumber.isPositief(-3));
    }

    @Test
    public void testNul() {
        assertFalse(PositiveNumber.isPositief(0));
    }

}