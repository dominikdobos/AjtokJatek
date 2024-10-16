package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import modell.Jatekter;
import modell.Statisztika;
import nezet.AjtokGUI;

public class Vezerlo {

    private Jatekter modell;
    private AjtokGUI nezet;
    private Statisztika stat;

    public Vezerlo(Jatekter modell, AjtokGUI nezet) {
        this.modell = modell;
        this.nezet = nezet;
        this.stat = new Statisztika();

        csereGombAllapot(false);
        guiBeallitas();
        esemenyek();
    }

    public void esemenyek() {
        ujJatek();
        ajtoValasztas();
        csereEldontes();
    }

    private void ajtoValasztas() {
        JToggleButton elsoAjto = nezet.getElsoAjto();
        JToggleButton masodikAjto = nezet.getMasodikAjto();
        JToggleButton harmadikAjto = nezet.getHarmadikAjto();

        this.valasztEsemeny(elsoAjto, 0);
        this.valasztEsemeny(masodikAjto, 1);
        this.valasztEsemeny(harmadikAjto, 2);
    }

    private void ajtoFelfedez(int ajtoSzama) {
        int felfedezett = modell.felfedezettKivalaszt(ajtoSzama);
        nezet.felfedezKiir(felfedezett);
    }

    private void valasztEsemeny(JToggleButton ajto, int ajtoSzama) {
        ajto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (modell.isCsereEldont() == false) {
                    csereGombAllapot(true);
                    modell.setKivalasztottAjto(ajtoSzama);
                    nezet.kivalasztottKiir(ajtoSzama, modell.isCsereEldont());
                    ajtokValaszthatoak(false);
                    ajtoFelfedez(ajtoSzama);
                } else {
                    ajtokValaszthatoak(false);
                    modell.setKivalasztottAjto(ajtoSzama);
                    nezet.kivalasztottKiir(ajtoSzama, modell.isCsereEldont());
                    if (modell.getKivalasztottAjto() == modell.nyeroValaszt()) {
                        stat.setNyeresekSzama(stat.getNyeresekSzama() + 1);
                        nezet.statKiir(stat.getCserekSzama(), stat.getNyeresekSzama());
                    }

                    nezet.ajtokMitRejtKiir(modell.ajtokMogott());
                }
            }
        });
    }
    
    

    private void csereEldontes() {
        JButton csere = nezet.getCserelGomb();
        JButton nemCsere = nezet.getNemCserelGomb();

        csere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stat.setCserekSzama(stat.getCserekSzama() + 1);
                modell.setCsereEldont(true);
                nezet.csereKiir(true);
                csereGombAllapot(false);
                ajtokValaszthatoak(true);
                JToggleButton[] ajtok = nezet.getAjtok();
                ajtok[modell.getKivalasztottAjto()].setEnabled(false);
                ajtok[modell.getKivalasztottAjto()].setSelected(false);
            }
        });
        nemCsere.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nezet.csereKiir(false);
                modell.setCsereEldont(false);
                csereGombAllapot(false);

                if (modell.getKivalasztottAjto() == modell.nyeroValaszt()) {
                    stat.setNyeresekSzama(stat.getNyeresekSzama() + 1);
                }
                
                nezet.statKiir(stat.getCserekSzama(), stat.getNyeresekSzama());
                nezet.ajtokMitRejtKiir(modell.ajtokMogott());
            }
        });
    }

    
    
    public void csereGombAllapot(boolean allapot) {
        JButton csere = nezet.getCserelGomb();
        JButton nemCsere = nezet.getNemCserelGomb();
        csere.setEnabled(allapot);
        nemCsere.setEnabled(allapot);
    }

    private void ajtokValaszthatoak(boolean allapot) {
        JToggleButton elsoAjto = nezet.getElsoAjto();
        JToggleButton masodikAjto = nezet.getMasodikAjto();
        JToggleButton harmadikAjto = nezet.getHarmadikAjto();

        elsoAjto.setEnabled(allapot);
        masodikAjto.setEnabled(allapot);
        harmadikAjto.setEnabled(allapot);
    }

    private void ujJatek() {
        JButton ujJatekGomb = nezet.getUjJatek();
        ujJatekGomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ajtokValaszthatoak(true);
                modell.setCsereEldont(false);
                nezet.jatekAlap();
                csereGombAllapot(false);
            }
        });
    }

    private void guiBeallitas() {
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
            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjtokGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nezet.setVisible(true);
            }
        });
    }
}
