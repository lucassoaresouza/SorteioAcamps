/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sorteioacamps;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucassouza
 */
public class AllRecords extends javax.swing.JFrame {
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = (int)screenSize.getWidth();
    int screenHeight = (int)screenSize.getHeight();
    private final NumberRecordManager recordManager = new NumberRecordManager();
    private ArrayList<NumberRecord> records;
    /**
     * Creates new form AllRecords
     */
    public AllRecords() {
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
    }

    private void applyTextFonts(int screenWidth, int screenHeight){
        int averageScreenSize = (int)(screenWidth + screenHeight) / 2;
        String shadowKGHappy = "fonts/KGHAPPY.ttf";
        String solidKGHappy = "fonts/KGHAPPYSolid.ttf";
        text1.setFont(CustomFont.loadFont(shadowKGHappy, Font.PLAIN, averageScreenSize/20));
        backButton.setFont(CustomFont.loadFont(solidKGHappy, Font.PLAIN, averageScreenSize/47));
    }

    public void updateRecords(){
        records = recordManager.readRecords();
        recordsTable.setModel(initRecordsTableModel());
    }

    private String translateBooleanToPTBr(boolean value){
        if (value){
            return "Sim";
        }
        return "Não";
    }

    private DefaultTableModel initRecordsTableModel(){
        Object columnNames[] = { "Número", "Recebeu Tarefa", "Recebeu Brinde", "Outro"};
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

        jPanel2 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recordsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Todos os Registros");
        setBackground(new java.awt.Color(237, 235, 201));
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        jPanel2.setBackground(new java.awt.Color(237, 235, 201));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        text1.setBackground(new java.awt.Color(237, 235, 201));
        text1.setFont(new java.awt.Font("Arial", 1, screenHeight/15));
        text1.setForeground(new java.awt.Color(0, 133, 178));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("Todos os Registros:");
        text1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(text1, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel2);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

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

        jPanel3.add(jScrollPane1);

        getContentPane().add(jPanel3);

        jPanel1.setBackground(new java.awt.Color(237, 235, 201));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(filler1);

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recordsTable;
    private javax.swing.JLabel text1;
    // End of variables declaration//GEN-END:variables
}
