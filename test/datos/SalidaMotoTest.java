/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package datos;

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
public class SalidaMotoTest {
    
    public SalidaMotoTest() {
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
     * Test of calcularPrecio method, of class SalidaMoto.
     */
    @Test
    public void testCalcularPrecio() {
        System.out.println("calcularPrecio");
        int numMinutos = 0;
        double expResult = 0.0;
        double result = SalidaMoto.calcularPrecio(numMinutos);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPlaca method, of class SalidaMoto.
     */
    @Test
    public void testObtenerPlaca() {
        System.out.println("obtenerPlaca");
        SalidaMoto instance = new SalidaMoto();
        String expResult = "";
        String result = instance.obtenerPlaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPlaca method, of class SalidaMoto.
     */
    @Test
    public void testModificarPlaca() {
        System.out.println("modificarPlaca");
        String placa = "";
        SalidaMoto instance = new SalidaMoto();
        instance.modificarPlaca(placa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumarCupo method, of class SalidaMoto.
     */
    @Test
    public void testSumarCupo() {
        System.out.println("sumarCupo");
        int expResult = 0;
        int result = SalidaMoto.sumarCupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SalidaMoto.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SalidaMoto.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
