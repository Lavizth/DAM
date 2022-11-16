package Ejercicios.Ejercicio8;

import java.io.*;
import java.util.Scanner;

public class E8_Principal {
    public static void main(String[] args) throws IOException {

        String cadena = "";

        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una cadena a procesar: ");
        cadena = sc.nextLine();


        File directorio = new File(".\\out\\production\\Tema1_PSP");
        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicios.Ejercicio8.E8_subproceso");

        // se establece el directorio donde se encuentra el ejecutable
        pb.directory(directorio);

        //salida a consola
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        // se ejecuta el proceso
        Process p = pb.start();

        cadena+="\n";

        // escritura -- envia entrada
        OutputStream os = p.getOutputStream();
        os.write(cadena.getBytes());
        os.flush();

        // COMPROBACION DE ERROR - 0 bien - 1 mal
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            InputStream er = p.getErrorStream();
            BufferedReader brer = new BufferedReader(new InputStreamReader(er));
            String liner = null;
            while ((liner = brer.readLine()) != null)
                System.out.println("ERROR >" + liner);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
