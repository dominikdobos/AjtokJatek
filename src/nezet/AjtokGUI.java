package nezet;

public class AjtokGUI extends javax.swing.JFrame {
    private int kivalasztottIndex = -1;
    
    public AjtokGUI() {
        initComponents();
        jatekKiiras("Válassz egy ajtót!");
    }
    
    public void jatekKiiras(String szoveg) {
        szoveg = txtaJatek.getText() + "\n" + szoveg;
        txtaJatek.setText(szoveg);
    }
    
    public int kivalasztottKincs() {
        if(btnElsoAjto.isSelected()){
            kivalasztottIndex = 0;
            // mivel nem radiobutton ezért toggle-zni kell, nehogy egyszerre többet válasszon.
            btnHarmadikAjto.setEnabled(false);
            btnMasodikAjto.setEnabled(false);
            
        }else if(btnMasodikAjto.isSelected()){
            kivalasztottIndex = 1;
            btnElsoAjto.setEnabled(false);
            btnHarmadikAjto.setEnabled(false);
            
        }else if(btnHarmadikAjto.isSelected()){
            kivalasztottIndex = 2;
            btnElsoAjto.setEnabled(false);
            btnMasodikAjto.setEnabled(false);
        }
        
        return kivalasztottIndex;
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
        btnUjJatek = new javax.swing.JToggleButton();

        btnMasodikAjto1.setText("2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ajto.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ajto.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ajto.png"))); // NOI18N

        btnElsoAjto.setText("1");
        btnElsoAjto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnElsoAjtoItemStateChanged(evt);
            }
        });

        btnMasodikAjto.setText("2");
        btnMasodikAjto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnMasodikAjtoItemStateChanged(evt);
            }
        });

        btnHarmadikAjto.setText("3");
        btnHarmadikAjto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnHarmadikAjtoItemStateChanged(evt);
            }
        });

        txtaJatek.setColumns(20);
        txtaJatek.setRows(5);
        jScrollPane2.setViewportView(txtaJatek);

        btnCsere.setText("cserélek");

        btnNemCsere.setText("nem cserélek");

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
                        .addGap(61, 61, 61)
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

    private void btnElsoAjtoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnElsoAjtoItemStateChanged
        kivalasztottKincs();
        jatekKiiras("Választásod: "+(kivalasztottIndex+1));
    }//GEN-LAST:event_btnElsoAjtoItemStateChanged

    private void btnMasodikAjtoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnMasodikAjtoItemStateChanged
        kivalasztottKincs();
        jatekKiiras("Választásod: "+(kivalasztottIndex+1));
    }//GEN-LAST:event_btnMasodikAjtoItemStateChanged

    private void btnHarmadikAjtoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnHarmadikAjtoItemStateChanged
        kivalasztottKincs();
        jatekKiiras("Választásod: "+(kivalasztottIndex+1));
    }//GEN-LAST:event_btnHarmadikAjtoItemStateChanged

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
    private javax.swing.JToggleButton btnUjJatek;
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
