/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package grafica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JEISSON VARGAS
 */
public class VentanaTest {
    
    public VentanaTest() {
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
     * Test of main method, of class Ventana.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ventana.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarMoto method, of class Ventana.
     */
    @Test
    public void testRegistrarMoto() {
        System.out.println("registrarMoto");
        Ventana instance = new Ventana();
        instance.registrarMoto();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salidaMotoo method, of class Ventana.
     */
    @Test
    public void testSalidaMotoo() {
        System.out.println("salidaMotoo");
        Ventana instance = new Ventana();
        instance.salidaMotoo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of habilitar method, of class Ventana.
     */
    @Test
    public void testHabilitar() {
        System.out.println("habilitar");
        Ventana instance = new Ventana();
        instance.habilitar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
