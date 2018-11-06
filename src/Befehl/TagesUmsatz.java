package Befehl;

import Empfaenger.Kassensystem;

public class TagesUmsatz implements TagesUmsatzBefehl {
    private Kassensystem kassensystem;
    public TagesUmsatz(Kassensystem kassensystem){
        this.kassensystem = kassensystem;
    }
    /**
    gibt das Ergebnis der getTagesUmsatz aus der Empfänger Klasse zurück
    @return String
     */
    @Override
    public String getTagesUmsazt() {
        return kassensystem.getTagesUmsatz();
    }
}
