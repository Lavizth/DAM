/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import repaso.Clases.BookingManager;
import repaso.Clases.Piscina;
import repaso.Util.IO;

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
        
        BookingManager bm = new BookingManager(p);
        
        bm.reservar("abc1231");
        bm.getReservas();
    }
     
}