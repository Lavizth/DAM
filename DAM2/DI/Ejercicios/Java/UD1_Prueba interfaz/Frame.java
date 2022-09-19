import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame {
    
    private int altura;
    private int anchura;
    private String titulo;
    private JPanel panel;

    public Frame(String titulo, int altura, int anchura){
        super(titulo);
        setSize(anchura, altura);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        añadirComponentes(this);
    }

    private void añadirComponentes(Frame frame){
        panel = new JPanel();
        panel.add(new JLabel("Introduce un texto cualquiera"));
        panel.add(new JTextField(25));
        panel.add(new JCheckBox("Convertir el texto a mayusculas"));
        frame.add(panel);
    }

}
