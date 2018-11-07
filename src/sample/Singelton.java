package sample;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 Singelton Klasse die die Verbindung zur DB aufbaut
 @author herrGrey
 @version 1.0
 */
public class Singelton {
    static Connection conn = null;

    private Singelton(){

    }

    /**
     * Gibt die Verbindung zurück
     * @return conn Verbindung zur Datenbank
     */
    public static Connection getConn(){
        try {
            if(conn == null){
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/command" , "root", "");

            }
        }catch(Exception exc){
            exc.printStackTrace();
        }
        return conn;
    }
}
