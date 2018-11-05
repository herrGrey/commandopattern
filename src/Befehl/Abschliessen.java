package Befehl;

import Empfaenger.Kassensystem;
import javafx.collections.ObservableList;
import sample.Rechnung;

public class Abschliessen implements RechnungBefehl {

    private Kassensystem kassensystem;

    public Abschliessen(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }

    @Override
    public ObservableList<Rechnung> Rechnungerstellen(String tisch) {
       return kassensystem.Rechnungdrucken(tisch);
    }

    @Override
    public void Bestellen(String essen, String tisch) {

    }

    @Override
    public void Stornieren(String id) {

    }


}
