public class CuentaBancaria {

    private String titular;
    private static int numeroCuenta = 0;
    private double saldo;

    public CuentaBancaria() {
        this.titular = "";
        this.numeroCuenta = getNumeroCuenta();
        this.saldo = 0;
        numeroCuenta++;
    }

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.numeroCuenta = getNumeroCuenta();
        this.saldo = saldo;
        numeroCuenta++;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                '}';
    }

    public void ingresar(double ingreso){
        if(ingreso>0)
            saldo += ingreso;
    }

    public void retirarSaldo(double retirada){
        if(saldo >= retirada)
            saldo -= retirada;
    }

    public void transferir(double cantidad, CuentaBancaria beneficiario){
        if(saldo >= cantidad){
            saldo -= cantidad;
            beneficiario.ingresar(cantidad);
        }
    }

}
