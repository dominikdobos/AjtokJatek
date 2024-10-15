package modell;

public class Statisztika {
    private int nyeresekSzama;
    private int cserekSzama;

    public Statisztika() {
        cserekSzama = 0;
        nyeresekSzama = 0;
    }
    
    public Statisztika(int nyeresekSzama, int cserekSzama) {
        this.nyeresekSzama = nyeresekSzama;
        this.cserekSzama = cserekSzama;
    }

    public int getNyeresekSzama() {
        return nyeresekSzama;
    }

    public void setNyeresekSzama(int nyeresekSzama) {
        this.nyeresekSzama = nyeresekSzama;
    }

    public int getCserekSzama() {
        return cserekSzama;
    }

    public void setCserekSzama(int cserekSzama) {
        this.cserekSzama = cserekSzama;
    }
    
    
}
