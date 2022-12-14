/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.teis.edu;

import es.teis.data.IPersistencia;
import es.teis.data.PartidoObjectPersistencia;
import es.teis.data.exceptions.LecturaException;
import es.teis.dataXML.DOMXMLService;
import es.teis.dataXML.IXMLService;
import es.teis.model.Partido;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maria
 */
public class Main {

    private static String ELECCIONES_INPUT_FILE = Paths.get("src", "docs", "elecciones.xml").toString();
    private static String ELECCIONES_OUTPUT_FILE = Paths.get("src", "docs", "elecciones_output.dat").toString();

    private static float UMBRAL_PORCENTAJE = 3;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//completa aquí: 
        ArrayList<Partido> partidos = new ArrayList();
        
        IXMLService xmlService = new DOMXMLService();
        try {
            partidos = xmlService.leerPartidos(ELECCIONES_INPUT_FILE, UMBRAL_PORCENTAJE);
        } catch (LecturaException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        IPersistencia persistencia = new PartidoObjectPersistencia();
        persistencia.escribir(partidos, ELECCIONES_OUTPUT_FILE);
        
        mostrar(persistencia.leerTodo(ELECCIONES_OUTPUT_FILE));
    }

    private static void mostrar(ArrayList<Partido> partidos) {
        System.out.println("Se han leído: ");
        for (Partido partido : partidos) {
            System.out.println(partido);
        }
    }

}
