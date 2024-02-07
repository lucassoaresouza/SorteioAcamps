/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteioacamps;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Timer;
import static sorteioacamps.Utils.ParseRaffledNumberToString;

/**
 *
 * @author Lucas
 */
public class RaffleMultNumbers extends javax.swing.JFrame {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int)screenSize.getWidth();
    int screenHeight = (int)screenSize.getHeight();
    Timer t;
    ArrayList<Integer> raffledNumbers = new ArrayList<>();
    ArrayList<Integer> allNumbers = new ArrayList<>();
    ArrayList<javax.swing.JLabel> numberLabels = new ArrayList<>();
    int winksCount = 0;
    int numberCountValue = 0;
    int maxWinks = 5;
    int maxTime = 100;
    private NumberRecordManager recordManager = new NumberRecordManager();
    private ArrayList<NumberRecord> records;

    public void SetAllSortNumbersToInitialState(){
        for(javax.swing.JLabel sortNumber : numberLabels) {
           sortNumber.setText("???");
        }
    }

    public void SetAllSortNumbersVisible(boolean isVisible){
        for(javax.swing.JLabel sortNumber : numberLabels) {
           sortNumber.setVisible(isVisible);
        }
    }

    private int[] ValidateReceivedNumbersRange(javax.swing.JTextField maximumNumber, javax.swing.JTextField minimalNumber, javax.swing.JLabel errorLabel){
        int numMin = 0;
        int numMax = 0;
        try{
            numMax = Integer.parseInt(maximumNumber.getText());
            numMin = Integer.parseInt(minimalNumber.getText());
        } catch(NumberFormatException ex) {
            errorLabel.setText("Os campos devem conter somente números inteiros!");
            return null;
        }
        try{
            numberCountValue = (Integer.parseInt(totalNumberCount.getText()));
        } catch (NumberFormatException number) {
            errorLabel.setText("A quantidade deve estar entre 1 e 10");
            return null;
        }
        if (numMin > numMax) {
            errorLabel.setText("Os inteiros devem ser inseridos em forma crescente!");
            return null;
        }
        if((numMax - numMin) < numberCountValue - 1){
            errorLabel.setText("A quantidade sorteada deve ser menor que a diferença do maior e do menor número");
            return null;
        }
        if (numberCountValue > 10){
            errorLabel.setText("O número máximo de números sorteados é 10");
            return null;
        }
        if (numberCountValue < 1){
            errorLabel.setText("O número mínimo de números sorteados é 10");
            return null;
        }
        int[] values = {numMin, numMax};
        return values;
    }

    public RaffleMultNumbers() {
        records = recordManager.readRecords();
        initComponents();
        numberLabels.add(sortNumber1);
        numberLabels.add(sortNumber2);
        numberLabels.add(sortNumber3);
        numberLabels.add(sortNumber4);
        numberLabels.add(sortNumber5);
        numberLabels.add(sortNumber6);
        numberLabels.add(sortNumber7);
        numberLabels.add(sortNumber8);
        numberLabels.add(sortNumber9);
        numberLabels.add(sortNumber10);
        
        t = new javax.swing.Timer(maxTime, (ActionEvent e) -> {
            String selectedOption = recordManager.translateOption((String) raffledTo.getSelectedItem());
            int values[] = ValidateReceivedNumbersRange(maximumNumber, minimalNumber, errorLabel);
            if (values != null){
                if(winksCount < maxWinks){
                    SetAllSortNumbersToInitialState();
                    if (sortNumber1.isVisible() == true) {
                        winksCount++;
                        SetAllSortNumbersVisible(false);
                    }else{
                        SetAllSortNumbersVisible(true);
                    }
                } else {
                    SetAllSortNumbersVisible(true);
                    t.stop();
                    winksCount = maxWinks;
                    ArrayList<Integer> numbersToRaffleByOption = recordManager.returnAllNumbersCanRaffleByOption(
                            selectedOption,
                            records,
                            values[0],
                            values[1]
                    );
                    Collections.shuffle(numbersToRaffleByOption);
                    for(int count = 0; count < numberCountValue; count++){
                        numberLabels.get(count).setText("---");
                    }
                    System.out.println(numbersToRaffleByOption.size());
                    numberCountValue = (Integer.parseInt(totalNumberCount.getText()));
                    if(numbersToRaffleByOption.size() >= 1){
                        if(numbersToRaffleByOption.size() >= numberCountValue){
                            numberCountValue = (Integer.parseInt(totalNumberCount.getText()));
                            for(int cont = 0; cont < numberCountValue; cont++){
                                raffledNumbers.add(numbersToRaffleByOption.get(cont));
                            }
                        } else if (numbersToRaffleByOption.size() < numberCountValue){
                           raffledNumbers = numbersToRaffleByOption;
                        }
                        for(int count = 0; count < raffledNumbers.size(); count++){
                            int raffledNumber = raffledNumbers.get(count);
                            numberLabels.get(count).setText(ParseRaffledNumberToString(raffledNumber));
                            records = recordManager.updateRecords(records, raffledNumber, selectedOption);
                        }
                        recordManager.writeRecordsToFile(records);
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
        text1 = new javax.swing.JLabel();
        totalNumberCount = new javax.swing.JTextField();
        text2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        minimalNumber = new javax.swing.JTextField();
        text4 = new javax.swing.JLabel();
        maximumNumber = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        text6 = new javax.swing.JLabel();
        raffledTo = new javax.swing.JComboBox<>();
        text5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        sortNumber1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sortNumber2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sortNumber3 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sortNumber4 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sortNumber5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        sortNumber6 = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sortNumber7 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sortNumber8 = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sortNumber9 = new javax.swing.JLabel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        sortNumber10 = new javax.swing.JLabel();
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

        text6.setFont(new java.awt.Font("Arial", 0, screenHeight/25));
        text6.setForeground(new java.awt.Color(0, 133, 178));
        text6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text6.setText("p/ receber");
        jPanel2.add(text6, new java.awt.GridBagConstraints());

        raffledTo.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/25));
        raffledTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Tarefa", "Brinde", "Outro" }));
        jPanel2.add(raffledTo, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel2);

        text5.setFont(new java.awt.Font("Arial", 0, screenHeight/15));
        text5.setForeground(new java.awt.Color(0, 133, 178));
        text5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text5.setText("Números Sorteados");
        getContentPane().add(text5);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        sortNumber1.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber1.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber1.setText("???");
        jPanel6.add(sortNumber1, new java.awt.GridBagConstraints());
        jPanel6.add(filler1, new java.awt.GridBagConstraints());

        sortNumber2.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber2.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber2.setText("???");
        jPanel6.add(sortNumber2, new java.awt.GridBagConstraints());
        jPanel6.add(filler2, new java.awt.GridBagConstraints());

        sortNumber3.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber3.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber3.setText("???");
        jPanel6.add(sortNumber3, new java.awt.GridBagConstraints());
        jPanel6.add(filler3, new java.awt.GridBagConstraints());

        sortNumber4.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber4.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber4.setText("???");
        jPanel6.add(sortNumber4, new java.awt.GridBagConstraints());
        jPanel6.add(filler4, new java.awt.GridBagConstraints());

        sortNumber5.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber5.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber5.setText("???");
        jPanel6.add(sortNumber5, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel6);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        sortNumber6.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber6.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber6.setText("???");
        jPanel5.add(sortNumber6, new java.awt.GridBagConstraints());
        jPanel5.add(filler5, new java.awt.GridBagConstraints());

        sortNumber7.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber7.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber7.setText("???");
        jPanel5.add(sortNumber7, new java.awt.GridBagConstraints());
        jPanel5.add(filler6, new java.awt.GridBagConstraints());

        sortNumber8.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber8.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber8.setText("???");
        jPanel5.add(sortNumber8, new java.awt.GridBagConstraints());
        jPanel5.add(filler7, new java.awt.GridBagConstraints());

        sortNumber9.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber9.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber9.setText("???");
        jPanel5.add(sortNumber9, new java.awt.GridBagConstraints());
        jPanel5.add(filler8, new java.awt.GridBagConstraints());

        sortNumber10.setFont(new java.awt.Font("Showcard Gothic", 0, screenHeight/10));
        sortNumber10.setForeground(new java.awt.Color(0, 133, 178));
        sortNumber10.setText("???");
        jPanel5.add(sortNumber10, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel5);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        cleanButton.setBackground(new java.awt.Color(242, 242, 242));
        cleanButton.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/40));
        cleanButton.setText("Limpar");
        cleanButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cleanButton.setBorderPainted(false);
        cleanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        raffleButton.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/40));
        raffleButton.setText("Sortear");
        raffleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        raffleButton.setBorderPainted(false);
        raffleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        backButton.setFont(new java.awt.Font("Liberation Sans", 0, screenHeight/40));
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
                
        winksCount = 0;
        t.start();
        cleanButton.setEnabled(true);
        raffleButton.setEnabled(false);
        
    }//GEN-LAST:event_raffleButtonActionPerformed

    private void cleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanButtonActionPerformed

        SetAllSortNumbersToInitialState();
        raffledNumbers.clear();
        allNumbers.clear();
            
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
    private javax.swing.JComboBox<String> raffledTo;
    private javax.swing.JLabel sortNumber1;
    private javax.swing.JLabel sortNumber10;
    private javax.swing.JLabel sortNumber2;
    private javax.swing.JLabel sortNumber3;
    private javax.swing.JLabel sortNumber4;
    private javax.swing.JLabel sortNumber5;
    private javax.swing.JLabel sortNumber6;
    private javax.swing.JLabel sortNumber7;
    private javax.swing.JLabel sortNumber8;
    private javax.swing.JLabel sortNumber9;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JTextField totalNumberCount;
    // End of variables declaration//GEN-END:variables
}
