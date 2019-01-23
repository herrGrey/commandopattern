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
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

/** 
* Stornieren Tester. 
* 
* @author <Authors name> 
* @since <pre>Dez 12, 2018</pre> 
* @version 1.0 
*/ 
public class StornierenTest { 
private Kassensystem kassensystem;
private String tisch;
@Before
public void before() throws Exception {
    this.kassensystem = new Kassensystem();
    this.tisch ="21";

} 

@After
public void after() throws Exception {

} 

/** 
* 
* Method: Stornieren(String id) 
* 
*/ 
@Test
public void testStornieren() throws Exception {

}


} 
