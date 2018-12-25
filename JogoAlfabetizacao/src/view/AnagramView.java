/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author gabri
 */
public class AnagramView extends javax.swing.JInternalFrame {
    private MainWindow mainWindow;
    private List<JToggleButton> buttonsList = new ArrayList<>(11);
    private String wordToDo;
    /**
     * Creates new form AnagramView
     */
    public AnagramView(MainWindow m) {
        initComponents();
        this.mainWindow = m;
        this.wordToDo = mainWindow.getWordsForActivity().get(mainWindow.getPageNow() - 1);
        adjustComponents();

        
    }

    private void adjustComponents(){
        int wordLength = this.wordToDo.length();
        
        buttonsList.add(this.buttonLetter1);
        buttonsList.add(this.buttonLetter2);
        buttonsList.add(this.buttonLetter3);
        buttonsList.add(this.buttonLetter4);
        buttonsList.add(this.buttonLetter5);
        buttonsList.add(this.buttonLetter6);
        buttonsList.add(this.buttonLetter7);
        buttonsList.add(this.buttonLetter8);
        buttonsList.add(this.buttonLetter9);
        buttonsList.add(this.buttonLetter10);
        buttonsList.add(this.buttonLetter11);
        
        for(int i=wordLength; i<11; i++){
            this.buttonsList.get(i).setText("?");
            this.buttonsList.get(i).setEnabled(false);
        }
        
        for(int i=0; i<wordLength; i++){
            this.buttonsList.get(i).setText(Character.toString(this.wordToDo.charAt(i)));
        }
    }
    
    
    public JToggleButton getButtonLetter1() {
        return buttonLetter1;
    }

    public void setButtonLetter1(JToggleButton buttonLetter1) {
        this.buttonLetter1 = buttonLetter1;
    }

    public JToggleButton getButtonLetter10() {
        return buttonLetter10;
    }

    public void setButtonLetter10(JToggleButton buttonLetter10) {
        this.buttonLetter10 = buttonLetter10;
    }

    public JToggleButton getButtonLetter11() {
        return buttonLetter11;
    }

    public void setButtonLetter11(JToggleButton buttonLetter11) {
        this.buttonLetter11 = buttonLetter11;
    }

    public JToggleButton getButtonLetter2() {
        return buttonLetter2;
    }

    public void setButtonLetter2(JToggleButton buttonLetter2) {
        this.buttonLetter2 = buttonLetter2;
    }

    public JToggleButton getButtonLetter3() {
        return buttonLetter3;
    }

    public void setButtonLetter3(JToggleButton buttonLetter3) {
        this.buttonLetter3 = buttonLetter3;
    }

    public JToggleButton getButtonLetter4() {
        return buttonLetter4;
    }

    public void setButtonLetter4(JToggleButton buttonLetter4) {
        this.buttonLetter4 = buttonLetter4;
    }

    public JToggleButton getButtonLetter5() {
        return buttonLetter5;
    }

    public void setButtonLetter5(JToggleButton buttonLetter5) {
        this.buttonLetter5 = buttonLetter5;
    }

    public JToggleButton getButtonLetter6() {
        return buttonLetter6;
    }

    public void setButtonLetter6(JToggleButton buttonLetter6) {
        this.buttonLetter6 = buttonLetter6;
    }

    public JToggleButton getButtonLetter7() {
        return buttonLetter7;
    }

    public void setButtonLetter7(JToggleButton buttonLetter7) {
        this.buttonLetter7 = buttonLetter7;
    }

    public JToggleButton getButtonLetter8() {
        return buttonLetter8;
    }

    public void setButtonLetter8(JToggleButton buttonLetter8) {
        this.buttonLetter8 = buttonLetter8;
    }

    public JToggleButton getButtonLetter9() {
        return buttonLetter9;
    }

    public void setButtonLetter9(JToggleButton buttonLetter9) {
        this.buttonLetter9 = buttonLetter9;
    }

    public JLabel getLabelWordFormed() {
        return labelWordFormed;
    }

    public void setLabelWordFormed(JLabel labelWordFormed) {
        this.labelWordFormed = labelWordFormed;
    }
    
