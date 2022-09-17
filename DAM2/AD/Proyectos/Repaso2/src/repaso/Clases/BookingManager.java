/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.Clases;

import repaso.Util.IO;

/**
 *
 * @author a14deividdd
 */
public class BookingManager {

    private static final int MAX_FRANJAS = 6;
    private String[][] reservasPorFranja;
    private Piscina piscina;

    public BookingManager(Piscina piscina) {
        this.piscina = piscina;
        this.reservasPorFranja = new String[MAX_FRANJAS][piscina.getAforo()];
    }

    public void reservar(String DNI) {
        int reserva = pedirReserva(); 
        int i = 0;
        try {
            if(reservasPorFranja[reserva-1][i] == null){}
            reservasPorFranja[reserva-1][i] = DNI;
        } catch (Exception e){
            System.out.println("Hubo un error al añadir el DNI");
        }
    }

    private int pedirReserva() {
        int reserva;
        do {
            reserva = IO.pedirEntero("Dame la franja horaria (1-6)");
        } while (!IO.isInRange(1, MAX_FRANJAS, reserva));
        return reserva;
    }

    public void getReservas() {
        for(int i = 0; i<reservasPorFranja.length;i++){
            for(int j = 0; j<reservasPorFranja[0].length;j++){
                System.out.println("Franja: "+i+" aforo: "+j+" DNI: "+reservasPorFranja[i][j]);
            }
        }
    }

}
