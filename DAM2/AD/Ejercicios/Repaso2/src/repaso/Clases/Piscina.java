/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso.Clases;

import repaso.Util.IO;

/**
 *
 * @author a14deividdd
 */
public class Piscina {
    
    private static final int ESPACIO_PERSONAL = 2;
    private int alturaPiscina;
    private int anchuraPiscina;
    private int alturaParcela;
    private int anchuraParcela;
    private int aforo;
    
    public Piscina(int alturaPiscina, int anchuraPiscina, int alturaParcela, int anchuraParcela){
        this.alturaPiscina = alturaPiscina;
        this.anchuraPiscina = anchuraParcela;
        this.alturaParcela = alturaParcela;
        this.anchuraParcela = anchuraParcela;
        this.aforo = CalcularAforo();
    }

    public int getAforo(){
        return aforo;
    }
    
    private int calcularSuperficie(int altura, int anchura){
        return altura * anchura;
    }
    
    private int CalcularAforo(){
        return Math.min(
            calcularSuperficie(alturaPiscina, anchuraPiscina)/ESPACIO_PERSONAL,
            calcularSuperficie(alturaParcela, anchuraParcela)/ESPACIO_PERSONAL);
    }
    
}
