/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.FasesTransformador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanescacha
 */
public class FasesTransformadorDAOImpTest {
    
    public FasesTransformadorDAOImpTest() {
    }

    /**
     * Test of insertFasesTransformador method, of class FasesTransformadorDAOImp.
     */
    @Test
    public void testInsertFasesTransformador() throws Exception {
        System.out.println("insertFasesTransformador");
        FasesTransformador fase = new FasesTransformador((short) 4, "cuatro");
        FasesTransformadorDAOImp instance = new FasesTransformadorDAOImp();
        boolean expResult = true;
        boolean result = instance.insertFasesTransformador(fase);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectFasesTransformador method, of class FasesTransformadorDAOImp.
     */
    @Test
    public void testSelectFasesTransformador() throws Exception {
        System.out.println("selectFasesTransformador");
        short idFase = 2;
        FasesTransformadorDAOImp instance = new FasesTransformadorDAOImp();
        FasesTransformador expResult = new FasesTransformador((short) 2, "bifasico");
        FasesTransformador result = instance.selectFasesTransformador(idFase);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllFasesTransformador method, of class FasesTransformadorDAOImp.
     */
    @Test
    public void testSelectAllFasesTransformador() throws Exception {
        System.out.println("selectAllFasesTransformador");
        FasesTransformadorDAOImp instance = new FasesTransformadorDAOImp();
        ArrayList<FasesTransformador> expResult = null;
        ArrayList<FasesTransformador> result = instance.selectAllFasesTransformador();
        for (FasesTransformador fasesTransformador : result ) {
            System.out.println(fasesTransformador.toString());
        }
    }

    /**
     * Test of updateFasesTransformador method, of class FasesTransformadorDAOImp.
     */
    @Test
    public void testUpdateFasesTransformador() throws Exception {
        System.out.println("updateFasesTransformador");
        FasesTransformador fase = new FasesTransformador((short) 2, "bifasico");
        FasesTransformadorDAOImp instance = new FasesTransformadorDAOImp();
        boolean expResult = true;
        boolean result = instance.updateFasesTransformador(fase);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteFasesTransformador method, of class FasesTransformadorDAOImp.
     */
    @Test
    public void testDeleteFasesTransformador() throws Exception {
        System.out.println("deleteFasesTransformador");
        short idFase = 4;
        FasesTransformadorDAOImp instance = new FasesTransformadorDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteFasesTransformador(idFase);
        assertEquals(expResult, result);
    }
    
}
