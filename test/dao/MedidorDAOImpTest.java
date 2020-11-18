/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import java.util.ArrayList;
import model.Medidor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanescacha
 */
public class MedidorDAOImpTest {
    
    public MedidorDAOImpTest() {
    }

    /**
     * Test of insertMedidor method, of class MedidorDAOImp.
     */
    @Test
    public void testInsertMedidor() throws Exception {
        System.out.println("insertMedidor");
        Medidor medidor = new Medidor(10000, 15.2333f , 15.2333f , 135 , Date.valueOf("2020-11-02"));
        MedidorDAOImp instance = new MedidorDAOImp();
        boolean expResult = true;
        boolean result = instance.insertMedidor(medidor);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectMedidor method, of class MedidorDAOImp.
     */
    @Test
    public void testSelectMedidor() throws Exception {
        System.out.println("selectMedidor");
        int NoMedidor = 1;
        MedidorDAOImp instance = new MedidorDAOImp();
        Medidor expResult = new Medidor(1, 51.213f , 51.213f , 136 , Date.valueOf("2020-11-02") );
        Medidor result = instance.selectMedidor(NoMedidor);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllMedidores method, of class MedidorDAOImp.
     */
    @Test
    public void testSelectAllMedidores() throws Exception {
        System.out.println("selectAllMedidores");
        MedidorDAOImp instance = new MedidorDAOImp();
        ArrayList<Medidor> expResult = null;
        ArrayList<Medidor> result = instance.selectAllMedidores();
        for (Medidor medidor : result) {
            System.out.println(medidor.toString());
        }
        //assertEquals(expResult, result);
    }

    /**
     * Test of updateMedidor method, of class MedidorDAOImp.
     */
    @Test
    public void testUpdateMedidor() throws Exception {
        System.out.println("updateMedidor");
        Medidor medidor = new Medidor(6, 48.213f , 50.134f , 136 , Date.valueOf("2020-11-02"));
        MedidorDAOImp instance = new MedidorDAOImp();
        boolean expResult = true;
        boolean result = instance.updateMedidor(medidor);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteMedidor method, of class MedidorDAOImp.
     */
    @Test
    public void testDeleteMedidor() throws Exception {
        System.out.println("deleteMedidor");
        int NoMedidor = 10000;
        MedidorDAOImp instance = new MedidorDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteMedidor(NoMedidor);
        assertEquals(expResult, result);
    }
    
}
