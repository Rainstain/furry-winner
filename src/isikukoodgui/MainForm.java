/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isikukoodgui;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Rain.kald
 */
public class MainForm extends javax.swing.JFrame {
    
    /////////////////////////////
    ///////////////////////////
    /////////////////////////
    ///////////////////////
    /////////////////////
    ///////////////////
    /////////////////
    ///////////////
    /////////////
    ///////////
    /////////
    ///////
    /////
    ///
    //
    static check ck = new check();
    static gen gn = new gen();

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        btnCk.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jPanel1 = new javax.swing.JPanel();
        CBGender = new javax.swing.JComboBox<>();
        btnGn = new javax.swing.JButton();
        spnAmount = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DCdate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnCk = new javax.swing.JButton();
        CBvanus = new javax.swing.JCheckBox();
        CBkehtivus = new javax.swing.JCheckBox();
        CBhaiglakood = new javax.swing.JCheckBox();
        CBkontrollnr = new javax.swing.JCheckBox();
        CBhaigla = new javax.swing.JCheckBox();
        btnSelectAll = new javax.swing.JButton();
        CBsugu = new javax.swing.JCheckBox();
        CBsunniaeg = new javax.swing.JCheckBox();
        TF1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        CBs = new javax.swing.JCheckBox();
        CBsoonr = new javax.swing.JCheckBox();
        CByy = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Isikukooder");
        setFocusable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CBGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Naine", "Mees", "♀ & ♂" }));

