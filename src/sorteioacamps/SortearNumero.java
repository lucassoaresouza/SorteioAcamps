/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteioacamps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

/**
 *
 * @author Lucas
 */
public class SortearNumero extends javax.swing.JFrame {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int)screenSize.getWidth();
    int screenHeight = (int)screenSize.getHeight();
    FazSorteio sortear = new FazSorteio();
    Timer t;
    int timer_flag = 5;
    
    public SortearNumero() {
        initComponents();
            t = new javax.swing.Timer(100, (ActionEvent e) -> {
                if(timer_flag < 5){
                    numero_sorteado.setText("???");
                    if (numero_sorteado.isVisible() == true) {
                        timer_flag++;
                        numero_sorteado.setVisible(false);
                    }else{
                        numero_sorteado.setVisible(true);
                    }
                } else {
                    numero_sorteado.setVisible(true);      
                    t.stop();
                    int num_max = 0;
                    int num_min = 0;
                    timer_flag = 5;
                    
                    try{
                        
                        num_max = Integer.parseInt(numero_maximo.getText());
                        num_min = Integer.parseInt(numero_minimo.getText());
                        
                    } catch(NumberFormatException ex) {
                        
                        erro_inteiro.setText("Os campos devem conter somente números inteiros!");
                    
                    }
                    
                    if(num_min <= num_max){
                        int num_sorteado = sortear.sorteio_numero(num_min, num_max);
                        
                        if(num_sorteado < 10){
                            
                            numero_sorteado.setText("00" + Integer.toString(num_sorteado));
                            
                        } else if(num_sorteado >= 10 && num_sorteado <= 99){
                            
                            numero_sorteado.setText("0"+ Integer.toString(num_sorteado));
                            
                        } else {
                            
                            numero_sorteado.setText(Integer.toString(num_sorteado));
                            
                        }
                        
                    } else {
                        
                        erro_inteiro.setText("Os inteiros devem ser inseridos em forma crescente!");
                        
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        sortear_entre = new javax.swing.JLabel();
        numero_minimo = new javax.swing.JTextField();
        entre_e_x = new javax.swing.JLabel();
        numero_maximo = new javax.swing.JTextField();
        erro_inteiro = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        numero_sorteado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        limpar_sorteio = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        fazer_sorteio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 25), new java.awt.Dimension(15, 25), new java.awt.Dimension(15, 25));
        voltar_inicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sortear um Número");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(new java.awt.Point(600, 300));
        getContentPane().setLayout(new java.awt.GridLayout(5, 0, 0, 15));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        sortear_entre.setFont(new java.awt.Font("Arial Black", 0, screenHeight/15));
        sortear_entre.setForeground(new java.awt.Color(0, 133, 178));
        sortear_entre.setText("Sortear entre");
        jPanel1.add(sortear_entre, new java.awt.GridBagConstraints());

        numero_minimo.setFont(new java.awt.Font("Arial Black", 0, screenHeight/15));
        numero_minimo.setForeground(new java.awt.Color(0, 133, 178));
        numero_minimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_minimo.setText("0");
        numero_minimo.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/15));
        numero_minimo.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/15));
        numero_minimo.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/15));
        numero_minimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_minimoActionPerformed(evt);
            }
        });
        jPanel1.add(numero_minimo, new java.awt.GridBagConstraints());

        entre_e_x.setFont(new java.awt.Font("Arial Black", 0, screenHeight/15));
        entre_e_x.setForeground(new java.awt.Color(0, 133, 178));
        entre_e_x.setText("e");
        jPanel1.add(entre_e_x, new java.awt.GridBagConstraints());

        numero_maximo.setFont(new java.awt.Font("Arial Black", 0, screenHeight/15));
        numero_maximo.setForeground(new java.awt.Color(0, 133, 178));
        numero_maximo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero_maximo.setText("0");
        numero_maximo.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/15));
        numero_maximo.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/15));
        numero_maximo.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/15));
        numero_maximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero_maximoActionPerformed(evt);
            }
        });
        jPanel1.add(numero_maximo, new java.awt.GridBagConstraints());

        erro_inteiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        erro_inteiro.setForeground(new java.awt.Color(255, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(erro_inteiro, gridBagConstraints);

        getContentPane().add(jPanel1);

        Numero.setFont(new java.awt.Font("Arial Black", 0, screenHeight/15));
        Numero.setForeground(new java.awt.Color(0, 133, 178));
        Numero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Numero.setText("Número Sorteado:");
        Numero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Numero);

        numero_sorteado.setFont(new java.awt.Font("Showcard Gothic", 1, screenHeight/7));
        numero_sorteado.setForeground(new java.awt.Color(0, 133, 178));
        numero_sorteado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numero_sorteado.setText("???");
        getContentPane().add(numero_sorteado);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        limpar_sorteio.setBackground(new java.awt.Color(242, 242, 242));
        limpar_sorteio.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/40));
        limpar_sorteio.setText("Limpar");
        limpar_sorteio.setToolTipText("");
        limpar_sorteio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpar_sorteio.setBorderPainted(false);
        limpar_sorteio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpar_sorteio.setDisabledIcon(null);
        limpar_sorteio.setEnabled(false);
        limpar_sorteio.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        limpar_sorteio.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        limpar_sorteio.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        limpar_sorteio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_sorteioActionPerformed(evt);
            }
        });
        jPanel3.add(limpar_sorteio, new java.awt.GridBagConstraints());
        jPanel3.add(filler1, new java.awt.GridBagConstraints());

        fazer_sorteio.setBackground(new java.awt.Color(242, 242, 242));
        fazer_sorteio.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/40));
        fazer_sorteio.setText("Sortear");
        fazer_sorteio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fazer_sorteio.setBorderPainted(false);
        fazer_sorteio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fazer_sorteio.setDisabledIcon(null);
        fazer_sorteio.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        fazer_sorteio.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        fazer_sorteio.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        fazer_sorteio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazer_sorteioActionPerformed(evt);
            }
        });
        jPanel3.add(fazer_sorteio, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel3);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        jPanel2.add(filler2);

        voltar_inicio.setBackground(new java.awt.Color(242, 242, 242));
        voltar_inicio.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/40));
        voltar_inicio.setText("Voltar");
        voltar_inicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        voltar_inicio.setBorderPainted(false);
        voltar_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar_inicio.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        voltar_inicio.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        voltar_inicio.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        voltar_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_inicioActionPerformed(evt);
            }
        });
        jPanel2.add(voltar_inicio);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero_minimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_minimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_minimoActionPerformed

    private void numero_maximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero_maximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero_maximoActionPerformed

    private void voltar_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_inicioActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_voltar_inicioActionPerformed

    private void limpar_sorteioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_sorteioActionPerformed

        numero_sorteado.setText("???");
        erro_inteiro.setText("");
        fazer_sorteio.setEnabled(true);
        limpar_sorteio.setEnabled(false);
    }//GEN-LAST:event_limpar_sorteioActionPerformed

    private void fazer_sorteioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazer_sorteioActionPerformed
        timer_flag = 0;
        t.start();
        limpar_sorteio.setEnabled(true);
        fazer_sorteio.setEnabled(false);

    }//GEN-LAST:event_fazer_sorteioActionPerformed

    
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
            java.util.logging.Logger.getLogger(SortearNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortearNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortearNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortearNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortearNumero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel entre_e_x;
    private javax.swing.JLabel erro_inteiro;
    private javax.swing.JButton fazer_sorteio;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton limpar_sorteio;
    private javax.swing.JTextField numero_maximo;
    private javax.swing.JTextField numero_minimo;
    private javax.swing.JLabel numero_sorteado;
    private javax.swing.JLabel sortear_entre;
    private javax.swing.JButton voltar_inicio;
    // End of variables declaration//GEN-END:variables
}
