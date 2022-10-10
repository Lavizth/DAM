/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablademultiplicar;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author a14deividdd
 */
public class Frame extends JFrame{

    private JPanel panelTop;
    private JPanel panelMid;
    private JPanel panelBottom;
    
    public Frame(String string){
        super(string);
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelTop = new PanelTop();
        panelMid = new PanelMid(this);
        panelBottom = new PanelBottom();
        
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelMid, BorderLayout.CENTER);
    }
    
}


class PanelTop extends JPanel{

    private JLabel titulo;
    private JComboBox<Integer> numero;
    
    public PanelTop() {
        this.setLayout(new GridLayout(2, 1));
        iniciar();
        añadir();
    }
    
    private void iniciar(){
        titulo = new JLabel("Tabla de Multiplicar");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        
        numero = new JComboBox<>();
        for (int i = 0; i < 10; i++) {
            numero.addItem(i);
        }
    }
    
    private void añadir(){
        this.add(titulo);
        this.add(numero);
    }

}


class PanelMid extends JPanel{

    private JPanel panelNumero;
    private JPanel panelIgual;
    private JPanel panelResultado;

    public PanelMid(JFrame frame) {
        this.setSize(frame.getSize());
        iniciar();
        añadir();
    }
    
    private void iniciar(){
        this.panelNumero = new PanelNumero();
        this.panelIgual = new PanelIgual();
        this.panelResultado = new PanelResultado();
    }
    
    private void añadir(){
        this.add(panelNumero);
        this.add(panelIgual);
        this.add(panelResultado);
    }
    
}

class PanelNumero extends JPanel{
    
    private JButton[] numero;

    public PanelNumero() {
        this.setLayout(new GridLayout(10, 1));
        this.numero = new JButton[10];
        iniciar();
        añadir();
    }
    
    private void iniciar(){
        for (Integer i = 0; i < 10; i++) {
            numero[i] = new JButton(i.toString());
        }
    }
    
    private void añadir(){
        for (int i = 0; i < 10; i++) {
            this.add(numero[i]);
        }
    }
    
}

class PanelIgual extends JPanel{
    
    private JButton[] igual;

    public PanelIgual() {
        this.setLayout(new GridLayout(10, 1));
        this.igual = new JButton[10];
        iniciar();
        añadir();
    }
    
    private void iniciar(){
        for (Integer i = 0; i < 10; i++) {
            igual[i] = new JButton("=");
        }
    }
    
    private void añadir(){
        for (int i = 0; i < 10; i++) {
            this.add(igual[i]);
        }
    }
    
}


class PanelResultado extends JPanel{
    
    private JButton[] resultado;

    public PanelResultado() {
        this.setLayout(new GridLayout(10, 1));
        this.resultado = new JButton[10];
        iniciar();
        añadir();
    }
    
    private void iniciar(){
        for (Integer i = 0; i < 10; i++) {
            resultado[i] = new JButton(" ");
        }
    }
    
    private void añadir(){
        for (int i = 0; i < 10; i++) {
            this.add(resultado[i]);
        }
    }
    
}

class PanelBottom extends JPanel{
    
    private JLabel numero1;
    private JLabel numero2;
    private JLabel resultado;
    private JTextField texto1;
    private JTextField texto2;
    private JTextField textoResult;
    private JButton sumar;

    public PanelBottom() {
    }
    
    
    
}
