package sample;
/**
Tabellenklasse Objekt wird in die OS-List gespeichert
 @author herrGrey
 @version 1.0
 */
public class Rechnung {
    String id;
    String gericht;
    String preis;
    String tisch;
    /**
    Setter für die ID
    @param id id der Rechnung
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
    Setter für das Gericht
    @param gericht name des Gerichts
     */
    public void setGericht(String gericht) {
        this.gericht = gericht;
    }
    /**
    Setter für den Preis
    @param preis Preis des Gerichts
     */
    public void setPreis(String preis) {
        preis = preis;
    }
    /**
    Setter für die setTisch
    @param tisch Tischnummer
     */
    public void setTisch(String tisch) {
        this.tisch = tisch;
    }
    /**
    Getter für die ID
    @return id Id der Rechnung
     */
    public String getId() {
        return id;
    }
    /**
    Getter für den Gerichtnamen
    @return gericht Gerichtname
     */
    public String getGericht() {
        return gericht;
    }
    /**
   Getter für den Preis des Gerichtes
   @return preis Preis des Gerichts
     */
    public String getPreis() {
        return preis;

    }
    /**
    Getter für die Tischnummer
    @return tisch Tischnummer
     */
    public String getTisch() {
        return tisch;
    }

    /**
     * to String zum ausgeben der Daten in die Tabelle
     * @param id id aus der Rechnungstabelle
     * @param gericht Name des Gerichts
     * @param preis Preis des Gerichts
     * @param tisch tischnummer
     */
    public Rechnung(String id, String gericht, String preis, String tisch) {
        this.id = id;
        this.gericht = gericht;
        this.preis = preis;
        this.tisch = tisch;
    }
}
