/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JLabel;

/**
 *
 * @author gabri
 */
public class ActivitiesView extends javax.swing.JInternalFrame {
    /**
     * Creates new form ActivitiesView
     */
    public ActivitiesView() {
        initComponents();
        this.labelWordShowed.setText("");
        this.labelWordShowed2.setText("");
        this.labelImage.setText("");
    }

    public JLabel getLabelImage() {
        return labelImage;
    }

    public void setLabelImage(JLabel labelImage) {
        this.labelImage = labelImage;
    }

    public JLabel getLabelWordShowed() {
        return labelWordShowed;
    }

    public void setLabelWordShowed(JLabel labelWordShowed) {
        this.labelWordShowed = labelWordShowed;
    }

    public JLabel getLabelWordShowed2() {
        return labelWordShowed2;
    }

    public void setLabelWordShowed2(JLabel labelWordShowed2) {
        this.labelWordShowed2 = labelWordShowed2;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImage = new javax.swing.JLabel();
        labelWordShowed2 = new javax.swing.JLabel();
        labelWordShowed = new javax.swing.JLabel();

        setMaximizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelImage.setText("1");
        labelImage.setToolTipText("");

        labelWordShowed2.setFont(new java.awt.Font("Tahoma", 1, 300)); // NOI18N
        labelWordShowed2.setForeground(new java.awt.Color(255, 0, 0));
        labelWordShowed2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelWordShowed2.setText("REI");
        labelWordShowed2.setToolTipText("");

        labelWordShowed.setFont(new java.awt.Font("Tahoma", 1, 300)); // NOI18N
        labelWordShowed.setForeground(new java.awt.Color(255, 0, 0));
        labelWordShowed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelWordShowed.setText("REI");
        labelWordShowed.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelWordShowed, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWordShowed2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelWordShowed, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelWordShowed2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1255, 596);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelWordShowed;
    private javax.swing.JLabel labelWordShowed2;
    // End of variables declaration//GEN-END:variables
}
