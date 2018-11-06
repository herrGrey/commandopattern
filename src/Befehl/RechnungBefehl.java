package Befehl;
/*
Interface für die verfügbaren Befehle
 */
import javafx.collections.ObservableList;
import sample.Rechnung;

public interface RechnungBefehl extends OberBefehl{
    ObservableList<Rechnung> Rechnungerstellen(String tisch);


}
