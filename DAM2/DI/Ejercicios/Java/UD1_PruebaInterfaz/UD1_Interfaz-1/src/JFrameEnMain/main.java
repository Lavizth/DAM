package JFrameEnMain;


import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Prueba interfaz");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.add(new JLabel("Introduce un texto cualquiera"));
        panel.add(new JTextField(25));
        panel.add(new JCheckBox("Convertir el texto a mayusculas"));

        frame.setVisible(true);
    }

}
