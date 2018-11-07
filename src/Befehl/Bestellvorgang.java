package Befehl;


import Empfaenger.Kassensystem;

/**
 * Konkrete Befehlsklasse für den Bestellvorgang
 * @author herrGrey
 * @version 1.0
 */
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
