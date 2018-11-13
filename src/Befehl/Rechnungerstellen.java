package Befehl;


import Empfaenger.Kassensystem;
import javafx.collections.ObservableList;
import sample.Rechnung;
/**
 * Konkrete Befehlsklasse für das erstellen einer Rechnungerstellen
 * @author herrGrey
 * @version 1.0
 */
public class Rechnungerstellen implements RechnungBefehl {

    private Kassensystem kassensystem;
/**
Konkreter Befehl wird bekanntgegeben
 @param kassensystem EmpfängerKlasse
 */
    public Rechnungerstellen(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }
/**
Methode zum Rechnungerstellen die das Ergebnis vom Empfänger als OS-List returnt
@param tisch Tischnummer
@return ObservableList Liste der Rechnungen
 */
    @Override
    public ObservableList<sample.Rechnung> Rechnungerstellen(String tisch) {
       return kassensystem.Rechnungdrucken(tisch);
    }


}
