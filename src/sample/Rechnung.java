package sample;

public class Rechnung {
    String id;
    String gericht;
    String Preis;
    String tisch;

    public void setId(String id) {
        this.id = id;
    }

    public void setGericht(String gericht) {
        this.gericht = gericht;
    }

    public void setPreis(String preis) {
        Preis = preis;
    }

    public void setTisch(String tisch) {
        this.tisch = tisch;
    }

    public String getId() {
        return id;
    }

    public String getGericht() {
        return gericht;
    }

    public String getPreis() {
        return Preis;
    }

    public String getTisch() {
        return tisch;
    }

    public Rechnung(String id, String gericht, String preis, String tisch) {
        this.id = id;
        this.gericht = gericht;
        Preis = preis;
        this.tisch = tisch;
    }
}
