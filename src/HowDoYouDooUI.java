/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rachelg
 */
public class HowDoYouDooUI extends javax.swing.JFrame {

    GameHandler game;
    /**
     * Creates new form HowDoYouDoUI
     */
    public HowDoYouDooUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        startPanel = new javax.swing.JPanel();
        teamAField = new javax.swing.JTextField();
        teamBField = new javax.swing.JTextField();
        roundSpinner = new javax.swing.JSpinner();
        roundsLbl = new javax.swing.JLabel();
        goBtn = new javax.swing.JButton();
        startHeaderLbl = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        songLbl = new javax.swing.JLabel();
        correctLbl = new javax.swing.JButton();
        passLbl = new javax.swing.JButton();
        mainMenu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        closeItm = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        optnsItm = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutItm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        teamAField.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        teamAField.setForeground(new java.awt.Color(0, 102, 153));
        teamAField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        teamAField.setText("Team A");
        teamAField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamAFieldActionPerformed(evt);
            }
        });

        teamBField.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        teamBField.setForeground(new java.awt.Color(0, 102, 153));
        teamBField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        teamBField.setText("Team B");

        roundSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        roundsLbl.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        roundsLbl.setText("Rounds");

        goBtn.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        goBtn.setText("Go!");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        startHeaderLbl.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        startHeaderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startHeaderLbl.setText("Game Setup");

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                        .addComponent(startHeaderLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                        .addGap(0, 98, Short.MAX_VALUE)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teamBField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                                    .addComponent(roundsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(roundSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                                    .addComponent(teamAField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(92, 92, 92)))))))
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(goBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(startHeaderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teamAField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(teamBField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundsLbl)
                    .addComponent(roundSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(goBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        mainPanel.add(startPanel, "startCard");

        songLbl.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        songLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songLbl.setText("<html>\nSong<br>\n(Artist)");

        correctLbl.setText("CORRECT");
        correctLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctLblActionPerformed(evt);
            }
        });

        passLbl.setText("PASS");
        passLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passLblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(correctLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(passLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(songLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correctLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        mainPanel.add(gamePanel, "gameCard");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");

        closeItm.setText("Close");
        fileMenu.add(closeItm);

        mainMenu.add(fileMenu);

        editMenu.setText("Edit");

        optnsItm.setText("Options");
        editMenu.add(optnsItm);

        mainMenu.add(editMenu);

        helpMenu.setText("Help");

        aboutItm.setText("About");
        helpMenu.add(aboutItm);

        mainMenu.add(helpMenu);

        setJMenuBar(mainMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teamAFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamAFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamAFieldActionPerformed

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        Team teamA = new Team(teamAField.getText());
        Team teamB = new Team(teamBField.getText());
        int rounds = (int) roundSpinner.getValue();
        String curSong;
        game = new GameHandler(teamA, teamB, rounds);
        songLbl.setText(game.nextSong());
        java.awt.CardLayout cardLayout = (java.awt.CardLayout) mainPanel.getLayout();
        cardLayout.next(mainPanel);
    }//GEN-LAST:event_goBtnActionPerformed

    private void correctLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctLblActionPerformed
        songLbl.setText(game.nextSong(true));
    }//GEN-LAST:event_correctLblActionPerformed

    private void passLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passLblActionPerformed
        songLbl.setText(game.nextSong(false));
    }//GEN-LAST:event_passLblActionPerformed

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
            java.util.logging.Logger.getLogger(HowDoYouDooUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HowDoYouDooUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HowDoYouDooUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HowDoYouDooUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HowDoYouDooUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItm;
    private javax.swing.JMenuItem closeItm;
    private javax.swing.JButton correctLbl;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JButton goBtn;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem optnsItm;
    private javax.swing.JButton passLbl;
    private javax.swing.JSpinner roundSpinner;
    private javax.swing.JLabel roundsLbl;
    private javax.swing.JLabel songLbl;
    private javax.swing.JLabel startHeaderLbl;
    private javax.swing.JPanel startPanel;
    private javax.swing.JTextField teamAField;
    private javax.swing.JTextField teamBField;
    // End of variables declaration//GEN-END:variables
}