        btnGn.setText("Genereeri");
        btnGn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGnActionPerformed(evt);
            }
        });

        spnAmount.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel1.setText("Vali sugu, vali kuupäev");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setText("Vali kogus ja genereeri");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel3.setText("Min 1;Max 100");

        DCdate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(spnAmount)
                        .addComponent(CBGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DCdate, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGn)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CBGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DCdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnGn)))))
        );

        TA1.setEditable(false);
        TA1.setColumns(20);
        TA1.setRows(5);
        jScrollPane1.setViewportView(TA1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCk.setText("Kontrolli");
        btnCk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCkActionPerformed(evt);
            }
        });

        CBvanus.setText("Vanus");

        CBkehtivus.setText("Kehtivus");

        CBhaiglakood.setText("Haigla kood");

        CBkontrollnr.setText("Kontrollnr");

        CBhaigla.setText("Haigla nimi");

        btnSelectAll.setText("Vali kõik");
        btnSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAllActionPerformed(evt);
            }
        });

        CBsugu.setText("SUGU");

        CBsunniaeg.setText("Sünniaeg");

        jButton2.setText("Kontrolli seda^");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CBs.setText("s");

        CBsoonr.setText("SOO NUMBER");

        CByy.setText("dd.mm.yy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBkehtivus)
                                    .addComponent(CBhaiglakood)
                                    .addComponent(CBsunniaeg)
                                    .addComponent(CBs)
                                    .addComponent(CBvanus))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBkontrollnr)
                                    .addComponent(CBhaigla)
                                    .addComponent(CByy)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CBsugu)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBsoonr))
                                    .addComponent(btnSelectAll)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCk, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CBhaigla, CBhaiglakood, CBkehtivus, CBkontrollnr, CBs, CBsoonr, CBsugu, CBsunniaeg, CBvanus, CByy});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBsugu)
                        .addComponent(CBsoonr))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CBs)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBsunniaeg)
                            .addComponent(CByy))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBhaiglakood)
                            .addComponent(CBhaigla))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBkehtivus)
                            .addComponent(CBkontrollnr))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBvanus)
                            .addComponent(btnSelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addComponent(btnCk)
                .addGap(18, 18, 18)
                .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CBhaiglakood, CBkehtivus, CBs, CBsunniaeg, CBvanus});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CBhaigla, CBkontrollnr, CBsoonr, CBsugu, CByy});

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGnActionPerformed
        TA1.setText("");
        int hobune = (Integer) spnAmount.getValue();
        for (int i = 0; i < hobune; i++) {
            if (DCdate.getDate() != null) {
                String kala = (String) CBGender.getSelectedItem();
                if (null == kala) {
                    JOptionPane.showMessageDialog(null,
                            "ERROR!",
                            "ERROR!",
                            JOptionPane.ERROR_MESSAGE);
                    break;
                } else {
                    switch (kala) {
                        case "Naine":
                            gn.gender = "N";
                            break;
                        case "Mees":
                            gn.gender = "M";
                            break;
                        case "♀ & ♂":
                            Random rand = new Random();
                            int n = rand.nextInt(2) + 1;
                            if (n == 1) {
                                gn.gender = "N";
                            } else if (n == 2) {
                                gn.gender = "M";
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,
                                    "ERROR!",
                                    "ERROR!",
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                }

                String date = ((JTextField) DCdate.getDateEditor().getUiComponent()).getText();
                gn.sunniaeg = date;
                if (hobune == 1) {
                    TA1.setText(gn.personalCode());
                } else {
                    TA1.append(gn.personalCode() + "\n");
                }
                btnCk.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Palun vali kuupäev!",
                        "ERROR!",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }//GEN-LAST:event_btnGnActionPerformed

    private void btnCkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCkActionPerformed
        for (String line : TA1.getText().split("\\n")) {
            ck.pc = line;
            if (line.length() == 11) {
                TA1.append("\n##################\n");
                TA1.append(ck.personalCode());

                if (CBsugu.isSelected()) {
                    String gender1 = "";
                    if ("M".equals(ck.gender)) {
                        gender1 = "Mees";
                    } else if ("N".equals(ck.gender)) {
                        gender1 = "Naine";
                    }
                    TA1.append("\nSugu: " + gender1);
                }
                if (CBsoonr.isSelected()) {
                    TA1.append("\nSugu: " + gn.genderNr);
                }
                if (CBs.isSelected()) {
                    TA1.append("\nSugu: " + ck.gender);
                }
                if (CBsunniaeg.isSelected()) {
                    TA1.append("\nSünniaeg: " + ck.Day + " " + ck.monthsi + " " + ck.Year1half + "" + ck.Year2half);
                }
                if (CByy.isSelected()) {
                    TA1.append("\nSünniaeg: " + ck.Day + "." + ck.Month + "." + ck.Year2half);
                }
                if (CBhaiglakood.isSelected()) {
                    TA1.append("\nHaigla kood: " + ck.HaiglaNr);
                }
                if (CBhaigla.isSelected()) {
                    TA1.append("\nHaigla: " + ck.Hospital());
                }
                if (CBkehtivus.isSelected()) {
                    TA1.append("\nKehtivus: " + ck.kehtivus);
                }
                if (CBkontrollnr.isSelected()) {
                    TA1.append("\nKontrollNr: " + ck.kontrollnr);
                }
                if (CBvanus.isSelected()) {
                    TA1.append("\nVanus: " + ck.vanus);
                }
                TA1.append(" \n##################\n");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sisestatud isikukood on vale!\nGenereeri uus!",
                        "ERROR!",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
            btnCk.setEnabled(false);
        }
    }//GEN-LAST:event_btnCkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAllActionPerformed
        if (CBhaiglakood.isSelected() == false
                || CBsugu.isSelected() == false
                || CBsunniaeg.isSelected() == false
                || CBhaigla.isSelected() == false
                || CBkehtivus.isSelected() == false
                || CBkontrollnr.isSelected() == false
                || CByy.isSelected() == false
                || CBsoonr.isSelected() == false
                || CBs.isSelected() == false
                || CBvanus.isSelected() == false) {
            CBsugu.setSelected(true);
            CBsunniaeg.setSelected(true);
            CBhaiglakood.setSelected(true);
            CBhaigla.setSelected(true);
            CBkehtivus.setSelected(true);
            CBkontrollnr.setSelected(true);
            CBvanus.setSelected(true);
            CByy.setSelected(true);
            CBsoonr.setSelected(true);
            CBs.setSelected(true);
        } else {
            CBsugu.setSelected(false);
            CBsunniaeg.setSelected(false);
            CBhaiglakood.setSelected(false);
            CBhaigla.setSelected(false);
            CBkehtivus.setSelected(false);
            CBkontrollnr.setSelected(false);
            CBvanus.setSelected(false);
            CByy.setSelected(false);
            CBsoonr.setSelected(false);
            CBs.setSelected(false);
        }
    }//GEN-LAST:event_btnSelectAllActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String personalcode = TF1.getText();
        if (personalcode.length() == 11) {
            TA1.setText("");
            btnCk.setEnabled(false);
            ck.pc = personalcode;
            TA1.append("\n##################\n");
            TA1.append(ck.personalCode());

            if (CBsugu.isSelected()) {
                String gender1 = "";
                if ("M".equals(ck.gender)) {
                    gender1 = "Mees";
                } else if ("N".equals(ck.gender)) {
                    gender1 = "Naine";
                }
                TA1.append("\nSugu: " + gender1);
            }
            if (CBsoonr.isSelected()) {
                TA1.append("\nSugu: " + gn.genderNr);
            }
            if (CBs.isSelected()) {
                TA1.append("\nSugu: " + ck.gender);
            }
            if (CBsunniaeg.isSelected()) {
                TA1.append("\nSünniaeg: " + ck.Day + " " + ck.monthsi + " " + ck.Year1half + "" + ck.Year2half);
            }
            if (CByy.isSelected()) {
                TA1.append("\nSünniaeg: " + ck.Day + "." + ck.Month + "." + ck.Year2half);
            }
            if (CBhaiglakood.isSelected()) {
                TA1.append("\nHaigla kood: " + ck.HaiglaNr);
            }
            if (CBhaigla.isSelected()) {
                TA1.append("\nHaigla: " + ck.Hospital());
            }
            if (CBkehtivus.isSelected()) {
                TA1.append("\nKehtivus: " + ck.kehtivus);
            }
            if (CBkontrollnr.isSelected()) {
                TA1.append("\nKontrollNr: " + ck.kontrollnr);
            }
            if (CBvanus.isSelected()) {
                TA1.append("\nVanus: " + ck.vanus);
            }
            TA1.append(" \n##################\n");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Sisestatud isikukood on vale!\nGenereeri uus!",
                    "ERROR!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBGender;
    private javax.swing.JCheckBox CBhaigla;
    private javax.swing.JCheckBox CBhaiglakood;
    private javax.swing.JCheckBox CBkehtivus;
    private javax.swing.JCheckBox CBkontrollnr;
    private javax.swing.JCheckBox CBs;
    private javax.swing.JCheckBox CBsoonr;
    private javax.swing.JCheckBox CBsugu;
    private javax.swing.JCheckBox CBsunniaeg;
    private javax.swing.JCheckBox CBvanus;
    private javax.swing.JCheckBox CByy;
    private com.toedter.calendar.JDateChooser DCdate;
    private javax.swing.JTextArea TA1;
    private javax.swing.JTextField TF1;
    private javax.swing.JButton btnCk;
    private javax.swing.JButton btnGn;
    private javax.swing.JButton btnSelectAll;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JSpinner spnAmount;
    // End of variables declaration//GEN-END:variables
}
