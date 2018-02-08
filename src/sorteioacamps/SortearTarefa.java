/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteioacamps;

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

        sortear_label = new javax.swing.JLabel();
        qtd_numeros_text = new javax.swing.JTextField();
        numeros_label = new javax.swing.JLabel();
        sort_number_10 = new javax.swing.JLabel();
        sort_number_9 = new javax.swing.JLabel();
        sort_number_8 = new javax.swing.JLabel();
        sort_number_7 = new javax.swing.JLabel();
        sort_number_6 = new javax.swing.JLabel();
        sort_number_5 = new javax.swing.JLabel();
        sort_number_4 = new javax.swing.JLabel();
        sort_number_3 = new javax.swing.JLabel();
        sort_number_2 = new javax.swing.JLabel();
        sort_number_1 = new javax.swing.JLabel();
        grade_sorteio = new javax.swing.JLabel();
        numeros_sorteados_label = new javax.swing.JLabel();
        sortear_numbs_button = new javax.swing.JButton();
        erro_variavel = new javax.swing.JLabel();
        limpar_sorteio_t = new javax.swing.JButton();
        voltar_button = new javax.swing.JButton();
        x_e_y = new javax.swing.JLabel();
        num_min_text = new javax.swing.JTextField();
        Entre_label2 = new javax.swing.JLabel();
        num_max_text = new javax.swing.JTextField();
        sortear_tarefa_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sortear Tarefa");
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sortear_label.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        sortear_label.setForeground(new java.awt.Color(0, 133, 178));
        sortear_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sortear_label.setText("Sortear");
        getContentPane().add(sortear_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, -1));

        qtd_numeros_text.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        qtd_numeros_text.setForeground(new java.awt.Color(0, 133, 178));
        qtd_numeros_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qtd_numeros_text.setText("1");
        getContentPane().add(qtd_numeros_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 50, 40));

        numeros_label.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        numeros_label.setForeground(new java.awt.Color(0, 133, 178));
        numeros_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeros_label.setText("NUMEROS SORTEADOS:");
        getContentPane().add(numeros_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 460, -1));

        sort_number_10.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_10.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_10.setText("???");
        getContentPane().add(sort_number_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        sort_number_9.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_9.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_9.setText("???");
        getContentPane().add(sort_number_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        sort_number_8.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_8.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_8.setText("???");
        getContentPane().add(sort_number_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));

        sort_number_7.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_7.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_7.setText("???");
        getContentPane().add(sort_number_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        sort_number_6.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_6.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_6.setText("???");
        getContentPane().add(sort_number_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        sort_number_5.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_5.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_5.setText("???");
        getContentPane().add(sort_number_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        sort_number_4.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_4.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_4.setText("???");
        getContentPane().add(sort_number_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        sort_number_3.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_3.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_3.setText("???");
        getContentPane().add(sort_number_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        sort_number_2.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_2.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_2.setText("???");
        getContentPane().add(sort_number_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        sort_number_1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        sort_number_1.setForeground(new java.awt.Color(0, 133, 178));
        sort_number_1.setText("???");
        getContentPane().add(sort_number_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        grade_sorteio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/grade.jpg"))); // NOI18N
        getContentPane().add(grade_sorteio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 520, 200));

        numeros_sorteados_label.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        numeros_sorteados_label.setForeground(new java.awt.Color(0, 133, 178));
        numeros_sorteados_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeros_sorteados_label.setText("numeros");
        getContentPane().add(numeros_sorteados_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 110, -1));

        sortear_numbs_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/sortear_v2.jpg"))); // NOI18N
        sortear_numbs_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sortear_numbs_button.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/sortear_v.jpg"))); // NOI18N
        sortear_numbs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortear_numbs_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(sortear_numbs_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 100, 30));

        erro_variavel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        erro_variavel.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(erro_variavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 610, 20));

        limpar_sorteio_t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/limpar_v.jpg"))); // NOI18N
        limpar_sorteio_t.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpar_sorteio_t.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/limpar_v2.jpg"))); // NOI18N
        limpar_sorteio_t.setEnabled(false);
        limpar_sorteio_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_sorteio_tActionPerformed(evt);
            }
        });
        getContentPane().add(limpar_sorteio_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 100, 30));

        voltar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/voltar_v.jpg"))); // NOI18N
        voltar_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(voltar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 90, 20));

        x_e_y.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        x_e_y.setForeground(new java.awt.Color(0, 133, 178));
        x_e_y.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x_e_y.setText("e");
        getContentPane().add(x_e_y, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 30, -1));

        num_min_text.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        num_min_text.setForeground(new java.awt.Color(0, 133, 178));
        num_min_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num_min_text.setText("0");
        getContentPane().add(num_min_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 50, 40));

        Entre_label2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Entre_label2.setForeground(new java.awt.Color(0, 133, 178));
        Entre_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entre_label2.setText("entre");
        getContentPane().add(Entre_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 100, -1));

        num_max_text.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        num_max_text.setForeground(new java.awt.Color(0, 133, 178));
        num_max_text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num_max_text.setText("0");
        getContentPane().add(num_max_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 50, 40));

        sortear_tarefa_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sorteioacamps/imagens/1.jpg"))); // NOI18N
        getContentPane().add(sortear_tarefa_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    private javax.swing.JLabel grade_sorteio;
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
    private javax.swing.JLabel sortear_tarefa_background;
    private javax.swing.JButton voltar_button;
    private javax.swing.JLabel x_e_y;
    // End of variables declaration//GEN-END:variables
}
