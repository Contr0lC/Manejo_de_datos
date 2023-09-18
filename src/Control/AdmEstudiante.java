
package Control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import model.Estudiante;
import model.Parcial;

public class AdmEstudiante {
 
    private ArrayList<Estudiante> nomina=new ArrayList<>();
private static AdmEstudiante AdmEstudiante =null; //Inicio
private Estudiante e=null;
private int abrirFile=0;
   private  LocalDate dia = LocalDate.now();
   String cedula, nombre;
   String Hora,minuto,segundo,ampn;
   
   
   
   
public AdmEstudiante(){
       nomina=new ArrayList<>();
   }
public static AdmEstudiante getDatosEstudiante() {
        if(AdmEstudiante==null)
            AdmEstudiante=new AdmEstudiante();
        return AdmEstudiante;
    }

 public ArrayList<Estudiante> getNomina() {
        return nomina;
    }
    public void setNomina(ArrayList<Estudiante> nomina) {
        this.nomina = nomina;
    }
      public boolean noVacio(String cedula, String nombre, String sexo,
             String carrera, String parcial, String curso,String NombreProy,Date fechaNac,Date fechaEn,String Despro){
        boolean x=false;
        Validacion v=new Validacion();
        if(!nombre.isEmpty()&&!cedula.isEmpty()&&!sexo.isEmpty()&&!Despro.isEmpty()&&
                !carrera.isEmpty()&&!parcial.isEmpty()&&!curso.isEmpty()
                &&!NombreProy.isEmpty()&&fechaNac!=null&&fechaEn!=null)
            if(v.esCedula(cedula) )
            x=true;
        else
        JOptionPane.showMessageDialog(null,"Error: cedula debe de tener 10 digitos");
        return x;
    }
      public void guardar(String cedula, String nombre, String sexo,
             String carrera, String parcial,String curso, 
             String NombreProy,Date FechaNac,Date fechaEn,String Despro,
            JTextArea txtContenido, JLabel lblTotal) {
           Validacion v=new Validacion();
        LocalDate FechaLD=FechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaLf= fechaEn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            e=new Estudiante("", "", "","",LocalDate.now(),LocalDate.now(),' ', new Parcial("","",""));
            e.getParcial().setdescripPro(Despro);
            e.setfechaEn(fechaLf);
            e.setNombre(nombre);
            e.setCedula(cedula);
            e.setSexo(sexo.charAt(0));
            e.setFechaNac(v.aFecha1(FechaLD.toString()));
            e.setcurso(curso);
            e.setcarrera(carrera); 
            e.getParcial().setNumParcial(parcial);
            e.getParcial().setnombrePro(NombreProy);
            nomina.add(e);
            txtContenido.append(e.toString());
            lblTotal.setText(nomina.size()+"");
            
    }
      public void llenarTabla(JTable tblEstudiantes, JLabel lblTotal) {
        DefaultTableModel modelo =(DefaultTableModel)tblEstudiantes.getModel();
        int fila=0;
        if(nomina.size()>0){
            for(Estudiante est:nomina){
                   llenarFila(tblEstudiantes, fila, est);
                fila++;
            }
            lblTotal.setText(nomina.size()+"");
        }
    }
        
       private void llenarFila(JTable tblEstudiantes, int fila, Estudiante est){
         DefaultTableModel modelo = (DefaultTableModel)tblEstudiantes.getModel();
          modelo.addRow(new Object [1]);
                tblEstudiantes.setValueAt(fila+1 , fila, 0);
                tblEstudiantes.setValueAt(est.getCedula(), fila, 1);
                tblEstudiantes.setValueAt(est.getNombre(), fila, 2);
                tblEstudiantes.setValueAt(est.getFechaNac(), fila, 3);
                tblEstudiantes.setValueAt(est.calcularEdad(), fila, 4);
                tblEstudiantes.setValueAt((est.getSexo()=='F'?"Femenino":"Masculino"), fila, 5);
                tblEstudiantes.setValueAt(est.getcarrera(), fila, 6);
                tblEstudiantes.setValueAt(est.getParcial().getParcial(), fila, 7);
                tblEstudiantes.setValueAt(est.getcurso(), fila, 8);
                tblEstudiantes.setValueAt(est.getParcial().getnombrePro(), fila, 9);
                tblEstudiantes.setValueAt(est.getfechaEn(), fila, 10);
                tblEstudiantes.setValueAt(est.calcularFecha(), fila, 11);
                tblEstudiantes.setValueAt(est.getParcial().getdescripPro(), fila, 12);
         
     }

