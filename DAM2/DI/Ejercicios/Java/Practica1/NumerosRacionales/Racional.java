package NumerosRacionales;

public class Racional {
    
    private int numerador;
    private int denominador;

    public Racional() {
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

    public String visualizarRacional(){
        return numerador + "/"+  denominador;
    }
}