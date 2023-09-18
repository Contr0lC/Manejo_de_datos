package visual;
import Control.AdmEstudiante;
import conexion.conexion;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEditarEstudiantes extends javax.swing.JInternalFrame {
    
private  LocalDate dia = LocalDate.now();
String Hora,minuto,segundo,ampn;
conexion con = new conexion(); 
       java.sql.Connection co= con.conectarbdE();

private AdmEstudiante admE= AdmEstudiante.getDatosEstudiante();
    public FrmEditarEstudiantes(java.awt.Frame parent, boolean modal) {
        initComponents();
        calculartime();
        bloquear();
    }
         
    public void bloquear(){
        for(Component a: jPanel1.getComponents()){
           a.setEnabled(false);
        
        } 
           txtDesPro.setEnabled(false);
           dtcEntrega.setVisible(false);
           dtcFecha.setVisible(false);
          
    }
      public void desbloquear(){
        for(Component a: jPanel1.getComponents()){
           a.setEnabled(true);
           
        } 
           txtDesPro.setEnabled(true);
           dtcEntrega.setVisible(true);
           dtcFecha.setVisible(true);
           
    }
      public void bloquear_desbloquear(){
      if(btn_bloquear_desbloquear.isSelected()){
          desbloquear();
          btn_bloquear_desbloquear.setText("Bloquear"); 
      }else{
          bloquear();
          btn_bloquear_desbloquear.setText("Desbloquear");
      }
          
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        lblCedulaNombre = new javax.swing.JLabel();
        txtCedulaNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cmbCedulaNombre = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dtcFecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cmbCarrera = new javax.swing.JComboBox<>();
        cmbcurso = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbParcial = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtNomProyec = new javax.swing.JTextField();
        dtcEntrega = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDesPro = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_bloquear_desbloquear = new javax.swing.JToggleButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Editar");

        tblEstudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblEstudiantes.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
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
        tblEstudiantes.setCellSelectionEnabled(true);
        tblEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstudiantes);

        lblCedulaNombre.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        lblCedulaNombre.setText("Buscar por:");

        txtCedulaNombre.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        txtCedulaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaNombreActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cmbCedulaNombre.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        cmbCedulaNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombre" }));
        cmbCedulaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCedulaNombreActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        jLabel6.setText("Sexo:");

        cmbSexo.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculimo", "Femenino" }));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel4.setText("Nombre: ");

        txtCedula.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha de ");
        jLabel3.setDoubleBuffered(true);

        dtcFecha.setBackground(java.awt.Color.white);
        dtcFecha.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        jLabel8.setText("Carrera:");

        cmbCarrera.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        cmbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software", "Medicina", "Jurisprudencia" }));

        cmbcurso.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        cmbcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2-1", "2-2", "2-3", "2-4", "2-5" }));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel9.setText("Parcial:");

        cmbParcial.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        cmbParcial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primero", "Segundo" }));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel10.setText("Curso:");

        txtNomProyec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProyecActionPerformed(evt);
            }
        });
        txtNomProyec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomProyecKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        jLabel5.setText("Descripcion del Proyecto:");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel7.setText("Fecha de entrega:");

        txtDesPro.setColumns(20);
        txtDesPro.setRows(5);
        txtDesPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDesProMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(txtDesPro);

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel11.setText("Nombre del");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        jLabel13.setText("proyecto:");

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Nacimiento:");
        jLabel14.setDoubleBuffered(true);

        btnActualizar.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblTotal.setText("_______");

        jLabel1.setText("Total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cmbParcial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel11))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel13)))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNomProyec, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dtcEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(147, 147, 147))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtNomProyec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtcEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(cmbcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbParcial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(dtcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(jLabel1)))))
        );

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("Editar registros");

        btn_bloquear_desbloquear.setText("Desbloquear");
        btn_bloquear_desbloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bloquear_desbloquearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCedulaNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(btn_bloquear_desbloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedulaNombre)
                            .addComponent(btnBuscar)
                            .addComponent(txtCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCedulaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_bloquear_desbloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstudiantesMouseClicked
        int row = tblEstudiantes.getSelectedRow();
        DefaultTableModel md = (DefaultTableModel)tblEstudiantes.getModel();
        txtCedula.setText(md.getValueAt(row, 1).toString());
        txtNombre.setText(md.getValueAt(row, 2).toString());
        txtNomProyec.setText(md.getValueAt(row,9).toString());
        cmbParcial.setSelectedItem(md.getValueAt(row, 7).toString());
        cmbcurso.setSelectedItem(md.getValueAt(row,8).toString());
        txtDesPro.setText(md.getValueAt(row, 12).toString());
        

        // Carrera: Software, Medicina, Jurisprudencia
        if (md.getValueAt(row, 6).toString().equals("Software"))
        cmbCarrera.setSelectedItem("Software");
        else if (md.getValueAt(row, 6).toString().equals("Medicina"))
        cmbCarrera.setSelectedItem("Medicina");
        else if (md.getValueAt(row, 6).toString().equals("Jurisprudencia"))
        cmbCarrera.setSelectedItem("Jurisprudencia");

        // Sexo: Masculino, Femenino
        cmbSexo.setSelectedItem(md.getValueAt(row,5).toString());
        // Fecha de nacimiento
        String fechaNacStr = md.getValueAt(row, 3).toString();
        String fechaEntStr = md.getValueAt(row, 10).toString();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNac = new Date();
        Date fechaEn = new Date();
        try {
            fechaNac = formato.parse(fechaNacStr);
            fechaEn = formato.parse(fechaEntStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dtcFecha.setDate(fechaNac);
        dtcEntrega.setDate(fechaEn);
    }//GEN-LAST:event_tblEstudiantesMouseClicked

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
            admE.filtrarXCedula(tblEstudiantes, lblTotal, txtCedulaNombre.getText(), tipoDatoBuscado);
        } else if (tipoDatoBuscado==1){
            admE.filtrarXNombre(tblEstudiantes, lblTotal, txtCedulaNombre.getText(), tipoDatoBuscado);
        }else if (tipoDatoBuscado>1){
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbCedulaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCedulaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCedulaNombreActionPerformed
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
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

         String nombre=txtNombre.getText().trim(),
        cedula=(String)txtCedula.getText().trim(),
        sexo=(String)cmbSexo.getSelectedItem(),
        carrera=(String)cmbCarrera.getSelectedItem(),
        parcial=(String)cmbParcial.getSelectedItem(),
        curso=(String)cmbcurso.getSelectedItem(),
        Despro=txtDesPro.getText().trim(),
        NombreProy=txtNomProyec.getText().trim();
        Date fechaEn=dtcEntrega.getDate();
        Date fechaNac=dtcFecha.getDate();
        if (admE.noVacio(cedula, nombre, sexo, carrera,
            parcial, curso, NombreProy,fechaNac,fechaEn,Despro)) {
        admE.Eguardar(cedula, nombre, sexo,  carrera,
            parcial, curso, NombreProy,fechaNac,fechaEn,Despro);
        
        
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/recursos/historial.txt", true))) {
            writer.write("Estudiante con cedula "+"["+ cedula +"]"+" "
                    + "fue Editado el dia: "+"["+dia+"]"+" a la hora de: "+"["+Hora+":"+minuto+":"+segundo+" "+ampn+"]");
            writer.newLine(); // Agregar una nueva línea después de cada entrada.
            System.out.println("Información guardada exitosamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar la información en el archivo: " + e.getMessage());
        }
            
                     try {
        PreparedStatement ps=co.prepareStatement("INSERT INTO historial(mensaje,Cedula,FECHA, HORA) VALUES (?,?,?,?)");
        ps.setString(1,"Fue Editado el Estudiante con cedula" );
        ps.setString(2,txtCedulaNombre.getText() );
        ps.setString(3,dia.toString() );
        ps.setString(4, Hora+":"+minuto+":"+segundo+" "+ampn);
        ps.executeUpdate();
        System.out.println("\n  guardo la información en ela base de datos: ");
       
                
    }catch (SQLException e){
        System.err.println("\n Error al guardar la información en ela base de datos: " + e.getMessage());
    }
        
        

        }else
        JOptionPane.showMessageDialog(null, "Debe ingresar todos los campos.",
            "ERROR", JOptionPane.ERROR_MESSAGE);       
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtNomProyecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomProyecKeyTyped

    }//GEN-LAST:event_txtNomProyecKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)&&c!=' ')
        evt.consume();
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed

    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c=evt.getKeyChar();
        if(!Character.isLetter(c)&&!Character.isSpaceChar(c))
        evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNomProyecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProyecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomProyecActionPerformed

    private void txtDesProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDesProMouseClicked
txtDesPro.setText(txtDesPro.getText());
    }//GEN-LAST:event_txtDesProMouseClicked

    private void btn_bloquear_desbloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bloquear_desbloquearActionPerformed
       bloquear_desbloquear();
    }//GEN-LAST:event_btn_bloquear_desbloquearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JToggleButton btn_bloquear_desbloquear;
    private javax.swing.JComboBox<String> cmbCarrera;
    private javax.swing.JComboBox<String> cmbCedulaNombre;
    private javax.swing.JComboBox<String> cmbParcial;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbcurso;
    private com.toedter.calendar.JDateChooser dtcEntrega;
    private com.toedter.calendar.JDateChooser dtcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCedulaNombre;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaNombre;
    private javax.swing.JTextArea txtDesPro;
    private javax.swing.JTextField txtNomProyec;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
