/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package logica;

import datos.IngresoMoto;
import datos.SalidaMoto;
import java.util.Date;
import java.util.Timer;
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
public class RegistroMotoTest {
    
    public RegistroMotoTest() {
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
     * Test of registrarMoto method, of class RegistroMoto.
     */
    @Test
    public void testRegistrarMoto() {
        System.out.println("registrarMoto");
        String placa = "";
        Date fecha = null;
        Timer hora = null;
        String identificacion = "";
        RegistroMoto instance = new RegistroMoto();
        IngresoMoto expResult = null;
        IngresoMoto result = instance.registrarMoto(placa, fecha, hora, identificacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salidaMoto method, of class RegistroMoto.
     */
    @Test
    public void testSalidaMoto() {
        System.out.println("salidaMoto");
        String placa = "";
        RegistroMoto instance = new RegistroMoto();
        SalidaMoto expResult = null;
        SalidaMoto result = instance.salidaMoto(placa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
