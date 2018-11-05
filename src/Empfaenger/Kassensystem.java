package Empfaenger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Rechnung;
import sample.Singelton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
Empfänger Klasse Kassensystem
Hier werden die Methoden ausimplementiert
 */
public class Kassensystem {
    Connection connection = Singelton.getConn();
    /*
    Gibt die Rechnung pro Tisch in eine Tabelle aus

    @param tisch Tischnummer
    @return  ObservableList<Rechnung> Liste die in die Tabelle gespeichert werden
     */
    public ObservableList<Rechnung> Rechnungdrucken(String tisch){
        ObservableList<Rechnung> liste = FXCollections.observableArrayList();
        try {
            ResultSet resultSet;
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT tbl_rechnung.rechnung_id, tbl_gericht.g_name, tbl_gericht.g_preis AS Preis ,tbl_tisch.tisch_name\n" +
                    "FROM tbl_rechnung\n" +
                    "JOIN tbl_gericht ON tbl_rechnung.tbl_gericht_g_id=tbl_gericht.g_id\n" +
                    "JOIN tbl_tisch ON tbl_rechnung.tbl_tisch_tisch_id=tbl_tisch.tisch_id WHERE tbl_tisch.tisch_name =?");
            preparedStatement.setString(1, tisch);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                liste.add(new Rechnung(resultSet.getString("tbl_rechnung.rechnung_id"),
                        resultSet.getString("tbl_gericht.g_name"),resultSet.getString("Preis"),
                        resultSet.getString("tbl_tisch.tisch_name")));
            }


        }catch (Exception exc){
            exc.printStackTrace();
        }

        return liste;
    }
    /*
    Ausgewähltes Essen und Tisch werden in die Rechnungstabelle gespeichert
    @param essen    Gerichtname
    @param tisch    Tischnummer
     */
    public void Bestellen(String essen, String tisch){
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO tbl_rechnung (rechnung_id,tbl_gericht_g_id,tbl_tisch_tisch_id) VALUES (?,?,?);");
            preparedStatement.setString(1, null);
            preparedStatement.setInt(2, getIDGericht(essen));
            preparedStatement.setInt(3, getIDTisch(tisch));
            preparedStatement.execute();


        }catch (Exception exc){
            exc.printStackTrace();
        }

    }
    /*
    Methode die das Ausgewählte Gericht mittels der übergebenen ID aus der Datenbank löscht
    @param id Primärschlüssel der Rechnungstabelle
     */
    public void Stornieren(String id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("  DELETE FROM tbl_rechnung WHERE rechnung_id=?;");
            preparedStatement.setString(1, id);
            preparedStatement.execute();
        }catch (Exception exc){
            exc.printStackTrace();
        }






    }

/*
Gibt die ID des ausgewählten Gericht zurück
@param essen Name des Gerichts
@return int ID des Gerichts in tbl_gerichte
 */
    public int getIDGericht(String essen){
        int essenid = 0;
        try {
            ResultSet resultSet;
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT g_id FROM command.tbl_gericht WHERE g_name = ?;");
            preparedStatement.setString(1, essen);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                essenid = resultSet.getInt("g_id");
            }

        }catch (Exception exc){
            exc.printStackTrace();
        }
        return essenid;

    }
    /*
Gibt die ID des ausgewählten Tisches zurück
@param essen Tischnummer
@return int ID des Tisches in tbl_tisch
 */
    public int getIDTisch(String tisch){
        int tischid =0;
        try {
        ResultSet resultSet;
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT tisch_id FROM command.tbl_tisch WHERE tisch_name = ?;");
        preparedStatement.setString(1, tisch);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            tischid = resultSet.getInt("tisch_id");
        }

    }catch (Exception exc){
        exc.printStackTrace();
    }
        return tischid;
    }
}
