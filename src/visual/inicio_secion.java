package visual;
import Control.AdmUsers;
import conexion.conexion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;


public class inicio_secion extends javax.swing.JFrame {
       conexion con = new conexion(); 
       Connection co=con.conectarbd();
       public static String user = ""; //Se declara así para enviar datos entre interfaces
    String pass = "";
private Color trasparent;
private AdmUsers admUsers = new AdmUsers();
    public inicio_secion() {
        trasparent= new Color(0,0,0,0);
          setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(this); 
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel5, "src/imagen/logo.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel3, "src/imagen/cerrar.png");
    }
    

    
public void ingresar () {
    //PreparedStatement pst=null;
    ResultSet rs = null;
     user= usernameField.getText();
     pass= passwordField.getText();
    if(user.equals("")||pass.equals("") ){
        JOptionPane.showMessageDialog(this, "Uno o mas campos esta vacios");
    }else {
        try{
      PreparedStatement pst= co.prepareStatement("select username, pass from usuarios where username='"+user
              + "' and pass='" + pass + "' "); 
        rs=(ResultSet) pst.executeQuery();
        if(rs.next()){
            this.dispose();
            new FrmMenu().setVisible(true);
        }else {
           JOptionPane.showMessageDialog(this, "Contraseño / usuario incorrectos");
        }
        }catch (SQLException e){
            System.err.print(e.toString());
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
        }     
    } 
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnOlvidasteContraseña = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de secion");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 310, 440));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 127, -1));

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 127, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginButton.setText("Iniciar sesión");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 120, 30));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 20, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("IDENTIFIQUESE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 150, 40));

        btnOlvidasteContraseña.setBackground(new java.awt.Color(0, 0, 0));
        btnOlvidasteContraseña.setForeground(new java.awt.Color(255, 255, 255));
        btnOlvidasteContraseña.setText("¿Olvidaste Contraseña?");
        btnOlvidasteContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOlvidasteContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidasteContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btnOlvidasteContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButtonKeyPressed

    }//GEN-LAST:event_loginButtonKeyPressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
      ingresar ();
    }//GEN-LAST:event_loginButtonActionPerformed


    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    ingresar ();
}
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void btnOlvidasteContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidasteContraseñaActionPerformed
      FrmRecuperarClave frms = new FrmRecuperarClave();
      frms.toFront();
      frms.setVisible(true);
      dispose();
        
            }//GEN-LAST:event_btnOlvidasteContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOlvidasteContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
