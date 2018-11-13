package Befehl;


import javafx.collections.ObservableList;
import sample.Rechnung;
/**
Befehls Interface zum Rechnungerstellen
 @author herrGrey
 @version 1.0
 */
public interface RechnungBefehl {
    ObservableList<Rechnung> Rechnungerstellen(String tisch);


}
