package Interfaz;

import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

/**
 *
 * @author Lavizth
 */
public class ScrollBar extends JScrollBar{
    
    private static final int ORIENTACION =  SwingConstants.VERTICAL;
    private static final int VALOR_INICIAL = 0;
    private static final int EXTEND = 1;
    private static final int MIN = 0;
    private static final int MAX = 255;
    
    public ScrollBar(){
        super(ORIENTACION, VALOR_INICIAL, EXTEND,MIN,MAX);
    }
    
    


}
