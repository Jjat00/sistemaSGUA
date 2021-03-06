/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sharon Zuleta
 */
public class ModificarClientes extends javax.swing.JPanel {

    /**
     * Creates new form ModificarClientes
     */
    public ModificarClientes() {
        initComponents();
        this.setSize(1433,746);
    }
    
    public JTextField getjtNombre (){
        return jtNombre;
    }
    
    public void setjtNombre (JTextField jtNombre){
        this.jtNombre = jtNombre;
    }
    
    public JTextField getjtCedula (){
        return jtCedula;
    }
    
    public void setjtCedula (JTextField jtCedula){
        this.jtCedula = jtCedula;
    }
    
    public JTextField getjtApellidos (){
        return jtApellidos;
    }
    
    public void setjtApellidos (JTextField jtApellidos){
        this.jtApellidos = jtApellidos;
    }
    
    public JTextField getjtCelular (){
        return jtCelular;
    }
    
    public void setjtCelular (JTextField jtCelular){
        this.jtCelular = jtCelular;
    }
    
    public JTextField getjtEmail (){
        return jtEmail;
    }
    
    public void setjtEmail (JTextField jtEmail){
        this.jtEmail = jtEmail;
    }
    
    public JTextField getjtDireccion (){
        return jtDireccion;
    }
    
    public void setjtDireccion (JTextField jtDireccion){
        this.jtDireccion = jtDireccion;
    }
    
    public JTextField getjtEstrato (){
        return jtEstrato;
    }
    
    public void setjtEstrato (JTextField jtEstrato){
        this.jtEstrato = jtEstrato;
    }
    
    public JComboBox getcbActividad (){
        return cbActividad;
    }
    
    public void setcbActividad (JComboBox cbActividad){
        this.cbActividad = cbActividad;
    }
    
    public JButton getbtnDevolver (){
        return btnDevolver;
    }
    
    public void setbtnDevolver (JButton btnDevolver){
        this.btnDevolver = btnDevolver;
    }
    
    public JButton getbtnModificarCliente (){
        return btnModificarCliente;
    }
    
    public void setbtnModificarCliente (JButton btnModificarCliente){
        this.btnModificarCliente = btnModificarCliente;
    }

    public JLabel getLabelMensaje() {
        return jLabelMensaje;
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
        btnDevolver = new javax.swing.JButton();
        cbActividad = new javax.swing.JComboBox<>();
        jtDireccion = new javax.swing.JTextField();
        jtEstrato = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtCedula = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtCelular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnModificarCliente = new javax.swing.JButton();
        jLabelMensaje = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jpBackgroundTitulo.setBackground(new java.awt.Color(102, 102, 102));

        jlTituloGerente.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 36)); // NOI18N
        jlTituloGerente.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloGerente.setText("Operador");

        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconDevolver.png"))); // NOI18N
        btnDevolver.setBorderPainted(false);
        btnDevolver.setContentAreaFilled(false);

        javax.swing.GroupLayout jpBackgroundTituloLayout = new javax.swing.GroupLayout(jpBackgroundTitulo);
        jpBackgroundTitulo.setLayout(jpBackgroundTituloLayout);
        jpBackgroundTituloLayout.setHorizontalGroup(
            jpBackgroundTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundTituloLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jlTituloGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jpBackgroundTituloLayout.setVerticalGroup(
            jpBackgroundTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundTituloLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jlTituloGerente)
                .addGap(36, 36, 36))
            .addGroup(jpBackgroundTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnDevolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la actividad...", "Activo", "Inactivo" }));

        jLabel7.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Estrato:");

        jLabel1.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Cédula:");

        jLabel4.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Actividad:");

        jLabel9.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Modificar cliente");

        btnModificarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnModificarCliente.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 24)); // NOI18N
        btnModificarCliente.setForeground(new java.awt.Color(102, 102, 102));
        btnModificarCliente.setText("Modificar cliente");
        btnModificarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLabelMensaje.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensaje.setText(" ");
        jLabelMensaje.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackgroundTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(556, 556, 556)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtNombre)
                                    .addComponent(jtCedula)
                                    .addComponent(jtApellidos)
                                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtEmail)
                            .addComponent(cbActividad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtDireccion)
                            .addComponent(jtEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(536, 536, 536))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(447, 447, 447))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpBackgroundTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabelMensaje)
                .addGap(18, 18, 18)
                .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JComboBox<String> cbActividad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jlTituloGerente;
    private javax.swing.JPanel jpBackgroundTitulo;
    private javax.swing.JTextField jtApellidos;
    private javax.swing.JTextField jtCedula;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtEstrato;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
