package Ejercicios.Ejercicio8;

import java.util.Scanner;

public class E8_subproceso {
    public static void main(String[] args) {
        String cadena = "";

        Scanner sc = new Scanner(System.in);
        //System.out.printf("Introduce una cadena: ");
        cadena = sc.nextLine();

        if(cadena.length()==0 ) {
            System.out.println("La Cadena introducida está vacia. ");
            System.exit(1);
        }

        // SE LE QUITAN TODOS LOS ESPACIOS A LA CADENA
        String cadena2 = "";
        for (int x = 0; x < cadena.length(); x++) {
            if (cadena.charAt(x) != ' ')
                cadena2 += cadena.charAt(x);
        }

        cadena=cadena2;
        int inc = 0;
        int des = cadena.length() - 1;
        boolean bError = false;

        // SE MANEJAN 2 ÍNDICES, UNO SUPERIOR Y OTRO INFERIOR
        while ((inc<des) && (!bError)){
            if (cadena.charAt(inc)==cadena.charAt(des)){ // SE COMPARAN LOS CARACTERES DE POSICIONES SIMÉTRICAS
                inc++;
                des--;
            } else
                bError = true; // SI SE ENCUENTRAN CARACTERES DISTINTOS, YA NO ES PALÍNDROMO
        }

        if (!bError)
            System.out.println(cadena + " =>  es un PALINDROMO");

        else
            System.out.println(cadena + " => NO es un palíndromo");

        System.exit(0);
        sc.close();

    }
}
