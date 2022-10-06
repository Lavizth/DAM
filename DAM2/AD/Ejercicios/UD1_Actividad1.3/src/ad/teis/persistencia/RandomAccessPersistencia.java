/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad.teis.persistencia;

import ad.teis.model.Persona;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a14deividdd
 */
public class RandomAccessPersistencia implements IPersistencia{

    @Override
    public void escribirPersona(Persona persona, String ruta) {
        try(RandomAccessFile raf = new RandomAccessFile(ruta, "w")){
            
            StringBuilder dni = new StringBuilder(persona.getDni());
            dni.setLength(9);
            
            raf.writeLong(persona.getId());
            raf.writeChars(dni.toString());
            raf.writeUTF(dni.toString());
            raf.writeInt(persona.getEdad());
            raf.writeFloat(persona.getSalario());
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Persona leerDatos(String ruta) {
        
        long id = 0;
        StringBuilder dni = new StringBuilder();
        String dni2 = "";
        int edad = 0;
        float salario = 0;
        
        try(RandomAccessFile raf = new RandomAccessFile(ruta, "rw")){

            id = raf.readLong();
            for(int i=0;i<9;i++){
                dni.append(raf.readChar());
            }
            dni2 = raf.readUTF();
            edad = raf.readInt();
            salario = raf.readFloat();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println(new Persona(id, dni.toString(), edad, salario));
        return new Persona(id, dni2, edad, salario);
    }

    @Override
    public Persona leerPersona(int pos, String ruta) {
        long id = 0;
        StringBuilder dni = new StringBuilder();
        String dni2 = "";
        int edad = 0;
        float salario = 0;
        
        try(RandomAccessFile raf = new RandomAccessFile(ruta, "rw")){

            raf.seek(pos);
            
            id = raf.readLong();
            for(int i=0;i<9;i++){
                dni.append(raf.readChar());
            }
            dni2 = raf.readUTF();
            edad = raf.readInt();
            salario = raf.readFloat();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println(new Persona(id, dni.toString(), edad, salario));
        return new Persona(id, dni2, edad, salario);
    }
    
}
