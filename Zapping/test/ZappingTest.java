import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZappingTest {

    @Test
    void testCanal0al0() {
        assertEquals(0, Zapping.clics(0, 0));
    }
    @Test
    void testCanal1al2() {
        assertEquals(1, Zapping.clics(1, 2));
    }
}
