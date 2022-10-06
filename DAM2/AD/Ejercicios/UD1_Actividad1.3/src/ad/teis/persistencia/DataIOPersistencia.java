package ad.teis.persistencia;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import ad.teis.model.Persona;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a14deividdd
 */
public class DataIOPersistencia implements IPersistencia {

    @Override
    public void escribirPersona(Persona persona, String ruta) {

        if (persona != null) {

            try ( FileOutputStream fos = new FileOutputStream(ruta);) {

                DataOutputStream dos = new DataOutputStream(fos);
                
                dos.writeLong(persona.getId());
                dos.writeChars(persona.getDni());
                dos.writeUTF(persona.getDni());
                dos.writeInt(persona.getEdad());
                dos.writeFloat(persona.getSalario());

            } catch (FileNotFoundException ex) {
                System.out.println("ha ocurrido un error " + ex.getMessage());
            } catch (IOException ex) {
                System.out.println("ha ocurrido un error " + ex.getMessage());
            }
        }
    }

    @Override
    public Persona leerDatos(String ruta) {
        
        long id = 0;
        String dni1 = "";
        String dni2 = "";
        int edad = 0;
        float salario = 0;
        
        try(FileInputStream fis = new FileInputStream(ruta)){
            
            DataInputStream dis = new DataInputStream(fis);
            id = dis.readLong();
            
            for(int i=0;i<9;i++){
                dni1 += dis.readChar();
            }
                
            dni2 = dis.readUTF();
            edad = dis.readInt();
            salario = dis.readFloat();
            
        } catch (FileNotFoundException ex) {
            System.out.println("ha ocurrido un error " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ha ocurrido un error " + ex.getMessage());
        }
        
        System.out.println(new Persona(id, dni1, edad, salario));
        return new Persona(id, dni2, edad, salario);
    }

}
