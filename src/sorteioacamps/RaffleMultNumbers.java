/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteioacamps;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Timer;

/**
 *
 * @author Lucas
 */
public class RaffleMultNumbers extends javax.swing.JFrame {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int)screenSize.getWidth();
    int screenHeight = (int)screenSize.getHeight();
    Raffle sortear = new Raffle();
    Timer t;
    int timer_flag = 11;
    ArrayList<Integer> numeros_sorteados = new ArrayList<>();
    ArrayList<Integer> todos_numeros = new ArrayList<>();
    int qtd_numeros = 0;
    
    public RaffleMultNumbers() {
        initComponents();
        
        t = new javax.swing.Timer(100, (ActionEvent e) -> {
            if(timer_flag < 5){
                
                sort_number_2.setText("???");
                sort_number_3.setText("???");
                sort_number_4.setText("???");
                sort_number_5.setText("???");
                sort_number_6.setText("???");
                sort_number_7.setText("???");
                sort_number_8.setText("???");
                sort_number_9.setText("???");
                sort_number_10.setText("???");
                sort_number_1.setText("???");
                
                if (sort_number_1.isVisible() == true) {
                    timer_flag++;
                    
                    sort_number_1.setVisible(false);
                    sort_number_2.setVisible(false);
                    sort_number_3.setVisible(false);
                    sort_number_4.setVisible(false);
                    sort_number_5.setVisible(false);
                    sort_number_6.setVisible(false);
                    sort_number_7.setVisible(false);
                    sort_number_8.setVisible(false);
                    sort_number_9.setVisible(false);
                    sort_number_10.setVisible(false);
                    
                    
                }else{
                    
                    sort_number_1.setVisible(true);
                    sort_number_2.setVisible(true);
                    sort_number_3.setVisible(true);
                    sort_number_4.setVisible(true);
                    sort_number_5.setVisible(true);
                    sort_number_6.setVisible(true);
                    sort_number_7.setVisible(true);
                    sort_number_8.setVisible(true);
                    sort_number_9.setVisible(true);
                    sort_number_10.setVisible(true);
                    
                }
                
            } else {
                
                sort_number_1.setVisible(true);
                sort_number_2.setVisible(true);
                sort_number_3.setVisible(true);
                sort_number_4.setVisible(true);
                sort_number_5.setVisible(true);
                sort_number_6.setVisible(true);
                sort_number_7.setVisible(true);
                sort_number_8.setVisible(true);
                sort_number_9.setVisible(true);
                sort_number_10.setVisible(true);
                
                t.stop();
                int num_max = 0;
                int num_min = 0;
                timer_flag = 11;
                
                try{
                    
                    num_max = Integer.parseInt(maximumNumber.getText());
                    num_min = Integer.parseInt(minimalNumber.getText());
                    
                } catch(NumberFormatException ex) {
                    
                    errorLabel.setText("Os campos devem conter somente números inteiros!");
                    
                }
                
                
                try{
                    
                    qtd_numeros = (Integer.parseInt(totalNumberCount.getText()));
                    
                } catch (NumberFormatException number) {
                    
                    errorLabel.setText("A quantidade deve estar entre 1 e 10");
                    
                }
                
                if(num_min <= num_max){
                    
                    if((num_max - num_min) >= qtd_numeros - 1){
                        
                        for(int cont = num_min; cont <= num_max; cont++){
                            todos_numeros.add(cont);
                        }
                        
                        Collections.shuffle(todos_numeros);
                        
                        qtd_numeros = (Integer.parseInt(totalNumberCount.getText()));
                        
                        for(int cont = 0; cont < qtd_numeros; cont++){
                            
                            numeros_sorteados.add(todos_numeros.get(cont));
                            
                        }
                        
                        for(int cont_2 = 0 + qtd_numeros; cont_2 < 10; cont_2++ ){
                            
                            numeros_sorteados.add(0);
                            
                        }
                        
                        if(qtd_numeros <= 10 && qtd_numeros >= 1){
                            
                            sort_number_1.setText(Integer.toString(numeros_sorteados.get(0)));
                            sort_number_2.setText(Integer.toString(numeros_sorteados.get(1)));
                            sort_number_3.setText(Integer.toString(numeros_sorteados.get(2)));
                            sort_number_4.setText(Integer.toString(numeros_sorteados.get(3)));
                            sort_number_5.setText(Integer.toString(numeros_sorteados.get(4)));
                            sort_number_6.setText(Integer.toString(numeros_sorteados.get(5)));
                            sort_number_7.setText(Integer.toString(numeros_sorteados.get(6)));
                            sort_number_8.setText(Integer.toString(numeros_sorteados.get(7)));
                            sort_number_9.setText(Integer.toString(numeros_sorteados.get(8)));
                            sort_number_10.setText(Integer.toString(numeros_sorteados.get(9)));
                            
                        } else {
                            errorLabel.setText("O numero maximo de numeros sorteado é 10");
                        }
                        
                    } else {
                        errorLabel.setText("A quantidade sorteada deve ser menor que a diferença do maior e do menor numero");
                    }
              
                } else {
                    
                    errorLabel.setText("Os inteiros devem ser inseridos em forma crescente!");
                    
                }
                
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        totalNumberCount = new javax.swing.JTextField();
        text2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        minimalNumber = new javax.swing.JTextField();
        text4 = new javax.swing.JLabel();
        maximumNumber = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        text5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        sort_number_1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sort_number_2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sort_number_3 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sort_number_4 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sort_number_5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        sort_number_6 = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sort_number_7 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sort_number_8 = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sort_number_9 = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sort_number_10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cleanButton = new javax.swing.JButton();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        raffleButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 25), new java.awt.Dimension(15, 25), new java.awt.Dimension(15, 25));
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sortear Tarefa");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(new java.awt.Point(600, 300));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new java.awt.GridLayout(7, 0));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        text1.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        text1.setForeground(new java.awt.Color(0, 133, 178));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("Sortear");
        jPanel1.add(text1, new java.awt.GridBagConstraints());

        totalNumberCount.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        totalNumberCount.setForeground(new java.awt.Color(0, 133, 178));
        totalNumberCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalNumberCount.setText("1");
        totalNumberCount.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        totalNumberCount.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        totalNumberCount.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        totalNumberCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalNumberCountActionPerformed(evt);
            }
        });
        jPanel1.add(totalNumberCount, new java.awt.GridBagConstraints());

        text2.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        text2.setForeground(new java.awt.Color(0, 133, 178));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("número(s)");
        jPanel1.add(text2, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        text3.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        text3.setForeground(new java.awt.Color(0, 133, 178));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("entre");
        jPanel2.add(text3, new java.awt.GridBagConstraints());

        minimalNumber.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        minimalNumber.setForeground(new java.awt.Color(0, 133, 178));
        minimalNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minimalNumber.setText("0");
        minimalNumber.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        minimalNumber.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        minimalNumber.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        jPanel2.add(minimalNumber, new java.awt.GridBagConstraints());

        text4.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        text4.setForeground(new java.awt.Color(0, 133, 178));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("e");
        jPanel2.add(text4, new java.awt.GridBagConstraints());

        maximumNumber.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        maximumNumber.setForeground(new java.awt.Color(0, 133, 178));
        maximumNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maximumNumber.setText("0");
        maximumNumber.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        maximumNumber.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        maximumNumber.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        maximumNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximumNumberActionPerformed(evt);
            }
        });
        jPanel2.add(maximumNumber, new java.awt.GridBagConstraints());

        errorLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(errorLabel, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel2);

        text5.setFont(new java.awt.Font("Arial", 0, screenHeight/15));
        text5.setForeground(new java.awt.Color(0, 133, 178));
        text5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text5.setText("Números Sorteados");
        getContentPane().add(text5);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        sort_number_1.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_1.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_1.setText("???");
        jPanel6.add(sort_number_1, new java.awt.GridBagConstraints());
        jPanel6.add(filler1, new java.awt.GridBagConstraints());

        sort_number_2.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_2.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_2.setText("???");
        jPanel6.add(sort_number_2, new java.awt.GridBagConstraints());
        jPanel6.add(filler2, new java.awt.GridBagConstraints());

        sort_number_3.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_3.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_3.setText("???");
        jPanel6.add(sort_number_3, new java.awt.GridBagConstraints());
        jPanel6.add(filler3, new java.awt.GridBagConstraints());

        sort_number_4.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_4.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_4.setText("???");
        jPanel6.add(sort_number_4, new java.awt.GridBagConstraints());
        jPanel6.add(filler4, new java.awt.GridBagConstraints());

        sort_number_5.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_5.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_5.setText("???");
        jPanel6.add(sort_number_5, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel6);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        sort_number_6.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_6.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_6.setText("???");
        jPanel5.add(sort_number_6, new java.awt.GridBagConstraints());
        jPanel5.add(filler5, new java.awt.GridBagConstraints());

        sort_number_7.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_7.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_7.setText("???");
        jPanel5.add(sort_number_7, new java.awt.GridBagConstraints());
        jPanel5.add(filler6, new java.awt.GridBagConstraints());

        sort_number_8.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_8.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_8.setText("???");
        jPanel5.add(sort_number_8, new java.awt.GridBagConstraints());
        jPanel5.add(filler7, new java.awt.GridBagConstraints());

        sort_number_9.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_9.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_9.setText("???");
        jPanel5.add(sort_number_9, new java.awt.GridBagConstraints());
        jPanel5.add(filler8, new java.awt.GridBagConstraints());

        sort_number_10.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_10.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_10.setText("???");
        jPanel5.add(sort_number_10, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel5);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        cleanButton.setBackground(new java.awt.Color(242, 242, 242));
        cleanButton.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        cleanButton.setText("Limpar");
        cleanButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cleanButton.setBorderPainted(false);
        cleanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanButton.setDisabledIcon(null);
        cleanButton.setEnabled(false);
        cleanButton.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        cleanButton.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        cleanButton.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });
        jPanel4.add(cleanButton, new java.awt.GridBagConstraints());
        jPanel4.add(filler10, new java.awt.GridBagConstraints());

        raffleButton.setBackground(new java.awt.Color(242, 242, 242));
        raffleButton.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        raffleButton.setText("Sortear");
        raffleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raffleButton.setBorderPainted(false);
        raffleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        raffleButton.setDisabledIcon(null);
        raffleButton.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        raffleButton.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        raffleButton.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        raffleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raffleButtonActionPerformed(evt);
            }
        });
        jPanel4.add(raffleButton, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel4);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(filler9);

        backButton.setBackground(new java.awt.Color(242, 242, 242));
        backButton.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        backButton.setText("Voltar");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.setBorderPainted(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        backButton.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        backButton.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel3.add(backButton);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raffleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raffleButtonActionPerformed
                
        timer_flag = 0;
        t.start();
        cleanButton.setEnabled(true);
        raffleButton.setEnabled(false);
        
    }//GEN-LAST:event_raffleButtonActionPerformed

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed

        sort_number_1.setText("???");
        sort_number_2.setText("???");
        sort_number_3.setText("???");
        sort_number_4.setText("???");
        sort_number_5.setText("???");
        sort_number_6.setText("???");
        sort_number_7.setText("???");
        sort_number_8.setText("???");
        sort_number_9.setText("???");
        sort_number_10.setText("???");
        sort_number_1.setText("???");

        numeros_sorteados.clear();
        todos_numeros.clear();
            
        errorLabel.setText("");
        raffleButton.setEnabled(true);
        cleanButton.setEnabled(false);
        
    }//GEN-LAST:event_cleanButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void maximumNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximumNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maximumNumberActionPerformed

    private void totalNumberCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalNumberCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalNumberCountActionPerformed

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
            java.util.logging.Logger.getLogger(RaffleMultNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RaffleMultNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RaffleMultNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RaffleMultNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RaffleMultNumbers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cleanButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField maximumNumber;
    private javax.swing.JTextField minimalNumber;
    private javax.swing.JButton raffleButton;
    private javax.swing.JLabel sort_number_1;
    private javax.swing.JLabel sort_number_10;
    private javax.swing.JLabel sort_number_2;
    private javax.swing.JLabel sort_number_3;
    private javax.swing.JLabel sort_number_4;
    private javax.swing.JLabel sort_number_5;
    private javax.swing.JLabel sort_number_6;
    private javax.swing.JLabel sort_number_7;
    private javax.swing.JLabel sort_number_8;
    private javax.swing.JLabel sort_number_9;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JTextField totalNumberCount;
    // End of variables declaration//GEN-END:variables
}
