package Befehl;

import empfaenger.Kassensystem;
import javafx.collections.ObservableList;
import sample.Rechnung;

public class Stornieren implements RechnungBefehl{
    private Kassensystem kassensystem;

    public Stornieren(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }

    @Override
    public ObservableList<Rechnung> Rechnungerstellen(String tisch) {
        return null;
    }

    @Override
    public void Bestellen(String essen, String tisch) {

    }

    @Override
    public void Stornieren(String id) {
        kassensystem.Stornieren(id);
    }
}
