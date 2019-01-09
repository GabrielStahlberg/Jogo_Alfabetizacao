/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author gabri
 */
public class AnagramView extends javax.swing.JInternalFrame {
    private MainWindow mainWindow;
    private List<JButton> listButtons = new ArrayList<>(11);
    private String wordToDo;
    private int roundNow = 1;
    private Map<Integer, JButton> pressedButtons = new HashMap<>();
    /**
     * Creates new form AnagramView
     */
    public AnagramView(MainWindow m) {
        initComponents();
        this.mainWindow = m;
        this.wordToDo = mainWindow.getWordsForActivity().get(mainWindow.getPageNow() - 1);
        adjustComponents();
    }
    
    private List<String> shuffleLetters(){
        int wordToDoLength = wordToDo.length();
        List<String> letters;
        boolean ok;
        do{
            letters = new ArrayList<>(11);
            StringBuffer sb = new StringBuffer();
            ok = true;
            if(wordToDoLength == 2){
                letters.add(Character.toString(this.wordToDo.charAt(1)));
                letters.add(Character.toString(this.wordToDo.charAt(0)));
            }else{
                for(int i=0; i<wordToDoLength; i++){
                    letters.add(Character.toString(this.wordToDo.charAt(i)));
                }
                Collections.shuffle(letters);
            }
            for(int g=0; g<letters.size(); g++){
                sb.append(letters.get(g));
            }
            if(sb.toString().equals(this.wordToDo)){
                ok = false;
            }
        }while(!ok);
    
        return letters;
    }

    private void adjustComponents(){
        int wordLength = this.wordToDo.length();
        List<String> letters = shuffleLetters();
        
        listButtons.add(this.buttonLetter1);
        listButtons.add(this.buttonLetter2);
        listButtons.add(this.buttonLetter3);
        listButtons.add(this.buttonLetter4);
        listButtons.add(this.buttonLetter5);
        listButtons.add(this.buttonLetter6);
        listButtons.add(this.buttonLetter7);
        listButtons.add(this.buttonLetter8);
        listButtons.add(this.buttonLetter9);
        listButtons.add(this.buttonLetter10);
        listButtons.add(this.buttonLetter11);
        listButtons.add(this.buttonLetter12);
        listButtons.add(this.buttonLetter13);
        
        this.labelWordFormed.setText("");
        
        for(int i=wordLength; i<13; i++){
            this.listButtons.get(i).setText("?");
            this.listButtons.get(i).setEnabled(false);
        }
        
        for(int i=0; i<wordLength; i++){
            this.listButtons.get(i).setText(letters.get(i));
        }
    }

    public JButton getButtonLetter1() {
        return buttonLetter2;
    }

    public JButton getButtonLetter10() {
        return buttonLetter11;
    }

    public JButton getButtonLetter11() {
        return buttonLetter12;
    }

    public JButton getButtonLetter2() {
        return buttonLetter3;
    }

    public JButton getButtonLetter3() {
        return buttonLetter4;
    }

    public JButton getButtonLetter4() {
        return buttonLetter5;
    }

    public JButton getButtonLetter5() {
        return buttonLetter6;
    }

    public JButton getButtonLetter6() {
        return buttonLetter7;
    }

    public JButton getButtonLetter7() {
        return buttonLetter8;
    }

    public JButton getButtonLetter8() {
        return buttonLetter9;
    }

    public JButton getButtonLetter9() {
        return buttonLetter10;
    }

    public JButton getButtonLetter12() {
        return buttonLetter13;
    }

    public void setButtonLetter12(JButton buttonLetter12) {
        this.buttonLetter13 = buttonLetter12;
    }

    public JButton getButtonLetter13() {
        return buttonLetter1;
    }

    public void setButtonLetter13(JButton buttonLetter13) {
        this.buttonLetter1 = buttonLetter13;
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
        this.mainWindow.getButtonAlert().setEnabled(true);
        this.mainWindow.getButtonSound().setEnabled(true);
    }
    
