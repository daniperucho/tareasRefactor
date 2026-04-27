import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordVerifyTest {

    @Test
    public void testVacio() {
        PasswordVerify.PasswordResultado r = PasswordVerify.valido("");
        assertFalse(r.valido);
        assertEquals("La contrasenya ha de tenir almenys 8 caràcters\n" + "La contrasenya ha de contenir almenys 2 números\n" +
                "La contrasenya ha de contenir almenys una lletra majúscula\n" + "La contrasenya ha de contenir almenys un caràcter especial",
                r.errores);
    }
}