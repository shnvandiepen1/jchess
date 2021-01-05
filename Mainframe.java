import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mainframe extends MouseAdapter {

    private int width = 1280;
    private int height = 720; 
    
    private JFrame frame;
    private BoardPanel panel; 

    public Mainframe(){
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initPieces();

        panel = new BoardPanel();
        panel.setBackground(Color.gray);
        

        frame.add(panel);
        frame.setVisible(true);        
    } 
    
    public static void initPieces(){
        for(int i = 0; i < 8; i++){
        }
    }

}
