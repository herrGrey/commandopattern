package Befehl;

import Empfaenger.Kassensystem;
import javafx.collections.ObservableList;
import sample.Rechnung;

public class Stornieren implements StornierenBefehl{
    private Kassensystem kassensystem;

    public Stornieren(Kassensystem kassensystem) {
        this.kassensystem = kassensystem;
    }

/*
Stornieren Methode aus der Empfänger Klasse wird aufgerufen
 */
    @Override
    public void Stornieren(String id) {
        kassensystem.Stornieren(id);
    }


}
