/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablademultiplicar;

<<<<<<< HEAD
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
=======
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
<<<<<<< HEAD
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static tablademultiplicar.Frame.matematica;
=======
import javax.swing.JPanel;
import javax.swing.JTextField;
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee

/**
 *
 * @author a14deividdd
 */
public class Frame extends JFrame{

<<<<<<< HEAD
    static Matematica matematica = new Matematica();
=======
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
    private JPanel panelTop;
    private JPanel panelMid;
    private JPanel panelBottom;
    
    public Frame(String string){
        super(string);
<<<<<<< HEAD
        this.setLayout(new FlowLayout(HEIGHT, 5, 15));
        this.setSize(450, 640);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        panelMid = new PanelMid();
        panelTop = new PanelTop();
        panelBottom = new PanelBottom();
        
        this.add(panelTop);
        this.add(panelMid);
        this.add(panelBottom);
=======
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelTop = new PanelTop();
        panelMid = new PanelMid(this);
        panelBottom = new PanelBottom();
        
        this.add(panelTop, BorderLayout.NORTH);
        this.add(panelMid, BorderLayout.CENTER);
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
    }
    
}


<<<<<<< HEAD
class PanelTop extends JPanel implements ConstructorPanel{

    private JLabel titulo;
    public JComboBox<Integer> numero = new JComboBox<>();
    
