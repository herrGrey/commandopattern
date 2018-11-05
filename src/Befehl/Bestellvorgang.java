package Befehl;

import Empfaenger.Kassensystem;
import javafx.collections.ObservableList;
import sample.Rechnung;

public class Bestellvorgang implements RechnungBefehl {
    private Kassensystem kassensystem;

    public Bestellvorgang(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }

    @Override
    public ObservableList<Rechnung> Rechnungerstellen(String tisch) {
        return null;
    }
    /*
    Methode zum Bestellen die das Ergebnis vom Empfänger in die Datenbank speichert
    @param tisch Tischnummer

 */
    @Override
    public void Bestellen(String essen, String tisch) {
        kassensystem.Bestellen(essen,tisch);
    }

    @Override
    public void Stornieren(String id) {

    }

}
