
package model;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private String carrera;
    private String curso;
    private Parcial parcial=new Parcial("","","");
   public Estudiante(String carrera,String curso, String nombre, String cedula,
        LocalDate fechaNac,LocalDate fechaEn,char sexo, Parcial parcial) {
        super(nombre, cedula,fechaNac,fechaEn,sexo);
        this.carrera = carrera;
        this.curso =curso;
        this.parcial = parcial;     
    }





    public Parcial getParcial() {
        return parcial;
    }

    public void setParcial(Parcial parcial) {
        this.parcial = parcial;
    }
     public String getcurso(){
        return curso;
    }
    public void setcurso (String curso){
        this.curso=curso;
    }
    
    public String getcarrera(){
        return carrera;
    }
    public void setcarrera(String carrera){
        this.carrera=carrera;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nCarrera: " + carrera+"\nCurso: "+curso+ parcial.toString();
    }
    public String saludo(){
        return "hola 2021";
    }

    @Override
    public String mensaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
