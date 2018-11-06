package Befehl;
/**
 * Konkrete Befehlsklasse für den Bestellvorgang
 */

import Empfaenger.Kassensystem;
import javafx.collections.ObservableList;
import sample.Rechnung;

public class Bestellvorgang implements BestellBefehl {
    private Kassensystem kassensystem;

    public Bestellvorgang(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }


    /**
    Methode zum Bestellen die das Ergebnis vom Empfänger in die Datenbank speichert
    @param tisch Tischnummer

 */
    @Override
    public void Bestellen(String essen, String tisch) {
        kassensystem.Bestellen(essen,tisch);
    }



}
