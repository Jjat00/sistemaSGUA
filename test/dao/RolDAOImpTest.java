/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Rol;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanescacha
 */
public class RolDAOImpTest {
    
    public RolDAOImpTest() {
    }

    /**
     * Test of insertRol method, of class RolDAOImp.
     */
    @Test
    public void testInsertRol() throws Exception {
        System.out.println("insertRol");
        Rol rol = new Rol((short) 4, "test");
        RolDAOImp instance = new RolDAOImp();
        boolean expResult = true;
        boolean result = instance.insertRol(rol);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectRolByID method, of class RolDAOImp.
     */
    @Test
    public void testSelectRolByID() throws Exception {
        System.out.println("selectRolByID");
        short id = 3;
        RolDAOImp instance = new RolDAOImp();
        Rol expResult = new Rol((short) 3, "operador");
        Rol result = instance.selectRolByID(id);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllRol method, of class RolDAOImp.
     */
    @Test
    public void testSelectAllRol() throws Exception {
        System.out.println("selectAllRol");
        RolDAOImp instance = new RolDAOImp();
        ArrayList<Rol> expResult = null;
        ArrayList<Rol> result = instance.selectAllRol();
        for (Rol rol : result) {
            System.out.println(rol.toString());
        }
    }

    /**
     * Test of updateRol method, of class RolDAOImp.
     */
    @Test
    public void testUpdateRol() throws Exception {
        System.out.println("updateRol");
        Rol rol = new Rol((short) 3, "operador");
        RolDAOImp instance = new RolDAOImp();
        boolean expResult = true;
        boolean result = instance.updateRol(rol);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteRol method, of class RolDAOImp.
     */
    @Test
    public void testDeleteRol() throws Exception {
        System.out.println("deleteRol");
        short id = 4;
        RolDAOImp instance = new RolDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteRol(id);
        assertEquals(expResult, result);
    }
    
}
