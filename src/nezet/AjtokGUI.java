package nezet;

import javax.swing.JButton;
import javax.swing.JToggleButton;

public class AjtokGUI extends javax.swing.JFrame {

    private String jatekSzoveg;
    private final JToggleButton[] ajtok;

    public AjtokGUI() {
        initComponents();
        jatekAlap();
        this.ajtok = new JToggleButton[3];
        this.setAjtok();
    }

    public JToggleButton[] getAjtok() {
        return ajtok;
    }
    
    private void setAjtok() {
        ajtok[0] = getElsoAjto();
        ajtok[1] = getMasodikAjto();
        ajtok[2] = getHarmadikAjto();
    }

    public JToggleButton getElsoAjto() {
        return btnElsoAjto;
    }

    public JToggleButton getMasodikAjto() {
        return btnMasodikAjto;
    }

    public JToggleButton getHarmadikAjto() {
        return btnHarmadikAjto;
    }

    public JButton getCserelGomb() {
        return btnCsere;
    }

    public JButton getNemCserelGomb() {
        return btnNemCsere;
    }

    public JButton getUjJatek() {
        return btnUjJatek;
    }

    public void jatekAlap() {
        jatekSzoveg = "Válassz egy ajtót!\n";
        txtaJatek.setText(jatekSzoveg);
        txfKincsVagyNemKincs.setText("");
        txfKincsVagyNemKincs2.setText("");
        txfKincsVagyNemKincs1.setText("");
        btnElsoAjto.setSelected(false);
        btnMasodikAjto.setSelected(false);
        btnHarmadikAjto.setSelected(false);
        btnCsere.setEnabled(true);
        btnNemCsere.setEnabled(true);
    }

    public void kivalasztottKiir(int ajtoSzama, boolean allapot) {
        if (!allapot) {
            jatekSzoveg += "Választásod: " + ajtoSzama + "\n"
                    + "Felfedem,\nhogy mi van az egyik ajtó mögött!\n"
                    + "Szeretnél cseréni?\n";
        } else {
            jatekSzoveg += "Választásod: " + ajtoSzama + "\n";
        }
        txtaJatek.setText(jatekSzoveg);
    }

    public void felfedezKiir(int ajtoSzama) {
        switch (ajtoSzama) {
            case 0:
                txfKincsVagyNemKincs.setText("semmi");
                break;
            case 1:
                txfKincsVagyNemKincs2.setText("semmi");
                break;
            case 2:
                txfKincsVagyNemKincs1.setText("semmi");
                break;
        }
    }

    public void ajtokMitRejtKiir(boolean[] ajtokMogott) {
        txfKincsVagyNemKincs.setText(ajtokMogott[0] ? "kincs" : "semmi");
        txfKincsVagyNemKincs2.setText(ajtokMogott[1] ? "kincs" : "semmi");
        txfKincsVagyNemKincs1.setText(ajtokMogott[2] ? "kincs" : "semmi");
    }

    public void csereKiir(boolean csereDontes) {
        if (csereDontes) {
            jatekSzoveg += "Választásod: cserélek\n";
            txtaJatek.setText(jatekSzoveg);
        } else {
            jatekSzoveg += "Választásod: nem cserélek\n";
            txtaJatek.setText(jatekSzoveg);
        }
    }

    public void statKiir(int cserekSzama, int nyeresekSzama) {
        txtaStatisztika1.setText("Nyerések száma: " + nyeresekSzama + "\n"
                + "Cserék száma: " + cserekSzama);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMasodikAjto1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnElsoAjto = new javax.swing.JToggleButton();
        btnMasodikAjto = new javax.swing.JToggleButton();
        btnHarmadikAjto = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaJatek = new javax.swing.JTextArea();
        btnCsere = new javax.swing.JButton();
        btnNemCsere = new javax.swing.JButton();
        txfKincsVagyNemKincs = new javax.swing.JTextField();
        txfKincsVagyNemKincs1 = new javax.swing.JTextField();
        txfKincsVagyNemKincs2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaStatisztika1 = new javax.swing.JTextArea();
        btnUjJatek = new javax.swing.JButton();

        btnMasodikAjto1.setText("2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ajto.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ajto.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ajto.png"))); // NOI18N

        btnElsoAjto.setText("1");

        btnMasodikAjto.setText("2");

        btnHarmadikAjto.setText("3");

        txtaJatek.setEditable(false);
        txtaJatek.setColumns(20);
        txtaJatek.setRows(5);
        jScrollPane2.setViewportView(txtaJatek);

        btnCsere.setText("cserélek");
        btnCsere.setEnabled(false);

        btnNemCsere.setText("nem cserélek");
        btnNemCsere.setEnabled(false);

        txfKincsVagyNemKincs.setEditable(false);
        txfKincsVagyNemKincs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txfKincsVagyNemKincs1.setEditable(false);
        txfKincsVagyNemKincs1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txfKincsVagyNemKincs2.setEditable(false);
        txfKincsVagyNemKincs2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtaStatisztika1.setEditable(false);
        txtaStatisztika1.setColumns(20);
        txtaStatisztika1.setRows(5);
        jScrollPane3.setViewportView(txtaStatisztika1);

        btnUjJatek.setText("új játék");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfKincsVagyNemKincs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnElsoAjto, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMasodikAjto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfKincsVagyNemKincs2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(112, 112, 112)
                                .addComponent(txfKincsVagyNemKincs1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(btnHarmadikAjto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnCsere, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNemCsere))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnUjJatek, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElsoAjto)
                    .addComponent(btnMasodikAjto)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHarmadikAjto)
                        .addComponent(btnNemCsere)
                        .addComponent(btnCsere)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfKincsVagyNemKincs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfKincsVagyNemKincs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfKincsVagyNemKincs2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUjJatek))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    AjtosJatek-ban hívódik a main
//    public static void main(String args[]) {
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AjtokGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCsere;
    private javax.swing.JToggleButton btnElsoAjto;
    private javax.swing.JToggleButton btnHarmadikAjto;
    private javax.swing.JToggleButton btnMasodikAjto;
    private javax.swing.JToggleButton btnMasodikAjto1;
    private javax.swing.JButton btnNemCsere;
    private javax.swing.JButton btnUjJatek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txfKincsVagyNemKincs;
    private javax.swing.JTextField txfKincsVagyNemKincs1;
    private javax.swing.JTextField txfKincsVagyNemKincs2;
    private javax.swing.JTextArea txtaJatek;
    private javax.swing.JTextArea txtaStatisztika1;
    // End of variables declaration//GEN-END:variables
}
