/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import dao.ReporteDAO;
import dao.ReporteDAOImp;
import dao.UserDAO;
import dao.UserDAOImp;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Reporte;
import model.ReporteFinal;
import model.Usuario;
import views.ConsultaReportes;
import views.GUI;

/**
 *
 * @author Milton Lenis
 */
public class ReporteGerenteController {
    
    private GerenteController gerente;
    private ConsultaReportes reg;
    private ReporteDAO reporteDAO;
    private UserDAO usuarioDAO;

    public ReporteGerenteController(GerenteController gerente) {
        this.gerente = gerente;
        this.reg = new ConsultaReportes();
        this.reporteDAO = new ReporteDAOImp();
        this.usuarioDAO = new UserDAOImp();
        this.cambiarPanel();
        this.next();
        leerTodos();
        totalUsuarios();
    }

    private void cambiarPanel() {
        GUI ventana = gerente.getPrincipal().getVentana();
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
            this.gerente.cambiarPanel();
        });
    }
    
    private void leerTodos() {
        try {
            this.limpiarTabla();
            ArrayList<Reporte> reportes = reporteDAO.selectAllPagos();
            ArrayList<ReporteFinal> reportefinal = new ArrayList<>();
                
            float totalsin = 0;
            float totalcon = 0;
            for (int i = 0; i < reportes.size(); i++) {
                try {
                    if (reportes.get(i).getCedula() == reportes.get(i+1).getCedula()) {
                        totalsin += reportes.get(i).getTotal();
                        totalcon += reportes.get(i).getTotalxmora();
                    } else {
                        totalsin += reportes.get(i).getTotal();
                        totalcon += reportes.get(i).getTotalxmora();
                        ReporteFinal rep = new ReporteFinal(reportes.get(i).getCedula(), totalcon, totalsin);
                        reportefinal.add(rep);
                        totalsin = 0;
                        totalcon = 0;
                    }
                } catch (IndexOutOfBoundsException e) {
                    ReporteFinal rep = new ReporteFinal(reportes.get(i).getCedula(), totalcon, totalsin);
                    reportefinal.add(rep);
                }
            }
                
            int totalRecaudo = 0;
            for (ReporteFinal reporte : reportefinal) {
                String datos[] = { reporte.getCliente() + "", 
                        reporte.getTotalinteres() + "", reporte.getTotalsininteres() + ""};
                this.reg.getModelTbl().addRow(datos);   
                totalRecaudo += reporte.getTotalinteres();
            }
            this.reg.getJlRecaudoXIntereses2().setText(totalRecaudo + "");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void limpiarTabla() {
        while (reg.getModelTbl().getRowCount() != 0) {
            this.reg.getModelTbl().removeRow(0);
        }
    } 
    
    private void totalUsuarios() {
        ArrayList<Usuario> clientes;
        try {
            clientes = usuarioDAO.selectAllUsers();
            this.reg.getJlTotalUsuarios().setText(clientes.size() + "");
        } catch (SQLException ex) {
        }
    }
    
}
