
package timerapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.SwingWorker;
import javax.swing.Timer;

public class ControlsFrame extends javax.swing.JFrame {

    SwingWorker sw;
    Timer timer ;
    Color c;
    ColorFrame cf = new ColorFrame();
   
    public ControlsFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        startBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        onTimeRadioBtn = new javax.swing.JRadioButton();
        countdownRadioBtn = new javax.swing.JRadioButton();
        chooseColorBtn = new javax.swing.JButton();
        colorLbl = new javax.swing.JLabel();
        speedLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFormattedTextField1.setColumns(8);
        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, onTimeRadioBtn, org.jdesktop.beansbinding.ELProperty.create("${selected}"), jFormattedTextField1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jFormattedTextField2.setColumns(12);
        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, countdownRadioBtn, org.jdesktop.beansbinding.ELProperty.create("${selected}"), jFormattedTextField2, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        startBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        startBtn.setText("START");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });

        stopBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        stopBtn.setText("STOP");
        stopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(onTimeRadioBtn);
        onTimeRadioBtn.setText("On time:");

        buttonGroup1.add(countdownRadioBtn);
        countdownRadioBtn.setText("Countdown(sec):");

        chooseColorBtn.setText("Choose color");
        chooseColorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseColorBtnActionPerformed(evt);
            }
        });

        colorLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        colorLbl.setText("C H O S E N   C O L O R");

        speedLbl.setText("Speed:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(startBtn)
                .addGap(49, 49, 49)
                .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(onTimeRadioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countdownRadioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(speedLbl)
                    .addComponent(chooseColorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField1))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(colorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onTimeRadioBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countdownRadioBtn))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseColorBtn)
                    .addComponent(colorLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(speedLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stopBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(startBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseColorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseColorBtnActionPerformed
       JColorChooser jcc = new JColorChooser();
        JDialog dialog = JColorChooser.createDialog(jcc, "Choose color", true, jcc, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                c = jcc.getColor();
                colorLbl.setForeground(c);
            }
        }, null);
        dialog.setVisible(true);
    }//GEN-LAST:event_chooseColorBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
       
       
        onTimeRadioBtn.setEnabled(false);
        countdownRadioBtn.setEnabled(false);
        jFormattedTextField1.setEnabled(false);
        jFormattedTextField2.setEnabled(false);
        chooseColorBtn.setEnabled(false);
        colorLbl.setEnabled(false);
        jComboBox1.setEnabled(false);
        speedLbl.setEnabled(false);
        startBtn.setEnabled(false);
        
        if(onTimeRadioBtn.isSelected()){
             
            DateFormat df = new SimpleDateFormat("HH:mm:ss");
            
            try{
            Calendar c1 = Calendar.getInstance();
            c1.setTime((Date) df.parse(jFormattedTextField1.getText()));
            
            Calendar c2 = Calendar.getInstance();
            
            int h1 = c1.get(Calendar.HOUR_OF_DAY);
            int m1= c1.get(Calendar.MINUTE);
            int s1 = c1.get(Calendar.SECOND);
            
            int h2 = c2.get(Calendar.HOUR_OF_DAY);
            int m2 = c2.get(Calendar.MINUTE);
            int s2 = c2.get(Calendar.SECOND);
       
            String ss1 = Integer.toString(h1) + ":" + Integer.toString(m1) + ":" + Integer.toString(s1);
            String ss2 = Integer.toString(h2) + ":" + Integer.toString(m2) + ":" + Integer.toString(s2);
            
            Date d1 = df.parse(ss1);
            Date d2 = df.parse(ss2);
            
            long time = d1.getTime() - d2.getTime();
            int speed = jComboBox1.getSelectedIndex() + 1;
            
                  
           timer = new Timer(speed, new ActionListener() { 
               
                @Override
                public void actionPerformed(ActionEvent ae) {
                   
                   
                    sw = new SwingWorker(){
                      
                        @Override
                        protected Object doInBackground() throws Exception {
                             Thread.sleep(time); 
                             
                             while(timer.isRunning()){
                                  cf.setVisible(true);
                                  Thread.sleep(speed*1000);
                                  cf.getContentPane().setBackground(c);
                                  Thread.sleep(speed*1000);
                                  cf.getContentPane().setBackground(Color.white);
                             }
                             return null;
                                
                            }};
                     
                        sw.execute();
                 }
            });
           
            timer.start();
          
           
            }catch(ParseException ex){
                System.out.println("Error");
            }
           
        
        }else if(countdownRadioBtn.isSelected()){
            
    
            int timeToShow = Integer.parseInt(jFormattedTextField2.getText()) * 1000;
            int speed = jComboBox1.getSelectedIndex() + 1; 
            
               
            timer = new Timer(speed, new ActionListener(){
                
                 
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                   
                    sw = new SwingWorker(){
                            
                            @Override
                            protected Object doInBackground() throws Exception {
                                 Thread.sleep(timeToShow);   
                             
                                 while( timer.isRunning()){
                                     
                                     cf.setVisible(true);  
                                     Thread.sleep(speed*1000);
                                     cf.getContentPane().setBackground(c);
                                     Thread.sleep(speed*1000);
                                     cf.getContentPane().setBackground(Color.white);
                                }
                                return null;
                              
                            } };
                       
                   sw.execute();
                }

            });
        
              timer.start();
             
          }
         
               
    }//GEN-LAST:event_startBtnActionPerformed

    private void stopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBtnActionPerformed
        
    
        timer.stop();
        cf.dispose();
        
    
        onTimeRadioBtn.setEnabled(true);
        countdownRadioBtn.setEnabled(true);
        jFormattedTextField1.setEnabled(true);
        jFormattedTextField1.setText("");
        jFormattedTextField2.setEnabled(true);
        jFormattedTextField2.setText("");
        chooseColorBtn.setEnabled(true);
        colorLbl.setEnabled(true);
        colorLbl.setForeground(null);
        jComboBox1.setEnabled(true);
        jComboBox1.setSelectedIndex(0);
        speedLbl.setEnabled(true);
        startBtn.setEnabled(true);
        buttonGroup1.clearSelection();

 
    }//GEN-LAST:event_stopBtnActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chooseColorBtn;
    private javax.swing.JLabel colorLbl;
    private javax.swing.JRadioButton countdownRadioBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JRadioButton onTimeRadioBtn;
    private javax.swing.JLabel speedLbl;
    private javax.swing.JButton startBtn;
    private javax.swing.JButton stopBtn;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
