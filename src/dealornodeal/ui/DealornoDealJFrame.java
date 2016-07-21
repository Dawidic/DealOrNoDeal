/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealornodeal.ui;

import dealornodeal.database.topScoreJFrame;
import dealornodeal.model.Cases;
import dealornodeal.model.bankercal;
import java.awt.BorderLayout;

/**
 *
 * @author sebastian & David
 */
public class DealornoDealJFrame extends javax.swing.JFrame {

    //jpanels
    private final InstructonJPanel InstructionJPanel;
    private final NewGameJPanel NewGameJPanel;
    private final MoneyListLow MoneyListLow;
    private final MoneyListHigh MoneyListHigh;
    private final buttonjPanel buttonjPanel;
    // based code for cases and bankercal
    private final Cases Cases;
    bankercal bc = new bankercal();
    //payername
    public String playerName;
    //variables to determine round numbers, cases, and bank offers
    private int numSelect;
    public int mainRound = 0;
    private int casesInRound = 6;
    private float finalCases;
    public int myCase = 99;
    private int cases = 26;
    public int numberOfCasesRound = 7;
    private float totalValue = 0;
    public float bankOffer = 0;
    private final float average = 0;
    private int offer;
    private int buttonpress = 9;
    private int countCase = 0;

    /*
     add all panels to 1 jFrame and passing each instance of object when needed

     */
    public DealornoDealJFrame(String player) {
        //super title
        super("Deal Or No Deal");
        this.playerName = player;
        initComponents();
        Cases = new Cases(this);
        Cases.randomSort();
        InstructionJPanel = new InstructonJPanel(this);
        buttonjPanel = new buttonjPanel(this, Cases);
        NewGameJPanel = new NewGameJPanel(this, buttonjPanel);
        MoneyListLow = new MoneyListLow(this);
        MoneyListHigh = new MoneyListHigh(this);
        moneylowContainer.setLayout(new BorderLayout());
        moneylowContainer.add(MoneyListLow, BorderLayout.CENTER);
        moneyhighContainer.setLayout(new BorderLayout());
        moneyhighContainer.add(MoneyListHigh, BorderLayout.CENTER);
        instructionContainer.setLayout(new BorderLayout());
        instructionContainer.add(InstructionJPanel, BorderLayout.CENTER);
        newGameContainer.setLayout(new BorderLayout());
        newGameContainer.add(NewGameJPanel, BorderLayout.CENTER);
        sectorContainer.setLayout(new BorderLayout());
        sectorContainer.add(buttonjPanel, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
        setLocationRelativeTo(null);
        roundUpdate();
    }
    /*
     Method used to link selected cases to actual number assiciated with that
     case. Also to determine when the colour of the button should change
     */

    public void moneyListUpdate(int x, int y) {
        if (y == 1) {
            MoneyListLow.labelChangeLow(x);
        }
        if (y == 2) {
            MoneyListHigh.labelChangeHigh(x);
        }
    }


    /*
     Rounds is the method which goes through playing the game, it will determine
     what round the game is in, how many cases to go, and when the bank offer 
     should display.
     */
    public void roundUpdate() {
        System.out.println("name" + playerName);
        if (buttonjPanel.fistClick == true) {
            numberOfCasesRound--;
            System.out.println("numberOfCasesRound" + numberOfCasesRound);
        }
        if (numberOfCasesRound == 0) {
            mainRound++;
            InstructionJPanel.Update();
            System.out.println("InstructionJPanel");
            totalValue = Cases.Totalcal();//call the TotalValue of the remaining cases
            bankOffer = bc.bankercal(totalValue, mainRound, cases);// call the banker Calculation 
            buttonjPanel.disableCases();
            System.out.println("disableCases");
            NewGameJPanel.bankerEnable();
            System.out.println("bankerEnable");
            buttonjPanel.changeOutput("BANK OFFER $" + bankOffer);
            //NewGameJPanel.changeOutput("$"+bankOffer);
            System.out.println("bankerPrint");
            //bankerChoice ();
            System.out.println("bankerChoiceEnd");
            if (casesInRound > 1) {
                casesInRound--;
            }
            System.out.println("casesInRound");
            numberOfCasesRound = casesInRound;
            InstructionJPanel.Update();
            if (mainRound == 8) {  // if its the final round, calls the last Choice 
                lastChoiceCheck(55);
            }
        } else {
            //DisplayNum(buttonjPanel.getCaseValue());
            InstructionJPanel.Update();
        }

    }
    /*
     bankerChoice gives use the option if we are going to take the money or carry on playing.
     */

    public int bankerChoice(int x) {
        int choice = x;
        if (choice == 1) {
            bankOffer = bc.bankercal(totalValue, mainRound, cases);
            buttonjPanel.changeOutput("YOU WON $" + bankOffer);
            topScoreJFrame topScore = new topScoreJFrame(playerName, bankOffer);
            this.dispose();
        //System.exit(1);//link to jdatabase
            //System.out.println("retchoice Deal");
            return choice = 0;
        }
        if (choice == 2) {
            buttonjPanel.enableCases();
            //System.out.println("retchoice No Deal");
            return choice = 0;
        }
        return choice = 55;
    }

    /*
     last Choice Check gives use the option 
     of weather we want to take the banker offer or take Your Case
     */
    public int lastChoiceCheck(int z) {
        int choice = z;
        bankOffer = bc.bankercal(totalValue, mainRound, cases);
        String displayBankOffer = ("Bank Offer$ " + bankOffer);
        buttonjPanel.changeOutput(displayBankOffer);
        String displayChoice = ("Case? or ");
        String totalDisplay = (displayChoice + "\n" + displayBankOffer);
        buttonjPanel.changeOutput(totalDisplay);
        NewGameJPanel.changeButtonMyCase();
        //last choice of the final round. Mycase or deal...will take to 
        // Choice one is taking the banker offer which sends your player name and the bankoffer to the topscorejframe
        // then gets rid of the the main frame
        if (choice == 1) {
            bankOffer = bc.bankercal(totalValue, mainRound, cases);
            buttonjPanel.changeOutput("YOU WON $" + bankOffer);
            topScoreJFrame topScore = new topScoreJFrame(playerName, bankOffer);
            this.dispose();
            return choice = 0;
        }
        // Choice two is taking MyCase which sends your player name and the MyCase to the topscorejframe
        // then gets rid of the the main frame
        if (choice == 2) {
            buttonjPanel.changeOutput("YOUR CASE HAS $" + Cases.retCaseValue(myCase - 1));
            topScoreJFrame topScore = new topScoreJFrame(playerName, Cases.retCaseValue(myCase - 1));
            this.dispose();
            return choice = 0;

        }
        return choice;
    }
    //used to restart the game
    public void Restart() {

        this.dispose();
        DealornoDealJFrame gameFrame = new DealornoDealJFrame(playerName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moneylowContainer = new javax.swing.JPanel();
        sectorContainer = new javax.swing.JPanel();
        newGameContainer = new javax.swing.JPanel();
        moneyhighContainer = new javax.swing.JPanel();
        instructionContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        javax.swing.GroupLayout moneylowContainerLayout = new javax.swing.GroupLayout(moneylowContainer);
        moneylowContainer.setLayout(moneylowContainerLayout);
        moneylowContainerLayout.setHorizontalGroup(
            moneylowContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        moneylowContainerLayout.setVerticalGroup(
            moneylowContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sectorContainerLayout = new javax.swing.GroupLayout(sectorContainer);
        sectorContainer.setLayout(sectorContainerLayout);
        sectorContainerLayout.setHorizontalGroup(
            sectorContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );
        sectorContainerLayout.setVerticalGroup(
            sectorContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout newGameContainerLayout = new javax.swing.GroupLayout(newGameContainer);
        newGameContainer.setLayout(newGameContainerLayout);
        newGameContainerLayout.setHorizontalGroup(
            newGameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        newGameContainerLayout.setVerticalGroup(
            newGameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout moneyhighContainerLayout = new javax.swing.GroupLayout(moneyhighContainer);
        moneyhighContainer.setLayout(moneyhighContainerLayout);
        moneyhighContainerLayout.setHorizontalGroup(
            moneyhighContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        moneyhighContainerLayout.setVerticalGroup(
            moneyhighContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout instructionContainerLayout = new javax.swing.GroupLayout(instructionContainer);
        instructionContainer.setLayout(instructionContainerLayout);
        instructionContainerLayout.setHorizontalGroup(
            instructionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        instructionContainerLayout.setVerticalGroup(
            instructionContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(moneylowContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(sectorContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(moneyhighContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGameContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instructionContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moneylowContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sectorContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(moneyhighContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(instructionContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(newGameContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DealornoDealJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DealornoDealJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DealornoDealJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DealornoDealJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DealornoDealJFrame().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel instructionContainer;
    private javax.swing.JPanel moneyhighContainer;
    private javax.swing.JPanel moneylowContainer;
    private javax.swing.JPanel newGameContainer;
    private javax.swing.JPanel sectorContainer;
    // End of variables declaration//GEN-END:variables

}
