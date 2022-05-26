/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package datos;

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
public class IngresoMotoTest {
    
    public IngresoMotoTest() {
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
     * Test of obtenerPlaca method, of class IngresoMoto.
     */
    @Test
    public void testObtenerPlaca() {
        System.out.println("obtenerPlaca");
        IngresoMoto instance = new IngresoMoto();
        String expResult = "";
        String result = instance.obtenerPlaca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPlaca method, of class IngresoMoto.
     */
    @Test
    public void testModificarPlaca() {
        System.out.println("modificarPlaca");
        String placa = "";
        IngresoMoto instance = new IngresoMoto();
        instance.modificarPlaca(placa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerFecha method, of class IngresoMoto.
     */
    @Test
    public void testObtenerFecha() {
        System.out.println("obtenerFecha");
        IngresoMoto instance = new IngresoMoto();
        Date expResult = null;
        Date result = instance.obtenerFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarFecha method, of class IngresoMoto.
     */
    @Test
    public void testModificarFecha() {
        System.out.println("modificarFecha");
        Date fecha = null;
        IngresoMoto instance = new IngresoMoto();
        instance.modificarFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerHora method, of class IngresoMoto.
     */
    @Test
    public void testObtenerHora() {
        System.out.println("obtenerHora");
        IngresoMoto instance = new IngresoMoto();
        Timer expResult = null;
        Timer result = instance.obtenerHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarHora method, of class IngresoMoto.
     */
    @Test
    public void testModificarHora() {
        System.out.println("modificarHora");
        Timer hora = null;
        IngresoMoto instance = new IngresoMoto();
        instance.modificarHora(hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerIdentificacion method, of class IngresoMoto.
     */
    @Test
    public void testObtenerIdentificacion() {
        System.out.println("obtenerIdentificacion");
        IngresoMoto instance = new IngresoMoto();
        String expResult = "";
        String result = instance.obtenerIdentificacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarIdentificacion method, of class IngresoMoto.
     */
    @Test
    public void testModificarIdentificacion() {
        System.out.println("modificarIdentificacion");
        String identificacion = "";
        IngresoMoto instance = new IngresoMoto();
        instance.modificarIdentificacion(identificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restarCupo method, of class IngresoMoto.
     */
    @Test
    public void testRestarCupo() {
        System.out.println("restarCupo");
        int expResult = 0;
        int result = IngresoMoto.restarCupo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
