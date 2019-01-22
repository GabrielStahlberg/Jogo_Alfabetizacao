/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabrielstahlberg
 */
public class MenuView extends javax.swing.JInternalFrame {
    private MainWindow mainWindow;
    ActivitiesView av;
    private ButtonGroup group = new ButtonGroup();
    private DefaultTableModel modelDepart;
    private List<String> words;
    private List<String> wordsActivity = new ArrayList<>(10);
    private int begin = 1;
    private int end = 7;
    private int max;
    private int countLevel = 0;
    private int page = 1;
    /**
     * Creates new form MenuView
     */
    public MenuView(MainWindow m) {
        initComponents();
        this.mainWindow = m;
        this.group.add(this.radioEasy);
        this.group.add(this.radioMedium);
        this.group.add(this.radioHard);
        this.buttonBegin.setEnabled(false);
        this.buttonNext.setEnabled(false);
        this.buttonPrevious.setEnabled(false);
        this.modelDepart = (DefaultTableModel) tableLevel.getModel();
    }
    
    /**
     * POPULA TODA A TABELA
     */
    private void injectTable(){
        List<String> wordsByRow = new ArrayList<>(10);
        modelDepart.setRowCount(0);
        
        Object[] levelLine = new Object[]{"Nº "+(countLevel+1), "Nº "+(countLevel+2),
            "Nº "+(countLevel+3), "Nº "+(countLevel+4), "Nº "+(countLevel+5), "Nº "+(countLevel+6)};
        modelDepart.addRow(levelLine);
        
        int aux = 0;
        if(this.radioEasy.isSelected()){
            this.max = 3;
        }else if(this.radioMedium.isSelected()){
            this.max = 6;
        }else{
            this.max = 9;
        }

        for(int k=0; k<this.max; k++){
            for(int i=begin; i<end; i++){
                this.words = this.mainWindow.getDatas(i);
                wordsByRow.add(words.get(aux));
            }
            Object[] line = new Object[]{wordsByRow.get(0), wordsByRow.get(1),
                wordsByRow.get(2), wordsByRow.get(3), wordsByRow.get(4), wordsByRow.get(5)};
            modelDepart.addRow(line);
            aux++;
            wordsByRow.clear();
        }        
    }
    
    private void renameColumns(){
        int numberOfColumns = this.tableLevel.getColumnCount();
        List<String> names = new ArrayList<>(10);
        if(numberOfColumns > 0){
            this.modelDepart = new DefaultTableModel();
            this.tableLevel.setModel(modelDepart);
        }
        names = mainWindow.getColumnsName().get(this.page);
        for(int i=0; i<6; i++){
            this.modelDepart.addColumn(names.get(i));
        }
    }
    
