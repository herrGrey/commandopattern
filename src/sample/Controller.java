package sample;
/*
Controller Klasse zum Steuern der GUI Elemente
 */

import Befehl.Abschliessen;
import Befehl.Bestellvorgang;
import Befehl.Stornieren;
import Aufrufer.Kellner;
import Empfaenger.Kassensystem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.ResultSet;

public class Controller {

    Connection connection = Singelton.getConn();
    @FXML private ListView<String> gerichte;
    @FXML private ListView<String> tische;
    @FXML private TableView<Rechnung> table;
    @FXML private TableColumn<Rechnung, String>id;
    @FXML private TableColumn<Rechnung, String>gericht;
    @FXML private TableColumn<Rechnung, String>preis;
    @FXML private TableColumn<Rechnung, String>tisch;

/*
  gerichte aus der Datenbank in die ListView gerichte speichern

 */
    public void gerichteLaden(){
        try {
            gerichte.getItems().clear();
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT g_name FROM tbl_gericht");
            while (resultSet.next()) {
                gerichte.getItems().add(resultSet.getString("g_name"));
            }

        }catch (Exception exc){
            exc.printStackTrace();
        }
        tischeLaden();


    }
    /*
    Tische aus der Datenbank in die ListView speichern
     */
    public void tischeLaden(){
        try {
            tische.getItems().clear();
            ResultSet resultSet = connection.createStatement().executeQuery("SELECT tisch_name FROM tbl_tisch");
            while (resultSet.next()) {
                tische.getItems().add(resultSet.getString("tisch_name"));
            }

        }catch (Exception exc){
            exc.printStackTrace();
        }
    }
    /*
    Methode die die Rechnung pro Tisch in die Tabelle schreibt
     */
    public void Rechnungdrucken(){


        Kassensystem kassensystem = new Kassensystem();
        Kellner kellner = new Kellner();
        kellner.setOberBefehl(new Abschliessen(kassensystem));
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        gericht.setCellValueFactory(new PropertyValueFactory<>("gericht"));
        preis.setCellValueFactory(new PropertyValueFactory<>("preis"));
        tisch.setCellValueFactory(new PropertyValueFactory<>("tisch"));
        table.setItems(kellner.Rechnungdrucken(tische.getSelectionModel().getSelectedItem()));

    }
    /*
    Methode zum Bestellen neuer Gerichte
     */
    public void Bestellen(){
        Kassensystem kassensystem = new Kassensystem();
        Kellner kellner1 = new Kellner();
        kellner1.setOberBefehl(new Bestellvorgang(kassensystem));
        kellner1.Bestellen(gerichte.getSelectionModel().getSelectedItem(),tische.getSelectionModel().getSelectedItem());
    }
    /*
    Methode zum Stornieren ausgewählter Gerichte
     */
    public void Stornieren(){
        Kassensystem kassensystem = new Kassensystem();
        Kellner kellner = new Kellner();
        kellner.setOberBefehl(new Stornieren(kassensystem));
        kellner.Stornieren(table.getSelectionModel().getSelectedItem().getId());
    }

    }


