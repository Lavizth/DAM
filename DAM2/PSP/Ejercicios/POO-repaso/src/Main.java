public class Main {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Pepe", 2000);
        CuentaBancaria c2 = new CuentaBancaria("Juan", 1000);

        System.out.println("\n Valor inicial");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("\nIngresar 50 a PEPE");
        c1.ingresar(50);
        System.out.println(c1.toString());

        System.out.println("\nRetirar 100 a PEPE");
        c1.retirarSaldo(100);
        System.out.println(c1.toString());

        System.out.println("\nTransferir 200 de PEPE a JUAN");
        c1.transferir(200, c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }

}