    private void prepareWordsForActivity(){
        int level;
        try{
            level = Integer.parseInt(fieldLevel.getText());
            if(level > 0 && level < 45){
                for(int i=0; i<this.max; i++){
                    String word = this.mainWindow.getDatas(level).get(i);
                    if(!word.equals("-----")){
                        this.wordsActivity.add(word);
                    }
                }
                if(!this.mainWindow.getWordsForGuess().isEmpty()){
                    this.mainWindow.setWordsForGuess(new ArrayList<>(9));
                }
                for(String w : this.mainWindow.getDatas(level)){
                    if(!w.equals("-----")){
                        this.mainWindow.getWordsForGuess().add(w);
                    }
                }
                
                this.mainWindow.getDesktop().removeAll();
                mainWindow.getButtonHome().setEnabled(true);
                mainWindow.getButtonMenu().setEnabled(true);
                this.av = new ActivitiesView();
                this.av.setVisible(true);
                this.mainWindow.getDesktop().add(av);
                prepareComponents();
                this.mainWindow.setMv(this);
            }else{
                JOptionPane.showMessageDialog(null, "Não há dados para esse nível.", null, JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Insira apenas números.", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    public ActivitiesView getAv() {
        return av;
    }

    public void setAv(ActivitiesView av) {
        this.av = av;
    }

    public List<String> getWordsActivity() {
        return wordsActivity;
    }
    
    private void prepareComponents(){
        this.mainWindow.getButtonNext().setEnabled(true);
        this.mainWindow.getButtonShowImage().setEnabled(true);
        this.mainWindow.getButtonShowWord().setEnabled(true);
        this.mainWindow.getButtonSound().setEnabled(true);
        this.mainWindow.setWordsForActivity(wordsActivity);
        this.mainWindow.setMax(wordsActivity.size());
        this.mainWindow.getLabelPagina().setEnabled(true);
        this.mainWindow.getLabelPagina().setText("Página 1 de " + wordsActivity.size());
        this.mainWindow.getButtonAlert().setEnabled(true);
        this.mainWindow.getButtonAnagram().setEnabled(true);
        this.mainWindow.getButtonGuess().setEnabled(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableLevel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        radioEasy = new javax.swing.JRadioButton();
        radioHard = new javax.swing.JRadioButton();
        radioMedium = new javax.swing.JRadioButton();
        buttonChoose = new javax.swing.JButton();
        buttonNext = new javax.swing.JButton();
        buttonPrevious = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fieldLevel = new javax.swing.JTextField();
        buttonBegin = new javax.swing.JButton();

        setMaximizable(true);
        setResizable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        tableLevel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableLevel.setEnabled(false);
        tableLevel.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(tableLevel);

        jLabel2.setFont(new java.awt.Font("Manjari Regular", 3, 100)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 44, 200));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENU PRINCIPAL");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 127, 35));
        jLabel1.setText("DIFICULDADE:");

        radioEasy.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        radioEasy.setSelected(true);
        radioEasy.setText("FÁCIL");

        radioHard.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        radioHard.setText("DIFÍCIL");

        radioMedium.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        radioMedium.setText("MÉDIO");

        buttonChoose.setBackground(new java.awt.Color(222, 127, 35));
        buttonChoose.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        buttonChoose.setText("ESCOLHER");
        buttonChoose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChooseActionPerformed(evt);
            }
        });

        buttonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/next.png"))); // NOI18N
        buttonNext.setToolTipText("");
        buttonNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });

        buttonPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/previous.png"))); // NOI18N
        buttonPrevious.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPreviousActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel3.setText("ESCOLHA O NÍVEL(Nº) QUE DESEJA:");

        buttonBegin.setBackground(new java.awt.Color(77, 153, 57));
        buttonBegin.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        buttonBegin.setForeground(new java.awt.Color(253, 251, 251));
        buttonBegin.setText("COMEÇAR");
        buttonBegin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBeginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(buttonPrevious)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonNext))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(31, 31, 31)
                                    .addComponent(fieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(89, 89, 89)
                                    .addComponent(buttonBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(50, 50, 50)
                                    .addComponent(radioEasy)
                                    .addGap(30, 30, 30)
                                    .addComponent(radioMedium)
                                    .addGap(26, 26, 26)
                                    .addComponent(radioHard)
                                    .addGap(76, 76, 76)
                                    .addComponent(buttonChoose)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioEasy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioHard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioMedium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonPrevious)
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonNext)
                                .addGap(92, 92, 92)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonBegin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );

        setBounds(0, 0, 1255, 596);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChooseActionPerformed
        renameColumns();
        injectTable();
        if(!this.buttonNext.isEnabled() && this.countLevel != 42){
            this.buttonNext.setEnabled(true);
        }
        this.buttonBegin.setEnabled(true);        
    }//GEN-LAST:event_buttonChooseActionPerformed

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        this.page++;
        //this.tableLevel.getColumnModel().getColumn(0).setHeaderValue("TESTE");
        renameColumns();
        if(this.countLevel == 36){
            this.buttonNext.setEnabled(false);
        }
        this.begin += 6;
        this.end += 6;
        
        this.buttonPrevious.setEnabled(true);
        this.countLevel += 6;
        injectTable();
    }//GEN-LAST:event_buttonNextActionPerformed

    private void buttonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPreviousActionPerformed
        this.page--;
        renameColumns();
        if(this.countLevel == 6){
            this.buttonPrevious.setEnabled(false);
        }
        this.begin -= 6;
        this.end -= 6;
        
        this.countLevel -= 6;
        this.buttonNext.setEnabled(true);
        injectTable();
    }//GEN-LAST:event_buttonPreviousActionPerformed

    private void buttonBeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBeginActionPerformed
        prepareWordsForActivity();
    }//GEN-LAST:event_buttonBeginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBegin;
    private javax.swing.JButton buttonChoose;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonPrevious;
    private javax.swing.JTextField fieldLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioEasy;
    private javax.swing.JRadioButton radioHard;
    private javax.swing.JRadioButton radioMedium;
    private javax.swing.JTable tableLevel;
    // End of variables declaration//GEN-END:variables
}
