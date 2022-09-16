import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[] args){

        System.out.println("Dime una cadena de caracteres");
        String cadena = io.entrada();

        int cantidadVocales = 0;
        for (int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                cantidadVocales++;
            }
        }

        System.out.println("La cantidad de vocales es: "+cantidadVocales);
    }
}


class io {
    static Scanner sc = new Scanner(System.in);

    public static String entrada(){
        return sc.nextLine();
    }
}