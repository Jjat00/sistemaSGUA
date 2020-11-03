/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Transformador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jjat02
 */
public class TransformadorDAOImpTest {
    
    public TransformadorDAOImpTest() {
    }

    /**
     * Test of insertTransformador method, of class TransformadorDAOImp.
     */
    @Test
    public void testInsertTransformador() throws Exception {
        System.out.println("insertTransformador");
        Transformador trans = new Transformador(100007, true, "marca3", (short) 2, 14.5f, 13.3f, 15.0f, 60.0f);
        TransformadorDAOImp instance = new TransformadorDAOImp();
        boolean expResult = true;
        boolean result = instance.insertTransformador(trans);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectTransformador method, of class TransformadorDAOImp.
     */
    @Test
    public void testSelectTransformador() throws Exception {
        System.out.println("selectTransformador");
        int idTransformador = 100006;
        TransformadorDAOImp instance = new TransformadorDAOImp();
        Transformador expResult = new Transformador(100006, true, "marca3", (short) 3, 15.0f, 13.2f, 240.0f, 60.0f);
        Transformador result = instance.selectTransformador(idTransformador);
        assertEquals(expResult.toString(), result.toString());
    }
//
    /**
     * Test of selectAllTransformadores method, of class TransformadorDAOImp.
     */
    @Test
    public void testSelectAllTransformadores() throws Exception {
        System.out.println("selectAllTransformadores");
        TransformadorDAOImp instance = new TransformadorDAOImp();
        ArrayList<Transformador> expResult = null;
        ArrayList<Transformador> result = instance.selectAllTransformadores();
        for (Transformador transformador : result) {
            System.out.println(transformador.toString());
        }
        //assertEquals(expResult, result);
    }

    /**
     * Test of updateTransformador method, of class TransformadorDAOImp.
     */
    @Test
    public void testUpdateTransformador() throws Exception {
        System.out.println("updateTransformador");
        Transformador trans = new Transformador(100005, true, "marca2", (short) 3, 15.5f, 13.2f, 240.0f, 60.0f);;
        TransformadorDAOImp instance = new TransformadorDAOImp();
        boolean expResult = true;
        boolean result = instance.updateTransformador(trans);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteTransformador method, of class TransformadorDAOImp.
     */
    @Test
    public void testDeleteTransformador() throws Exception {
        System.out.println("deleteTransformador");
        int idTransformador = 100007;
        TransformadorDAOImp instance = new TransformadorDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteTransformador(idTransformador);
        assertEquals(expResult, result);
    }
    
}
