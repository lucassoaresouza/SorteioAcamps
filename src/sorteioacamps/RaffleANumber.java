/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteioacamps;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.Collections;
import static sorteioacamps.Utils.ParseRaffledNumberToString;

/**
 *
 * @author Lucas
 */
public class RaffleANumber extends javax.swing.JFrame {

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int)screenSize.getWidth();
    int screenHeight = (int)screenSize.getHeight();
    Timer t;
    int winksCount = 0;
    int maxWinks = 5;
    int maxTime = 100;
    private NumberRecordManager recordManager = new NumberRecordManager();
    private ArrayList<NumberRecord> records;

    public int WinkAJLabel(javax.swing.JLabel jlabel, int maxWinks, int winksCount){
        if (jlabel.isVisible() == true) {
            jlabel.setVisible(false);
        }else{
            jlabel.setVisible(true);
        }
        winksCount++;
        return winksCount;
    }

    private int[] ValidateReceivedNumbersRange(javax.swing.JTextField jTextFieldNumMax, javax.swing.JTextField jTextFieldNumMin, javax.swing.JLabel jLabelValidationError){
        int numMax = 0;
        int numMin = 0;
        try{
            numMax = Integer.parseInt(jTextFieldNumMax.getText());
            numMin = Integer.parseInt(jTextFieldNumMin.getText());
        } catch(NumberFormatException ex) {
            jLabelValidationError.setText("Os campos devem conter somente números inteiros!");
            return null;
        }
        if(numMin < 0 || numMax < 0){
            jLabelValidationError.setText("Os inteiros devem ser positivos!");
            return null;
        }
        if(numMin > 999 || numMax > 999){
            errorLabel.setText("O número máximo para sorteio é 999!");
            return null;
        }
        if(numMin > numMax){
            jLabelValidationError.setText("Os inteiros devem ser inseridos em forma crescente!");
            return null;
        }
        int[] values = {numMin, numMax};
        return values;
    }

    private void applyTextFonts(int screenWidth, int screenHeight){
        int averageScreenSize = (int)(screenWidth + screenHeight) / 2;
        String shadowKGHappy = "fonts/KGHAPPY.ttf";
        String solidKGHappy = "fonts/KGHAPPYSolid.ttf";
        text1.setFont(CustomFont.loadFont(shadowKGHappy, Font.PLAIN, averageScreenSize/20));
        backButton.setFont(CustomFont.loadFont(solidKGHappy, Font.PLAIN, averageScreenSize/47));
        cleanButton.setFont(CustomFont.loadFont(solidKGHappy, Font.PLAIN, averageScreenSize/47));
        raffleButton.setFont(CustomFont.loadFont(solidKGHappy, Font.PLAIN, averageScreenSize/47));
        text1.setFont(CustomFont.loadFont(shadowKGHappy, Font.PLAIN, averageScreenSize/37));
        text2.setFont(CustomFont.loadFont(shadowKGHappy, Font.PLAIN, averageScreenSize/37));
        text5.setFont(CustomFont.loadFont(shadowKGHappy, Font.PLAIN, averageScreenSize/37));
        text4.setFont(CustomFont.loadFont(shadowKGHappy, Font.PLAIN, averageScreenSize/14));
        text3.setFont(CustomFont.loadFont(shadowKGHappy, Font.PLAIN, averageScreenSize/22));
        minimalNumber.setFont(CustomFont.loadFont(solidKGHappy, Font.PLAIN, averageScreenSize/37));
        maximumNumber.setFont(CustomFont.loadFont(solidKGHappy, Font.PLAIN, averageScreenSize/37));
        raffledTo.setFont(CustomFont.loadFont(solidKGHappy, Font.PLAIN, averageScreenSize/37));
        errorLabel.setFont(CustomFont.loadFont(solidKGHappy, Font.PLAIN, averageScreenSize/54));
    }
    
    public RaffleANumber() {
        records = recordManager.readRecords();
        initComponents();
        applyTextFonts(screenWidth, screenHeight);
        Color customColor = new Color(255, 255, 255);
        getContentPane().setBackground(customColor);
        addComponentListener(new ComponentAdapter(){
                @Override
                public void componentResized(ComponentEvent e){
                    int newScreenWidth = getWidth();
                    int newScreenHeight = getHeight();
                    applyTextFonts(newScreenWidth, newScreenHeight);
                }
            }
        );
        text4.setText("???");
        t = new javax.swing.Timer(maxTime, (ActionEvent e) -> {
            String selectedOption = recordManager.translateOption((String) raffledTo.getSelectedItem());
            int[] values = ValidateReceivedNumbersRange(maximumNumber, minimalNumber, errorLabel);
            if(values != null){
                if(winksCount < maxWinks){
                    winksCount = WinkAJLabel(text4, maxWinks, winksCount);
                } else {
                    t.stop();
                    text4.setVisible(true);
                    winksCount = maxWinks;
                    ArrayList<Integer> numbersToRaffleByOption = recordManager.returnAllNumbersCanRaffleByOption(
                            selectedOption,
                            records,
                            values[0],
                            values[1]
                    );
                    if (numbersToRaffleByOption.size() < 1){
                        text4.setText("Sem opções!");
                    } else {
                        Collections.shuffle(numbersToRaffleByOption);
                        int raffledNumber = numbersToRaffleByOption.get(0);
                        String parsedRaffledNumber = ParseRaffledNumberToString(raffledNumber);
                        text4.setText(parsedRaffledNumber);
                        records = recordManager.updateRecords(records, raffledNumber, selectedOption);
                        recordManager.writeRecordsToFile(records);
                    }
                }
            } else {
                t.stop();
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
        errorLabel = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        minimalNumber = new javax.swing.JTextField();
        text2 = new javax.swing.JLabel();
        maximumNumber = new javax.swing.JTextField();
        text5 = new javax.swing.JLabel();
        raffledTo = new javax.swing.JComboBox<>();
        text3 = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cleanButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        raffleButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 25), new java.awt.Dimension(15, 25), new java.awt.Dimension(15, 25));
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sortear um Número");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(new java.awt.Point(600, 300));
        getContentPane().setLayout(new java.awt.GridLayout(5, 0, 0, 15));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        errorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(errorLabel, gridBagConstraints);

        text1.setFont(new java.awt.Font("Arial Black", 0, screenHeight/30));
        text1.setForeground(new java.awt.Color(0, 133, 178));
        text1.setText("Sortear número entre");
        jPanel1.add(text1, new java.awt.GridBagConstraints());

        minimalNumber.setFont(new java.awt.Font("Arial Black", 0, screenHeight/30));
        minimalNumber.setForeground(new java.awt.Color(0, 133, 178));
        minimalNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minimalNumber.setText("000");
        minimalNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimalNumberActionPerformed(evt);
            }
        });
        jPanel1.add(minimalNumber, new java.awt.GridBagConstraints());

        text2.setFont(new java.awt.Font("Arial Black", 0, screenHeight/30));
        text2.setForeground(new java.awt.Color(0, 133, 178));
        text2.setText("e");
        jPanel1.add(text2, new java.awt.GridBagConstraints());

        maximumNumber.setFont(new java.awt.Font("Arial Black", 0, screenHeight/30));
        maximumNumber.setForeground(new java.awt.Color(0, 133, 178));
        maximumNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maximumNumber.setText("000");
        maximumNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maximumNumberActionPerformed(evt);
            }
        });
        jPanel1.add(maximumNumber, new java.awt.GridBagConstraints());

        text5.setFont(new java.awt.Font("Arial Black", 0, screenHeight/30));
        text5.setForeground(new java.awt.Color(0, 133, 178));
        text5.setText("p/ receber");
        jPanel1.add(text5, new java.awt.GridBagConstraints());

        raffledTo.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/30));
        raffledTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Tarefa", "Brinde", "Outro" }));
        raffledTo.setOpaque(true);
        raffledTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raffledToActionPerformed(evt);
            }
        });
        jPanel1.add(raffledTo, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1);

        text3.setFont(new java.awt.Font("Arial Black", 0, screenHeight/15));
        text3.setForeground(new java.awt.Color(0, 133, 178));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("Número Sorteado:");
        text3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(text3);

        text4.setFont(new java.awt.Font("Showcard Gothic", 1, screenHeight/7));
        text4.setForeground(new java.awt.Color(0, 133, 178));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("???");
        getContentPane().add(text4);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        cleanButton.setBackground(new java.awt.Color(202, 202, 202));
        cleanButton.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/40));
        cleanButton.setText("Limpar");
        cleanButton.setToolTipText("");
        cleanButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cleanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanButton.setEnabled(false);
        cleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanButtonActionPerformed(evt);
            }
        });
        jPanel3.add(cleanButton, new java.awt.GridBagConstraints());
        jPanel3.add(filler1, new java.awt.GridBagConstraints());

        raffleButton.setBackground(new java.awt.Color(202, 202, 202));
        raffleButton.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/40));
        raffleButton.setText("Sortear");
        raffleButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raffleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        raffleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raffleButtonActionPerformed(evt);
            }
        });
        jPanel3.add(raffleButton, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel3);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        jPanel2.add(filler2);

        backButton.setBackground(new java.awt.Color(202, 202, 202));
        backButton.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/40));
        backButton.setText("Voltar");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimalNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimalNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimalNumberActionPerformed

    private void maximumNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximumNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maximumNumberActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed
        text4.setText("???");
        errorLabel.setText("");
        raffleButton.setEnabled(true);
        cleanButton.setEnabled(false);
    }//GEN-LAST:event_cleanButtonActionPerformed

    private void raffleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raffleButtonActionPerformed
        winksCount = 0;
        t.setInitialDelay(0);
        t.start();
        cleanButton.setEnabled(true);
        raffleButton.setEnabled(false);
    }//GEN-LAST:event_raffleButtonActionPerformed

    private void raffledToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raffledToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raffledToActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cleanButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField maximumNumber;
    private javax.swing.JTextField minimalNumber;
    private javax.swing.JButton raffleButton;
    private javax.swing.JComboBox<String> raffledTo;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    // End of variables declaration//GEN-END:variables
}
