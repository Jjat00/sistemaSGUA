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
public class GestionUsuariosAdmin extends javax.swing.JPanel {

    /**
     * Creates new form GestionUsuariosAdmin
     */
    public GestionUsuariosAdmin() {
        initComponents();
        
            this.setSize(543, 460);
            this.setBackground(Color.white);
    }
   
    public JButton getbtnRegistroUsuario(){       
        return btnRegistroUsuario;        
    }
    
    public void setbtnbtnRegistroUsuario(JButton btnRegistroUsuario){
        this.btnRegistroUsuario = btnRegistroUsuario;        
    }
    
    public JButton getbtnModificarUsuario(){       
        return btnModificarUsuario;        
    }
    
    public void setbtnModificarUsuario(JButton btnModificarUsuario){
        this.btnModificarUsuario = btnModificarUsuario;        
    }
    
    public JButton getbtnConsultarUsuario(){       
        return btnConsultarUsuario;        
    }
    
    public void setbtnConsultarUsuario(JButton btnConsultarUsuario){
        this.btnConsultarUsuario = btnConsultarUsuario;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlGestionUsuarios = new javax.swing.JLabel();
        btnRegistroUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnConsultarUsuario = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jlGestionUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jlGestionUsuarios.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 48)); // NOI18N
        jlGestionUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        jlGestionUsuarios.setText("Gestionar usuarios");
        jlGestionUsuarios.setAlignmentY(0.0F);

        btnRegistroUsuario.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        btnRegistroUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnRegistroUsuario.setText("Registrar nuevo usuario");
        btnRegistroUsuario.setBorderPainted(false);
        btnRegistroUsuario.setContentAreaFilled(false);

        btnModificarUsuario.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnModificarUsuario.setText("Modificar usuario");
        btnModificarUsuario.setBorderPainted(false);
        btnModificarUsuario.setContentAreaFilled(false);

        btnConsultarUsuario.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        btnConsultarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnConsultarUsuario.setText("Consultar usuario");
        btnConsultarUsuario.setBorderPainted(false);
        btnConsultarUsuario.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jlGestionUsuarios)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jlGestionUsuarios)
                .addGap(49, 49, 49)
                .addComponent(btnRegistroUsuario)
                .addGap(36, 36, 36)
                .addComponent(btnModificarUsuario)
                .addGap(40, 40, 40)
                .addComponent(btnConsultarUsuario)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarUsuario;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnRegistroUsuario;
    private javax.swing.JLabel jlGestionUsuarios;
    // End of variables declaration//GEN-END:variables
}
