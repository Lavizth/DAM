package NumerosRacionales;

public class TestRacional {
    public static void main (String[] args){
        
        Racional2 rc1 = new Racional2();
        Racional2 rc2 = new Racional2();
        Racional2 rc3 = new Racional2();

        System.out.println("Se le asigna al primer racional los valores:");
        rc1.asignarDatos(20, 4);
        System.out.println("Se le asigna al segundo racional los valores:");
        rc2.asignarDatos(6, 5);
        
        System.out.println(rc1.visualizar());
        System.out.println(rc2.visualizar());
        
        System.out.println("\nLa suma da:");
        rc3.sumar(rc1, rc2);
        System.out.println(rc3.visualizar());

        System.out.println("\nLa resta da:");
        rc3.restar(rc1, rc2);
        System.out.println(rc3.visualizar());
        
        System.out.println("\nLa multiplicación da:");
        rc3.multiplicar(rc1, rc2);
        System.out.println(rc3.visualizar());

        System.out.println("\nLa division da:");
        rc3.dividir(rc1, rc2);
        System.out.println(rc3.visualizar());
    }
}
