package no.hvl.dat109;

import java.util.Random;

public class Terning {
    private int verdi;

   /* Oppretter terning */
    public Terning() {
        this.verdi = 0;
    }

    /**
     * Trille funksjon med logikk.
     */
    public void trill() {
        Random random = new Random();
        this.verdi = random.nextInt(6) + 1;
    }

    public int getVerdi() {
        return verdi;
    }

    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }
    
}