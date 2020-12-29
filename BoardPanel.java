import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JLabel;

public class BoardPanel extends JPanel {
    public static final int LENGTH = 8;
    private final Color[] COLOR_ARRAY = {Color.decode("#FFFACD"), Color.decode("#593E1A")};

    public BoardPanel(){
        setLayout(new GridLayout(LENGTH, LENGTH));
      
        int numview = 1;

        for(int i = 0; i < LENGTH; i++){
            numview = (numview ==0)? 1:0;
            for(int j = 0; j < LENGTH; j++){
                add(new TileView(COLOR_ARRAY[numview]));
                numview = (numview == 0)? 1:0;                
            }            
        }

    }

}

class TileView extends JLabel {
    public TileView(Color c){
        setPreferredSize(new Dimension(100,100));
        setOpaque(true);
        setBackground(c);
    }
}
