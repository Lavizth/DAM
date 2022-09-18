/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.Clases;

import repaso.Util.IO;
import sun.reflect.LangReflectAccess;

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
        int franja = pedirFranjaHoraria();
        String dni;
        boolean dniOK = false;
        boolean dniRepetido = false;
        for (int i = 0; i < piscina.getAforo(); i++) {
            if (reservasPorFranja[franja - 1][i] == null) {
                dni = IO.pedirDNI();
                dniOK = true;
                if (!dniRepetido(dni)) {
                    reservasPorFranja[franja - 1][i] = dni;
                    IO.salida("DNI Añadido correctamente");
                    break;
                }
                dniRepetido = true;
                break;
            }
        }
        if (!dniOK) {
            IO.salida("No hay sufuficiente aforo en la franja horaria: " + franja);
        }
        if (dniRepetido) {
            IO.salida("El DNI ya tiene una reserva en alguna franja horaria");
        }
    }

    private int pedirFranjaHoraria() {
        int franja;
        do {
            franja = IO.pedirEntero("Dame la franja horaria (1-6)");
        } while (!IO.isInRange(1, MAX_FRANJAS, franja));
        return franja;
    }

    public void getReservas() {
        for (int i = 0; i < reservasPorFranja.length; i++) {
            for (int j = 0; j < reservasPorFranja[0].length; j++) {
                IO.salida("Franja: " + i + " aforo: " + j + " DNI: " + reservasPorFranja[i][j]);
            }
        }
    }

    public boolean dniRepetido(String dni) {
        for (int i = 0; i < reservasPorFranja.length; i++) {
            for (int j = 0; j < reservasPorFranja[0].length; j++) {
                if (reservasPorFranja[i][j] != null) {
                    if (reservasPorFranja[i][j].equals(dni))
                        return true;
                }
            }
        }
        return false;
    }
    
}
