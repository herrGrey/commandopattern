package sample;
/**
Singelton Klasse die die Verbindung zur DB aufbaut
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Singelton {
    static Connection conn = null;

    private Singelton(){

    }
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
