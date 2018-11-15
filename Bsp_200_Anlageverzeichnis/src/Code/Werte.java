
package Code;

public enum Werte {
    BEZEICHNUNG("Bezeichnung"), AK("Ak"), INBETRIEBNAHME("Innbetriebnahme"), ND("Nd"), BISHND("Bis Nd"),
            AFABISHER("AfA Bisher"), WERTVOR("Wert Vor"), AFADJ("AfA DJ"), BW31("BW31");
            
    private String name;

    private Werte(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
}