    private void actionsByButtons(JButton button){
        this.pressedButtons.put(this.roundNow++, button);
        String wordStarted = this.labelWordFormed.getText();
        String newLetter = button.getText();
        String newWord = wordStarted + newLetter;
        this.labelWordFormed.setText(newWord);
        button.setEnabled(false);
        
        this.buttonDelete.setEnabled(true);
        this.buttonDeleteAll.setEnabled(true);
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
        buttonDelete = new javax.swing.JButton();
        buttonDeleteAll = new javax.swing.JButton();
        buttonLetter12 = new javax.swing.JButton();
        buttonLetter2 = new javax.swing.JButton();
        buttonLetter3 = new javax.swing.JButton();
        buttonLetter4 = new javax.swing.JButton();
        buttonLetter5 = new javax.swing.JButton();
        buttonLetter6 = new javax.swing.JButton();
        buttonLetter7 = new javax.swing.JButton();
        buttonLetter8 = new javax.swing.JButton();
        buttonLetter9 = new javax.swing.JButton();
        buttonLetter10 = new javax.swing.JButton();
        buttonLetter11 = new javax.swing.JButton();
        buttonLetter13 = new javax.swing.JButton();
        buttonLetter1 = new javax.swing.JButton();

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

        buttonDelete.setBackground(new java.awt.Color(102, 102, 102));
        buttonDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/delete.png"))); // NOI18N
        buttonDelete.setText("Apagar");
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDelete.setEnabled(false);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonDeleteAll.setBackground(new java.awt.Color(102, 102, 102));
        buttonDeleteAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDeleteAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/deleteall.png"))); // NOI18N
        buttonDeleteAll.setText("Apagar tudo");
        buttonDeleteAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDeleteAll.setEnabled(false);
        buttonDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelForWordLayout = new javax.swing.GroupLayout(panelForWord);
        panelForWord.setLayout(panelForWordLayout);
        panelForWordLayout.setHorizontalGroup(
            panelForWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForWordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelForWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelForWordLayout.createSequentialGroup()
                        .addComponent(labelWordFormed, javax.swing.GroupLayout.DEFAULT_SIZE, 1219, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelForWordLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelForWordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDelete)
                .addGap(18, 18, 18)
                .addComponent(buttonDeleteAll)
                .addGap(36, 36, 36))
        );
        panelForWordLayout.setVerticalGroup(
            panelForWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelForWordLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(buttonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(labelWordFormed, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(panelForWordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDeleteAll)
                    .addComponent(buttonDelete))
                .addGap(23, 23, 23))
        );

