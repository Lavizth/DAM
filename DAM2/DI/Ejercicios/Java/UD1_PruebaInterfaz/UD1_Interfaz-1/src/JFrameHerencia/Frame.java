package JFrameHerencia;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame {
    
    private JPanel panel;

    public Frame(String titulo, int altura, int anchura){
        super(titulo);
        setSize(anchura, altura);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anhadirComponentes();
    }

    private void anhadirComponentes(){
        panel = new JPanel();
        panel.add(new JLabel("Introduce un texto cualquiera"));
        panel.add(new JTextField(25));
        panel.add(new JCheckBox("Convertir el texto a mayusculas"));
        this.add(panel);
    }

}
