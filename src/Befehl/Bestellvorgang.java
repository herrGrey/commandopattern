package Befehl;

import empfaenger.Kassensystem;
import javafx.collections.ObservableList;
import sample.Rechnung;

import java.util.ArrayList;

public class Bestellvorgang implements RechnungBefehl {
    private Kassensystem kassensystem;

    public Bestellvorgang(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }
    @Override
    public ObservableList<Rechnung> Rechnungerstellen(String tisch) {
        return null;
    }

    @Override
    public void Bestellen(String essen, String tisch) {
        kassensystem.Bestellen(essen,tisch);
    }

    @Override
    public void Stornieren(String id) {

    }

}
