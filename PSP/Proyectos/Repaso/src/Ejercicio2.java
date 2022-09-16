import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        String[] cadenas = {};
        int i = 0;

        System.out.println("Cuantas cadenas quieres escribir");
        int cantidad = io2.entrada2();
        while(true){
            System.out.println("Introduce una cadena:");
            cadenas[i] = io2.entrada2();
        }

        System.out.println("Ordenadas al reves:");

        for (int i = 2; i>-1; i--){
            System.out.println(cadenas[i]);
        }
    }
}

class io2{
    static Scanner sc = new Scanner (System.in);

    public static String entrada2(){
        return sc.nextLine();
    }

    public static int entrada2int(){
        return sc.nextInt();
    }
}
