public class Ejercicio8 {

    public static void main(String[] args) {

        String linea = args[0];
        String linea2 = "";

        if(linea.length()!=0){
            System.out.println("La cadena estaba vacia");
            System.exit(1);
        }

        for(int i=linea.length()-1;i>-1;i--) {
            linea2 += linea.charAt(i);
        }

        if(linea.equals(linea2)){
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }

    }

}