    public PanelTop() {
        this.setLayout(new GridLayout(2, 1,0,10));
=======
class PanelTop extends JPanel{

    private JLabel titulo;
    private JComboBox<Integer> numero;
    
    public PanelTop() {
        this.setLayout(new GridLayout(2, 1));
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        iniciar();
        añadir();
    }
    
<<<<<<< HEAD
    @Override
    public void iniciar(){
        titulo = new JLabel("                 Tabla de Multiplicar");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        
        for (int i = 0; i < 10; i++) {
            numero.addItem(i);
        }
        numero.setPreferredSize(new Dimension(420, HEIGHT));
        numero.addActionListener(new EventoMultiplicar(numero));
    }
    
    @Override
     public void añadir(){
=======
    private void iniciar(){
        titulo = new JLabel("Tabla de Multiplicar");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        
        numero = new JComboBox<>();
        for (int i = 0; i < 10; i++) {
            numero.addItem(i);
        }
    }
    
    private void añadir(){
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        this.add(titulo);
        this.add(numero);
    }

}

<<<<<<< HEAD
class EventoMultiplicar implements ActionListener{
    
    private JComboBox<Integer> numero;

    public EventoMultiplicar(JComboBox<Integer> numero){
        this.numero = numero;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            PanelResultado.resultado[i].setText(""+matematica.multiplicar((int)(numero.getSelectedItem()), i));
        }
    }
}


class PanelMid extends JPanel implements ConstructorPanel{
=======

class PanelMid extends JPanel{
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee

    private JPanel panelNumero;
    private JPanel panelIgual;
    private JPanel panelResultado;

<<<<<<< HEAD
    public PanelMid() {
        this.setLayout(new GridLayout(1, 3,10,0));
        this.setPreferredSize(new Dimension(420, 400));
=======
    public PanelMid(JFrame frame) {
        this.setSize(frame.getSize());
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        iniciar();
        añadir();
    }
    
<<<<<<< HEAD
    @Override
    public void iniciar(){
=======
    private void iniciar(){
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        this.panelNumero = new PanelNumero();
        this.panelIgual = new PanelIgual();
        this.panelResultado = new PanelResultado();
    }
    
<<<<<<< HEAD
    @Override
    public void añadir(){
=======
    private void añadir(){
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        this.add(panelNumero);
        this.add(panelIgual);
        this.add(panelResultado);
    }
    
}

<<<<<<< HEAD
class PanelNumero extends JPanel implements ConstructorPanel{
    
    private JButton[] numero = new JButton[10];;

    public PanelNumero() {
        this.setLayout(new GridLayout(10, 1,0,15));
=======
class PanelNumero extends JPanel{
    
    private JButton[] numero;

    public PanelNumero() {
        this.setLayout(new GridLayout(10, 1));
        this.numero = new JButton[10];
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        iniciar();
        añadir();
    }
    
<<<<<<< HEAD
    @Override
    public void iniciar(){
=======
    private void iniciar(){
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        for (Integer i = 0; i < 10; i++) {
            numero[i] = new JButton(i.toString());
        }
    }
    
<<<<<<< HEAD
    @Override
    public void añadir(){
=======
    private void añadir(){
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        for (int i = 0; i < 10; i++) {
            this.add(numero[i]);
        }
    }
    
}

<<<<<<< HEAD
class PanelIgual extends JPanel implements ConstructorPanel{
    
    private JButton[] igual = new JButton[10];

    public PanelIgual() {
        this.setLayout(new GridLayout(10, 1,0,15));
=======
class PanelIgual extends JPanel{
    
    private JButton[] igual;

    public PanelIgual() {
        this.setLayout(new GridLayout(10, 1));
        this.igual = new JButton[10];
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        iniciar();
        añadir();
    }
    
<<<<<<< HEAD
    @Override
    public void iniciar(){
=======
    private void iniciar(){
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        for (Integer i = 0; i < 10; i++) {
            igual[i] = new JButton("=");
        }
    }
    
<<<<<<< HEAD
    @Override
    public void añadir(){
=======
    private void añadir(){
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        for (int i = 0; i < 10; i++) {
            this.add(igual[i]);
        }
    }
    
}

<<<<<<< HEAD
class PanelResultado extends JPanel implements ConstructorPanel{
    
    public static JButton[] resultado = new JButton[10];;

    public PanelResultado() {
        this.setLayout(new GridLayout(10, 1,0,15));
=======

class PanelResultado extends JPanel{
    
    private JButton[] resultado;

    public PanelResultado() {
        this.setLayout(new GridLayout(10, 1));
        this.resultado = new JButton[10];
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        iniciar();
        añadir();
    }
    
<<<<<<< HEAD
    @Override
    public void iniciar(){
=======
    private void iniciar(){
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        for (Integer i = 0; i < 10; i++) {
            resultado[i] = new JButton(" ");
        }
    }
    
<<<<<<< HEAD
    @Override
    public void añadir(){
=======
    private void añadir(){
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
        for (int i = 0; i < 10; i++) {
            this.add(resultado[i]);
        }
    }
    
}

<<<<<<< HEAD
class PanelBottom extends JPanel implements ConstructorPanel{
    
    private JPanel panelLabel;
    private JPanel panelTextField;
    private Boton sumar;

    public PanelBottom() {
        this.setLayout(new FlowLayout(HEIGHT, 15, 0));
        iniciar();
        añadir();
    }
    
    @Override
    public void iniciar(){
        this.panelLabel = new PanelLabel();
        this.panelTextField = new PanelTextField();
        this.sumar = new Boton();
        sumar.addActionListener(new EventoSumar());
    }
    
    @Override
    public void añadir(){
        this.add(panelLabel);
        this.add(panelTextField);
        this.add(sumar);
    }
    
}

class PanelLabel extends JPanel implements ConstructorPanel{
=======
class PanelBottom extends JPanel{
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
    
    private JLabel numero1;
    private JLabel numero2;
    private JLabel resultado;
<<<<<<< HEAD
    private Font font = new Font("Arial", Font.BOLD, 14);
    
    public PanelLabel(){
        this.setLayout(new GridLayout(3,1,0,10));
        iniciar();
        añadir();
    }
    
    @Override
    public void iniciar(){
        this.numero1 = new JLabel("Numero1:");
        this.numero1.setFont(font);
        this.numero2 = new JLabel("Numero2:");
        this.numero2.setFont(font);
        this.resultado = new JLabel("Resultado:");
        this.resultado.setFont(font);
    }
    
    @Override
    public void añadir(){
        this.add(numero1);
        this.add(numero2);
        this.add(resultado);
    }
    
}

class PanelTextField extends JPanel implements ConstructorPanel{
    
    public static JTextField texto1;
    public static JTextField texto2;
    public static JTextField textoResultado;
    
    public PanelTextField(){
        this.setLayout(new GridLayout(3, 1,0,10));
        iniciar();
        añadir();
    }
    
    @Override
    public void iniciar(){
        PanelTextField.texto1 = new JTextField(10);
        PanelTextField.texto2 = new JTextField(10);
        PanelTextField.textoResultado = new JTextField(10);
        PanelTextField.textoResultado.setEditable(false);
    }
    
    @Override
    public void añadir(){
        this.add(texto1);
        this.add(texto2);
        this.add(textoResultado);
    }
    
}


class Boton extends JButton{

    public Boton(){
        this.setText("Sumar");
        this.setPreferredSize(new Dimension(170, 80));
    }
    
}

class EventoSumar implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try{
            Integer result = matematica.sumar(Integer.parseInt(PanelTextField.texto1.getText()),Integer.parseInt(PanelTextField.texto2.getText()));
            PanelTextField.textoResultado.setText(result.toString());
        }catch(Exception f){
            JOptionPane.showMessageDialog(null, "Hubo un error al intruducir los numeros\n"+f.getMessage());
        }
        
    }
}
=======
    private JTextField texto1;
    private JTextField texto2;
    private JTextField textoResult;
    private JButton sumar;

    public PanelBottom() {
    }
    
    
    
}
>>>>>>> c68769889a644695e5b6077e23c34c00a34874ee
