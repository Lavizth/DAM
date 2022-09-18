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

    public void reservar() {
        String dni = "";
        int franja = pedirFranjaHoraria();
        int aforo = aforoDisponible(franja);

        if (aforo != -1) {
            dni = IO.pedirDNI();
            if(!dniRepetido(dni)){
                añadirDNI(dni, franja, aforo);
            } else {
                IO.imprimirError("Este DNI ya tiene una reserva en alguna franja horaria");
            }
        } else {
            IO.imprimirError("No hay sufuficiente aforo en la franja horaria: " + franja);
        }
    }

    private int pedirFranjaHoraria() {
        int franja;
        do {
            franja = IO.pedirEntero("Dame la franja horaria (1-6)");
            if(IO.isInRange(1, MAX_FRANJAS, franja))
                return franja;
            else
                IO.imprimirError("La franja debe ser un numero del 1 al 6");
        } while (true);
    }

    public void getReservas() {
        for (int i = 0; i < reservasPorFranja.length; i++) {
            for (int j = 0; j < reservasPorFranja[0].length; j++) {
                IO.imprimir("Franja: " + (i+1) + " aforo: " + (j+1) + " DNI: " + reservasPorFranja[i][j]);
            }
        }
    }

    public boolean dniRepetido(String dni) {
        for (String[] i : reservasPorFranja){
            for (String j : i){
                if (j!= null && j.equals(dni))
                    return true;
            }
        }
        return false;
    }

    public int aforoDisponible(int franja) {
        for (int i = 0; i < piscina.getAforo(); i++) {
            if (reservasPorFranja[franja - 1][i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void añadirDNI(String dni, int reserva, int aforo) {
        reservasPorFranja[reserva-1][aforo] = dni;
        IO.imprimirOK("DNI Añadido correctamente");
    }
}
