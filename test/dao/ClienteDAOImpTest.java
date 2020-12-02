package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Test para cliente
 */
public class ClienteDAOImpTest {
    
    public ClienteDAOImpTest() {
    }

    /**
     * Test of insertCliente method, of class ClienteDAOImp.
     */
    @Test
    public void testInsertCliente() throws Exception {
        System.out.println("insertCliente");
        Cliente cliente = new Cliente(2144711477L, "Nombre9", "Apellido9", 3159777779L, "Cliente08@gmail.com", true, "calle 4C 39-23", 1);
        ClienteDAOImp instance = new ClienteDAOImp();
        boolean expResult = true;
        boolean result = instance.insertCliente(cliente);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteCliente method, of class ClienteDAOImp.
     */
    @Test
    public void testDeleteCliente() throws Exception {
        System.out.println("deleteCliente");
        long cedula = 2144777777L;
        ClienteDAOImp instance = new ClienteDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteCliente(cedula);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectCliente method, of class ClienteDAOImp.
     */
    @Test
    public void testSelectCliente() throws Exception {
        System.out.println("selectCliente");
        long cedula = 2144000000L;
        ClienteDAOImp instance = new ClienteDAOImp();
        Cliente expResult = new Cliente(2144711477L, "Nombre9", "Apellido9", 3159777779L, "Cliente08@gmail.com", true, "calle 4C 39-23", 1);
        Cliente result = instance.selectCliente(cedula);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllClientes method, of class ClienteDAOImp.
     */
    @Test
    public void testSelectAllClientes() throws Exception {
        System.out.println("selectAllClientes");
         try {
            System.out.println(new ClienteUbicacionDAOImp().selectClienteUbicacion(2144000000L));
            ArrayList<Cliente> lista = new ClienteDAOImp().selectAllClientes();
             for (Cliente cliente : lista) {
                 System.out.println(cliente.toString());
             }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Test of updateCliente method, of class ClienteDAOImp.
     */
    @Test
    public void testUpdateCliente() throws Exception {
        System.out.println("updateCliente");
        Cliente cliente = new Cliente(2144711477L, "Nombre9", "Apellido9", 3159777779L, "Cliente08@gmail.com", true, "calle 4C 39-23", 1);
        ClienteDAOImp instance = new ClienteDAOImp();
        boolean expResult = true;
        boolean result = instance.updateCliente(cliente);
        assertEquals(expResult, result);
    }
    
}
