/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author a14deividdd
 */
public class Main {

    static JFrame frame = new JFrame("Prueba de JTextField y JPasswordField");
    static JPanel panel = new JPanel();
    static JTextField texto1 = new JTextField(15);
    static JTextField texto2 = new JTextField(15);
    static JTextField texto3 = new JTextField(15);
    static JPasswordField contraseña = new JPasswordField(15);
    
    public static void main(String[] args) {

        frame.setSize(800, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        texto2.setText("Escriba el texto aqui");
        texto3.setEditable(false);
        texto3.setText("Campo de texto no editable");
        
        panel.add(texto1);
        panel.add(texto2);
        panel.add(texto3);
        panel.add(contraseña);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
