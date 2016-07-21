/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealornodeal.database;

import dealornodeal.ui.DealornoDealJFrame;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian and David
 */
public class topScoreJFrame extends javax.swing.JFrame {

    String playerName;
    float bankOffer;
    String finalPlayerName;
    ScoreList sl = new ScoreList();

    /**
     * Creates new form topScoreJFrame
     */
    public topScoreJFrame(String play, float offer) {
        super("topScore");
        this.playerName = play;
        this.bankOffer = offer;
        initComponents();
        this.setBackground(new Color(255, 248, 220));
        jtbNewGame.setEnabled(false);
        jTopScores.setText(sl.getData());
        tfName.setText(playerName);

        String caseOutput = Float.toString(bankOffer);
        jtlTopScoreShow.setText(caseOutput);
        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTopScores = new javax.swing.JTextArea();
        pnlbackground = new javax.swing.JPanel();
        jtbAddScore = new javax.swing.JButton();
        tfName = new javax.swing.JTextField();
        jtlTopScoreShow = new javax.swing.JLabel();
        jtlTopScore = new javax.swing.JLabel();
        jtlName = new javax.swing.JLabel();
        jtl_title = new javax.swing.JLabel();
        jtbNewGame = new javax.swing.JButton();
        jtbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 220));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setForeground(new java.awt.Color(255, 248, 220));

        jTopScores.setBackground(new java.awt.Color(255, 248, 220));
        jTopScores.setColumns(20);
        jTopScores.setLineWrap(true);
        jTopScores.setRows(5);
        jTopScores.setAutoscrolls(false);
        jTopScores.setBorder(null);
        jTopScores.setCaretColor(new java.awt.Color(255, 248, 220));
        jTopScores.setFocusable(false);
        jTopScores.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTopScores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 279, 501, 230));

        pnlbackground.setBackground(new java.awt.Color(255, 248, 220));

        jtbAddScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/submitred.png"))); // NOI18N
        jtbAddScore.setBorder(null);
        jtbAddScore.setBorderPainted(false);
        jtbAddScore.setContentAreaFilled(false);
        jtbAddScore.setFocusPainted(false);
        jtbAddScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbAddScoreActionPerformed(evt);
            }
        });

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        jtlTopScore.setText("TopScore");

        jtlName.setText("Name");

        jtl_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/title.png"))); // NOI18N

        jtbNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/playagain.png"))); // NOI18N
        jtbNewGame.setBorder(null);
        jtbNewGame.setBorderPainted(false);
        jtbNewGame.setContentAreaFilled(false);
        jtbNewGame.setFocusPainted(false);
        jtbNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbNewGameActionPerformed(evt);
            }
        });

        jtbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/existred.png"))); // NOI18N
        jtbExit.setBorderPainted(false);
        jtbExit.setContentAreaFilled(false);
        jtbExit.setFocusPainted(false);
        jtbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlbackgroundLayout = new javax.swing.GroupLayout(pnlbackground);
        pnlbackground.setLayout(pnlbackgroundLayout);
        pnlbackgroundLayout.setHorizontalGroup(
            pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbackgroundLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jtl_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(pnlbackgroundLayout.createSequentialGroup()
                .addGroup(pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlbackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtlName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtlTopScore))
                        .addGap(129, 129, 129)
                        .addGroup(pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtlTopScoreShow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlbackgroundLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jtbAddScore)
                        .addGap(32, 32, 32)
                        .addComponent(jtbNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnlbackgroundLayout.setVerticalGroup(
            pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbackgroundLayout.createSequentialGroup()
                .addGroup(pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtl_title)
                    .addComponent(jtbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtlName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtlTopScore)
                    .addComponent(jtlTopScoreShow, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtbAddScore)
                    .addComponent(jtbNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(257, Short.MAX_VALUE))
        );

        getContentPane().add(pnlbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtbAddScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbAddScoreActionPerformed
        //finally add score to databse
        //user can only play again after clicking 'submit'
        finalPlayerName = tfName.getText();
//        jTopScores.setText("Name"+"              "+"Score"+"\n"+finalPlayerName+"              "+bankOffer);
        try {


            sl.connectScoreListDB(finalPlayerName, bankOffer);
            jTopScores.setText(sl.getData());
            jtbAddScore.setEnabled(false);
            jtbNewGame.setEnabled(true);

// TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(topScoreJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtbAddScoreActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void jtbNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbNewGameActionPerformed
        //user chance to rename
        DealornoDealJFrame gameFrame = new DealornoDealJFrame(finalPlayerName);
        this.dispose();
    }//GEN-LAST:event_jtbNewGameActionPerformed

    private void jtbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbExitActionPerformed
        //exit button

        System.exit(0);
    }//GEN-LAST:event_jtbExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(topScoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(topScoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(topScoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(topScoreJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new topScoreJFrame().setVisible(true);
////            }
//        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTopScores;
    private javax.swing.JButton jtbAddScore;
    private javax.swing.JButton jtbExit;
    private javax.swing.JButton jtbNewGame;
    private javax.swing.JLabel jtlName;
    private javax.swing.JLabel jtlTopScore;
    private javax.swing.JLabel jtlTopScoreShow;
    private javax.swing.JLabel jtl_title;
    private javax.swing.JPanel pnlbackground;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
