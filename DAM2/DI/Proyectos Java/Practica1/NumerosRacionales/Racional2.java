package NumerosRacionales;

public class Racional2 {
    
    private int numerador;
    private int denominador;

    public Racional2() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public void setNumerador(int numerador){
        this.numerador = numerador;
    }
    
    public void setDenominador(int denominador){
        this.denominador = denominador;
    }

    public void asignarDatos (int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public String visualizar(){
        return numerador + "/"+  denominador;
    }

    // (a*d + b*c) / (b*d)
    public void sumar(Racional2 rc1, Racional2 rc2){
        this.numerador = (rc1.numerador*rc2.denominador)+(rc1.denominador*rc2.numerador);
        this.denominador = (rc1.denominador*rc2.denominador);
    }

    // (a*d - b*c) / (b*d)
    public void restar(Racional2 rc1, Racional2 rc2){
        this.numerador = (rc1.numerador*rc2.denominador)-(rc1.denominador*rc2.numerador);
        this.denominador = (rc1.denominador*rc2.denominador);
    }


    // (a*c) / (b*d)
    public void multiplicar(Racional2 rc1, Racional2 rc2){
        this.numerador = rc1.numerador*rc2.numerador;
        this.denominador = rc1.denominador*rc2.denominador;
    }

    // (a*d) / (b*c)
    public void dividir(Racional2 rc1, Racional2 rc2){
        this.numerador = rc1.numerador*rc2.denominador;
        this.denominador = rc1.denominador*rc2.numerador;
    }
}