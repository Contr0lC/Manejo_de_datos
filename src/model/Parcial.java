
package model;

public class Parcial {
    private String Parcial;
    private String nombrePro;
    private String descripPro;
    

    public Parcial(String Parcial,String nombrePro, String descripPro) {
        this.nombrePro = nombrePro;
        this.descripPro = descripPro;
        this.Parcial=Parcial;
    }


//set
    
    public void setNumParcial(String NumParcial){
        this.Parcial = NumParcial;
    }
    public void setnombrePro(String nombrePro) {
       this.nombrePro = nombrePro;
    }
      public void setdescripPro(String descripPro) {
        this.descripPro = descripPro;
    }

//get
      
    public String getnombrePro() {
        return nombrePro;
    }

    public String getdescripPro() {
        return descripPro;
    }
      public String getParcial(){
        return Parcial;
    }

    @Override
     public String toString(){
        return "\nParcial: " + Parcial 
               + "\nNombre del proyecto: " + nombrePro
               + "\nDescripción del proyecto: " + descripPro ;
    }
}


