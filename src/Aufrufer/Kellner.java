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
    Ruft die Methode Rechnungerstellen der Klasse Kasseensystem auf

    @param  tisch Tischnummer
    @return ObservableList<Rechnung>    OS-List die dann in die Tabelle gespeichert wird
     */
    public ObservableList<Rechnung> Rechnungdrucken(String tisch){
       return rechnungBefehl.Rechnungerstellen(tisch);
    }
    /*
    Ruft die Methode Bestellen der Klasse Kassensystem auf
    @param  essen Name des Gerichts
    @param  tisch Tischnummer
     */
    public void Bestellen(String essen, String tisch){
        rechnungBefehl.Bestellen(essen,tisch);
    }
    /*
    Ruft die Methode Stornieren aus der Kassensystem Klasse auf
    @param id   Primärschlüssel tbl_rechnung aus der Datenbank
     */
    public void Stornieren(String id){
        rechnungBefehl.Stornieren(id);
    }
}
