/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.TransformadorUbicacion;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanescacha
 */
public class TransformadorUbicacionDAOImpTest {
    
    public TransformadorUbicacionDAOImpTest() {
    }

    /**
     * Test of insertTransformadorUbicacion method, of class TransformadorUbicacionDAOImp.
     */
    @Test
    public void testInsertTransformadorUbicacion() throws Exception {
        System.out.println("insertTransformadorUbicacion");
        TransformadorUbicacion transformadorUbicacion = new TransformadorUbicacion(100006, "3°27 54.0 N 76°28 46.6 W" , "Alfonzo Lopez", (short) 4);
        TransformadorUbicacionDAOImp instance = new TransformadorUbicacionDAOImp();
        boolean expResult = true;
        boolean result = instance.insertTransformadorUbicacion(transformadorUbicacion);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectTransformadorUbicacion method, of class TransformadorUbicacionDAOImp.
     */
    @Test
    public void testSelectTransformadorUbicacion() throws Exception {
        System.out.println("selectTransformadorUbicacion");
        int idTransformador = 100002;
        TransformadorUbicacionDAOImp instance = new TransformadorUbicacionDAOImp();
        TransformadorUbicacion expResult = new TransformadorUbicacion(100002, "3°27 58.8 N 76°29 37.6 W", "Villa del Prado", (short) 5);
        TransformadorUbicacion result = instance.selectTransformadorUbicacion(idTransformador);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllTransformadores method, of class TransformadorUbicacionDAOImp.
     */
    @Test
    public void testSelectAllTransformadores() throws Exception {
        System.out.println("selectAllTransformadores");
        TransformadorUbicacionDAOImp instance = new TransformadorUbicacionDAOImp();
        ArrayList<TransformadorUbicacion> expResult = null;
        ArrayList<TransformadorUbicacion> result = instance.selectAllTransformadores();
        for (TransformadorUbicacion transformadorUbicacion : result) {
            System.out.println(transformadorUbicacion.toString());
        }
    }

    /**
     * Test of updateTransformadorUbicacion method, of class TransformadorUbicacionDAOImp.
     */
    @Test
    public void testUpdateTransformadorUbicacion() throws Exception {
        System.out.println("updateTransformadorUbicacion");
        TransformadorUbicacion transformadorUbicacion = new TransformadorUbicacion(100005, "3°27 45.1 N 76°30 27.5 W", "Las Delicias" ,(short) 4);
        TransformadorUbicacionDAOImp instance = new TransformadorUbicacionDAOImp();
        boolean expResult = true;
        boolean result = instance.updateTransformadorUbicacion(transformadorUbicacion);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteTransformadorUbicacion method, of class TransformadorUbicacionDAOImp.
     */
    @Test
    public void testDeleteTransformadorUbicacion() throws Exception {
        System.out.println("deleteTransformadorUbicacion");
        int idTransformador = 100006;
        TransformadorUbicacionDAOImp instance = new TransformadorUbicacionDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteTransformadorUbicacion(idTransformador);
        assertEquals(expResult, result);
    }
    
}