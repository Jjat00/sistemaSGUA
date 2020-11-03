package Controllers;

import views.GUI;
import views.InicioGerente;

/**
 *
 * Controlador para el gerente
 */
public class GerenteController {
    
    private GUI ventana;
    private InicioGerente gerente;

    public GerenteController(GUI ventana) {
        this.ventana = ventana;
        this.gerente = new InicioGerente();
        this.cambiarPanel();
        
        this.gerente.getbtnSalirGerente().addActionListener(new SesionGerenteController(ventana));
    }
    
    private void cambiarPanel() {
        this.ventana.setSize(gerente.getWidth() + 18, gerente.getHeight() + 46);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getMainPanel().removeAll();
        this.ventana.getMainPanel().add(gerente);
        this.ventana.getMainPanel().revalidate();
        this.ventana.repaint();
    }
}