
public class PasswordVerify {

    public static class PasswordResultado {
        public boolean valido;
        public String errores = "";
    }

    public static PasswordResultado valido(String password) {
        PasswordResultado r = new PasswordResultado();

        //recorremos el password para localizar dígitos.
        int cuentaNumeros = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) cuentaNumeros++;
        }

        //validación carácteres mínimos
        if (password.length() < 8) {
            r.valido = false;
            r.errores += "La contrasenya ha de tenir almenys 8 caràcters";
        }

        //validación números mínimos
        if (cuentaNumeros < 2) {
            r.valido = false;
            r.errores += "La contrasenya ha de contenir almenys 2 números";
        }

        //validación mayúscula mínima
        if (!password.matches(".*[A-Z].*")) {
            r.valido = false;
            r.errores += "La contrasenya ha de contenir almenys una lletra majúscula";
        }

        //validación carácteres especiales
        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            r.valido = false;
            r.errores += "La contrasenya ha de contenir almenys un caràcter especial";
        }
        return r;
    }
}
