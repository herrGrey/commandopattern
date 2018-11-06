package Befehl;
/**
 * Konkreter BefehlsKlasse für das Stornieren
 */

import Empfaenger.Kassensystem;


public class Stornieren implements StornierenBefehl{
    private Kassensystem kassensystem;
/**
Konkreter Befehl wird bekanntgegeben
 @param kassensystem
 */
    public Stornieren(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }

/**
Stornieren Methode aus der Empfänger Klasse wird aufgerufen
 @param id
 */
    @Override
    public void Stornieren(String id) {
        kassensystem.Stornieren(id);
    }


}
