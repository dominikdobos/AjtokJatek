package modell;

public class Ajto {
    private boolean nyero;

    public Ajto() {
        this(false);
    }
    
    public Ajto(boolean nyero) {
        this.nyero = nyero;
    }

    public void setNyeroTrue() {
        this.nyero = true;
    }
    
    public boolean isNyero() {
        return nyero;
    }
    
}
