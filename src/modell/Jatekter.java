package modell;

import java.util.Random;
public class Jatekter {
    private static Random rnd = new Random();
    
    private Ajto[] ajtok;
    private int kivalasztottAjto;
    private int felfedezett;
    private boolean csereEldont;
    private int nyertesIndex;
    
    public Jatekter() {
        ajtokGeneral(3);
    }
    
    private void ajtokGeneral(int ajtokSzama) {
        this.ajtok = new Ajto[ajtokSzama];
        for (int i = 0; i < ajtokSzama; i++) {
            ajtok[i] = new Ajto();
        }
    }
    
    public int felfedezettKivalaszt(int kivalasztottAjto) {
        // felfedez egy olyan ajtót ami nem a kiválasztott ajtó
        do {
            felfedezett = rnd.nextInt(0,3);
        } while (felfedezett == kivalasztottAjto);
        
        return felfedezett;
    }
    
    public int nyeroValaszt() {
        // eldöntjuk a nyertest, a felfedezett nem lehet nyertes
        do {
            nyertesIndex = rnd.nextInt(0,3);
        } while (nyertesIndex == felfedezett);
        
        return nyertesIndex;
    }
    
    public boolean[] ajtokMogott() {
        boolean[] tomb = new boolean[3];
        
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = false;
        }
        tomb[nyertesIndex] = true;
        
        return tomb;
    }

    public void setKivalasztottAjto(int kivalasztottAjto) {
        this.kivalasztottAjto = kivalasztottAjto;
    }

    public int getKivalasztottAjto() {
        return kivalasztottAjto;
    }

    public boolean isCsereEldont() {
        return csereEldont;
    }

    public void setCsereEldont(boolean csereEldont) {
        this.csereEldont = csereEldont;
    }
}
