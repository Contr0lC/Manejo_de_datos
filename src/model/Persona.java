
package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Persona {

    protected String cedula;
    protected String nombre;
    protected char sexo;
    protected LocalDate fechaNac;
    protected LocalDate fechaEn;
    protected int edad;
    protected int Dem;
    
    public Persona(String nombre, String cedula,LocalDate fechaNac,LocalDate fechaEn, char sexo) {
        this.nombre = nombre;
        this.fechaEn= fechaEn;
        this.cedula = cedula;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        Dem=calcularFecha();
        edad = calcularEdad();
    }


    public final int calcularEdad() {
        return LocalDate.now().getYear() - fechaNac.getYear();
    }
     public final int calcularFecha() {
        return fechaEn.getDayOfYear() - LocalDate.now().getDayOfYear();
    }

 public String verSexo(){
        String x="";
        if(Character.toUpperCase(sexo)=='F'){
            x="Femenino";
        }else if(Character.toUpperCase(sexo)=='M'){
            x="Masculino";
        }
        return x; 
    }
    
    public LocalDate getfechaEn() {
        return fechaEn;
    }
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }


    public char getSexo() {
        return sexo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public int getEdad() {
        return edad;
    }
    public int getDem() {
        return Dem;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


     public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
        this.edad = calcularEdad();
    }
    public void setfechaEn(LocalDate fechaEn) {
        this.fechaEn = fechaEn;
        this.Dem = calcularFecha();
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDem(int Dem) {
        this.Dem = Dem;
    }


    @Override
    public String toString() {
        return "\n*******************" + 
                "\nNombre:" + nombre
                + "\nCedula: " + cedula
                + "\nFecha de Nacimiento: " 
                + fechaNac.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                +"\nFecha de Entrega: " 
                + fechaEn.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                +"\nPlazo para la Entregar el Proyecto: " +Dem +" Dias"
                + "\nEdad: " + edad + " año(s)"
                + "\nSexo: " + (sexo=='F'?"Femenino":"Masculino");
    }
    public abstract String mensaje();

    
}