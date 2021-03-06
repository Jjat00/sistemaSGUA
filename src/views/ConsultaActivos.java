/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sharon Zuleta
 */
public class ConsultaActivos extends javax.swing.JPanel {
    
    private DefaultTableModel modelTbl;
    
    /**
     * Creates new form ConsultaActivos
     */
    public ConsultaActivos() {
        initComponents();
        
        this.setSize(1360, 740);
    }
    
    public JTextField getjtID (){
        return jtID;
    }
    
    public void setjtID (JTextField jtID){
        this.jtID = jtID;
    }
    
    public JButton getbtnConsultarActivo (){
        return btnConsultarActivo;
    }
    
    public JButton getbtnConsultarActivos (){
        return btnConsultarActivos;
    }
    
    public void setbtnConsultarActivo (JButton btnConsultarActivo){
        this.btnConsultarActivo = btnConsultarActivo;
    }
    
    public JButton getbtnDevolver (){
        return btnDevolver;
    }
    
    public void setbtnDevolver (JButton btnDevolver){
        this.btnDevolver = btnDevolver;
    }

    public DefaultTableModel getModelTbl() {
        return modelTbl;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConsultarActivo = new javax.swing.JButton();
        jpTituloAdmin = new javax.swing.JPanel();
        jlAdministrador = new javax.swing.JLabel();
        btnDevolver = new javax.swing.JButton();
        btnConsultarActivos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        String data[][] = {};
        String head[]={"ID", "Marca", "Fases", "Actividad", "Snom (KVA)", "v1nom (V)", "v2nom (V)", "Frecuencia"};
        modelTbl = new DefaultTableModel(data, head);
        tblUsuarios.setModel(modelTbl);
        jScrollPane1.setViewportView(tblUsuarios);

        jLabel1.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Consulta de activos");

        jLabel2.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Digite un ID:");

        btnConsultarActivo.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultarActivo.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        btnConsultarActivo.setForeground(new java.awt.Color(102, 102, 102));
        btnConsultarActivo.setText("Consultar activo");
        btnConsultarActivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnConsultarActivo.setBorderPainted(false);

        jpTituloAdmin.setBackground(new java.awt.Color(102, 102, 102));
        jpTituloAdmin.setPreferredSize(new java.awt.Dimension(1352, 120));

        jlAdministrador.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 36)); // NOI18N
        jlAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jlAdministrador.setText("Administrador");

        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconDevolver.png"))); // NOI18N
        btnDevolver.setBorderPainted(false);
        btnDevolver.setContentAreaFilled(false);

        javax.swing.GroupLayout jpTituloAdminLayout = new javax.swing.GroupLayout(jpTituloAdmin);
        jpTituloAdmin.setLayout(jpTituloAdminLayout);
        jpTituloAdminLayout.setHorizontalGroup(
            jpTituloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloAdminLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jlAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jpTituloAdminLayout.setVerticalGroup(
            jpTituloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloAdminLayout.createSequentialGroup()
                .addGroup(jpTituloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTituloAdminLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlAdministrador))
                    .addGroup(jpTituloAdminLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnDevolver)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnConsultarActivos.setBackground(new java.awt.Color(204, 204, 204));
        btnConsultarActivos.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        btnConsultarActivos.setForeground(new java.awt.Color(102, 102, 102));
        btnConsultarActivos.setText("Consultar todo");
        btnConsultarActivos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnConsultarActivos.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTituloAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnConsultarActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)
                        .addComponent(btnConsultarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTituloAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultarActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConsultarActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarActivo;
    private javax.swing.JButton btnConsultarActivos;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlAdministrador;
    private javax.swing.JPanel jpTituloAdmin;
    private javax.swing.JTextField jtID;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
