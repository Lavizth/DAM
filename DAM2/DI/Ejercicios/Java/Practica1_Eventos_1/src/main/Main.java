/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author a14deividdd
 */
public class Main extends JFrame{

    static JFrame frame = new JFrame("Formulario1");
    static JPanel panel = new JPanel();
    static JTextField texto = new JTextField(30);
    static JButton hola = new JButton("Hola");
    static JButton ventana = new JButton("ventana");
    static JButton limpiar = new JButton("Limpiar");

    public static void main(String[] args) {
    
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);
        panel.add(texto);
        panel.add(hola);
        panel.add(ventana);
        panel.add(limpiar);
        
        hola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("Hola");
                System.out.println(e.paramString());
            }
        });
        
        ventana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("Ventana");
                System.out.println(e.paramString());
            }
        });
        
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText("Limpiar");
                System.out.println(e.paramString());
            }
        });
        
        frame.setVisible(true);
    }
    
}
