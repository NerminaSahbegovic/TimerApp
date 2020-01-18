
package timerapp;

import javax.swing.JOptionPane;


public class TimerApp {

    public static void main(String[] args) {
         int choice = JOptionPane.showOptionDialog(null,"Choose option","Option dialog",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new String[]{"Settings","Close"},null);
     
        switch(choice){
            case JOptionPane.YES_OPTION:
                 java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            
            public void run() {
                new ControlsFrame().setVisible(true);
            }
        });
                break;
                
            case JOptionPane.NO_OPTION:
                System.exit(0);
                break;
                
            case -1:
                JOptionPane.showMessageDialog(null,"You closed.");
                break;
        
        }
    
    }
    
}

    
    
