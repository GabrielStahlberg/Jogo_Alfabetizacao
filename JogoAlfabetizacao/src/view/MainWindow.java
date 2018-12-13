/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author gabrielstahlberg
        wordList = new WordListByDifficulty();
 */
public class MainWindow extends javax.swing.JFrame {
    private Map<Integer, List<String>> datas = new HashMap<>();
    private List<String> auxList = new ArrayList<>(10);

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        }
        catch(UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
           // handle exception
           e.printStackTrace();
        }
        injectDatas();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.labelDate.setText(LocalDate.now().format(formatter));
        StartView startView = new StartView(this);
        startView.setVisible(true);
        desktop.add(startView);
        
        this.buttonHome.setEnabled(false);
        this.buttonMenu.setEnabled(false);
    }
    
    private void injectDatas(){        
        auxList.add("REI");
        auxList.add("UVA");
        auxList.add("OVO");
        auxList.add("RIO");
        auxList.add("PAU");
        auxList.add("PAI");
        auxList.add("AVE");
        auxList.add("PIA");
        auxList.add("RUA");
        this.datas.put(1, auxList);        
        auxList = new ArrayList<>(10);
        
        auxList.add("PÉ");
        auxList.add("SAPO");
        auxList.add("VOVÓ");
        auxList.add("PÁ");
        auxList.add("PÓ");
        auxList.add("SAPÉ");
        auxList.add("SOPÉ");
        auxList.add("SAÚVA");
        auxList.add("-----");
        this.datas.put(2, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("LUA");
        auxList.add("LUVA");
        auxList.add("VELA");
        auxList.add("SELO");
        auxList.add("SOLA");
        auxList.add("RALO");
        auxList.add("ROLO");
        auxList.add("SALA");
        auxList.add("PELE");
        datas.put(3, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("DADO");
        auxList.add("RODA");
        auxList.add("RÁDIO");
        auxList.add("REDE");
        auxList.add("DEDO");
        auxList.add("RODO");
        auxList.add("DÁLIA");
        auxList.add("VEADO");
        auxList.add("-----");
        datas.put(4, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("COPO");
        auxList.add("VACA");
        auxList.add("CAVALO");
        auxList.add("CAPA");
        auxList.add("CALO");
        auxList.add("SACO");
        auxList.add("PACA");
        auxList.add("CÔCO");
        auxList.add("COROA");
        datas.put(5, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("CAMA");
        auxList.add("MALA");
        auxList.add("MACACO");
        auxList.add("MAPA");
        auxList.add("MACA");
        auxList.add("LIMA");
        auxList.add("MÉDICO");
        auxList.add("CAMELO");
        auxList.add("REMO");
        datas.put(6, auxList);
        auxList = new ArrayList<>(10);
        
        auxList.add("TOMATE");
        auxList.add("SAPATO");
        auxList.add("RATO");
        auxList.add("TATU");
        auxList.add("LATA");
        auxList.add("TULIPA");
        auxList.add("PATO");
        auxList.add("MULETA");
        auxList.add("TAPETE");
        datas.put(7, auxList);
    }

    public JButton getButtonExit() {
        return buttonExit;
    }

    public void setButtonExit(JButton buttonExit) {
        this.buttonExit = buttonExit;
    }

    public JButton getButtonHome() {
        return buttonHome;
    }

    public void setButtonHome(JButton buttonHome) {
        this.buttonHome = buttonHome;
    }

    public JButton getButtonMenu() {
        return buttonMenu;
    }

    public void setButtonMenu(JButton buttonMenu) {
        this.buttonMenu = buttonMenu;
    }

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public void setDesktop(JDesktopPane desktop) {
        this.desktop = desktop;
    }

    public List<String> getDatas(int level) {
        return datas.get(level);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        buttonHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        buttonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo de Alfabetização");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        desktop.setPreferredSize(new java.awt.Dimension(750, 600));

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/home.png"))); // NOI18N
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(205, 58, 58));
        jLabel1.setText("ATIVIDADES");

        labelDate.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        labelDate.setText("10/12/2018");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/iconfinder_letter_ABC_1553073.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(205, 58, 58));
        jLabel2.setText("DE");

        jLabel4.setFont(new java.awt.Font("Noto Sans", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(205, 58, 58));
        jLabel4.setText("ALFABETIZAÇÃO");

        buttonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/exit.png"))); // NOI18N
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/menu.png"))); // NOI18N
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(buttonHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonExit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDate)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDate)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExit)
                    .addComponent(buttonMenu)
                    .addComponent(buttonHome))
                .addGap(18, 18, 18))
        );

        setSize(new java.awt.Dimension(1040, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        this.desktop.removeAll();
        StartView startView = new StartView(this);
        startView.setVisible(true);
        this.desktop.add(startView);
        this.buttonHome.setEnabled(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        this.desktop.removeAll();
        MenuView mv = new MenuView(this);
        mv.setVisible(true);
        this.desktop.add(mv);
    }//GEN-LAST:event_buttonMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelDate;
    // End of variables declaration//GEN-END:variables
}
