/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablademultiplicar;

/**
 *
 * @author Lavizth
 */
public class Matematica {
    
    private int num;

    public Matematica() {
    }

    public Matematica(int num) {
        this.num = num;
    }
    
    public int sumar(int num1, int num2){
        num = num1 + num2;
        return num;
    }
    
    public int multiplicar(int num1, int num2){
        num = num1 * num2;
        return num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}
