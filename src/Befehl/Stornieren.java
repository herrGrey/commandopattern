package Befehl;


import Empfaenger.Kassensystem;

/**
 * Konkreter BefehlsKlasse für das Stornieren
 * @author herrGrey
 * @version 1.0
 */
public class Stornieren implements StornierenBefehl{
    private Kassensystem kassensystem;
/**
Konkreter Befehl wird bekanntgegeben
 @param kassensystem EmpfängerKlasse
 */
    public Stornieren(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }

/**
Stornieren Methode aus der Empfänger Klasse wird aufgerufen
 @param id id aus der Rechnungstabelle
 */
    @Override
    public void Stornieren(String id) {
        kassensystem.Stornieren(id);
    }


}
