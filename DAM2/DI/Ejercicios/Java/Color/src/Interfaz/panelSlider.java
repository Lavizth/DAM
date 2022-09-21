package Interfaz;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author a14deividdd
 */
public class PanelSlider extends JPanel{
    
    private GridLayout layout;
    private JScrollBar scrollBarRojo;
    private JScrollBar scrollBarVerde;
    private JScrollBar scrollBarAzul;
    
    public PanelSlider(GridLayout layout){
        this.layout = layout;
    }
    
    public void setPanelSlider(){
        scrollBarRojo = new ScrollBar();
        scrollBarVerde = new ScrollBar();
        scrollBarAzul = new ScrollBar();
    }
    
}
