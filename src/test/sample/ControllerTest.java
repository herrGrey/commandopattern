package test.sample; 

import Aufrufer.Kellner;
import Befehl.Bestellvorgang;
import Befehl.RechnungBefehl;
import Befehl.Rechnungerstellen;
import Empfaenger.Kassensystem;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import static org.junit.Assert.*;

import sample.Controller;
import sample.Rechnung;
import sample.Singelton;

import java.sql.ResultSet;
import java.sql.Statement;

/** 
* Controller Tester. 
* 
* @author <Authors name> 
* @since <pre>Dez 11, 2018</pre> 
* @version 1.0 
*/ 
public class ControllerTest {
    private Statement statement;

@Before
public void before() throws Exception {
    this.statement = Singelton.getConn().createStatement();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: gerichteLaden() 
* 
*/ 
@Test
public void testGerichteLaden() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: tischeLaden() 
* 
*/ 
@Test
public void testTischeLaden() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: Rechnungdrucken() 
* 
*/ 
@Test
public void testRechnungdrucken() throws Exception {


} 

/** 
* 
* Method: Bestellen() 
* 
*/ 
@Test
public void testBestellen() throws Exception {

} 

/** 
* 
* Method: Stornieren() 
* 
*/

@Test
public void testStornieren() throws Exception {

} 

/** 
* 
* Method: getUmsatz() 
* 
*/ 
@Test
public void testGetUmsatz() throws Exception { 
    try {

        ResultSet set = statement.executeQuery("SELECT SUM(tbl_gericht.g_preis)AS Preis\n" +
                "                    FROM tbl_rechnung\n" +
                "                    JOIN tbl_gericht ON tbl_rechnung.tbl_gericht_g_id=tbl_gericht.g_id");

        assertTrue(set.next());
        assertTrue(57==set.getInt("Preis"));
    }catch (Exception exc){
        exc.printStackTrace();
    }
}


} 