    private void adjustButtons(){
        this.mainWindow.getButtonNext().setEnabled(true);
        this.mainWindow.getButtonPrevious().setEnabled(true);
        this.mainWindow.getButtonShowImage().setEnabled(true);
        this.mainWindow.getButtonShowWord().setEnabled(true);
        this.mainWindow.getButtonAnagram().setEnabled(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        panelForWord = new javax.swing.JPanel();
        labelWordFormed = new javax.swing.JLabel();
        buttonReturn = new javax.swing.JButton();
        buttonLetter1 = new javax.swing.JToggleButton();
        buttonLetter2 = new javax.swing.JToggleButton();
        buttonLetter3 = new javax.swing.JToggleButton();
        buttonLetter4 = new javax.swing.JToggleButton();
        buttonLetter5 = new javax.swing.JToggleButton();
        buttonLetter6 = new javax.swing.JToggleButton();
        buttonLetter7 = new javax.swing.JToggleButton();
        buttonLetter8 = new javax.swing.JToggleButton();
        buttonLetter9 = new javax.swing.JToggleButton();
        buttonLetter10 = new javax.swing.JToggleButton();
        buttonLetter11 = new javax.swing.JToggleButton();

        jToggleButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jToggleButton4.setText("G");

        jToggleButton12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jToggleButton12.setText("G");

        setMaximizable(true);
        setResizable(true);

        panelForWord.setBackground(new java.awt.Color(0, 102, 102));

        labelWordFormed.setBackground(new java.awt.Color(255, 255, 255));
        labelWordFormed.setFont(new java.awt.Font("Tahoma", 1, 90)); // NOI18N
        labelWordFormed.setForeground(new java.awt.Color(204, 204, 204));
        labelWordFormed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWordFormed.setText("PALAVRA FORMADA AQUI");
        labelWordFormed.setToolTipText("");

        buttonReturn.setBackground(new java.awt.Color(102, 102, 102));
        buttonReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/return.png"))); // NOI18N
        buttonReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelForWordLayout = new javax.swing.GroupLayout(panelForWord);
        panelForWord.setLayout(panelForWordLayout);
        panelForWordLayout.setHorizontalGroup(
            panelForWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelForWordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelWordFormed, javax.swing.GroupLayout.DEFAULT_SIZE, 1219, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelForWordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        panelForWordLayout.setVerticalGroup(
            panelForWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForWordLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(labelWordFormed, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        buttonLetter1.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter1.setText("G");
        buttonLetter1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter2.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter2.setText("G");
        buttonLetter2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter3.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter3.setText("G");
        buttonLetter3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter4.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter4.setText("G");
        buttonLetter4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter5.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter5.setText("G");
        buttonLetter5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter6.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter6.setText("G");
        buttonLetter6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter7.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter7.setText("G");
        buttonLetter7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter8.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter8.setText("G");
        buttonLetter8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter9.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter9.setText("G");
        buttonLetter9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter10.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter10.setText("G");
        buttonLetter10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        buttonLetter11.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter11.setText("G");
        buttonLetter11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(buttonLetter1)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter2)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter3)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter4)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter5)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter6)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter7)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter8)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter9)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter10)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelForWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLetter1)
                    .addComponent(buttonLetter2)
                    .addComponent(buttonLetter3)
                    .addComponent(buttonLetter4)
                    .addComponent(buttonLetter5)
                    .addComponent(buttonLetter6)
                    .addComponent(buttonLetter7)
                    .addComponent(buttonLetter8)
                    .addComponent(buttonLetter9)
                    .addComponent(buttonLetter10)
                    .addComponent(buttonLetter11))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1255, 596);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        this.setVisible(false);
        this.mainWindow.getDesktop().add(this.mainWindow.getMv().getAv());
        adjustButtons();
    }//GEN-LAST:event_buttonReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonLetter1;
    private javax.swing.JToggleButton buttonLetter10;
    private javax.swing.JToggleButton buttonLetter11;
    private javax.swing.JToggleButton buttonLetter2;
    private javax.swing.JToggleButton buttonLetter3;
    private javax.swing.JToggleButton buttonLetter4;
    private javax.swing.JToggleButton buttonLetter5;
    private javax.swing.JToggleButton buttonLetter6;
    private javax.swing.JToggleButton buttonLetter7;
    private javax.swing.JToggleButton buttonLetter8;
    private javax.swing.JToggleButton buttonLetter9;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JLabel labelWordFormed;
    private javax.swing.JPanel panelForWord;
    // End of variables declaration//GEN-END:variables
}
