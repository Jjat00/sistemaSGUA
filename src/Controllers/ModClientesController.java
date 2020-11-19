package Controllers;

import dao.ClienteDAO;
import dao.ClienteDAOImp;
import java.awt.event.ActionEvent;
import views.GUI;
import views.ModificarClientes;

/**
 *
 * Controla la ventana para modificar clientes
 */
public class ModClientesController {
    
    private OperadorController operador;
    private ModificarClientes mod;
    private ClienteDAO clienteDAO;

    public ModClientesController(OperadorController operador) {
        this.operador = operador;
        this.mod = new ModificarClientes();
        this.clienteDAO = new ClienteDAOImp();
        this.cambiarPanel();
        this.next();
    }
    
    private void cambiarPanel() {
        GUI ventana = operador.getPrincipal().getVentana();
        ventana.setSize(mod.getWidth() + 18, mod.getHeight() + 46);
        ventana.setLocationRelativeTo(null);
        ventana.getMainPanel().removeAll();
        ventana.getMainPanel().add(mod);
        ventana.getMainPanel().revalidate();
        ventana.repaint();
    }
    
    private void next() {
        this.mod.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.operador.cambiarPanel();
        });
        this.mod.getbtnModificarCliente().addActionListener((ActionEvent ev) -> {
            this.modificarCliente();
        });
    }

    private void modificarCliente() {}
    
}
