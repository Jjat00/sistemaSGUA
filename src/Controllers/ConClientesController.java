package Controllers;

import dao.ClienteDAO;
import dao.ClienteDAOImp;
import java.awt.event.ActionEvent;
import views.ConsultaCliente;
import views.GUI;

/**
 *
 * Controlador para leer clientes
 */
public class ConClientesController {
    
    private OperadorController operador;
    private ConsultaCliente consulta;
    private ClienteDAO clienteDAO;

    public ConClientesController(OperadorController operador) {
        this.operador = operador;
        this.consulta = new ConsultaCliente();
        this.clienteDAO = new ClienteDAOImp();
        this.cambiarPanel();
        this.next();
        this.leerTodos();
    }
    
    private void cambiarPanel() {
        GUI ventana = operador.getPrincipal().getVentana();
        ventana.setSize(consulta.getWidth() + 18, consulta.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(consulta);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
        ventana.setResizable(true);        
    }
    
    private void next() {
        this.consulta.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.operador.cambiarPanel();
        });
        this.consulta.getbtnConsultarCliente().addActionListener((ActionEvent ev) ->{
            this.leerTodos();
        });
    }

    private void leerTodos() {}
}
