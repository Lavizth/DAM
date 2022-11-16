/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagraphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author a14deividdd
 */
public class Frame extends JFrame{

    JPanel panelTop;
    JPanel panelBot;

    public Frame(String string){
        super(string);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        panelTop = new PanelTop();
        panelBot = new PanelBot();
        
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelBot,BorderLayout.CENTER);
        
        this.setBackground(Color.yellow);
        
    }

//    @Override
//    public void paint(Graphics g){
//        System.out.println("Frame");
//    }
    
}

class PanelTop extends JPanel{

    JLabel labelX1;
    JLabel labelX2;
    JLabel labelY1;
    JLabel labelY2;
    
    JTextField coordenadaX1;
    JTextField coordenadaX2;
    JTextField coordenadaY1;
    JTextField coordenadaY2;
    
    public PanelTop() {
        this.setLayout(new GridLayout(2, 4));
        iniciar();
        añadir();
    }
    
    private void iniciar(){
        labelX1 = new JLabel("Coordenada X1");
        labelX2 = new JLabel("Coordenada X2");
        labelY1 = new JLabel("Coordenada Y1");
        labelY2 = new JLabel("Coordenada Y2");
        
        coordenadaX1 = new JTextField(6);
        coordenadaX2 = new JTextField(6);
        coordenadaY1 = new JTextField(6);
        coordenadaY2 = new JTextField(6);
        
        coordenadaX1.setEditable(false);
        coordenadaY1.setEditable(false);
    }
    
    private void añadir(){
        this.add(labelX1);
        this.add(coordenadaX1);
        this.add(labelY1);
        this.add(coordenadaY1);
        this.add(labelX2);
        this.add(coordenadaX2);
        this.add(labelY2);
        this.add(coordenadaY2);
    }
    
}

class PanelBot extends JPanel{
    
    JPanel panelCalculo;
    JPanel panelGraphics;
    
    PanelBot(){
        iniciar();
        añadir();
    }
    
    private void iniciar(){
        panelCalculo = new PanelCalculo();
        panelGraphics = new PanelGraphics();
    }
    
    private void añadir(){
        this.add(panelCalculo);
        this.add(panelGraphics);
    }
    
}

class PanelCalculo extends JPanel{
    
    JTextArea resultado;
    
    public PanelCalculo(){
        this.setLayout(new GridLayout(1,1));
        iniciar();
        añadir();
    }
    
    private void iniciar(){
        resultado = new JTextArea(25,25);
        resultado.setMaximumSize(new Dimension(250, 400));
    }
    
    private void añadir(){
        this.add(resultado);
    }
    
}

class PanelGraphics extends JPanel{

    public PanelGraphics() {
        this.setSize(250,400);
        this.setBackground(Color.red);
    }
    
}
