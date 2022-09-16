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
        
        //Texto que pide el numero
        System.out.println(texto);
        
        //Pedir numero
        boolean datoOk = false;
        int n = 0;
        do{
            sc = new Scanner(System.in);
            try{
                n = sc.nextInt();
                break;
            }catch(Exception e){
                System.out.println("\nEl numero esta mal introducelo de nuevo\n"+texto);
            }
        }while(true);
        return n;
    }
    
    public static boolean isInRange(int min, int max, int valor){
        if(valor <= max && valor >= min)
            return true;
        else
            return false;
    }
    
}
