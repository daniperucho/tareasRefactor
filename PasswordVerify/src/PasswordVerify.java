import java.util.EnumMap;
import java.util.Enumeration;

public class PasswordVerify {

    public static class PasswordResultado {
        public boolean valido;
        public String errores = "";
    }

    public static PasswordResultado valido(String password) {
        PasswordResultado r = new PasswordResultado();

        int cuentaNumeros = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) cuentaNumeros++;
        }
        if (password.length() < 8) {
            r.valido = false;
            r.errores += "La contrasenya ha de tenir almenys 8 caràcters";
        }

        if (cuentaNumeros < 2) {
            r.valido = false;
            r.errores += "La contrasenya ha de contenir almenys 2 números";
        }

        if (!password.matches(".*[A-Z].*")) {
            r.valido = false;
            r.errores += "La contrasenya ha de contenir almenys una lletra majúscula";
        }

        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            r.valido = false;
            r.errores += "La contrasenya ha de contenir almenys un caràcter especial";
        }






        return r;
    }
}
