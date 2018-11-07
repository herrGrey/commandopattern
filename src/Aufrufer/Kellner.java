
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

    private OberBefehl oberBefehl;


    /**
    Setter für den Befehl
     @param oberBefehl Konkreter Befehl
     */
    public void setOberBefehl (OberBefehl oberBefehl){
        this.oberBefehl = oberBefehl;
    }

    /**
     * Ruft die Methode Rechnung erstellen aus dem Konkreten Befehl auf
     * @param tisch Tischnummer
     * @return ObserableList List die in der Tabelle ausgegeben wird
     */
    public ObservableList<Rechnung> Rechnungdrucken(String tisch){
        if (oberBefehl instanceof Abschliessen){
            return ((Abschliessen) oberBefehl).Rechnungerstellen(tisch);
        }
        return null;
    }
    /**
     Ruft die Methode Bestellen aus dem Konkreten Befehl auf
    @param  essen Name des Gerichts
    @param  tisch Tischnummer
     */
    public void Bestellen(String essen, String tisch){
       if (oberBefehl instanceof Bestellvorgang){
           ((Bestellvorgang) oberBefehl).Bestellen(essen,tisch);
       }
    }
    /**
     Ruft die Methode Stornieren aus dem Konkreten Befehl auf
    @param id   Primärschlüssel tbl_rechnung aus der Datenbank
     */
    public void Stornieren(String id){
        if (oberBefehl instanceof Stornieren){
            ((Stornieren) oberBefehl).Stornieren(id);
        }
    }
    /**
     Ruft die Methode getTagesUmsatz aus dem Konkreten Befehl auf
    @return String
     */
    public String getTagesUmsatz(){
        if (oberBefehl instanceof TagesUmsatz){
           return  ((TagesUmsatz) oberBefehl).getTagesUmsazt();
        }
        return null;
    }
}
