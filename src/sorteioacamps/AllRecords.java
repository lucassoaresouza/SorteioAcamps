/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sorteioacamps;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import sorteioacamps.NumberRecordManager;

/**
 *
 * @author lucassouza
 */
public class AllRecords extends javax.swing.JFrame {
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int screenWidth = (int)screenSize.getWidth();
    private int screenHeight = (int)screenSize.getHeight();
    private NumberRecordManager recordManager = new NumberRecordManager();
    private ArrayList<NumberRecord> records;
    /**
     * Creates new form AllRecords
     */
    public AllRecords() {
        records = recordManager.readRecords();
        initComponents();
        recordsTable.setModel(initRecordsTableModel());
    }
 
    private String translateBooleanToPTBr(boolean value){
        if (value){
            return "Sim";
        }
        return "Não";
    }

    private DefaultTableModel initRecordsTableModel(){
        Object columnNames[] = { "Número", "Recebeu Brinde", "Recebeu Tarefa", "Outro"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        Object[][] data = new Object[records.size()][4];
        for (int i = 0; i < records.size(); i++) {
            NumberRecord record = records.get(i);
            data[i][0] = String.valueOf(record.getNumber());
            data[i][1] = translateBooleanToPTBr(record.isTask());
            data[i][2] = translateBooleanToPTBr(record.isGift());
            data[i][3] = translateBooleanToPTBr(record.isOther());
        }
        model.setDataVector(data, columnNames);
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recordsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todos os Registros");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        text1.setFont(new java.awt.Font("Arial", 1, screenHeight/15));
        text1.setForeground(new java.awt.Color(0, 133, 178));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("Todos os Registros:");
        text1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(text1);

        recordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(recordsTable);

        getContentPane().add(jScrollPane1);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(filler1);

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
        jPanel1.add(backButton);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recordsTable;
    private javax.swing.JLabel text1;
    // End of variables declaration//GEN-END:variables
}
