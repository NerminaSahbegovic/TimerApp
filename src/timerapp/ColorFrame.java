
package timerapp;

import java.awt.Color;
import javax.swing.JFrame;


public class ColorFrame extends JFrame{
    
    public ColorFrame(){
   
        initComponents();
    
    }
    void initComponents(){
    this.setSize(500,500);
    this.setLocationRelativeTo(null);
    this.getContentPane().setBackground(Color.white);
    
    }
}
