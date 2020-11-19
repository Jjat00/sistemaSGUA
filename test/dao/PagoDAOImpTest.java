/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.util.ArrayList;
import model.Pago;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanescacha
 */
public class PagoDAOImpTest {
    
    public PagoDAOImpTest() {
    }

    /**
     * Test of insertPago method, of class PagoDAOImp.
     */
    @Test
    public void testInsertPago() throws Exception {
        System.out.println("insertPago");
        Pago pay = new Pago(4, Date.valueOf("2020-07-11"), (short) 2, 4);
        PagoDAOImp instance = new PagoDAOImp();
        boolean expResult = true;
        boolean result = instance.insertPago(pay);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectPago method, of class PagoDAOImp.
     */
    @Test
    public void testSelectPago() throws Exception {
        System.out.println("selectPago");
        int idPago = 3;
        PagoDAOImp instance = new PagoDAOImp();
        Pago expResult = new Pago(3, Date.valueOf("2020-06-11"), (short) 1, 3);
        Pago result = instance.selectPago(idPago);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllPagos method, of class PagoDAOImp.
     */
    @Test
    public void testSelectAllPagos() throws Exception {
        System.out.println("selectAllPagos");
        PagoDAOImp instance = new PagoDAOImp();
        ArrayList<Pago> expResult = null;
        ArrayList<Pago> result = instance.selectAllPagos();
        
        for (Pago pago : result) {
            System.out.println(pago.toString());
        }
    }

    /**
     * Test of updatePago method, of class PagoDAOImp.
     */
    @Test
    public void testUpdatePago() throws Exception {
        System.out.println("updatePago");
        Pago pay = new Pago(3,Date.valueOf("2020-06-11"),(short) 1, 3);
        PagoDAOImp instance = new PagoDAOImp();
        boolean expResult = true;
        boolean result = instance.updatePago(pay);
        assertEquals(expResult, result);
    }

    /**
     * Test of deletePago method, of class PagoDAOImp.
     */
    @Test
    public void testDeletePago() throws Exception {
        System.out.println("deletePago");
        int idPago = 4;
        PagoDAOImp instance = new PagoDAOImp();
        boolean expResult = true;
        boolean result = instance.deletePago(idPago);
        assertEquals(expResult, result);
    }
    
}
