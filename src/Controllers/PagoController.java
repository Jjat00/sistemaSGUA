package Controllers;

import dao.FacturaDAO;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import dao.FacturaDAOImp;
import dao.PagoDAO;
import dao.PagoDAOImp;
import model.Factura;
import model.Pago;
import views.GUI;
import views.Pagos;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * Controla la ventana para registrar pagos
 */
public class PagoController {
    
    private OperadorController operador;
    private Pagos reg;
    private PagoDAO pagoDAO;
    private FacturaDAO facturaDAO;
    private ArrayList<Pago> pagos;

    public PagoController(OperadorController operador) {
        this.operador = operador;
        this.reg = new Pagos();
        this.pagoDAO = new PagoDAOImp();
        this.facturaDAO = new FacturaDAOImp();

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
        ventana.setResizable(false);
    }
    
    private void next() {
        this.reg.getbtnDevolver().addActionListener((ActionEvent ev) -> {
            this.operador.cambiarPanel();
        });
        this.reg.getbtnPagar().addActionListener((ActionEvent ev) -> {
            this.registrarPago();
        });
        this.leerTodos();
    }

    private void registrarPago(){
        short idBanco = 0;
        int idFactura = Integer.parseInt(this.reg.getjtIdFactura().getText());
        String metodoPago = reg.getcbMetodoPago().getSelectedItem().toString();
        switch (metodoPago) {
            case "Directo":
                idBanco = 1;
                break;
            case "Banco 1":
                idBanco = 2;
                break;
            case "Banco 2":
                idBanco = 3;
                break;
        
            default:
                break;
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        String fecha = dtf.format(now);
        System.out.println(dtf.format(now));
        Date fechaPago = Date.valueOf(fecha);
        int idPago = pagos.size()+1;
        if (this.facturaExiste(idFactura)) {
            if (!this.facturaPagada(idFactura)) {
                try {            
                    Pago pago = new Pago(idPago, fechaPago, idBanco, idFactura);
                    System.out.println(pago.toString());
                    pagoDAO.insertPago(pago);
                    String datos[] = { idPago + "", idFactura + "", metodoPago, fecha + "" };
                    this.reg.getModelTbl().addRow(datos);
                    this.reg.getLabelMensaje().setText("fuctura pagada");
                    facturaDAO.updateFacturaByID(idFactura, true);
                } catch (SQLException e) {
                    System.out.println(e);
                }                
            }else{
                this.reg.getLabelMensaje().setText("la fuctura ya está pagada");
            }
        }else{
            this.reg.getLabelMensaje().setText("la fuctura no existe");
        }
    }

    private void leerTodos() {
        try {
            String banco = "";
            this.limpiarTabla();
            pagos = pagoDAO.selectAllPagos();
            int idPago = 0;
            Date fecha = null;
            short idBanco = 0;
            int idFactura = 0;
            for (Pago pago : pagos) {
                idPago = pago.getIdPago();
                fecha = pago.getFecha();
                idBanco = pago.getIdBanco();
                idFactura = pago.getIdFactura();
                switch (idBanco) {
                    case 1:
                        banco = "directo";
                        break;
                    case 2:
                        banco = "banco 1";
                        break;
                    case 3:
                        banco = "banco 2";
                        break;
                    default:
                        break;
                }
                String datos[] = { 
                        idPago + "", idFactura + "", banco, fecha + ""};
                this.reg.getModelTbl().addRow(datos);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void limpiarTabla() {
        while (reg.getModelTbl().getRowCount() != 0) {
            this.reg.getModelTbl().removeRow(0);
        }
    }    

    private Boolean facturaExiste(int id){
        Boolean existe = false;
        try {
            Factura facturaModel = facturaDAO.selectFactura(id);
            existe = facturaModel != null;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return existe;
    }

    private Boolean facturaPagada(int id){
        Boolean pagada = false;
        try {
            Factura facturaModel = facturaDAO.selectFactura(id);
            pagada = facturaModel.getEstadoPago();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return pagada;
    }
}