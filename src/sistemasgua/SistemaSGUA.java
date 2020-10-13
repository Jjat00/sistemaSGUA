/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasgua;

import dao.UserDAOImpl;
import model.Cliente;
import views.GUISistemaSGUA;

import java.sql.SQLException;

/**
 *
 * @author Jaimen Aza
 * @author Milton Lenis
 * @author Sharon Zuleta
 * @author Juan Camargo
 * @author Javier Diaz
 */
public class SistemaSGUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Cliente cliente = new Cliente(108859745, 1, "jjat", "00", 316427787, "jjat@gmail.com");
        System.out.println(cliente.toString());

    }
}