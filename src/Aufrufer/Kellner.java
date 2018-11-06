
package Aufrufer;

import Befehl.*;
import javafx.collections.ObservableList;
import sample.Rechnung;

public class Kellner {

    private OberBefehl oberBefehl;


    /**
    Setter für den Befehl
     */
    public void setOberBefehl (OberBefehl oberBefehl){
        this.oberBefehl = oberBefehl;
    }

    /**
     * Ruft die Methode Rechnung erstellen aus dem Konkreten Befehl auf
     * @param tisch
     * @return ObserableList
     */

    public ObservableList<Rechnung> Rechnungdrucken(String tisch){
        if (oberBefehl instanceof Abschliessen){
            return ((Abschliessen) oberBefehl).Rechnungerstellen(tisch);
        }
        return null;
    }
    /**
    Methode zum Bestellen von Speißen
    @param  essen Name des Gerichts
    @param  tisch Tischnummer
     */
    public void Bestellen(String essen, String tisch){
       if (oberBefehl instanceof Bestellvorgang){
           ((Bestellvorgang) oberBefehl).Bestellen(essen,tisch);
       }
    }
    /**
    Methode zum Stornieren von Bestellungen
    @param id   Primärschlüssel tbl_rechnung aus der Datenbank
     */
    public void Stornieren(String id){
        if (oberBefehl instanceof Stornieren){
            ((Stornieren) oberBefehl).Stornieren(id);
        }
    }
    /**
    Methode zum Ausgeben des Umsatzes
    @return String
     */
    public String getTagesUmsatz(){
        if (oberBefehl instanceof TagesUmsatz){
           return  ((TagesUmsatz) oberBefehl).getTagesUmsazt();
        }
        return null;
    }
}
