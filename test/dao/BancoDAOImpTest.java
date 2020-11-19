/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Banco;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanescacha
 */
public class BancoDAOImpTest {
    
    public BancoDAOImpTest() {
    }

    /**
     * Test of insertBanco method, of class BancoDAOImp.
     */
    @Test
    public void testInsertBanco() throws Exception {
        System.out.println("insertBanco");
        Banco banco = new Banco(3,"banco2");
        BancoDAOImp instance = new BancoDAOImp();
        boolean expResult = true;
        boolean result = instance.insertBanco(banco);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectBanco method, of class BancoDAOImp.
     */
    @Test
    public void testSelectBanco() throws Exception {
        System.out.println("selectBanco");
        int idBanco = 3;
        BancoDAOImp instance = new BancoDAOImp();
        Banco expResult = new Banco(3,"banco2");
        Banco result = instance.selectBanco(idBanco);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllBancos method, of class BancoDAOImp.
     */
    @Test
    public void testSelectAllBancos() throws Exception {
        System.out.println("selectAllBancos");
        BancoDAOImp instance = new BancoDAOImp();
        ArrayList<Banco> expResult = null;
        ArrayList<Banco> result = instance.selectAllBancos();
        for (Banco banco : result) {
            System.out.println(banco.toString());
        }
    }

    /**
     * Test of updateBanco method, of class BancoDAOImp.
     */
    @Test
    public void testUpdateBanco() throws Exception {
        System.out.println("updateBanco");
        Banco banco = new Banco(2,"banco1");
        BancoDAOImp instance = new BancoDAOImp();
        boolean expResult = true;
        boolean result = instance.updateBanco(banco);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteBanco method, of class BancoDAOImp.
     */
    @Test
    public void testDeleteBanco() throws Exception {
        System.out.println("deleteBanco");
        int idBanco = 3;
        BancoDAOImp instance = new BancoDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteBanco(idBanco);
        assertEquals(expResult, result);
    }
    
}
