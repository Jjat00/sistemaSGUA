package Controllers;

import java.awt.event.ActionEvent;
import views.Factura;
import views.VentanaEmergente;

/**
 *
 * Controlador para la factura
 */
public class FacturaController {
    
    private VentanaEmergente ventana;
    private Factura factura;

    public FacturaController(OperadorController operador) {
        this.ventana = new VentanaEmergente(operador.getPrincipal().getVentana(), true);
        this.factura = new Factura();
        this.cambiarPanel();
        this.next();
        this.ventana.setVisible(true);
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(factura.getWidth() + 18, factura.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(factura);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
        this.ventana.setResizable(true);
    }
    
    private void next() {
        this.factura.getbtnConvertirPDF().addActionListener((ActionEvent ev) -> {
            /**
             * Todo lo que se ponga aquí abajo es lo que ocurrirá cuando se presione
             * el botón de convertir a pdf (PUEDES ELIMINAR ESTE MENSAJE)
             */
            //**** ACCION DE EJEMPLO ****
            metodoDeEjemplo1("\"convertir PDF\" ");
        });
        this.factura.getbtnModificarPublicidad().addActionListener((ActionEvent ev) -> {
            /**
             * Todo lo que se ponga aquí abajo es lo que ocurrirá cuando se presione
             * el botón modificar publicidad (PUEDES ELIMINAR ESTE MENSAJE)
             */
            //**** ACCION DE EJEMPLO ****
            metodoDeEjemplo1("\"modificar publicidad\" ");
        });
    }
    
    private void metodoDeEjemplo1(String mensajeDeEjemplo) {
        System.out.println("Se ha dado click en el botón " + mensajeDeEjemplo
                + "si quieres editar esta accion ve a la clase FacturaController "
                + "en el paquete Controllers");
    }
}