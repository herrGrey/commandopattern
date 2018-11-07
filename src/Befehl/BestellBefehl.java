package Befehl;

/**
 Befehls Interface zum Bestellen eines Gerichts
 @author herrGrey
 @version 1.0
 */
public interface BestellBefehl extends OberBefehl{
    void Bestellen(String essen, String tisch);
}
