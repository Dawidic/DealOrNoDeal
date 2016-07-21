/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealornodeal.ui;

import dealornodeal.model.Cases;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 *
 * @author sebastian & David
 * this Panel is set on the main frame and has our button case
 */
public class buttonjPanel extends javax.swing.JPanel implements ActionListener{
    private String caseOutput;
    private final Cases cases;
    private final DealornoDealJFrame menu;
    private boolean[] casedisable = new boolean[26];
    public boolean fistClick = false;
    private String myCaseOutput;
    /**
     * Creates new form buttonjPanel
     */
    public buttonjPanel(DealornoDealJFrame mainFrame,Cases cs) {
        //allows us to set all the casedisables to false
        Arrays.fill(casedisable,false);//http://stackoverflow.com/questions/12229516/initializing-a-boolean-array-to-false
        initComponents();
        this.setBackground(new Color(255, 248, 220));
//        buttonComponent component = new buttonComponent();
//        component.setSize(616, 364);
//        add(component);
        cases = cs;
        menu = mainFrame;
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
        jButton6.addActionListener(this);
        jButton7.addActionListener(this);
        jButton8.addActionListener(this);
        jButton9.addActionListener(this);
        jButton10.addActionListener(this);
        jButton11.addActionListener(this);
        jButton12.addActionListener(this);
        jButton13.addActionListener(this);
        jButton14.addActionListener(this);
        jButton15.addActionListener(this);
        jButton16.addActionListener(this);
        jButton17.addActionListener(this);
        jButton18.addActionListener(this);
        jButton19.addActionListener(this);
        jButton20.addActionListener(this);
        jButton21.addActionListener(this);
        jButton22.addActionListener(this);
        jButton23.addActionListener(this);
        jButton24.addActionListener(this);
        jButton25.addActionListener(this);
        jButton26.addActionListener(this);
    }
    // sets the output to text then displays
     public void changeOutput(String a){
         lblOutput.setText(a);
        }
//     public float getCaseValue(){
//        return   Float.valueOf(caseOutput);
//        }
     // disables all the buttons
     public void disableCases(){
      jButton1.setEnabled(false);
      jButton2.setEnabled(false);
      jButton3.setEnabled(false);
      jButton4.setEnabled(false);
      jButton5.setEnabled(false);
      jButton6.setEnabled(false);
      jButton7.setEnabled(false);
      jButton8.setEnabled(false);
      jButton9.setEnabled(false);
      jButton10.setEnabled(false);
      jButton11.setEnabled(false);
      jButton12.setEnabled(false);
      jButton13.setEnabled(false);
      jButton14.setEnabled(false);
      jButton15.setEnabled(false);
      jButton16.setEnabled(false);
      jButton17.setEnabled(false);
      jButton18.setEnabled(false);
      jButton19.setEnabled(false);
      jButton20.setEnabled(false);
      jButton21.setEnabled(false);
      jButton22.setEnabled(false);
      jButton23.setEnabled(false);
      jButton24.setEnabled(false);
      jButton25.setEnabled(false);
      jButton26.setEnabled(false);
     }
     // renables the case so long as they have not been previosly opend
     public void enableCases(){

        if(casedisable[0] == false){
         jButton1.setEnabled(true);   
        }
        if(casedisable[1] == false){
         jButton2.setEnabled(true);   
        }
        if(casedisable[2] == false){
         jButton3.setEnabled(true);   
        }
        if(casedisable[3] == false){
         jButton4.setEnabled(true);   
        }
        if(casedisable[4] == false){
         jButton5.setEnabled(true);   
        }
        if(casedisable[5] == false){
         jButton6.setEnabled(true);   
        }
        if(casedisable[6] == false){
         jButton7.setEnabled(true);   
        }
        if(casedisable[7] == false){
         jButton8.setEnabled(true);   
        }
        if(casedisable[8] == false){
         jButton9.setEnabled(true);   
        }
        if(casedisable[9] == false){
         jButton10.setEnabled(true);   
        }
        if(casedisable[10] == false){
         jButton11.setEnabled(true);   
        }
        if(casedisable[11] == false){
         jButton12.setEnabled(true);   
        }
        if(casedisable[12] == false){
         jButton13.setEnabled(true);   
        }
        if(casedisable[13] == false){
         jButton14.setEnabled(true);   
        }
        if(casedisable[14] == false){
         jButton15.setEnabled(true);   
        }
        if(casedisable[15] == false){
         jButton16.setEnabled(true);   
        }
        if(casedisable[16] == false){
         jButton17.setEnabled(true);   
        }
        if(casedisable[17] == false){
         jButton18.setEnabled(true);   
        }
        if(casedisable[18] == false){
         jButton19.setEnabled(true);   
        }
        if(casedisable[19] == false){
         jButton20.setEnabled(true);   
        }
        if(casedisable[20] == false){
         jButton21.setEnabled(true);   
        }
        if(casedisable[21] == false){
         jButton22.setEnabled(true);   
        }
        if(casedisable[22] == false){
         jButton23.setEnabled(true);   
        }
        if(casedisable[23] == false){
         jButton24.setEnabled(true);   
        }
        if(casedisable[24] == false){
         jButton25.setEnabled(true);   
        }
        if(casedisable[25] == false){
         jButton26.setEnabled(true);   
        }


     }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        lblOutput = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblmyCase = new javax.swing.JLabel();
        lblOutput1 = new javax.swing.JLabel();

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/2.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/3.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setOpaque(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/4.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setOpaque(false);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/5.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setOpaque(false);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/6.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setOpaque(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/7.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setOpaque(false);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/8.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusPainted(false);
        jButton8.setOpaque(false);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/9.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusPainted(false);
        jButton9.setOpaque(false);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/10.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        jButton10.setOpaque(false);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/11.png"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setFocusPainted(false);
        jButton11.setOpaque(false);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/12.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setFocusPainted(false);
        jButton12.setOpaque(false);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/13.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setFocusPainted(false);
        jButton13.setOpaque(false);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/14.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.setFocusPainted(false);
        jButton14.setOpaque(false);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/15.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.setFocusPainted(false);
        jButton15.setOpaque(false);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/16.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setFocusPainted(false);
        jButton16.setOpaque(false);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/17.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setFocusPainted(false);
        jButton17.setOpaque(false);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/18.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setFocusPainted(false);
        jButton18.setOpaque(false);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/19.png"))); // NOI18N
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setFocusPainted(false);
        jButton19.setOpaque(false);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/20.png"))); // NOI18N
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setFocusPainted(false);
        jButton20.setOpaque(false);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/21.png"))); // NOI18N
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setFocusPainted(false);
        jButton21.setOpaque(false);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/22.png"))); // NOI18N
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setFocusPainted(false);
        jButton22.setOpaque(false);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/23.png"))); // NOI18N
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setFocusPainted(false);
        jButton23.setOpaque(false);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/24.png"))); // NOI18N
        jButton24.setBorder(null);
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setFocusPainted(false);
        jButton24.setOpaque(false);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/25.png"))); // NOI18N
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setFocusPainted(false);
        jButton25.setOpaque(false);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/26.png"))); // NOI18N
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setFocusPainted(false);
        jButton26.setOpaque(false);

        lblOutput.setBackground(new java.awt.Color(255, 0, 0));
        lblOutput.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblOutput.setForeground(new java.awt.Color(255, 0, 51));
        lblOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("MyCase");

        lblmyCase.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        lblOutput1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        lblOutput1.setForeground(new java.awt.Color(255, 255, 255));
        lblOutput1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOutput1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/title.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOutput1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOutput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton7)
                            .addComponent(jButton13)
                            .addComponent(jButton19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton25)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton21)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton22)
                                    .addComponent(jButton26))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmyCase, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27)))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblOutput1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1))
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12)
                    .addComponent(jButton11)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton24))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton25)
                            .addComponent(jButton26)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lblmyCase, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblOutput1;
    private javax.swing.JLabel lblmyCase;
    // End of variables declaration//GEN-END:variables
 // allows us to overide the action performed meathod and use our own meathods
 @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == jButton1) // if the button is clicked
        {
        if(fistClick == false) { // if its the first click then it sets the MyCase to the case
         menu.myCase = 1;// sets the value of the my case back to mycase which is stored in the main frame
         
          jButton1.setEnabled(false);// disables the button
         casedisable[0] = true; // sets the boolean array to true
       }else{
        caseOutput = Float.toString(cases.retCaseValue(0));// if it's not the first click then it returns the vale inside the case
        lblOutput.setText("$" +caseOutput);// sets the text to the return value
        cases.caseOpen(0);// opens the case which clears the value
       jButton1.setEnabled(false);// disables the button
        casedisable[0] = true;// sets the boolean array to true
        }
        }
        if(source == jButton2)
        {
         if(fistClick == false) {
         menu.myCase = 2;
         lblOutput.setText("your have Selected Case:2");
          jButton2.setEnabled(false);
          casedisable[1] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(1));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(1);
       jButton2.setEnabled(false);
        casedisable[1] = true;
        }
        }
        if(source == jButton3)
        {
        if(fistClick == false) {
         menu.myCase = 3;
         
          jButton3.setEnabled(false);
         casedisable[2] = true;
       }else{    
        caseOutput = Float.toString(cases.retCaseValue(2));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(2);
        jButton3.setEnabled(false);
        casedisable[2] = true;
        }
        }
        if(source == jButton4)
        {
        if(fistClick == false) {
         menu.myCase = 4;
         
          jButton4.setEnabled(false);
         casedisable[3] = true;
        }else{
        caseOutput = Float.toString(cases.retCaseValue(3));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(3);
        jButton4.setEnabled(false);
        casedisable[3] = true;
        }
        }
        if(source == jButton5)
        {
        if(fistClick == false) {
         menu.myCase = 5;
         
          jButton5.setEnabled(false);
         casedisable[4] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(4));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(4);
        jButton5.setEnabled(false);
        casedisable[4] = true;
        }
        }
        if(source == jButton6)
        {
        if(fistClick == false) {
         menu.myCase = 6;
         
          jButton6.setEnabled(false);
         casedisable[5] = true;
       }else{    
        caseOutput = Float.toString(cases.retCaseValue(5));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(5);
        jButton6.setEnabled(false);
        casedisable[5] = true;
        }
        }
        if(source == jButton7)
        {
        if(fistClick == false) {
         menu.myCase = 7;
         
          jButton7.setEnabled(false);
         casedisable[6] = true;
       }else{    
        caseOutput = Float.toString(cases.retCaseValue(6));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(6);
        jButton7.setEnabled(false);
        casedisable[6] = true;
        }
        }
        if(source == jButton8)
        {
        if(fistClick == false) {
         menu.myCase = 8;
         
          jButton8.setEnabled(false);
         casedisable[7] = true;
        }else{
        caseOutput = Float.toString(cases.retCaseValue(7));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(7);
        jButton8.setEnabled(false);
        casedisable[7] = true;
        }
        }
        if(source == jButton9)
        {
         if(fistClick == false) {
         menu.myCase = 9;
         
          jButton9.setEnabled(false);
         casedisable[8] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(8));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(8);
        jButton9.setEnabled(false); 
        casedisable[8] = true;
        }
        }
        if(source == jButton10)
        {if(fistClick == false) {
         menu.myCase = 10;
         
          jButton10.setEnabled(false);
         casedisable[9] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(9));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(9);
        jButton10.setEnabled(false);
        casedisable[9] = true;
        }
        }
        if(source == jButton11)
        {
        if(fistClick == false) {
         menu.myCase = 11;
         
          jButton11.setEnabled(false);
         casedisable[10] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(11));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(10);
        jButton11.setEnabled(false); 
        casedisable[10] = true;
        }
        }
        if(source == jButton12)
        {
            if(fistClick == false) {
         menu.myCase = 12;
         
          jButton12.setEnabled(false);
         casedisable[11] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(11));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(11);
        jButton12.setEnabled(false);
        casedisable[11] = true;
        }
        }
        if(source == jButton13)
        {
        if(fistClick == false) {
         menu.myCase = 13;
         
          jButton13.setEnabled(false);
         casedisable[12] = true;
       }else{    
        caseOutput = Float.toString(cases.retCaseValue(12));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(12);
        jButton13.setEnabled(false);
        casedisable[12] = true;
        }
        }
        if(source == jButton14)
        {
        if(fistClick == false) {
         menu.myCase = 14;
         
          jButton14.setEnabled(false);
         casedisable[13] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(13));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(13);
        jButton14.setEnabled(false);
        casedisable[13] = true;
        }
        }
        if(source == jButton15)
        {
        if(fistClick == false) {
         menu.myCase = 15;
         
          jButton15.setEnabled(false);
         casedisable[14] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(14));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(14);
        jButton15.setEnabled(false); 
        casedisable[14] = true;
        }
        }
        if(source == jButton16)
        {
        if(fistClick == false) {
         menu.myCase = 16;
         
          jButton16.setEnabled(false);
         casedisable[15] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(15));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(15);
        jButton16.setEnabled(false);
        casedisable[15] = true;
        }
        }
        if(source == jButton17)
        {
        if(fistClick == false) {
         menu.myCase = 17;
         
          jButton17.setEnabled(false);
         casedisable[16] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(16));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(16);
        jButton17.setEnabled(false);
        casedisable[16] = true;
        }
        }
        if(source == jButton18)
        {
        if(fistClick == false) {
         menu.myCase = 18;
         
          jButton18.setEnabled(false);
         casedisable[17] = true;
       }else{
         caseOutput = Float.toString(cases.retCaseValue(17));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(17);
        jButton18.setEnabled(false);
        casedisable[17] = true;
        }
        }
        if(source == jButton19)
        {
        if(fistClick == false) {
         menu.myCase = 19;
         
          jButton19.setEnabled(false);
         casedisable[18] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(18));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(18);
        jButton19.setEnabled(false);
        casedisable[18] = true;
        }
        }
        if(source == jButton20)
        {
        if(fistClick == false) {
         menu.myCase = 20;
         
          jButton20.setEnabled(false);
         casedisable[19] = true;
        }else{
        caseOutput = Float.toString(cases.retCaseValue(19));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(19);
        jButton20.setEnabled(false);
        casedisable[19] = true;
        }
        }
        if(source == jButton21)
        {if(fistClick == false) {
         menu.myCase = 21;
         
          jButton21.setEnabled(false);
         casedisable[20] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(20));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(20);
        jButton21.setEnabled(false);
        casedisable[20] = true;
        }
        }
        if(source == jButton22)
        {
        if(fistClick == false) {
         menu.myCase = 22;
         
          jButton22.setEnabled(false);
         casedisable[21] = true;
       }else{    
        caseOutput = Float.toString(cases.retCaseValue(21));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(21);
        jButton22.setEnabled(false); 
        casedisable[21] = true;
        }
        }
        if(source == jButton23)
        {
        if(fistClick == false) {
         menu.myCase = 23;
         
          jButton23.setEnabled(false);
         casedisable[22] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(22));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(22);
        jButton23.setEnabled(false); 
        casedisable[22] = true;
        }
        }
        if(source == jButton24)
        {
        if(fistClick == false) {
         menu.myCase = 24;
         
          jButton24.setEnabled(false);
         casedisable[23] = true;
        }else{    
        caseOutput = Float.toString(cases.retCaseValue(23));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(23);
        jButton24.setEnabled(false);
        casedisable[23] = true;
        }
        }
        if(source == jButton25)
        {
        if(fistClick == false) {
         menu.myCase = 25;
         
          jButton25.setEnabled(false);
         casedisable[24] = true;
       }else{    
        caseOutput = Float.toString(cases.retCaseValue(24));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(24);
        jButton25.setEnabled(false); 
        casedisable[24] = true;
        }
        }
        if(source == jButton26)
        {
        if(fistClick == false) {
         menu.myCase = 26;
         
          jButton26.setEnabled(false);
         casedisable[25] = true;
       }else{
        caseOutput = Float.toString(cases.retCaseValue(25));
        lblOutput.setText("$" +caseOutput);
        cases.caseOpen(25);
        jButton26.setEnabled(false);
        casedisable[25] = true;
        }
        }
         menu.roundUpdate();// after the action event it updates the display
         myCaseOutput = Float.toString(menu.myCase);
         System.out.println("mycase"+menu.myCase);
         lblmyCase.setText(myCaseOutput);// sets the text of my case
         if(fistClick == false) { // if its still the first click.
         fistClick = true; // changes to false
         lblOutput.setText("your have Selected Case:"+menu.myCase);// displays output of my case
         }
    }
}
