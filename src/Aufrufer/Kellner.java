
package Aufrufer;

import Befehl.*;
import javafx.collections.ObservableList;
import sample.Rechnung;

/**
 * Klasse des Befehlsausführer
 * @author herrGrey
 * version 1.0
 */
public class Kellner {

    private RechnungBefehl rechnungBefehl;
    private StornierenBefehl stornierenBefehl;
    private BestellBefehl bestellBefehl;
    private TagesUmsatzBefehl tagesUmsatzBefehl;

    public void setRechnungBefehl(RechnungBefehl rechnungBefehl) {
        this.rechnungBefehl = rechnungBefehl;
    }

    public void setStornierenBefehl(StornierenBefehl stornierenBefehl) {
        this.stornierenBefehl = stornierenBefehl;
    }

    public void setBestellBefehl(BestellBefehl bestellBefehl) {
        this.bestellBefehl = bestellBefehl;
    }

    public void setTagesUmsatzBefehl(TagesUmsatzBefehl tagesUmsatzBefehl) {
        this.tagesUmsatzBefehl = tagesUmsatzBefehl;
    }
    /**
    Setter für den Befehl
     @param oberBefehl Konkreter Befehl
     */


    /**
     * Ruft die Methode Rechnungerstellen erstellen aus dem Konkreten Befehl auf
     * @param tisch Tischnummer
     * @return ObserableList List die in der Tabelle ausgegeben wird
     */
    public ObservableList<Rechnung> Rechnungdrucken(String tisch){
        return rechnungBefehl.Rechnungerstellen(tisch);

    }
    /**
     Ruft die Methode Bestellen aus dem Konkreten Befehl auf
    @param  essen Name des Gerichts
    @param  tisch Tischnummer
     */
    public void Bestellen(String essen, String tisch){
        bestellBefehl.Bestellen(essen,tisch);
    }
    /**
     Ruft die Methode Stornieren aus dem Konkreten Befehl auf
    @param id   Primärschlüssel tbl_rechnung aus der Datenbank
     */
    public void Stornieren(String id){
        stornierenBefehl.Stornieren(id);
    }
    /**
     Ruft die Methode getTagesUmsatz aus dem Konkreten Befehl auf
    @return String
     */
    public String getTagesUmsatz(){
        return tagesUmsatzBefehl.getTagesUmsazt();
    }
}
