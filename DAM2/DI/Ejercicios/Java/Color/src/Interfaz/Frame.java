package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Lavizth
 */
public class Frame extends JFrame{
    
    private JPanel panelSlider, panelRGB, panelBotones, panelColor;
    private JScrollBar scrollBarRojo, scrollBarVerde, scrollBarAzul;
    private JLabel labelRojo, labelVerde, labelAzul;
    private JTextField textRojo, textVerde, textAzul;
    
    private final int SCROLLBAR_ORIENTACION =  SwingConstants.VERTICAL;
    private final int SCROLLBAR_VALOR_INICIAL = 0;
    private final int SCROLLBAR_EXTEND = 1;
    private final int SCROLLBAR_MIN = 0;
    private final int SCROLLBAR_MAX = 255;
    
    
    public Frame(int ancho, int alto, String titulo){
        super(titulo);
        setSize(ancho, alto);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setInterfaz();
    }
    
    private void setInterfaz(){
        setPanelSlider();
        setPanelColor();
        
        this.add(panelSlider,BorderLayout.LINE_START);
        this.add(panelColor);
    }
    
    private void setPanelSlider(){
//        scrollBarRojo = new JScrollBar(SCROLLBAR_ORIENTACION, SCROLLBAR_VALOR_INICIAL, SCROLLBAR_EXTEND, SCROLLBAR_MIN, SCROLLBAR_MAX);
//        scrollBarVerde = new JScrollBar(SCROLLBAR_ORIENTACION, SCROLLBAR_VALOR_INICIAL, SCROLLBAR_EXTEND, SCROLLBAR_MIN, SCROLLBAR_MAX);
//        scrollBarAzul = new JScrollBar(SCROLLBAR_ORIENTACION, SCROLLBAR_VALOR_INICIAL, SCROLLBAR_EXTEND, SCROLLBAR_MIN, SCROLLBAR_MAX);

        scrollBarRojo = new ScrollBar(SCROLLBAR_ORIENTACION, SCROLLBAR_VALOR_INICIAL, SCROLLBAR_EXTEND, SCROLLBAR_MIN, SCROLLBAR_MAX, panelColor);
        scrollBarVerde = new ScrollBar(SCROLLBAR_ORIENTACION, SCROLLBAR_VALOR_INICIAL, SCROLLBAR_EXTEND, SCROLLBAR_MIN, SCROLLBAR_MAX, panelColor);
        scrollBarAzul = new ScrollBar(SCROLLBAR_ORIENTACION, SCROLLBAR_VALOR_INICIAL, SCROLLBAR_EXTEND, SCROLLBAR_MIN, SCROLLBAR_MAX, panelColor);
        
        panelSlider = new JPanel(new GridLayout(1, 3));
        
        panelSlider.add(scrollBarRojo);
        panelSlider.add(scrollBarVerde);
        panelSlider.add(scrollBarAzul);
    }
    
    private void setPanelColor(){
        panelColor = new JPanel();
    }
    
}
