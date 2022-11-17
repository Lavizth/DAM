/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.teis.data;

import es.teis.model.Partido;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author a14Deividdd
 */
public class PartidoObjectPersistencia implements IPersistencia {

    @Override
    public void escribir(ArrayList<Partido> partidos, String ruta) {

        try ( FileOutputStream fos = new FileOutputStream(ruta);  ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            for (Partido partido : partidos) {
                oos.writeObject(partido);
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir los partidos en un fichero: " + Arrays.toString(e.getStackTrace()));
        }
    }

    @Override
    public ArrayList<Partido> leerTodo(String ruta) {
        ArrayList<Partido> partidos = new ArrayList();

        try(FileInputStream fis = new FileInputStream(ruta); ObjectInputStream ois = new ObjectInputStream(fis)){
            while(true){
                partidos.add((Partido) ois.readObject());
            }
        } catch (EOFException e){
            //error esperado al finalizar la lectura
        } catch (Exception e){
            System.out.println("Hubo un error al leer el archivo: "+Arrays.toString(e.getStackTrace()));
        }

        return partidos;
    }
    
}
