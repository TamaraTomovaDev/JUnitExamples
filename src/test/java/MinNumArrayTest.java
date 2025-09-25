import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinNumArrayTest {

    @Test
    public void testFindMinNumArray1() {
        int[] array = {4, 2, 7, 1, 9};
        assertEquals(1, MinNumArray.findMin(array));
    }

    @Test
    public void testFindMinNumArray2() {
        int[] array = {-3, -7, -1, -5};
        assertEquals(-7, MinNumArray.findMin(array));
    }

    @Test
    public void testFindMinNumArray3() {
        int[] array = {-7, 4, -44, 6};
        assertEquals(-44, MinNumArray.findMin(array));
    }

}
