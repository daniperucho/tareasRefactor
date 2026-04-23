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

    @Test
    void test3() {
        assertEquals("No", Divisible3.esDivisible(4));
    }

    @Test
    void test4() {
        assertEquals("No", Divisible3.esDivisible(1));
    }

    @Test
    void test5() {
        assertEquals("Sí", Divisible3.esDivisible(11));
    }

    @Test
    void test6() {
        assertEquals("Sí", Divisible3.esDivisible(9));
    }

    @Test
    void test7() {
        assertEquals("No", Divisible3.esDivisible(25));
    }

    @Test
    void test8() {
        assertEquals("Sí", Divisible3.esDivisible(26));
    }

}