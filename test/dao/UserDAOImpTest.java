/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jjat02
 */
public class UserDAOImpTest {
    
    public UserDAOImpTest() {
    }

    /**
     * Test of insertUser method, of class UserDAOImp.
     */
    @Test
    public void testInsertUser() throws Exception {
        System.out.println("insertUser");
        Usuario user = new Usuario(1144666666L, (short) 2, "Nombre7", "Apellido7", true, 3156666666L,
                "nombre7@gmail.com", "password7");
        UserDAOImp instance = new UserDAOImp();
        boolean expResult = true;
        boolean result = instance.insertUser(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of selectUser method, of class UserDAOImp.
     */
    @Test
    public void testSelectUser() throws Exception {
        System.out.println("selectUser");
        long cedula = 11442222L;
        UserDAOImp instance = new UserDAOImp();
        Usuario expResult = new Usuario(1144222222L, (short) 3, "Nombre3", "Apellido3", true, 3152222222L,
                "Alguien03@gmail.com", "password3");
        Usuario result = instance.selectUser(cedula);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of selectAllUsers method, of class UserDAOImp.
     */
    @Test
    public void testSelectAllUsers() throws Exception {
        System.out.println("selectAllUsers");
        UserDAOImp instance = new UserDAOImp();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.selectAllUsers();
        for (Usuario usuario : result) {
            System.out.println(usuario.toString());
        }
        //assertEquals(expResult, result);

    }

    /**
     * Test of updateUser method, of class UserDAOImp.
     */
    @Test
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        Usuario user = new Usuario(1144444444L, (short) 3, "Nombre55", "Apellido55", true, 3152222225L,
                "Alguien55@gmail.com", "password55");
        UserDAOImp instance = new UserDAOImp();
        boolean expResult = true;
        boolean result = instance.updateUser(user);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteUser method, of class UserDAOImp.
     */
    @Test
    public void testDeleteUser() throws Exception {
        System.out.println("deleteUser");
        long cedula = 1144666666L;
        UserDAOImp instance = new UserDAOImp();
        boolean expResult = true;
        boolean result = instance.deleteUser(cedula);
        assertEquals(expResult, result);
    }

}