        buttonLetter12.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter12.setText("G");
        buttonLetter12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter12ActionPerformed(evt);
            }
        });

        buttonLetter2.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter2.setText("G");
        buttonLetter2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter2ActionPerformed(evt);
            }
        });

        buttonLetter3.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter3.setText("G");
        buttonLetter3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter3ActionPerformed(evt);
            }
        });

        buttonLetter4.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter4.setText("G");
        buttonLetter4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter4ActionPerformed(evt);
            }
        });

        buttonLetter5.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter5.setText("G");
        buttonLetter5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter5ActionPerformed(evt);
            }
        });

        buttonLetter6.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter6.setText("G");
        buttonLetter6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter6ActionPerformed(evt);
            }
        });

        buttonLetter7.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter7.setText("G");
        buttonLetter7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter7ActionPerformed(evt);
            }
        });

        buttonLetter8.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter8.setText("G");
        buttonLetter8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter8ActionPerformed(evt);
            }
        });

        buttonLetter9.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter9.setText("G");
        buttonLetter9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter9ActionPerformed(evt);
            }
        });

        buttonLetter10.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter10.setText("G");
        buttonLetter10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter10ActionPerformed(evt);
            }
        });

        buttonLetter11.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter11.setText("G");
        buttonLetter11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter11ActionPerformed(evt);
            }
        });

        buttonLetter13.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter13.setText("G");
        buttonLetter13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter13ActionPerformed(evt);
            }
        });

        buttonLetter1.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        buttonLetter1.setText("G");
        buttonLetter1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLetter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLetter1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
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
                .addGap(18, 18, 18)
                .addComponent(buttonLetter12)
                .addGap(18, 18, 18)
                .addComponent(buttonLetter13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelForWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLetter12)
                    .addComponent(buttonLetter2)
                    .addComponent(buttonLetter3)
                    .addComponent(buttonLetter4)
                    .addComponent(buttonLetter5)
                    .addComponent(buttonLetter6)
                    .addComponent(buttonLetter7)
                    .addComponent(buttonLetter8)
                    .addComponent(buttonLetter9)
                    .addComponent(buttonLetter10)
                    .addComponent(buttonLetter11)
                    .addComponent(buttonLetter13)
                    .addComponent(buttonLetter1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1255, 596);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        this.setVisible(false);
        this.mainWindow.getDesktop().add(this.mainWindow.getMv().getAv());
        adjustButtons();
    }//GEN-LAST:event_buttonReturnActionPerformed

    private void buttonLetter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter2ActionPerformed
        actionsByButtons(this.buttonLetter2);
    }//GEN-LAST:event_buttonLetter2ActionPerformed

    private void buttonLetter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter3ActionPerformed
        actionsByButtons(this.buttonLetter3);
    }//GEN-LAST:event_buttonLetter3ActionPerformed

    private void buttonLetter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter4ActionPerformed
        actionsByButtons(this.buttonLetter4);
    }//GEN-LAST:event_buttonLetter4ActionPerformed

    private void buttonLetter5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter5ActionPerformed
        actionsByButtons(this.buttonLetter5);
    }//GEN-LAST:event_buttonLetter5ActionPerformed

    private void buttonLetter6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter6ActionPerformed
        actionsByButtons(this.buttonLetter6);
    }//GEN-LAST:event_buttonLetter6ActionPerformed

    private void buttonLetter7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter7ActionPerformed
        actionsByButtons(this.buttonLetter7);
    }//GEN-LAST:event_buttonLetter7ActionPerformed

    private void buttonLetter8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter8ActionPerformed
        actionsByButtons(this.buttonLetter8);
    }//GEN-LAST:event_buttonLetter8ActionPerformed

    private void buttonLetter9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter9ActionPerformed
        actionsByButtons(this.buttonLetter9);
    }//GEN-LAST:event_buttonLetter9ActionPerformed

    private void buttonLetter10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter10ActionPerformed
        actionsByButtons(this.buttonLetter10);
    }//GEN-LAST:event_buttonLetter10ActionPerformed

    private void buttonLetter11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter11ActionPerformed
        actionsByButtons(this.buttonLetter11);
    }//GEN-LAST:event_buttonLetter11ActionPerformed

    private void buttonLetter12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter12ActionPerformed
        actionsByButtons(this.buttonLetter12);
    }//GEN-LAST:event_buttonLetter12ActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        this.pressedButtons.get(this.roundNow - 1).setEnabled(true);
        this.roundNow--;
        String wordNow = this.labelWordFormed.getText();
        int wordNowLength = wordNow.length();
        String newWord = "";
        
        for(int i=0; i<(wordNowLength - 1); i++){
            newWord = newWord + Character.toString(wordNow.charAt(i));
        }
        this.labelWordFormed.setText(newWord);
        if(this.roundNow == 1){
            this.buttonDelete.setEnabled(false);
            this.buttonDeleteAll.setEnabled(false);
        }        
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteAllActionPerformed
        int wordLength = this.wordToDo.length();
        for(int i=0; i<wordLength; i++){
            this.listButtons.get(i).setEnabled(true);
        }
        this.labelWordFormed.setText("");
        if(this.roundNow == 1){
            this.buttonDelete.setEnabled(false);
            this.buttonDeleteAll.setEnabled(false);
        }
    }//GEN-LAST:event_buttonDeleteAllActionPerformed

    private void buttonLetter13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter13ActionPerformed
        actionsByButtons(this.buttonLetter13);
    }//GEN-LAST:event_buttonLetter13ActionPerformed

    private void buttonLetter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLetter1ActionPerformed
        actionsByButtons(this.buttonLetter1);
    }//GEN-LAST:event_buttonLetter1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDeleteAll;
    private javax.swing.JButton buttonLetter1;
    private javax.swing.JButton buttonLetter10;
    private javax.swing.JButton buttonLetter11;
    private javax.swing.JButton buttonLetter12;
    private javax.swing.JButton buttonLetter13;
    private javax.swing.JButton buttonLetter2;
    private javax.swing.JButton buttonLetter3;
    private javax.swing.JButton buttonLetter4;
    private javax.swing.JButton buttonLetter5;
    private javax.swing.JButton buttonLetter6;
    private javax.swing.JButton buttonLetter7;
    private javax.swing.JButton buttonLetter8;
    private javax.swing.JButton buttonLetter9;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JLabel labelWordFormed;
    private javax.swing.JPanel panelForWord;
    // End of variables declaration//GEN-END:variables
}
