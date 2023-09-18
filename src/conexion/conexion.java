
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class conexion {
       private String nombrebd ="registro_proyecto";
       private final String usuario ="root";
       private String password ="";
       private String url ="jdbc:mysql://localhost:3306/registro_proyecto";
       PreparedStatement ps=null;
       Connection con; 
       
       
       public Connection conectarbd() {
           try{
         //Class.forName("com.mysql.jdbc.driver");
         con=DriverManager.getConnection(url,usuario,password);
         System.out.print("\n se conecto correctamente "+nombrebd);
        }catch (Exception ex){
        //System.out.print("no se conecto "+nombrebd);
         JOptionPane.showMessageDialog(null, "no se pudo conectar con: "+nombrebd,
                "ERROR", JOptionPane.ERROR_MESSAGE);
    }
        return con;
    }
        public Connection conectarbdE() {
           try{
         //Class.forName("com.mysql.jdbc.driver");
         con=DriverManager.getConnection(url,usuario,password);
         System.out.print("\n se conecto correctamente de pruvas "+nombrebd);
        }catch (Exception ex){
        System.out.print("no se conecto "+nombrebd);
    }
        return con;
    }
   
}
