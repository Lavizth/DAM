/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad.teis.persistencia;

import ad.teis.model.Persona;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mfernandez
 */
public class DataIOPersistencia implements IPersistencia {

    @Override
    public void escribirPersonas(ArrayList<Persona> personas, String ruta) {

        try ( FileOutputStream fos = new FileOutputStream(ruta, true);  DataOutputStream dos = new DataOutputStream(fos);) {
            for (Persona p : personas) {
                //ID
                dos.writeLong(p.getId());
                //DNI
                StringBuilder sbDni = new StringBuilder(p.getDni());
                sbDni.setLength(Persona.MAX_LENGTH_DNI);
                dos.writeChars(sbDni.toString());
                //EDAD
                dos.writeInt(p.getEdad());
                //SALARIO
                dos.writeFloat(p.getSalario());
                //NOMBRE
                StringBuilder sbNombre = new StringBuilder(p.getNombre());
                sbNombre.setLength(Persona.MAX_LENGTH_NOMBRE);
                dos.writeChars(sbNombre.toString());
                //BORRADO
                dos.writeBoolean(p.isBorrado());
            }

        } catch (IOException ex) {
            System.err.println("Ha ocurrido una excepción: " + ex.getMessage());
        }
    }

    @Override
    public ArrayList<Persona> leerTodo(String ruta) {

        ArrayList<Persona> personas = new ArrayList<>();

        try ( FileInputStream fis = new FileInputStream(ruta);  DataInputStream dis = new DataInputStream(fis);) {
            while (fis.available() != 0) {
                //ID
                long id = dis.readLong();
                //DNI
                StringBuilder sbDni = new StringBuilder();
                for (int i = 0; i < Persona.MAX_LENGTH_DNI; i++) {
                    sbDni.append(dis.readChar());
                }
                //EDAD
                int edad = dis.readInt();
                //SALARIO
                float salario = dis.readFloat();
                //NOMBRE
                StringBuilder sbNombre = new StringBuilder();
                for (int i = 0; i < Persona.MAX_LENGTH_NOMBRE; i++) {
                    sbNombre.append(dis.readChar());
                }
                //BORRADO
                boolean borrado = dis.readBoolean();

                Persona persona = new Persona(id, sbDni.toString(), edad, salario, sbNombre.toString());
                persona.setBorrado(borrado);
                personas.add(persona);
            }

        } catch (IOException ex) {
            System.err.println("Ha ocurrido una excepción: " + ex.getMessage());
        }
        return personas;
    }

}
