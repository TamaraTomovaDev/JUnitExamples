import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void testReverse1() {
        assertEquals("aramaT", StringUtils.reverse("Tamara"));
    }
    @Test
    public void testReverse2(){
        assertTrue(true,StringUtils.reverse("tamara") );
    }
    @Test
    public void testReverse3(){
        assertTrue(true, StringUtils.reverse(""));
    }
}
