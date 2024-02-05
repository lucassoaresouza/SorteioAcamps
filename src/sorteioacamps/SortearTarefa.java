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
public class SortearTarefa extends javax.swing.JFrame {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int)screenSize.getWidth();
    int screenHeight = (int)screenSize.getHeight();
    FazSorteio sortear = new FazSorteio();
    Timer t;
    int timer_flag = 11;
    ArrayList<Integer> numeros_sorteados = new ArrayList<>();
    ArrayList<Integer> todos_numeros = new ArrayList<>();
    int qtd_numeros = 0;
    
    public SortearTarefa() {
        initComponents();
        
            t = new javax.swing.Timer(300, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
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
                        
                        num_max = Integer.parseInt(num_max_text.getText());
                        num_min = Integer.parseInt(num_min_text.getText());
                        
                    } catch(NumberFormatException ex) {
                        
                        erro_variavel.setText("Os campos devem conter somente números inteiros!");
                    
                    }
    
                    
                    try{
                    
                        qtd_numeros = (Integer.parseInt(qtd_numeros_text.getText()));
                    
                    } catch (NumberFormatException number) {

                                erro_variavel.setText("A quantidade deve estar entre 1 e 10");
                                
                    }
                    
                    if(num_min <= num_max){
                        
                        if((num_max - num_min) >= qtd_numeros - 1){
                        
                            for(int cont = num_min; cont <= num_max; cont++){
                                todos_numeros.add(cont);
                            }

                            Collections.shuffle(todos_numeros);

                            qtd_numeros = (Integer.parseInt(qtd_numeros_text.getText()));

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
                                erro_variavel.setText("O numero maximo de numeros sorteado é 10");
                            }
                        
                        } else {
                            erro_variavel.setText("A quantidade sorteada deve ser menor que a diferença do maior e do menor numero");
                        }

                    } else {
                        
                        erro_variavel.setText("Os inteiros devem ser inseridos em forma crescente!");
                        
                    }
              
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
        sortear_label = new javax.swing.JLabel();
        qtd_numeros_text = new javax.swing.JTextField();
        numeros_sorteados_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Entre_label2 = new javax.swing.JLabel();
        num_min_text = new javax.swing.JTextField();
        x_e_y = new javax.swing.JLabel();
        num_max_text = new javax.swing.JTextField();
        erro_variavel = new javax.swing.JLabel();
        numeros_label = new javax.swing.JLabel();
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
        limpar_sorteio_t = new javax.swing.JButton();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        sortear_numbs_button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 25), new java.awt.Dimension(15, 25), new java.awt.Dimension(15, 25));
        voltar_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sortear Tarefa");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(new java.awt.Point(600, 300));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new java.awt.GridLayout(7, 0));

        sortear_label.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        sortear_label.setForeground(new java.awt.Color(0, 133, 178));
        sortear_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sortear_label.setText("Sortear");
        jPanel1.add(sortear_label);

        qtd_numeros_text.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        qtd_numeros_text.setForeground(new java.awt.Color(0, 133, 178));
        qtd_numeros_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qtd_numeros_text.setText("1");
        qtd_numeros_text.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        qtd_numeros_text.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        qtd_numeros_text.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        jPanel1.add(qtd_numeros_text);

        numeros_sorteados_label.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        numeros_sorteados_label.setForeground(new java.awt.Color(0, 133, 178));
        numeros_sorteados_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeros_sorteados_label.setText("número(s)");
        jPanel1.add(numeros_sorteados_label);

        getContentPane().add(jPanel1);

        Entre_label2.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        Entre_label2.setForeground(new java.awt.Color(0, 133, 178));
        Entre_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entre_label2.setText("entre");
        jPanel2.add(Entre_label2);

        num_min_text.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        num_min_text.setForeground(new java.awt.Color(0, 133, 178));
        num_min_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num_min_text.setText("0");
        num_min_text.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        num_min_text.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        num_min_text.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        jPanel2.add(num_min_text);

        x_e_y.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        x_e_y.setForeground(new java.awt.Color(0, 133, 178));
        x_e_y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x_e_y.setText("e");
        jPanel2.add(x_e_y);

        num_max_text.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        num_max_text.setForeground(new java.awt.Color(0, 133, 178));
        num_max_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num_max_text.setText("0");
        num_max_text.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        num_max_text.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        num_max_text.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/25));
        num_max_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_max_textActionPerformed(evt);
            }
        });
        jPanel2.add(num_max_text);

        erro_variavel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        erro_variavel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(erro_variavel);

        getContentPane().add(jPanel2);

        numeros_label.setFont(new java.awt.Font("Arial", 0, screenHeight/15));
        numeros_label.setForeground(new java.awt.Color(0, 133, 178));
        numeros_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeros_label.setText("Números Sorteados");
        getContentPane().add(numeros_label);

        sort_number_1.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_1.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_1.setText("???");
        jPanel6.add(sort_number_1);
        jPanel6.add(filler1);

        sort_number_2.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_2.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_2.setText("???");
        jPanel6.add(sort_number_2);
        jPanel6.add(filler2);

        sort_number_3.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_3.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_3.setText("???");
        jPanel6.add(sort_number_3);
        jPanel6.add(filler3);

        sort_number_4.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_4.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_4.setText("???");
        jPanel6.add(sort_number_4);
        jPanel6.add(filler4);

        sort_number_5.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_5.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_5.setText("???");
        jPanel6.add(sort_number_5);

        getContentPane().add(jPanel6);

        sort_number_6.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_6.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_6.setText("???");
        jPanel5.add(sort_number_6);
        jPanel5.add(filler5);

        sort_number_7.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_7.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_7.setText("???");
        jPanel5.add(sort_number_7);
        jPanel5.add(filler6);

        sort_number_8.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_8.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_8.setText("???");
        jPanel5.add(sort_number_8);
        jPanel5.add(filler7);

        sort_number_9.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_9.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_9.setText("???");
        jPanel5.add(sort_number_9);
        jPanel5.add(filler8);

        sort_number_10.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sort_number_10.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_10.setText("???");
        jPanel5.add(sort_number_10);

        getContentPane().add(jPanel5);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        limpar_sorteio_t.setBackground(new java.awt.Color(242, 242, 242));
        limpar_sorteio_t.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        limpar_sorteio_t.setText("Limpar");
        limpar_sorteio_t.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpar_sorteio_t.setBorderPainted(false);
        limpar_sorteio_t.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpar_sorteio_t.setDisabledIcon(null);
        limpar_sorteio_t.setEnabled(false);
        limpar_sorteio_t.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        limpar_sorteio_t.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        limpar_sorteio_t.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        limpar_sorteio_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_sorteio_tActionPerformed(evt);
            }
        });
        jPanel4.add(limpar_sorteio_t, new java.awt.GridBagConstraints());
        jPanel4.add(filler10, new java.awt.GridBagConstraints());

        sortear_numbs_button.setBackground(new java.awt.Color(242, 242, 242));
        sortear_numbs_button.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        sortear_numbs_button.setText("Sortear");
        sortear_numbs_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sortear_numbs_button.setBorderPainted(false);
        sortear_numbs_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sortear_numbs_button.setDisabledIcon(null);
        sortear_numbs_button.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        sortear_numbs_button.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        sortear_numbs_button.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        sortear_numbs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortear_numbs_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(sortear_numbs_button, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel4);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(filler9);

        voltar_button.setBackground(new java.awt.Color(242, 242, 242));
        voltar_button.setFont(new java.awt.Font("Liberation Sans", 0, 12)); // NOI18N
        voltar_button.setText("Voltar");
        voltar_button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        voltar_button.setBorderPainted(false);
        voltar_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar_button.setMaximumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        voltar_button.setMinimumSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        voltar_button.setPreferredSize(new java.awt.Dimension(screenWidth/10, screenHeight/40));
        voltar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_buttonActionPerformed(evt);
            }
        });
        jPanel3.add(voltar_button);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortear_numbs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortear_numbs_buttonActionPerformed
                
        timer_flag = 0;
        t.start();
        limpar_sorteio_t.setEnabled(true);
        sortear_numbs_button.setEnabled(false);
        
    }//GEN-LAST:event_sortear_numbs_buttonActionPerformed

    private void limpar_sorteio_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_sorteio_tActionPerformed

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
            
        erro_variavel.setText("");
        sortear_numbs_button.setEnabled(true);
        limpar_sorteio_t.setEnabled(false);
        
    }//GEN-LAST:event_limpar_sorteio_tActionPerformed

    private void voltar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_buttonActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_voltar_buttonActionPerformed

    private void num_max_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_max_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_max_textActionPerformed

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
            java.util.logging.Logger.getLogger(SortearTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortearTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortearTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortearTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortearTarefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entre_label2;
    private javax.swing.JLabel erro_variavel;
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
    private javax.swing.JButton limpar_sorteio_t;
    private javax.swing.JTextField num_max_text;
    private javax.swing.JTextField num_min_text;
    private javax.swing.JLabel numeros_label;
    private javax.swing.JLabel numeros_sorteados_label;
    private javax.swing.JTextField qtd_numeros_text;
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
    private javax.swing.JLabel sortear_label;
    private javax.swing.JButton sortear_numbs_button;
    private javax.swing.JButton voltar_button;
    private javax.swing.JLabel x_e_y;
    // End of variables declaration//GEN-END:variables
}
