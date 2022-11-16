import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, EOFException{

        File fOut = new File("\\out\\production\\cadena.txt");
        File fErr = new File("\\out\\production\\error.txt");



        File dir = new File("out\\production\\Ejercicio8");
        ProcessBuilder pb = new ProcessBuilder("Java", "Ejercicio8", linea);
        pb.directory(dir);
        Process p = pb.start();

        try{
            InputStream is = p.getInputStream();
            int c;
            while((c = is.read()) != -1){
                System.out.print((char)c);
            }
            is.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
