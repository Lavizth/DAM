/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

/**
 *
 * @author a14deividdd
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Piscina p = new Piscina(
                IO.pedirEntero("Dime altura piscina"),
                IO.pedirEntero("Dime anchura piscina"), 
                IO.pedirEntero("Dime altura parcela"), 
                IO.pedirEntero("Dime anchura parcela"));
        
        System.out.println("El aforo es: "+p.getAforo());
    }
     
}