package visual;
import conexion.conexion;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FrmRecuperarClave extends javax.swing.JFrame {

   public FrmRecuperarClave() {
        initComponents();
        txtClave1.setVisible(false);
        lblContraseñaRecuperada.setVisible(false);
        txtClave2.setVisible(false);
        lblContraseñaRecuperada1.setVisible(false);
        jButton1.setVisible(false);
    }
   
   public void cambiocont(){
        String admin1="admin";
        String user = txtusuario.getText();       
       String cont = txtClave1.getText();
       String confcont = txtClave2.getText(); 
       if("".equals(cont)|| ("".equals(confcont))){
                   JOptionPane.showMessageDialog(null, "ingrese datos");  
                txtClave1.requestFocus();
       }else{
           if(txtusuario.getText() == null ? admin1 == null : txtusuario.getText().equals(admin1)){
              if(txtClave1.getText().equals(txtClave2.getText())){
                   Connection con = new conexion().conectarbd();
        int resp =  JOptionPane.showConfirmDialog(null,"¿Desea guardad?","guardar",JOptionPane.YES_NO_OPTION);
 if(resp==0){
    String cont1 = txtClave1.getText(); 
    try {
        String sql= ("UPDATE usuarios SET  pass=?  WHERE username = ?");
        PreparedStatement pst=con.prepareCall(sql);
        pst.setString(1, cont);
        pst.setString(2, user);
        
        int a =pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "contraseña guardada");
    
    }catch (SQLException| HeadlessException e){
        
    }
       dispose();
       inicio_secion a=new inicio_secion();
       a.setVisible(true);
 }else{
     JOptionPane.showMessageDialog(null, "no se guardo la contraseña");
 }
           } 
           }else
            JOptionPane.showMessageDialog(null, "usuario no registrado");   
           
       }
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrmRecuperarClave = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblContraseñaRecuperada = new javax.swing.JLabel();
        lblContraseñaRecuperada1 = new javax.swing.JLabel();
        txtClave1 = new javax.swing.JPasswordField();
        txtClave2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        lblPreguntaSeguridad = new javax.swing.JLabel();
        lblRespuesta = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        cmbPregunta = new javax.swing.JComboBox<>();
        btnRecuperarContraseña = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperacion de contraseña");

        FrmRecuperarClave.setBackground(new java.awt.Color(0, 0, 0));
        FrmRecuperarClave.setPreferredSize(new java.awt.Dimension(600, 432));
        FrmRecuperarClave.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recuperación de contraseña");
        FrmRecuperarClave.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 290, 40));

        lblContraseñaRecuperada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseñaRecuperada.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseñaRecuperada.setText("Repetir contraseña");
        FrmRecuperarClave.add(lblContraseñaRecuperada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, 30));

        lblContraseñaRecuperada1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContraseñaRecuperada1.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseñaRecuperada1.setText("Contraseña nueva");
        FrmRecuperarClave.add(lblContraseñaRecuperada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, 30));
        FrmRecuperarClave.add(txtClave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 320, -1));
        FrmRecuperarClave.add(txtClave2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 320, -1));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FrmRecuperarClave.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        FrmRecuperarClave.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));
        FrmRecuperarClave.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 330, -1));

        lblPreguntaSeguridad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPreguntaSeguridad.setForeground(new java.awt.Color(255, 255, 255));
        lblPreguntaSeguridad.setText("Pregunta de Seguridad");
        FrmRecuperarClave.add(lblPreguntaSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 30));

        lblRespuesta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRespuesta.setForeground(new java.awt.Color(255, 255, 255));
        lblRespuesta.setText("Respuesta");
        FrmRecuperarClave.add(lblRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 30));
        FrmRecuperarClave.add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 330, -1));

        cmbPregunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿Cuál es tu color favorito?" }));
        cmbPregunta.setName("cmbPregunta"); // NOI18N
        cmbPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPreguntaActionPerformed(evt);
            }
        });
        FrmRecuperarClave.add(cmbPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 330, -1));

        btnRecuperarContraseña.setText("Recuperar Contraseña");
        btnRecuperarContraseña.setBorder(null);
        btnRecuperarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarContraseñaActionPerformed(evt);
            }
        });
        FrmRecuperarClave.add(btnRecuperarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 140, 30));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        FrmRecuperarClave.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrmRecuperarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrmRecuperarClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       cambiocont();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRecuperarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarContraseñaActionPerformed
        String color="rojo";
        String user = txtusuario.getText(); 
        
        if (txtRespuesta.getText() == null ? color == null : txtRespuesta.getText().equals(color)){
        txtClave1.setVisible(true);
        lblContraseñaRecuperada.setVisible(true);
        txtClave2.setVisible(true);
        lblContraseñaRecuperada1.setVisible(true);
        jButton1.setVisible(true);
 }else if("".equals(user)){
     JOptionPane.showMessageDialog(null, "ingrese datos"); 
 }else
            JOptionPane.showMessageDialog(null, "Respuesta incorecta");
    }//GEN-LAST:event_btnRecuperarContraseñaActionPerformed

    private void cmbPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPreguntaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        inicio_secion a=new inicio_secion();
       a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FrmRecuperarClave;
    private javax.swing.JButton btnRecuperarContraseña;
    private javax.swing.JComboBox<String> cmbPregunta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblContraseñaRecuperada;
    private javax.swing.JLabel lblContraseñaRecuperada1;
    private javax.swing.JLabel lblPreguntaSeguridad;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JPasswordField txtClave1;
    private javax.swing.JPasswordField txtClave2;
    private javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}
