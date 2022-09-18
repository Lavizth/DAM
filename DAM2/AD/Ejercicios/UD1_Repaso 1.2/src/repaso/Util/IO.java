/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.Util;

import java.util.Scanner;

/**
 *
 * @author a14deividdd
 */
public class IO {
    static Scanner sc = new Scanner(System.in);
    
    public static int pedirEntero(String texto){
        imprimir(texto);

        do {
            try {
                sc = new Scanner(System.in);
                return sc.nextInt();
            } catch(java.util.InputMismatchException e){
                imprimirError("No se ha introducido un numero");
                imprimir(texto);
            } 
        } while(true);
    }
    
    public static boolean isInRange(int min, int max, int valor){
        if(valor <= max && valor >= min)
            return true;
        else
            return false;
    }

    public static void imprimir(String texto){
        System.out.println(texto);
    }
    
    public static void imprimirError(String texto){
        System.out.println("\u001B[31m \n"+texto+"\u001B[0m");
    }
    
    public static void imprimirOK(String texto){
        System.out.println("\u001B[32m \n"+texto+"\u001B[0m");
    }
    
    public static String pedirDNI(){
        String dni;
        do{
            imprimir("Dime tu DNI (8 letras y 1 digito)");
            sc = new Scanner(System.in);
            dni = sc.nextLine();
            
            if(dni.matches("[0-9]{8}[a-zA-Z]"))
                return dni;
            else{
                imprimirError("DNI mal escrito");
            }
        }while(true);
    }

}
