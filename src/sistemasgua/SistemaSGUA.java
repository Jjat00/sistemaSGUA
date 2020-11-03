package sistemasgua;

import controllers.MainController;
import java.sql.SQLException;
import views.GUI;

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
    public static void main(String args[]) throws SQLException {
        GUI ventana = new GUI();
        MainController controller = new MainController(ventana);
    }
}