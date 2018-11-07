package Befehl;


import Empfaenger.Kassensystem;
import javafx.collections.ObservableList;
import sample.Rechnung;
/**
 * Konkrete Befehlsklasse für das erstellen einer Rechnung
 * @author herrGrey
 * @version 1.0
 */
public class Abschliessen implements RechnungBefehl {

    private Kassensystem kassensystem;
/**
Konkreter Befehl wird bekanntgegeben
 @param kassensystem EmpfängerKlasse
 */
    public Abschliessen(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }
/**
Methode zum Rechnungerstellen die das Ergebnis vom Empfänger als OS-List returnt
@param tisch Tischnummer
@return ObservableList Liste der Rechnungen
 */
    @Override
    public ObservableList<Rechnung> Rechnungerstellen(String tisch) {
       return kassensystem.Rechnungdrucken(tisch);
    }


}
