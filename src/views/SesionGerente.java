/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JButton;

/**
 *
 * @author Sharon Zuleta
 */
public class SesionGerente extends javax.swing.JPanel {

    /**
     * Creates new form SesionGerente
     */
    public SesionGerente() {
        initComponents();
    }
    
    public JButton getbtnCerrarVentanaGerente(){       
        return btnCerrarVentanaGerente;        
    }
    
    public void setbtnCerrarVentanaGerente(JButton btnCerrarVentanaGerente){
        this.btnCerrarVentanaGerente = btnCerrarVentanaGerente;        
    }
    
    public JButton getbtnCerrarSesionGerente(){       
        return btnCerrarSesionGerente;        
    }
    
    public void setbtnCerrarSesionGerente(JButton btnCerrarSesionGerente){
        this.btnCerrarSesionGerente = btnCerrarSesionGerente;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlGerente = new javax.swing.JLabel();
        btnCerrarVentanaGerente = new javax.swing.JButton();
        btnCerrarSesionGerente = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jlGerente.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 36)); // NOI18N
        jlGerente.setForeground(new java.awt.Color(102, 102, 102));
        jlGerente.setText("Gerente");

        btnCerrarVentanaGerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-xbox-x-48.png"))); // NOI18N
        btnCerrarVentanaGerente.setBorderPainted(false);
        btnCerrarVentanaGerente.setContentAreaFilled(false);

        btnCerrarSesionGerente.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        btnCerrarSesionGerente.setForeground(new java.awt.Color(102, 102, 102));
        btnCerrarSesionGerente.setText("Cerrar sesión");
        btnCerrarSesionGerente.setBorderPainted(false);
        btnCerrarSesionGerente.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarVentanaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jlGerente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addComponent(btnCerrarSesionGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrarVentanaGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlGerente)
                .addGap(120, 120, 120)
                .addComponent(btnCerrarSesionGerente)
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesionGerente;
    private javax.swing.JButton btnCerrarVentanaGerente;
    private javax.swing.JLabel jlGerente;
    // End of variables declaration//GEN-END:variables
}
