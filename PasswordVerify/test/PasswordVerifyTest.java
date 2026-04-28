import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordVerifyTest {

    @Test
    public void testVacio() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters" +
                        "La contrasenya ha de contenir almenys 2 números" +
                        "La contrasenya ha de contenir almenys una lletra majúscula" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.errores);
    }

    @Test
    public void testHola() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("hola");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters" +
                        "La contrasenya ha de contenir almenys 2 números" +
                        "La contrasenya ha de contenir almenys una lletra majúscula" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.errores);
    }

    @Test
    public void testHolacaracola() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("holacaracola");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de contenir almenys 2 números" +
                        "La contrasenya ha de contenir almenys una lletra majúscula" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.errores);
    }

    @Test
    public void testHola12() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("hola12");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters" +
                        "La contrasenya ha de contenir almenys una lletra majúscula" +
                        "La contrasenya ha de contenir almenys un caràcter especial",
                r.errores);
    }

    @Test
    public void testHolA() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("holA");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters" +
                        "La contrasenya ha de contenir almenys 2 números" +
                        "La contrasenya ha de contenir almenys un caràcter especial", r.errores);
    }

    @Test
    public void testHolaExclamacion() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("hola!");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters" +
                "La contrasenya ha de contenir almenys 2 números" +
                "La contrasenya ha de contenir almenys una lletra majúscula", r.errores);
    }

    @Test
    public void testHolaAExclamacion() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("holaA!");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters" +
                "La contrasenya ha de contenir almenys 2 números", r.errores);
    }

    @Test
    public void testHola12Exclamacion() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("hola12!");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters" +
                "La contrasenya ha de contenir almenys una lletra majúscula", r.errores);
    }

    @Test
    public void testHola12A() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("hola12A");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters" +
                "La contrasenya ha de contenir almenys un caràcter especial", r.errores);
    }

    @Test
    public void testHolacaracola12() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("holacaracola12");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de contenir almenys una lletra majúscula" +
                        "La contrasenya ha de contenir almenys un caràcter especial", r.errores);
    }
}