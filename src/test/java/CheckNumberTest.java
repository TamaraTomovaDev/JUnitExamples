import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckNumberTest {
    @Test
    public void testPositiveNumber(){
        assertTrue(CheckNumber.checkNumber(5));
    }

    @Test
    public void testNegativeNumber(){
        assertFalse(CheckNumber.checkNumber(-4));
    }

    @Test
    public void testNul(){
        assertFalse(CheckNumber.checkNumber(0));
    }
}
