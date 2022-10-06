import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        System.out.println(args[0]);
    }
}

class proceso{
    public static void main(String[] args) throws IOException {
        File dir = new File("out\\production\\Ejercicio1.4");
        ProcessBuilder pb = new ProcessBuilder("Java", "Main","Pepe");
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

