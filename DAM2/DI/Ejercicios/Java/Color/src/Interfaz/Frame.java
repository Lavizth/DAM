package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lavizth
 */
public class Frame extends JFrame{
    
    private JPanel panelSlider, panelRGB, panelBotones, panelColor;
    
    public Frame(){
        super("Color");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new PanelSlider(new GridLayout(1, 3)),BorderLayout.LINE_START);
        this.add(panelColor);
    }

    
    private void setPanelColor(){
        panelColor = new JPanel();
    }
    
}
