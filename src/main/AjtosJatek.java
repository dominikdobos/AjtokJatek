package main;

import modell.Jatekter;
import nezet.AjtokGUI;
import vezerlo.Vezerlo;

public class AjtosJatek {
    public static void main(String[] args) {
        Jatekter modell = new Jatekter();
        AjtokGUI nezet = new AjtokGUI();
        
        new Vezerlo(modell, nezet);
    }
}
