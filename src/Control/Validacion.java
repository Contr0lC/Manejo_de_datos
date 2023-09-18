
package Control;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Validacion {
    public String leerCedula(String msj){
        String cedula="";
        Scanner sc=new Scanner(System.in);
        boolean bandera=true;
        int i=0;
        do{
            System.out.print(msj);
            cedula=sc.nextLine();
            bandera=true;
            cedula=cedula.trim();
            if(cedula.length()==10){
                for(i=0;i<cedula.length();i++){
                    if(!Character.isDigit(cedula.charAt(i))){
                        bandera=false;
                    }
                }
            }else
                bandera=false;
        }while(!bandera);
        return cedula;
    }
    
       boolean esCedula(String cedula) {
        boolean bandera=true;
        int i=0;
        if(cedula.length()==10){
            for(i=0;i<cedula.length();i++){
                if(!Character.isDigit(cedula.charAt(i))){
                    bandera=false;
                }
            }

        } else 
            bandera =false;
        return bandera;
    }
       
       char aChar(String entrada) {
        char  x= ' ';
        try{
            x=entrada.charAt(0);
        }catch(NumberFormatException ex){
            System.out.println("Se esperaba un dato char");
        }
        return x;
    }
    public double leerReal(String msj){
        double real=0;
        Scanner sc=new Scanner(System.in);
        boolean victor=true;                                  
        do{
           System.out.print(msj);
           victor=true;                                     
           try{
               real=sc.nextDouble();
               if(real<0){
                  victor=false;
               }
           }catch(InputMismatchException alex){
               System.out.print("\nError: Se esperaba un numero");
                victor = false;
                sc.nextLine();
            }
        }while(!victor);
        return real;
    }
    
      public char leerSexo(String msj){
        char sexo= ' ';
        Scanner sc=new Scanner(System.in);
        boolean alex=true;
        do{
          System.out.print(msj);
          sexo=sc.next().charAt(0);
          alex=true;
          if(Character.toUpperCase(sexo)=='F' || Character.toUpperCase(sexo)=='M'){
              alex=true;
          }else{
              alex=false;              
          }
        }while(!alex);
        return sexo;  
    }
    public int leerEntero(String msj){
        int x=0;
        boolean bandera=true;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print(msj);
            bandera=true;
            try{
                x=sc.nextInt();                
            }catch(InputMismatchException ex){
                System.out.print("\nError: Se esperaba numero");
                bandera = false;
                sc.nextLine();
            }
        }while(!bandera);
        return x;        
    }
    public String leerLetras(String msj){
        String letras="";
        Scanner sc=new Scanner(System.in);
        boolean bandera=true;
        int i=0;
        do{
            System.out.print(msj);
            letras=sc.nextLine();
            bandera=true;         
            for(i=0;i<letras.length();i++){
                if(!Character.isLetter(letras.charAt(i))&& letras.charAt(i) != KeyEvent.VK_SPACE){
                        bandera=false;
                }
            }
        }while(!bandera);
        return letras;
    }
    public LocalDate leerFecha(String msj){
        Scanner sc=new Scanner(System.in);
        LocalDate fecha=LocalDate.now(); 
        boolean bandera=true;
        do{
            System.out.print(msj);
            bandera=true; 
            try{
                fecha=LocalDate.parse(sc.nextLine());
            }catch(java.time.format.DateTimeParseException e){               
                bandera=false;
            }
        }while(!bandera);
        return fecha;
    }       
    double aReal (String entrada){
        double  x=0.0;
        try{
            x=Double.parseDouble(entrada);
        }catch(NumberFormatException ex){
            System.out.println("Se esperaba un numero");
        }
        return x;
    }
    boolean esReal(String entrada){
        boolean bandera=false;
        double x=0;
        try{
            x=Double.parseDouble(entrada);
            bandera=true;
            
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error: se esperaba un numero real.");
            bandera=false;
        }
        return bandera;
    }
    
    boolean dentroRango(String nombre,String entrada,double limInf,double limSup){
        boolean bandera=false;
        double x=aReal(entrada);
        if(x>=limInf&&x<=limSup)
            bandera=true;
        else
            bandera=false;
        if(!bandera)
            JOptionPane.showMessageDialog(null, "Error: "+nombre+ "debe estar entre "+limInf+" y "+limSup);
        return bandera;
    }
    int aEntero(String estatura){
        int x=0;
        try{
            x=Integer.parseInt(estatura);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "ERROR: Se esperaba un numero entero.");
        }
        return x;
    }
    
   public LocalDate aFecha(String entrada){
        LocalDate x=LocalDate.now();
        try{
            x=LocalDate.parse(entrada);
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Error");
        }
        return x;
    }
   
   public LocalDate aFecha1(String entrada) {
    LocalDate x = LocalDate.now();
    int edadMinimaRequerida = 18;
    
    try {
        x = LocalDate.parse(entrada);
    } catch (java.time.format.DateTimeParseException ex) {
        JOptionPane.showMessageDialog(null, "Error al parsear la fecha. Asegúrate de ingresar la fecha en el formato correcto (por ejemplo, yyyy-MM-dd).", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    LocalDate fechaActual = LocalDate.now();
    int edad = Period.between(x, fechaActual).getYears();
    
    if (edad >= edadMinimaRequerida) {
        // El usuario tiene la edad mínima requerida, continuar con la acción
        //JOptionPane.showMessageDialog(null, "¡Bienvenido! Puedes continuar con la acción.");
    } else {
        // El usuario no tiene la edad mínima requerida, mostrar mensaje de error
        JOptionPane.showMessageDialog(null, "Debes tener al menos " + edadMinimaRequerida + " años para continuar.", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    return x;
     }
public LocalDate FechaEntr(String entrada) {
    LocalDate x = LocalDate.now();
    int edadMinimaRequerida = 1;
    
    try {
        x = LocalDate.parse(entrada);
    } catch (java.time.format.DateTimeParseException ex) {
        JOptionPane.showMessageDialog(null, "Error al parsear la fecha. Asegúrate de ingresar la fecha en el formato correcto (por ejemplo, yyyy-MM-dd).", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    LocalDate fechaActual = LocalDate.now();
    int dias = Period.between(x, fechaActual).getDays();
    
    if (dias >= edadMinimaRequerida) {
        // El usuario tiene la edad mínima requerida, continuar con la acción
        //JOptionPane.showMessageDialog(null, "¡Bienvenido! Puedes continuar con la acción.");
    } else {
        // El usuario no tiene la edad mínima requerida, mostrar mensaje de error
        JOptionPane.showMessageDialog(null, "Debes tener al menos " + edadMinimaRequerida + " dia(s) de plazo para continuar.", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    return x;
     }
}
