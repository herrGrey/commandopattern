package sample;
/**
Tabellenklasse Objekt wird in die OS-List gespeichert
 */
public class Rechnung {
    String id;
    String gericht;
    String preis;
    String tisch;
    /**
    Setter für die ID
    @param id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
    Setter für das Gericht
    @param gericht
     */
    public void setGericht(String gericht) {
        this.gericht = gericht;
    }
    /**
    Setter für den Preis
    @param preis
     */
    public void setPreis(String preis) {
        preis = preis;
    }
    /**
    Setter für die setTisch
    @param tisch
     */
    public void setTisch(String tisch) {
        this.tisch = tisch;
    }
    /**
    Getter für die ID
    return id Id der Rechnung
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
     * @param id
     * @param gericht
     * @param preis
     * @param tisch
     */
    public Rechnung(String id, String gericht, String preis, String tisch) {
        this.id = id;
        this.gericht = gericht;
        this.preis = preis;
        this.tisch = tisch;
    }
}
