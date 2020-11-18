/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.ClienteUbicacion;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanescacha
 */
public class ClienteUbicacionDAOImpTest {
    
    public ClienteUbicacionDAOImpTest() {
    }

    /**
     * Test of insertClienteUbicacion method, of class ClienteUbicacionDAOImp.
     */
    @Test
    public void testInsertClienteUbicacion() throws Exception {
        
        System.out.println("insertClienteUbicacion");
        ClienteUbicacion clienteUbicacion = new ClienteUbicacion (2144666666L, "Calle 2D # 32 - 35", (short) 5);
        ClienteUbicacionDAOImp instance = new ClienteUbicacionDAOImp();
        boolean expResult = true;
        boolean result = instance.insertClienteUbicacion(clienteUbicacion);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectClienteUbicacion method, of class ClienteUbicacionDAOImp.
     */
    @Test
    public void testSelectClienteUbicacion() throws Exception {
        System.out.println("selectClienteUbicacion");
        long cedulaCliente = 2144444444L;
        ClienteUbicacionDAOImp instance = new ClienteUbicacionDAOImp();
        ClienteUbicacion expResult = new ClienteUbicacion (2144444444L, "Cra. XZ #XX-XZ", (short) 3);
        ClienteUbicacion result = instance.selectClienteUbicacion(cedulaCliente);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllClienteUbicacion method, of class ClienteUbicacionDAOImp.
     */
    @Test
    public void testSelectAllClienteUbicacion() throws Exception {
        System.out.println("selectAllClienteUbicacion");
        ClienteUbicacionDAOImp instance = new ClienteUbicacionDAOImp();
        ArrayList<ClienteUbicacion> expResult = null;
        ArrayList<ClienteUbicacion> result = instance.selectAllClienteUbicacion();
        for (ClienteUbicacion clienteUbicacion : result ) {
            System.out.println(clienteUbicacion.toString());
        }
    }

    /**
     * Test of updateClienteUbicacion method, of class ClienteUbicacionDAOImp.
     */
    @Test
    public void testUpdateClienteUbicacion() throws Exception {
        System.out.println("updateClienteUbicacion");
        ClienteUbicacion clienteUbicacion = new ClienteUbicacion(2144000000L, "Cra. XX #XX-XX" ,(short) 3);
        ClienteUbicacionDAOImp instance = new ClienteUbicacionDAOImp();
        boolean expResult = true;
        boolean result = instance.updateClienteUbicacion(clienteUbicacion);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteClienteUbicacion method, of class ClienteUbicacionDAOImp.
     */
    @Test
    public void testDeleteClienteUbicacion() throws Exception {
        System.out.println("deleteClienteUbicacion");
        long cedulaCliente = 2144666666L;
        ClienteUbicacionDAOImp instance = new ClienteUbicacionDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteClienteUbicacion(cedulaCliente);
        assertEquals(expResult, result);
    }
    
}
