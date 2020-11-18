/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Factura;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanescacha
 */
public class FacturaDAOImpTest {
    
    public FacturaDAOImpTest() {
    }

    /**
     * Test of insertFactura method, of class FacturaDAOImp.
     */
    @Test
    public void testInsertFactura() throws Exception {
        System.out.println("insertFactura");
        Factura factura = new Factura(7, 2144666666L, true, 2, 6, 593.0f , 11600.38f);
        FacturaDAOImp instance = new FacturaDAOImp();
        boolean expResult = true;
        boolean result = instance.insertFactura(factura);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectFactura method, of class FacturaDAOImp.
     */
    @Test
    public void testSelectFactura() throws Exception {
        System.out.println("selectFactura");
        int NoCuenta = 4;
        FacturaDAOImp instance = new FacturaDAOImp();
        Factura expResult = new Factura(4, 2144000000L, false, 1, 4, 550.12f , 11300.09f);
        Factura result = instance.selectFactura(NoCuenta);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllFacturas method, of class FacturaDAOImp.
     */
    @Test
    public void testSelectAllFacturas() throws Exception {
        System.out.println("selectAllFacturas");
        FacturaDAOImp instance = new FacturaDAOImp();
        ArrayList<Factura> expResult = null;
        ArrayList<Factura> result = instance.selectAllFacturas();
        for (Factura factura : result ) {
            System.out.println(factura.toString());
        }
    }

    /**
     * Test of updateFactura method, of class FacturaDAOImp.
     */
    @Test
    public void testUpdateFactura() throws Exception {
        System.out.println("updateFactura");
        Factura factura = new Factura(5, 2144555555L, true, 5, 5, 592.00f, 11600.37f);
        FacturaDAOImp instance = new FacturaDAOImp();
        boolean expResult = true;
        boolean result = instance.updateFactura(factura);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteFactura method, of class FacturaDAOImp.
     */
    @Test
    public void testDeleteFactura() throws Exception {
        System.out.println("deleteFactura");
        int NoCuenta = 7;
        FacturaDAOImp instance = new FacturaDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteFactura(NoCuenta);
        assertEquals(expResult, result);
    }
    
}
