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
        Piscina p;
        BookingManager bm;
        int menu = 0;
        boolean salir = false;
        
        int alturaPiscina = IO.pedirEntero("Dime altura piscina");
        int anchuraPiscina = IO.pedirEntero("Dime anchura piscina");
        int alturaParcela = IO.pedirEntero("Dime altura parcela"); 
        int anchuraParcela = IO.pedirEntero("Dime anchura parcela");

        p = new Piscina(alturaPiscina, anchuraPiscina, alturaParcela, anchuraParcela);
        bm = new BookingManager(p);
        
        do{
            menu = IO.pedirEntero("\nMenu de reservas de la piscina"
                    + "\n1-Salir"
                    + "\n2-Ver lista de reservas"
                    + "\n3-Añadir una reserva");
            
            switch(menu){
                case 1:
                    salir = true;
                    break;
                case 2:
                   bm.getReservas();
                   break;
                case 3:
                   bm.reservar(); 
                   break;
                default:
                    IO.imprimir("Numero de menu invalido");
                    break;
            }
        }while(salir != true);
    }
    
}