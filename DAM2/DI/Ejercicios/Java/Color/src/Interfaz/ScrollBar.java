package Interfaz;

import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author Lavizth
 */
public class ScrollBar extends JScrollBar implements AdjustmentListener{
    
    private JPanel panelColor;
    
    public ScrollBar(int orientacion, int valor, int extend, int min, int max, JPanel panelColor){
        super(orientacion, valor, extend, min, max);
        this.panelColor = panelColor;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        System.out.println("a");
        panelColor.setBackground(Color.GREEN);
    }



    
    
    
}
