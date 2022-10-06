/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ad.teis;

import ad.teis.model.Persona;
import ad.teis.persistencia.DataIOPersistencia;
import ad.teis.persistencia.IPersistencia;

/**
 *
 * @author a14deividdd
 */
public class Main {

    private static final String PERSONA_FILE = "persona.dat";
    
    public static void main(String[] args) {
        IPersistencia dataIOPersistencia = new DataIOPersistencia();
        //Persona persona = new Persona(1, "12345678A", 18, 2000.5f);
        
        
        //dataIOPersistencia.escribirPersona(persona, PERSONA_FILE);
        System.out.println(dataIOPersistencia.leerDatos(PERSONA_FILE).toString());
    }
    
}
