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
public class InicioOperador extends javax.swing.JPanel {

    /**
     * Creates new form InicioOperador
     */
    public InicioOperador() {
        initComponents();
        
            this.setSize(1360, 740);
            this.setBackground(Color.white);
    }
    
    public JButton getbtnGestionarCliente(){       
        return btnGestionarCliente;        
    }
    
    public void setbtnGestionarCliente(JButton btnGestionarCliente){
        this.btnGestionarCliente = btnGestionarCliente;        
    }
    
    public JButton getbtnFactura(){       
        return btnFactura;        
    }
    
    public void setbtnFactura(JButton btnFactura){
        this.btnFactura = btnFactura;        
    }
    
    public JButton getbtnServicios(){       
        return btnServicios;        
    }
    
    public void setbtnServicios(JButton btnServicios){
        this.btnServicios = btnServicios;        
    }
    
    public JButton getbtnConsultaReporte(){       
        return btnConsultaReporte;        
    }
    
    public void setbtnConsultaReporte(JButton btnConsultaReporte){
        this.btnConsultaReporte = btnConsultaReporte;        
    }
    
    public JButton getbtnSalirOperador(){       
        return btnSalirOperador;        
    }
    
    public void setbtnSalirOperador(JButton btnSalirOperador){
        this.btnSalirOperador = btnSalirOperador;        
    }
    
    public JButton getbtnRegistrarPagos(){       
        return btnRegistrarPagos;        
    }
    
    public void setbtnRegistrarPagos(JButton btnRegistrarPagos){
        this.btnRegistrarPagos = btnRegistrarPagos;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackgroundTitulo = new javax.swing.JPanel();
        jlTituloGerente = new javax.swing.JLabel();
        jlIconReporte = new javax.swing.JLabel();
        btnConsultaReporte = new javax.swing.JButton();
        btnSalirOperador = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnFactura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGestionarCliente = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarPagos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jpBackgroundTitulo.setBackground(new java.awt.Color(102, 102, 102));

        jlTituloGerente.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 36)); // NOI18N
        jlTituloGerente.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloGerente.setText("Operador");

        javax.swing.GroupLayout jpBackgroundTituloLayout = new javax.swing.GroupLayout(jpBackgroundTitulo);
        jpBackgroundTitulo.setLayout(jpBackgroundTituloLayout);
        jpBackgroundTituloLayout.setHorizontalGroup(
            jpBackgroundTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundTituloLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jlTituloGerente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBackgroundTituloLayout.setVerticalGroup(
            jpBackgroundTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundTituloLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jlTituloGerente)
                .addGap(36, 36, 36))
        );

        jlIconReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconReporte.png"))); // NOI18N

        btnConsultaReporte.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultaReporte.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        btnConsultaReporte.setForeground(new java.awt.Color(102, 102, 102));
        btnConsultaReporte.setText("Consultar reportes");
        btnConsultaReporte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.darkGray));

        btnSalirOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconExit.png"))); // NOI18N
        btnSalirOperador.setBorderPainted(false);
        btnSalirOperador.setContentAreaFilled(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconFactura.png"))); // NOI18N

        btnFactura.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(102, 102, 102));
        btnFactura.setText("Gestionar factura");
        btnFactura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconServicios.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconClientes.png"))); // NOI18N

        btnGestionarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnGestionarCliente.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        btnGestionarCliente.setForeground(new java.awt.Color(102, 102, 102));
        btnGestionarCliente.setText("Gestionar cliente");
        btnGestionarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.darkGray));

        btnServicios.setBackground(new java.awt.Color(204, 204, 204));
        btnServicios.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        btnServicios.setForeground(new java.awt.Color(102, 102, 102));
        btnServicios.setText("Servicios clientes");
        btnServicios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pagos.png"))); // NOI18N

        btnRegistrarPagos.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrarPagos.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        btnRegistrarPagos.setForeground(new java.awt.Color(102, 102, 102));
        btnRegistrarPagos.setText("Registrar pagos");
        btnRegistrarPagos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.darkGray));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackgroundTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20))
                            .addComponent(btnGestionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel4)))
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(jlIconReporte)
                        .addGap(243, 243, 243)
                        .addComponent(jLabel3)))
                .addContainerGap(270, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalirOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConsultaReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)
                        .addComponent(btnRegistrarPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(420, 420, 420))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpBackgroundTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGestionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlIconReporte)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultaReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnSalirOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultaReporte;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnGestionarCliente;
    private javax.swing.JButton btnRegistrarPagos;
    private javax.swing.JButton btnSalirOperador;
    private javax.swing.JButton btnServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlIconReporte;
    private javax.swing.JLabel jlTituloGerente;
    private javax.swing.JPanel jpBackgroundTitulo;
    // End of variables declaration//GEN-END:variables
}
