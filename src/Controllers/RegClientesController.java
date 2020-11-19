package Controllers;

import dao.ClienteDAO;
import dao.ClienteDAOImp;
import java.awt.event.ActionEvent;
import views.GUI;
import views.RegistroClientes;

/**
 *
 * Controla la ventana para registrar clientes
 */
public class RegClientesController {
    
    private OperadorController operador;
    private RegistroClientes reg;
    private ClienteDAO clienteDAO;

    public RegClientesController(OperadorController operador) {
        this.operador = operador;
        this.reg = new RegistroClientes();
        this.clienteDAO = new ClienteDAOImp();
        this.cambiarPanel();
        this.next();
    }
    
    private void cambiarPanel() {
        GUI ventana = operador.getPrincipal().getVentana();
        ventana.setSize(reg.getWidth() + 18, reg.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(reg);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
        ventana.setResizable(true);
    }
    
    private void next() {
        this.reg.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.operador.cambiarPanel();
        });
        this.reg.getbtnRegistrarCliente().addActionListener((ActionEvent ev) -> {
            this.registrarCliente();
        });
    }

    private void registrarCliente() {}
    
}
