package Befehl;


import javafx.collections.ObservableList;
import sample.Rechnung;

public interface RechnungBefehl extends OberBefehl{
    ObservableList<Rechnung> Rechnungerstellen(String tisch);


}
