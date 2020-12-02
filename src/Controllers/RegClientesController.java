package Controllers;

import dao.ClienteDAO;
import dao.ClienteDAOImp;
import java.awt.event.ActionEvent;
import model.Cliente;
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

    private void registrarCliente() {
        try {
            boolean actividadUsuario = false;
            String cedula = reg.getjtCedula().getText();
            String nombre = reg.getjtNombre().getText();
            String apellido = reg.getjtApellidos().getText();
            String celular = reg.getjtCelular().getText();
            String actividad = reg.getcbActividad().getSelectedItem().toString();
            String email = reg.getjtEmail().getText();
            String direccion = reg.getjtDireccion().getText();
            String estrato = reg.getjtEstrato().getText();

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
            clienteDAO.insertCliente(cliente);
            
            
        } catch (Exception e) {
            //TODO: handle exception

        }
    }
    
}
