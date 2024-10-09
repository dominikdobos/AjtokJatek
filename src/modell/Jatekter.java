package modell;

import java.util.Random;
public class Jatekter {
    private static Random rnd = new Random();
    
    private Ajto[] ajtok;
    
    public Jatekter() {
        ajtokGeneral(3);
    }
    
    private void ajtokGeneral(int ajtokSzama) {
        this.ajtok = new Ajto[ajtokSzama];
        for (int i = 0; i < ajtokSzama; i++) {
            ajtok[i] = new Ajto();
        }
        
        int nyertesAjtoIndex = rnd.nextInt(0, ajtokSzama);
        ajtok[nyertesAjtoIndex].setNyeroTrue();
    }
}
