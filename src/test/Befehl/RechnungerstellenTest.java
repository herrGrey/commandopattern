package test.Befehl; 

import Empfaenger.Kassensystem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import sample.Rechnung;
import org.hamcrest.collection.IsEmptyCollection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
        import static org.hamcrest.Matchers.hasProperty;
        import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;


import static org.junit.Assert.*;

/** 
* Rechnungerstellen Tester. 
* 
* @author <Authors name> 
* @since <pre>Dez 11, 2018</pre> 
* @version 1.0 
*/ 
public class RechnungerstellenTest { 
private Kassensystem kassensystem;
@Before
public void before() throws Exception {
    this.kassensystem = new Kassensystem();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: Rechnungerstellen(String tisch) 
* 
*/ 
@Test
public void testRechnungerstellen() throws Exception { 
   Kassensystem kassensystem = new Kassensystem();
   assertThat(kassensystem.Rechnungdrucken("21"), containsInAnyOrder(
           hasProperty("gericht", is("Pizza")),
           hasProperty("gericht", is("Burger")),
           hasProperty("gericht", is("Burger"))
   ));
   assertThat(kassensystem.Rechnungdrucken("21"),hasSize(3));

}


} 
