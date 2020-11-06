/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Sharon Zuleta
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
            this.setSize(457, 643);
            this.setBackground(Color.white);
    }
    
    public JButton getbtnExitLogin(){       
        return btnExitLogin;        
    }
    
    public void setbtnExitLogin(JButton btnExitLogin){
        this.btnExitLogin = btnExitLogin;        
    }
    
    public JButton getbtnIngresoLogin(){       
        return btnIngresoLogin;        
    }
    
    public void setbtnIngresoLogin(JButton btnIngresoLogin){
        this.btnIngresoLogin = btnIngresoLogin;        
    }

    public JPasswordField getJtIngresoContrasenia() {
        return jtIngresoContrasenia;
    }

    public void setJtIngresoContrasenia(JPasswordField jtIngresoContrasenia) {
        this.jtIngresoContrasenia = jtIngresoContrasenia;
    }
    
    public JTextField getjtIngresoUser(){
        return jtIngresoUser;
    }
    
    public void setjtIngresoUser(JTextField jtIngresoUser){
        this.jtIngresoUser = jtIngresoUser;
    }

    public JLabel getJlInfoIncorrecta() {
        return jlInfoIncorrecta;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackgroundLogin = new javax.swing.JPanel();
        jpBackgroundLogin1 = new javax.swing.JPanel();
        jtIngresoUser = new javax.swing.JTextField();
        jlUsuario = new javax.swing.JLabel();
        jlContrasenia = new javax.swing.JLabel();
        jlIconUser = new javax.swing.JLabel();
        btnIngresoLogin = new javax.swing.JButton();
        jtIngresoContrasenia = new javax.swing.JPasswordField();
        jlInfoIncorrecta = new javax.swing.JLabel();
        jlIniciarSesion = new javax.swing.JLabel();
        btnExitLogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jpBackgroundLogin.setBackground(new java.awt.Color(102, 102, 102));

        jpBackgroundLogin1.setBackground(new java.awt.Color(255, 255, 255));

        jtIngresoUser.setText("Alguien01@gmail.com");

        jlUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jlUsuario.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jlUsuario.setText("Usuario:");

        jlContrasenia.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        jlContrasenia.setForeground(new java.awt.Color(102, 102, 102));
        jlContrasenia.setText("Contraseña:");

        jlIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-user-96.png"))); // NOI18N

        btnIngresoLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnIngresoLogin.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 18)); // NOI18N
        btnIngresoLogin.setForeground(new java.awt.Color(102, 102, 102));
        btnIngresoLogin.setText("Ingresar");
        btnIngresoLogin.setBorderPainted(false);

        jtIngresoContrasenia.setText("password1");

        jlInfoIncorrecta.setForeground(new java.awt.Color(255, 0, 0));
        jlInfoIncorrecta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlInfoIncorrecta.setText(" ");

        javax.swing.GroupLayout jpBackgroundLogin1Layout = new javax.swing.GroupLayout(jpBackgroundLogin1);
        jpBackgroundLogin1.setLayout(jpBackgroundLogin1Layout);
        jpBackgroundLogin1Layout.setHorizontalGroup(
            jpBackgroundLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLogin1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIconUser)
                .addGap(146, 146, 146))
            .addGroup(jpBackgroundLogin1Layout.createSequentialGroup()
                .addGroup(jpBackgroundLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundLogin1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnIngresoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBackgroundLogin1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jpBackgroundLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlContrasenia)
                            .addComponent(jlUsuario)
                            .addComponent(jtIngresoUser, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(jtIngresoContrasenia)
                            .addComponent(jlInfoIncorrecta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jpBackgroundLogin1Layout.setVerticalGroup(
            jpBackgroundLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLogin1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jlIconUser)
                .addGap(29, 29, 29)
                .addComponent(jlUsuario)
                .addGap(18, 18, 18)
                .addComponent(jtIngresoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jlContrasenia)
                .addGap(18, 18, 18)
                .addComponent(jtIngresoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlInfoIncorrecta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnIngresoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jlIniciarSesion.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 36)); // NOI18N
        jlIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jlIniciarSesion.setText("Iniciar sesión ");

        btnExitLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-xbox-x-48.png"))); // NOI18N
        btnExitLogin.setContentAreaFilled(false);

        javax.swing.GroupLayout jpBackgroundLoginLayout = new javax.swing.GroupLayout(jpBackgroundLogin);
        jpBackgroundLogin.setLayout(jpBackgroundLoginLayout);
        jpBackgroundLoginLayout.setHorizontalGroup(
            jpBackgroundLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlIniciarSesion)
                .addGap(68, 68, 68)
                .addComponent(btnExitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpBackgroundLoginLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpBackgroundLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpBackgroundLoginLayout.setVerticalGroup(
            jpBackgroundLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpBackgroundLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLoginLayout.createSequentialGroup()
                        .addComponent(btnExitLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundLoginLayout.createSequentialGroup()
                        .addComponent(jlIniciarSesion)
                        .addGap(18, 18, 18)))
                .addComponent(jpBackgroundLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBackgroundLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBackgroundLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitLogin;
    private javax.swing.JButton btnIngresoLogin;
    private javax.swing.JLabel jlContrasenia;
    private javax.swing.JLabel jlIconUser;
    private javax.swing.JLabel jlInfoIncorrecta;
    private javax.swing.JLabel jlIniciarSesion;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPanel jpBackgroundLogin;
    private javax.swing.JPanel jpBackgroundLogin1;
    private javax.swing.JPasswordField jtIngresoContrasenia;
    private javax.swing.JTextField jtIngresoUser;
    // End of variables declaration//GEN-END:variables
}
