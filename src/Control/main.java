
package Control;
import java.util.logging.Level;
import java.util.logging.Logger;
import visual.inicio_secion;
import visual.splash_screnn;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable mRun = () -> {
            splash_screnn msplash = new splash_screnn();
        msplash.setVisible(true);
        
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            msplash.dispose();
            
          inicio_secion frm = new inicio_secion();
        frm.setVisible(true);
        };
   
     Thread mHiloSplash =new Thread (mRun);
     mHiloSplash.start();
        
        
    }
    
}
