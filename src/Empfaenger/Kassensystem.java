package Empfaenger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Rechnung;
import sample.Singelton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Kassensystem {
    Connection connection = Singelton.getConn();
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
    public void Stornieren(String id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("  DELETE FROM tbl_rechnung WHERE rechnung_id=?;");
            preparedStatement.setString(1, id);
            preparedStatement.execute();
        }catch (Exception exc){
            exc.printStackTrace();
        }






    }


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
