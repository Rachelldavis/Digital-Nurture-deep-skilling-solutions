
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(2)
    void secondTest() {
        assertEquals(4, 2 * 2);
    }

    @Test
    @Order(1)
    void firstTest() {
        assertTrue(true);
    }

    @Test
    @Order(3)
    void thirdTest() {
        assertFalse(false);
    }
}