    public void eliminar (JTable tblEstudiantes, JLabel lblTotal){
      DefaultTableModel modelo=(DefaultTableModel)tblEstudiantes.getModel();
      int posicion=tblEstudiantes.getSelectedRow();
      if(posicion>=0){
          modelo.removeRow(posicion);
          nomina.remove(posicion);
          lblTotal.setText(nomina.size()+"");
         
         
           try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/recursos/historial.txt", true))) {
            writer.write("Estudiante con el nombre de: "+"["+nombre +"]"+" con cedula "+"["+ cedula +"]"+" "
                    + "fue eliminado el dia: "+"["+dia+"]"+" a la hora de: "+"["+Hora+":"+minuto+":"+segundo+" "+ampn+"]");
            writer.newLine(); // Agregar una nueva línea después de cada entrada.
            System.out.println("Información guardada exitosamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al guardar la información en el archivo: " + e.getMessage());
        }
          
          
      }      
    }
     private ArrayList buscarEstudiantes(String datoBuscado, int tipoDatoBuscado) {
        //tipoDatoBuscado = 0, se busca cédula
        //tipoDatoBuscado = 1, se busca nombre
        ArrayList<Estudiante> estEncontrados = new ArrayList<>();
        
        // Para eliminar espacios y tomar sólo la primera palabra de datoBuscado
        datoBuscado = datoBuscado.replaceAll("\\s+", " ");          // Reemplaza todos los dobles, triples, etc., espacios por uno
        String[] datoBuscadoEnPartes = datoBuscado.split("\\s");    // Divide al String en partes, por cada espacio que encuentre
        String datoBuscadoFiltrado = datoBuscadoEnPartes[0];        // Se obtiene el primer String de lo divido y que contiene la primera palabra
        
        switch (tipoDatoBuscado) {
            case 0 -> {
                for (Estudiante est: nomina) {
                    if (est.getCedula().contains(datoBuscadoFiltrado))
                        estEncontrados.add(est);
                }
            }
            case 1 -> {
                for (Estudiante est: nomina) {
                    // En la siguiente línea, se convierte tanto el nombre como el dato buscado a minúsculas
                    // y se procede a preguntar si el nombre del estudiante contiene el dato buscado
                    if (est.getNombre().toLowerCase().contains(datoBuscadoFiltrado.toLowerCase()))
                        estEncontrados.add(est);
                }
            }
        }
        return estEncontrados;
    }

    public void listarEncontrados(JTable tblEstudiantes, JLabel lblTotal, String datoBuscado, int tipoDatoBuscado) {
        ArrayList<Estudiante> estEncontrados = null;
        estEncontrados = buscarEstudiantes(datoBuscado, tipoDatoBuscado);
        if (estEncontrados.isEmpty()) {
            String msj;
            if (tipoDatoBuscado == 0)
                msj = "No existe estudiante en nómina con la cédula [" + datoBuscado + "] ingresada.";
            else
                msj = "No existe estudiante en nómina con el nombre [" + datoBuscado + "] ingresado.";
            JOptionPane.showMessageDialog(null, msj, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int fila=0;
            if(!nomina.isEmpty()){
            for(Estudiante est:nomina){
                   llenarFila(tblEstudiantes, fila, est);
                fila++;
            }
            lblTotal.setText(nomina.size()+"");
        }
        }
    
    }


    public void Eguardar(String cedula, String nombre, String sexo, 
            String carrera, String parcial, String curso, String NombreProy, 
            Date fechaNac, Date fechaEn, String Despro) {
        Validacion v =new Validacion();
        LocalDate fechaLD=fechaNac.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaLf= fechaEn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
           boolean estEncontrado = false;  // Un flag para saber si se encontró al estudiante.
            int indexEstEncontrado = 0;     // Guardaremos aquí la posición del elemento en la nómina.
            for (Estudiante est: nomina) {
                if (est.getCedula().equals(cedula)) {
                    estEncontrado = true;
                    break;
                }
                indexEstEncontrado++;
            }
            if (estEncontrado) {
                nomina.get(indexEstEncontrado).setCedula(cedula);
                nomina.get(indexEstEncontrado).setNombre(nombre);
                nomina.get(indexEstEncontrado).getParcial().setNumParcial(parcial); 
                nomina.get(indexEstEncontrado).setcurso(curso);
                nomina.get(indexEstEncontrado).setcarrera(carrera);
                nomina.get(indexEstEncontrado).setFechaNac(fechaLD);
                nomina.get(indexEstEncontrado).setfechaEn(fechaLf);
                nomina.get(indexEstEncontrado).setSexo(v.aChar(sexo));
                nomina.get(indexEstEncontrado).getParcial().setNumParcial(parcial);
                nomina.get(indexEstEncontrado).getParcial().setnombrePro(NombreProy);
                nomina.get(indexEstEncontrado).getParcial().setdescripPro(Despro);
                JOptionPane.showMessageDialog(null, "Datos actualizados con éxito.", 
                        "INFO", JOptionPane.INFORMATION_MESSAGE);
            }else {
               JOptionPane.showMessageDialog(null, "Los datos NO se actualizaron .", 
                        "ERROR", JOptionPane.ERROR_MESSAGE);
           }
    }

    public void filtrarXSexoYEdad(String edad, String sexo, JTable tblEstudiantes, JLabel lblTotal) {
 DefaultTableModel modelo = (DefaultTableModel)tblEstudiantes.getModel();
        Validacion v = new Validacion();
        int fila=0;
        int edadI=v.aEntero(edad);
        modelo.setNumRows(0);
        if(!nomina.isEmpty()){
            for(Estudiante est:nomina){//for sin indice o for each
                if(sexo.compareTo("Femenino")==0){//verificando lo seleccionado en el combo
                    if(est.getSexo()=='F'&&est.getEdad()==edadI){
                        llenarFila(tblEstudiantes, fila, est);
                        fila++;
                    }else
                    JOptionPane.showMessageDialog(null, "No existen registros con ese filto",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                }else if(sexo.compareTo("Masculino")==0){
                    if(est.getSexo()=='M'&&est.getEdad()==edadI){
                        llenarFila(tblEstudiantes, fila, est);
                        fila++;
                    }else
        JOptionPane.showMessageDialog(null, "No existen registros con ese filto",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                }else if(sexo.compareTo("Todos")==0){
                    if(est.getEdad()==edadI){
                        llenarFila(tblEstudiantes, fila, est);
                        fila++;
                    }else
        JOptionPane.showMessageDialog(null, "No existen registros con ese filto",
                "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            lblTotal.setText(fila+"");
        }
    }
   


      public void filtrarXNombre(JTable tblEstudiantes, JLabel lblTotal, String nombre,int tipoDatoBuscado) {
          ArrayList<Estudiante> estEncontrados = null;
        estEncontrados = buscarEstudiantes(nombre, tipoDatoBuscado);
        DefaultTableModel modelo=(DefaultTableModel)tblEstudiantes.getModel();
        if (estEncontrados.size() == 0) {
            String msj;
            if (tipoDatoBuscado == 0)
                msj = "No existe estudiante en nómina con la cédula [" + nombre + "] ingresada.";
            else
                msj = "No existe estudiante en nómina con el nombre [" + nombre + "] ingresado.";
            JOptionPane.showMessageDialog(null, msj, "ERROR", JOptionPane.ERROR_MESSAGE);
        }else {
        int fila=0;
        modelo.setRowCount(0); 
        if(nomina.size()>0){
                for(Estudiante e:nomina){
                    if(nombre.compareTo(e.getNombre())==0){                                      
                        llenarFila(tblEstudiantes,fila,e);
                        fila++;
                    }               
                }
             lblTotal.setText(fila+"");
        }
        }
    }
    public void filtrarXCedula(JTable tblEstudiantes, JLabel lblTotal, String cedula, int tipoDatoBuscado) {
        ArrayList<Estudiante> estEncontrados = null;
        estEncontrados = buscarEstudiantes(cedula, tipoDatoBuscado);
        DefaultTableModel modelo=(DefaultTableModel)tblEstudiantes.getModel();
        if (estEncontrados.size() == 0) {
            String msj;
            if (tipoDatoBuscado == 0)
                msj = "No existe estudiante en nómina con la cédula [" + cedula + "] ingresada.";
            else
                msj = "No existe estudiante en nómina con el nombre [" + cedula + "] ingresado.";
            JOptionPane.showMessageDialog(null, msj, "ERROR", JOptionPane.ERROR_MESSAGE);
        }else {
        int fila=0;
        Validacion v=new Validacion();
        modelo.setRowCount(0); 
        if(nomina.size()>0){
                for(Estudiante e:nomina){
                    if(cedula.compareTo(e.getCedula())==0){                                      
                        llenarFila(tblEstudiantes,fila,e);
                        fila++;
                    }               
                }
             lblTotal.setText(fila+"");
        }
        }
    }
    public void filtrarXCedulafrm(JTable tblEstudiantes, JLabel lblTotal, String cedula) {
        DefaultTableModel modelo=(DefaultTableModel)tblEstudiantes.getModel();
        int fila=0;
        Validacion v=new Validacion();
        modelo.setRowCount(0); 
        if(nomina.size()>0){
                for(Estudiante e:nomina){
                    if(cedula.compareTo(e.getCedula())==0){                                      
                        llenarFila(tblEstudiantes,fila,e);
                        fila++;
                    }               
                }
             lblTotal.setText(fila+"");
        }
    }
}
