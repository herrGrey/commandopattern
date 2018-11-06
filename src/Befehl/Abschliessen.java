package Befehl;
/**
 * Konkrete Befehlsklasse für das erstellen einer Rechnung
 */

import Empfaenger.Kassensystem;
import javafx.collections.ObservableList;
import sample.Rechnung;

public class Abschliessen implements RechnungBefehl {

    private Kassensystem kassensystem;
/**
Konkreter Befehl wird bekanntgegeben
 @param kassensystem
 */
    public Abschliessen(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }
/**
Methode zum Rechnungerstellen die das Ergebnis vom Empfänger als OS-List returnt
@param tisch Tischnummer
@return ObservableList rechnungen Liste der Rechnungen
 */
    @Override
    public ObservableList<Rechnung> Rechnungerstellen(String tisch) {
       return kassensystem.Rechnungdrucken(tisch);
    }


}
