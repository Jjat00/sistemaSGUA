/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Sharon Zuleta
 */
public class SesionAdmin extends javax.swing.JPanel {

    /**
     * Creates new form SesionAdmin
     */
    public SesionAdmin() {
        initComponents();
        
            this.setSize(400, 443);
            this.setBackground(Color.white);
        
    }
    
    public JButton getbtnCerrarVentana(){       
        return btnCerrarVentana;        
    }
    
    public void setbtnCerrarVentana(JButton btnCerrarVentana){
        this.btnCerrarVentana = btnCerrarVentana;        
    }
    
    public JButton getbtnCerrarSesion(){       
        return btnCerrarSesion;        
    }
    
    public void setbtnCerrarSesion(JButton btnCerrarSesion){
        this.btnCerrarSesion = btnCerrarSesion;        
    }
    
    public JButton getbtnCambiarCuenta(){       
        return btnCambiarCuenta;        
    }
    
    public void setbtnCambiarCuenta(JButton btnCambiarCuenta){
        this.btnCambiarCuenta = btnCambiarCuenta;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlAdministrador = new javax.swing.JLabel();
        btnCerrarVentana = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnCambiarCuenta = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jlAdministrador.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 36)); // NOI18N
        jlAdministrador.setForeground(new java.awt.Color(102, 102, 102));
        jlAdministrador.setText("Administrador");

        btnCerrarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-xbox-x-48.png"))); // NOI18N
        btnCerrarVentana.setBorderPainted(false);
        btnCerrarVentana.setContentAreaFilled(false);

        btnCerrarSesion.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(102, 102, 102));
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setContentAreaFilled(false);

        btnCambiarCuenta.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        btnCambiarCuenta.setForeground(new java.awt.Color(102, 102, 102));
        btnCambiarCuenta.setText("Cambiar de cuenta");
        btnCambiarCuenta.setBorderPainted(false);
        btnCambiarCuenta.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCambiarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jlAdministrador)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jlAdministrador)
                .addGap(83, 83, 83)
                .addComponent(btnCerrarSesion)
                .addGap(47, 47, 47)
                .addComponent(btnCambiarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarCuenta;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCerrarVentana;
    private javax.swing.JLabel jlAdministrador;
    // End of variables declaration//GEN-END:variables
}