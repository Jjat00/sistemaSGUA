/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.TipoUsoMedidor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanescacha
 */
public class TipoUsoMedidorDAOImpTest {
    
    public TipoUsoMedidorDAOImpTest() {
    }

    /**
     * Test of insertTipoUsoMedidor method, of class TipoUsoMedidorDAOImp.
     */
    @Test
    public void testInsertTipoUsoMedidor() throws Exception {
        System.out.println("insertTipoUsoMedidor");
        TipoUsoMedidor tipoUsoMedidor = new TipoUsoMedidor(6, "test");
        TipoUsoMedidorDAOImp instance = new TipoUsoMedidorDAOImp();
        boolean expResult = true;
        boolean result = instance.insertTipoUsoMedidor(tipoUsoMedidor);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectTipoUsoMedidor method, of class TipoUsoMedidorDAOImp.
     */
    @Test
    public void testSelectTipoUsoMedidor() throws Exception {
        System.out.println("selectTipoUsoMedidor");
        int idTipoUso = 3;
        TipoUsoMedidorDAOImp instance = new TipoUsoMedidorDAOImp();
        TipoUsoMedidor expResult = new TipoUsoMedidor(3, "industrial");
        TipoUsoMedidor result = instance.selectTipoUsoMedidor(idTipoUso);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllTipoUsoMedidor method, of class TipoUsoMedidorDAOImp.
     */
    @Test
    public void testSelectAllTipoUsoMedidor() throws Exception {
        System.out.println("selectAllTipoUsoMedidor");
        TipoUsoMedidorDAOImp instance = new TipoUsoMedidorDAOImp();
        ArrayList<TipoUsoMedidor> expResult = null;
        ArrayList<TipoUsoMedidor> result = instance.selectAllTipoUsoMedidor();
        for (TipoUsoMedidor tipoUsoMedidor : result) {
            System.out.println(tipoUsoMedidor.toString());
        }
    }

    /**
     * Test of updateTipoUsoMedidor method, of class TipoUsoMedidorDAOImp.
     */
    @Test
    public void testUpdateTipoUsoMedidor() throws Exception {
        System.out.println("updateTipoUsoMedidor");
        TipoUsoMedidor tipoUsoMedidor = new TipoUsoMedidor(3, "industrial");
        TipoUsoMedidorDAOImp instance = new TipoUsoMedidorDAOImp();
        boolean expResult = true;
        boolean result = instance.updateTipoUsoMedidor(tipoUsoMedidor);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteTipoUsoMedidor method, of class TipoUsoMedidorDAOImp.
     */
    @Test
    public void testDeleteTipoUsoMedidor() throws Exception {
        System.out.println("deleteTipoUsoMedidor");
        int idTipoUso = 6;
        TipoUsoMedidorDAOImp instance = new TipoUsoMedidorDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteTipoUsoMedidor(idTipoUso);
        assertEquals(expResult, result);
    }
    
}
