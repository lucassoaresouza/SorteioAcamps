/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteioacamps;

import java.awt.Dimension;
import java.awt.Toolkit;


/**
 *
 * @author Lucas
 */
public class MainMenu extends javax.swing.JFrame {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int)screenSize.getWidth();
    int screenHeight = (int)screenSize.getHeight();
    RaffleANumber sort_numb = new RaffleANumber();
    RaffleMultNumbers sort_tarefa = new RaffleMultNumbers();

    public MainMenu() {
        initComponents();
        //verificar_janela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        raffleANumbers = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        raffleMultNumbers = new javax.swing.JButton();
        text2 = new javax.swing.JLabel();
        text3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio Acamps");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new java.awt.GridLayout(6, 1, 0, 15));
        getContentPane().add(jPanel3);

        text1.setFont(new java.awt.Font("Arial", 1, screenHeight/15));
        text1.setForeground(new java.awt.Color(0, 133, 178));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("Sorteio de Tarefas ou Brindes");
        text1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        text1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        text1.setMaximumSize(new java.awt.Dimension(screenWidth/2, 36));
        text1.setMinimumSize(new java.awt.Dimension(800, 36));
        text1.setPreferredSize(new java.awt.Dimension(screenWidth/2, 36));
        getContentPane().add(text1);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        raffleANumbers.setBackground(new java.awt.Color(242, 242, 242));
        raffleANumbers.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/30));
        raffleANumbers.setText("Sorteio Único");
        raffleANumbers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raffleANumbers.setBorderPainted(false);
        raffleANumbers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        raffleANumbers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        raffleANumbers.setMaximumSize(new java.awt.Dimension(screenWidth/2, screenHeight/6));
        raffleANumbers.setMinimumSize(new java.awt.Dimension(screenWidth/2, screenHeight/6));
        raffleANumbers.setPreferredSize(new java.awt.Dimension(screenWidth/2, screenHeight/6));
        raffleANumbers.setVerifyInputWhenFocusTarget(false);
        raffleANumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raffleANumbersActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(raffleANumbers, gridBagConstraints);

        getContentPane().add(jPanel1);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        raffleMultNumbers.setBackground(new java.awt.Color(242, 242, 242));
        raffleMultNumbers.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/30));
        raffleMultNumbers.setText("Sortear Vários");
        raffleMultNumbers.setToolTipText("");
        raffleMultNumbers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raffleMultNumbers.setBorderPainted(false);
        raffleMultNumbers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        raffleMultNumbers.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        raffleMultNumbers.setMaximumSize(new java.awt.Dimension(screenWidth/2, screenHeight/6));
        raffleMultNumbers.setMinimumSize(new java.awt.Dimension(screenWidth/2, screenHeight/6));
        raffleMultNumbers.setPreferredSize(new java.awt.Dimension(screenWidth/2, screenHeight/6));
        raffleMultNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raffleMultNumbersActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel2.add(raffleMultNumbers, gridBagConstraints);

        getContentPane().add(jPanel2);

        text2.setFont(new java.awt.Font("Arial", 1, screenHeight/20));
        text2.setForeground(new java.awt.Color(0, 133, 178));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Primeira Igreja Batista Bíblica no Novo Gama");
        text2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        text2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        text2.setMaximumSize(new java.awt.Dimension((int)screenWidth/2, 36));
        text2.setPreferredSize(new java.awt.Dimension((int)screenWidth/2, 36));
        text2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(text2);

        text3.setFont(new java.awt.Font("Arial", 1, screenHeight/40));
        text3.setForeground(new java.awt.Color(0, 133, 178));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        text3.setText("Versão 1.1.0 - 05/02/2023");
        text3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        text3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        text3.setMaximumSize(new java.awt.Dimension(160, 30));
        text3.setMinimumSize(new java.awt.Dimension(160, 30));
        getContentPane().add(text3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raffleMultNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raffleMultNumbersActionPerformed

        sort_tarefa.setVisible(true);

    }//GEN-LAST:event_raffleMultNumbersActionPerformed

    private void raffleANumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raffleANumbersActionPerformed

        sort_numb.setVisible(true);

    }//GEN-LAST:event_raffleANumbersActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainMenu().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton raffleANumbers;
    private javax.swing.JButton raffleMultNumbers;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    // End of variables declaration//GEN-END:variables
}
