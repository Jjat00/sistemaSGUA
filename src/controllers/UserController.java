package controllers;

import dao.UserDAO;
import dao.UserDAOImpl;
import views.GUISistemaSGUA;

/**
 *
 * Controlador para el manejo de la información de los usarios
 */
public class UserController {
    private UserDAO user;

    public UserController(){
        this.user = new UserDAOImpl();
    }

    public void handlerObtenerUsuario() {
        try {
            this.user.selectUser(1005454);
        } catch (Exception e) {
            
        }
    }
}
