package Controllers;

import dao.ClienteDAO;
import dao.ClienteDAOImp;
import model.Cliente;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

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
            this.leerUno();
        });

        this.consulta.getbtnConsultarClientes().addActionListener((ActionEvent ev) ->{
            this.leerTodos();
        });
    }

    private void leerUno(){
        long cedula = Long.parseLong(this.consulta.getjtCedula().getText());
        try {
            Cliente cliente = clienteDAO.selectCliente(cedula);
            String nombre = cliente.getNombre();
            String apellido = cliente.getApellido();
            long celular = cliente.getCedula();
            Boolean actividad = cliente.getActividad();
            String email = cliente.getEmail();
            this.limpiarTabla();
            String datos[] = { cedula + "", 
                            nombre, apellido, 
                            actividad + "", celular + "", email };
            this.consulta.getModelTbl().addRow(datos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void leerTodos() {
        try {
            this.limpiarTabla();
            ArrayList<Cliente> clientes = clienteDAO.selectAllClientes();
            long cedula = 0;
            String nombre = "";
            String apellido = "";
            long celular = 0;
            Boolean actividad = false;
            String email = "";
            for (Cliente cliente : clientes) {
                cedula = cliente.getCedula();
                nombre = cliente.getNombre();
                apellido = cliente.getApellido();
                celular = cliente.getCedula();
                actividad = cliente.getActividad();
                email = cliente.getEmail();
                String datos[] = { cedula + "", 
                        nombre, apellido , 
                        actividad + "", celular + "", email};
                this.consulta.getModelTbl().addRow(datos);                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void limpiarTabla() {
        while (consulta.getModelTbl().getRowCount() != 0) {
            this.consulta.getModelTbl().removeRow(0);
        }
    }    
}
