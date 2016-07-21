package dealornodeal.ui;
import java.awt.Color;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebastian & David
 * this is the InstructonJPanel which goes on the main frame 
 */
  
public class InstructonJPanel extends javax.swing.JPanel {
    private  int choice = 0;
//   Menu mu = new Menu();
      private DealornoDealJFrame mainframe;  
   
    /**
     * Creates new form instructonJPanel
     */
    public InstructonJPanel(DealornoDealJFrame mainFrame) {
        initComponents();
        this.setBackground(new Color(238, 238, 224));
     mainframe = mainFrame;
      Update();
    }
   // this meathod allows to update the frame with the PlayerName,Round, number Of Cases Round left.
   void Update(){
       jlPlayerNameDisplay.setText(mainframe.playerName);
      lblroundnum.setText(String.valueOf(mainframe.mainRound+1));
      lblnumCase.setText(String.valueOf(mainframe.numberOfCasesRound));

   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInstruction = new javax.swing.JButton();
        lblnumCase = new javax.swing.JLabel();
        lblroundDisplay = new javax.swing.JLabel();
        lblroundnum = new javax.swing.JLabel();
        jlPlayerName = new javax.swing.JLabel();
        jlPlayerNameDisplay = new javax.swing.JLabel();
        lblroundDisplay1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(157, 300));

        btnInstruction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/manual.png"))); // NOI18N
        btnInstruction.setBorder(null);
        btnInstruction.setBorderPainted(false);
        btnInstruction.setContentAreaFilled(false);
        btnInstruction.setFocusable(false);
        btnInstruction.setOpaque(false);
        btnInstruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionActionPerformed(evt);
            }
        });

        lblroundDisplay.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblroundDisplay.setText("Round:");

        jlPlayerName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jlPlayerName.setText("Player: ");

        jlPlayerNameDisplay.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        lblroundDisplay1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblroundDisplay1.setText("Cases Done:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/restart.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblroundDisplay1)
                        .addGap(18, 18, 18)
                        .addComponent(lblnumCase, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlPlayerNameDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblroundDisplay)
                        .addGap(20, 20, 20)
                        .addComponent(lblroundnum, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInstruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlPlayerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlPlayerNameDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblroundDisplay)
                    .addComponent(lblroundnum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblroundDisplay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnumCase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnInstruction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
// this action event allows us to display a JOptionPane of intstruction
    private void btnInstructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionActionPerformed
     JOptionPane.showMessageDialog(this, "To play the game, select from the following cases, at the end of each round your will get a bank offer. Click Exit to terminate program, or restart to replay","*Deal or No Deal*",JOptionPane.INFORMATION_MESSAGE);        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstructionActionPerformed
// Restarts the game
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainframe.Restart();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInstruction;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlPlayerName;
    private javax.swing.JLabel jlPlayerNameDisplay;
    private javax.swing.JLabel lblnumCase;
    private javax.swing.JLabel lblroundDisplay;
    private javax.swing.JLabel lblroundDisplay1;
    private javax.swing.JLabel lblroundnum;
    // End of variables declaration//GEN-END:variables
}
