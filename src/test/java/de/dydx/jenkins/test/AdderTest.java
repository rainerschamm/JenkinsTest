/*
 * AdderTest.java
 * 
 * Created on 10 February 2013, 14:33
 * 
 * Defines a class used to ...
 * 
 */
package de.dydx.jenkins.test;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rschamm
 */
public class AdderTest
{
   
   public AdderTest()
   {
   }
   
   @BeforeClass
   public static void setUpClass()
   {
   }
   
   @AfterClass
   public static void tearDownClass()
   {
   }
   
   @Before
   public void setUp()
   {
   }
   
   @After
   public void tearDown()
   {
   }

   /**
    * Test of add method, of class Adder.
    */
   @Test
   public void testAdd()
   {
      System.out.println("add");
      int x = 2;
      int y = 3;
      Adder instance = new Adder();
      int expResult = 5;
      int result = instance.add(x, y);
      assertEquals(expResult, result);
   }
}
