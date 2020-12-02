package Controllers;

import dao.ClienteDAO;
import dao.ClienteDAOImp;
import java.awt.event.ActionEvent;
import model.Cliente;
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

    private void modificarCliente() {
        try {
            boolean actividadUsuario = false;
            String cedula = mod.getjtCedula().getText();
            String nombre = mod.getjtNombre().getText();
            String apellido = mod.getjtApellidos().getText();
            String celular = mod.getjtCelular().getText();
            String actividad = mod.getcbActividad().getSelectedItem().toString();
            String email = mod.getjtEmail().getText();
            String direccion = mod.getjtDireccion().getText();
            String estrato = mod.getjtEstrato().getText();

            switch (actividad) {
                case "Activo":
                    actividadUsuario = true;
                    break;
                case "Inactivo":
                    actividadUsuario = false;
                    break;
                default:
                    break;
            }
            Long id = Long.parseLong(cedula);
            Long cel = Long.parseLong(celular);
            Cliente cliente = new Cliente(id, nombre, apellido, cel, email, actividadUsuario);
            System.out.println(cliente.toString());
            clienteDAO.updateCliente(cliente);

        } catch (Exception e) {
            // TODO: handle exception

        }        
    }
    
}
