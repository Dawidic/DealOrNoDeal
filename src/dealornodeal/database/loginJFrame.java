package dealornodeal.database;

import dealornodeal.ui.DealornoDealJFrame;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian and David
 * Class used to validate new user/ previous
 *
 */
public class loginJFrame extends javax.swing.JFrame {

    public String playerName;
    PlayerLogin pl = new PlayerLogin();

    /**
     * Creates new form loginJFrame2
     */
    public loginJFrame() {
        super("Login");
        initComponents();
        this.setVisible(true);
        this.setBackground(new Color(255, 248, 220));
//        pl.createTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        jPicture = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jfPassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jtbExit = new javax.swing.JButton();
        btnFirstTimeUser = new javax.swing.JButton();
        BtnReturningUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 248, 220));
        setForeground(new Color(255, 248, 220));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setText("USERNAME:");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 116, -1, -1));

        lblPassword.setText("PASSWORD:");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 136, -1, -1));

        jPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/title.png"))); // NOI18N
        getContentPane().add(jPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 110));

        username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 116, 152, -1));

        jfPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 138, 152, -1));

        jPanel1.setBackground(new java.awt.Color(255, 248, 220));

        jtbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/exit orange.png"))); // NOI18N
        jtbExit.setBorder(null);
        jtbExit.setBorderPainted(false);
        jtbExit.setContentAreaFilled(false);
        jtbExit.setFocusPainted(false);
        jtbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbExitActionPerformed(evt);
            }
        });

        btnFirstTimeUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/newuser orangee.png"))); // NOI18N
        btnFirstTimeUser.setBorderPainted(false);
        btnFirstTimeUser.setContentAreaFilled(false);
        btnFirstTimeUser.setFocusPainted(false);
        btnFirstTimeUser.setFocusable(false);
        btnFirstTimeUser.setRequestFocusEnabled(false);
        btnFirstTimeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstTimeUserActionPerformed(evt);
            }
        });

        BtnReturningUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealornodeal/Img/old user.png"))); // NOI18N
        BtnReturningUser.setBorderPainted(false);
        BtnReturningUser.setContentAreaFilled(false);
        BtnReturningUser.setFocusPainted(false);
        BtnReturningUser.setFocusable(false);
        BtnReturningUser.setRequestFocusEnabled(false);
        BtnReturningUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturningUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFirstTimeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnReturningUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnReturningUser)
                    .addComponent(btnFirstTimeUser)
                    .addComponent(jtbExit))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// this action event sets up and cheaks for the first time user 
    private void btnFirstTimeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstTimeUserActionPerformed
        String playerName = username.getText(); // gets user name
        char[] Password = jfPassword.getPassword(); // gets user password
        if (username.getText().equals("") || jfPassword.getPassword().length == 0) {// cheaks to see if the input fields are not null
            JOptionPane.showMessageDialog(this, "Please Enter A Valid Login", "*Deal or No Deal*", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String passwordString = String.valueOf(Password);// converts the passord from char to string
            try {
                String returnValue;//creates local varable
                returnValue = pl.connectNewPlayerCheckDB(playerName, passwordString);// calls the meathod for cheaking if the user has already played the game in the  database
                System.out.print("new user:" + returnValue);
                if (returnValue == "playerNameused") {// cheaks to see if the return from the meathod is "playerNameused"
                    JOptionPane.showMessageDialog(this, "there is already a player by that name.", "*Deal or No Deal*", JOptionPane.INFORMATION_MESSAGE);
                } else {// if the playerName isnt used 
                    returnValue = pl.connectNewPlayerAddDB(playerName, passwordString);// calls the meathod which  adds the player to the database
                    if (returnValue == "playerInserted") {// cheaks if it has inserted
                        DealornoDealJFrame gameFrame = new DealornoDealJFrame(playerName);// creating a new instance of the game Frame
                        this.dispose();// gets rid of the login jframe
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(loginJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btnFirstTimeUserActionPerformed
// this action event cheaks the data base to see if the user has previous played the came and the compars the password
    private void BtnReturningUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturningUserActionPerformed
        String playerName = username.getText(); // login username
        char[] Password = jfPassword.getPassword(); // login password
        if (username.getText().equals("") || jfPassword.getPassword().length == 0) { // cheaks to see if the input fields are not null
            JOptionPane.showMessageDialog(this, "Please Enter A Valid Login\n If your a first time user please use the first time button\n otherwise please make sure your username and passowrd are correct!", "*Deal or No Deal*", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                String passwordString = String.valueOf(Password);// converts the passord from char to string
                String returnValue;//creates local varable
                returnValue = pl.connectPlayerLoginDB(playerName, passwordString);// calls the meathod for conecting to the database
                if (returnValue == null) {// if null then it will display a joption pane
                    JOptionPane.showMessageDialog(this, " there is no UserName", "Deal or No Deal", JOptionPane.INFORMATION_MESSAGE);
                }
                if (returnValue == "passwordvaild") { // Starts the game if the password is vaild
                    DealornoDealJFrame gameFrame = new DealornoDealJFrame(playerName);// creating a new instance of the game Frame
                    this.dispose();// gets rid of the login jframe
                }
                if (returnValue == "invaildPassword") {// Displays a j option pane if the password is invaild
                    JOptionPane.showMessageDialog(this, "Not a vaild Password", "Deal or No Deal", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                Logger.getLogger(loginJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_BtnReturningUserActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void jtbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbExitActionPerformed
        System.exit(0);// quits the program
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
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReturningUser;
    private javax.swing.JButton btnFirstTimeUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPicture;
    private javax.swing.JPasswordField jfPassword;
    private javax.swing.JButton jtbExit;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
