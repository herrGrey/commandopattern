package Befehl;

import javafx.collections.ObservableList;
import sample.Rechnung;

import java.util.ArrayList;

public interface RechnungBefehl {
    ObservableList<Rechnung> Rechnungerstellen(String tisch);
    void Bestellen(String essen, String tisch);
    void Stornieren(String id);
}
