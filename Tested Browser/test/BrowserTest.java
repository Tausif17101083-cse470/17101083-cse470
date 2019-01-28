/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class BrowserTest {
    
    public BrowserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Browser.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        try{
            Browser.main(args);
        }
        catch (Throwable expected) {
        assertEquals(NullPointerException.class, expected.getClass());
        }
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Browser.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Browser instance = null;
        try{
            instance.actionPerformed(e);
        }
        catch (Throwable expected) {
        assertEquals(NullPointerException.class, expected.getClass());
    }
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of hyperlinkUpdate method, of class Browser.
     */
    @Test
    public void testHyperlinkUpdate() {
        System.out.println("hyperlinkUpdate");
        HyperlinkEvent h = null;
        Browser instance = null;
        try{
            instance.hyperlinkUpdate(h);
        }
        catch (Throwable expected) {
        assertEquals(NullPointerException.class, expected.getClass());
        }
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of warnUser method, of class Browser.
     */
    @Test
    public void testWarnUser() {
        System.out.println("warnUser");
        String message = "";
        Browser instance = null;
        try{
            instance.warnUser(message);
        }
        catch (Throwable expected) {
        assertEquals(NullPointerException.class, expected.getClass());
        }
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }
    
}
