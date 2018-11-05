package Aufrufer;

import Befehl.RechnungBefehl;
import javafx.collections.ObservableList;
import sample.Rechnung;

public class Kellner {
    private RechnungBefehl rechnungBefehl;

    /*
    Setter für den Rechnnungsbefehl
     */
    public void setRechnungBefehl (RechnungBefehl rechnungBefehl){
        this.rechnungBefehl = rechnungBefehl;
    }

    /*
    Methode zum Rechunungdrucken

    @param  tisch Tischnummer
    @return ObservableList<Rechnung>    OS-List die dann in die Tabelle gespeichert wird
     */

    public ObservableList<Rechnung> Rechnungdrucken(String tisch){
       return rechnungBefehl.Rechnungerstellen(tisch);
    }
    /*
    Methode zum Bestellen von Speißen
    @param  essen Name des Gerichts
    @param  tisch Tischnummer
     */
    public void Bestellen(String essen, String tisch){
        rechnungBefehl.Bestellen(essen,tisch);
    }
    /*
    Methode zum Stornieren von Bestellungen
    @param id   Primärschlüssel tbl_rechnung aus der Datenbank
     */
    public void Stornieren(String id){
        rechnungBefehl.Stornieren(id);
    }
}
