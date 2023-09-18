package visual;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class splash_screnn extends javax.swing.JFrame{
    private Color trasparent;
public splash_screnn() {
          trasparent= new Color(0,0,0,0);
          setUndecorated(true);
         initComponents(); 
         setBackground(trasparent);
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel3, "src/imagen/cerrar.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, "src/imagen/logo.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel4, "src/imagen/fondo2.jpg");    
barradeprogreso();
    }
    
    
private void barradeprogreso() {
    Timer mTimer =new Timer(45, (ActionEvent e) -> {
        carga.setValue(carga.getValue()+1);
        carga.setBackground(Color.GREEN);
        carga.setStringPainted(true);
        carga.setString("Cargando "+carga.getValue()+ "%");
    });
   mTimer.start(); 

};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        carga = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 20, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO DE ESTUDIANTES  /  PROYECTOS");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 420, 40));
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 220));
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 79, 63));
        panel1.add(carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar carga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables


}
