/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasgua;

import dao.UserDAOImpl;
import java.sql.SQLException;

/**
 *
 * @author jjat02
 */
public class SistemaSGUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(new UserDAOImpl().selectUser(1144111111L).toString());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}