import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {

    @Test
    void test1() {
        assertEquals("Sí", Divisible3.esDivisible(2));
    }

    @Test
    void test2() {
        assertEquals("Sí", Divisible3.esDivisible(6));
    }

}