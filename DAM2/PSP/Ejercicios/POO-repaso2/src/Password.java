import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = generatePassword(longitud);

    }

    public Password( String contraseña) {
        this.longitud = contraseña.length();
        this.contraseña = contraseña;
    }

    public Password( int longitud) {
        this.longitud = longitud;
        this.contraseña = generatePassword(longitud);
    }

    private String generatePassword(int longitud) {
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz$*-.";
        StringBuilder password = new StringBuilder(longitud);

        for (int i = 0; i < longitud; ++i) {
            int index = (int) (abecedario.length() * Math.random());
            password.append(abecedario.charAt(index));
        }
        return password.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void comprobarSeguridad(){
        char[] arrayContra = this.contraseña.toCharArray();

        int mayus = 0;
        int minus = 0;
        int num = 0;
        int caracter = 0;

        Pattern contadorMayus = Pattern.compile("[A-Z]");
        Pattern contadorMinus = Pattern.compile("[a-z]");
        Pattern contadorNum = Pattern.compile("[0-9]");
        Pattern contadorCaracter = Pattern.compile("[$,*,\\-,.]");

        for (char a : arrayContra){
            String letra = ""+a;

            Matcher m = contadorMayus.matcher(letra);
            if (m.matches())
                mayus++;

            Matcher n = contadorMinus.matcher(letra);
            if (n.matches()){
                minus++;
            }

            Matcher j = contadorNum.matcher(letra);
            if (j.matches()){
                num++;
            }

            Matcher h = contadorCaracter.matcher(letra);
            if (h.matches()){
                caracter++;
            }
        }

        System.out.println("\nmayus = "+mayus+"\nminus = "+minus+"\nnum = "+num+"\ncaracter = "+caracter);
        if (mayus<3 || minus < 2 || num < 4 || caracter < 2)
            System.out.println("\nContraseña poco segura");
        else
            System.out.println("\nContraseña segura");
    }
}
