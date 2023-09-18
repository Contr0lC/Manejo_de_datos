
package visual;
import javax.swing.table.DefaultTableModel;
import Control.AdmEstudiante;
import conexion.conexion;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class FrmEliminarEst extends javax.swing.JInternalFrame {
    private  LocalDate dia = LocalDate.now();
       conexion con = new conexion(); 
       java.sql.Connection co= con.conectarbdE();
   private AdmEstudiante admE= AdmEstudiante.getDatosEstudiante();
    public FrmEliminarEst(java.awt.Frame parent, boolean modal) {
        initComponents();
        calculartime();
    }
 
String Hora,minuto,segundo,ampn;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTotal = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        txtCedulaNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cmbCedulaNombre = new javax.swing.JComboBox<>();
        lblCedulaNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Eliminar");

        lblTotal.setText("_______");

        btnEliminar.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro.", "Cedula", "Nombre", "Fecha Nac.", "Edad", "Sexo", "Carrera", "Parcial", "Curso", "Nom..Proyecto", "Fecha Entrega", "Plaso de Entrega", "Des pro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEstudiantes);

        txtCedulaNombre.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        txtCedulaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaNombreActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cmbCedulaNombre.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        cmbCedulaNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombre" }));
        cmbCedulaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCedulaNombreActionPerformed(evt);
            }
        });

        lblCedulaNombre.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        lblCedulaNombre.setText("Buscar por:");

        jLabel1.setText("Total:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("Eliminar registros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(lblCedulaNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnBuscar)))
                .addContainerGap(461, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(563, 563, 563)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotal))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaNombre)
                    .addComponent(btnBuscar)
                    .addComponent(txtCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTotal)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void calculartime() {
Calendar calendario = new GregorianCalendar();
Date fechaHoraActual= new Date();
String tiempo= "";
calendario.setTime(fechaHoraActual);
ampn= calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
if(ampn.equals("PM")){
    int h=calendario.get(Calendar.HOUR_OF_DAY);
    Hora=h>9?""+h:"0"+h;
}else{
    Hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
} 
minuto=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
segundo=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);


}
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i =  JOptionPane.showConfirmDialog(null,"¿Desea eliminar este estudiante?","Eliminar",JOptionPane.YES_NO_OPTION);
        if (i==0){
            admE.eliminar(tblEstudiantes, lblTotal);
            
            
             try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/recursos/historial.txt", true))) {
            writer.write("Estudiante  con cedula "+"["+ txtCedulaNombre.getText() +"]"+" "
                    + "fue Eliminado el dia: "+"["+dia+"]"+" a la hora de: "+"["+Hora+":"+minuto+":"+segundo+" "+ampn+"]");
            writer.newLine(); // Agregar una nueva línea después de cada entrada.
            System.out.println("Información guardada exitosamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar la información en el archivo: " + e.getMessage());
        }
             
             
             
                  try {
        PreparedStatement ps=co.prepareStatement("INSERT INTO historial(mensaje,Cedula,FECHA, HORA) VALUES (?,?,?,?)");
        ps.setString(1,"Fue Eliminado el Estudiante con cedula" );
        ps.setString(2,txtCedulaNombre.getText() );
        ps.setString(3,dia.toString() );
        ps.setString(4, Hora+":"+minuto+":"+segundo+" "+ampn);
        ps.executeUpdate();
        System.out.println("\n  guardo la información en ela base de datos: ");
       
                
    }catch (SQLException e){
        System.err.println("\n Error al guardar la información en ela base de datos: " + e.getMessage());
    }
        }else if(i==1){

    }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCedulaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaNombreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       DefaultTableModel md = (DefaultTableModel)tblEstudiantes.getModel();
        if (txtCedulaNombre.getText().isEmpty()) {
       JOptionPane.showMessageDialog(null, "No se ingresaron los datos a buscar",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        }else 
        md.getDataVector().removeAllElements();
        md.fireTableDataChanged();
        // Se obtiene qué tipo de dato se va a buscar: Cédula o Nombre
        String tipoDatoBuscadoStr = String.valueOf(cmbCedulaNombre.getSelectedItem());
        int tipoDatoBuscado = 0;
        if (tipoDatoBuscadoStr.equals("Cedula"))
        tipoDatoBuscado = 0;
        else if (tipoDatoBuscadoStr.equals("Nombre"))
        tipoDatoBuscado = 1;

        if (tipoDatoBuscado==0){
           admE.filtrarXCedula(tblEstudiantes, lblTotal, txtCedulaNombre.getText(),tipoDatoBuscado);
        } else if (tipoDatoBuscado==1){
            admE.filtrarXNombre(tblEstudiantes, lblTotal, txtCedulaNombre.getText(), tipoDatoBuscado);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbCedulaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCedulaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCedulaNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbCedulaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedulaNombre;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTextField txtCedulaNombre;
    // End of variables declaration//GEN-END:variables
}
