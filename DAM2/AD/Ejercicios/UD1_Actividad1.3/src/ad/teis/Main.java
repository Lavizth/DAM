/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ad.teis;

import ad.teis.model.Persona;
import ad.teis.persistencia.DataIOPersistencia;
import ad.teis.persistencia.IPersistencia;
import ad.teis.persistencia.RandomAccessPersistencia;

/**
 *
 * @author a14deividdd
 */
public class Main {

    private static final String PERSONA_FILE = "personaRandom.dat";
    
    public static void main(String[] args) {
        IPersistencia dataIOPersistencia = new DataIOPersistencia();
        IPersistencia randomAccessPersistencia = new RandomAccessPersistencia();
        //Persona persona = new Persona(1, "12345678A", 18, 2000.5f);
        //dataIOPersistencia.escribirPersona(persona, PERSONA_FILE);
        
        Persona personaRandom = new Persona(1, "12345678A", 18, 2000.5f);
        dataIOPersistencia.escribirPersona(personaRandom, PERSONA_FILE);
        
        //System.out.println(dataIOPersistencia.leerDatos(PERSONA_FILE).toString());
        
        Persona p = dataIOPersistencia.leerDatos(PERSONA_FILE);
        System.out.println(p.toString());
        
        System.out.println("-----------------");
        Persona p2 = randomAccessPersistencia.leerDatos(PERSONA_FILE);
        System.out.println(p2.toString());
        
        System.out.println("-----------------");
        Persona p3 = randomAccessPersistencia.leerPersona(0,PERSONA_FILE);
        System.out.println(p3.toString());
        
    }
    
}
