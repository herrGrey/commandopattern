package Befehl;

import Empfaenger.Kassensystem;

/**
 * Konkreter Befehl zum berechnen des Tagesumsatzes
 * @author herrGrey
 * @version 1.0
 */
public class TagesUmsatz implements TagesUmsatzBefehl {
    private Kassensystem kassensystem;
    public TagesUmsatz(Kassensystem kassensystem){
        this.kassensystem = kassensystem;
    }
    /**
    gibt das Ergebnis der getTagesUmsatz aus der Empfänger Klasse zurück
    @return String Umsatz
     */
    @Override
    public String getTagesUmsazt() {
        return kassensystem.getTagesUmsatz();
    }
}
