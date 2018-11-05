package aufrufer;

import Befehl.RechnungBefehl;
import javafx.collections.ObservableList;
import sample.Rechnung;

import java.util.ArrayList;

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

    @param tisch Tischnummer
    @return ObservableList<Rechnung> OS-List die dann in die Tabelle gespeichert wird
     */
    public ObservableList<Rechnung> Rechnungdrucken(String tisch){
       return rechnungBefehl.Rechnungerstellen(tisch);
    }
    /*
    Ruft die Methode Bestellen der Klasse Kassensystem auf
    @param essen Name des Gerichts
    @param tisch Tischnummer
     */
    public void Bestellen(String essen, String tisch){
        rechnungBefehl.Bestellen(essen,tisch);
    }
    public void Stornieren(String id){
        rechnungBefehl.Stornieren(id);
    }
}
