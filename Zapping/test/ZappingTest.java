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

    @Test
    void testCanal10al30() {
        assertEquals(20, Zapping.clics(10, 30));
    }

    @Test
    void testCanal2al99() {
        assertEquals(2, Zapping.clics(99, 2));
    }
}
