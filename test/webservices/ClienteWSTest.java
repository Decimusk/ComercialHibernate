/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ing. Guillermo Pérez
 */
public class ClienteWSTest {
    
    public ClienteWSTest() {
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
     * Test of IngresarCliente method, of class ClienteWS.
     */
    @Test
    public void testIngresarCliente() {
        System.out.println("IngresarCliente");
        String Cli_Id = "";
        String Cli_Apellidos = "";
        String Cli_Nombres = "";
        String Cli_NombreCompleto = "";
        String Cli_Direccion = "";
        String Cli_Ciudad = "";
        String Cli_Telefono = "";
        ClienteWS instance = new ClienteWS();
        String expResult = "";
        String result = instance.IngresarCliente(Cli_Id, Cli_Apellidos, Cli_Nombres, Cli_NombreCompleto, Cli_Direccion, Cli_Ciudad, Cli_Telefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
