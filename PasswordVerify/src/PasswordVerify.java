public class PasswordVerify {

    public static class PasswordResultado {
        public boolean valido;
        public String errores;
    }

    public static PasswordResultado valido(String password) {
        PasswordResultado r = new PasswordResultado();

        if (password.length() < 8){
            r.valido = false;
            r.errores =
                    "La contrasenya ha de tenir almenys 8 caràcters\n" +
                            "La contrasenya ha de contenir almenys 2 números\n" +
                            "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                            "La contrasenya ha de contenir almenys un caràcter especial";
        } else {
            r.valido = false;
            r.errores = "La contrasenya ha de contenir almenys 2 números\n" +
                    "La contrasenya ha de contenir almenys una lletra majúscula\n" +
                    "La contrasenya ha de contenir almenys un caràcter especial";
        }

        return r;
        }
}
