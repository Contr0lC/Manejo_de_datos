package model;
import java.util.HashMap;
import java.util.Map;
import visual.inicio_secion;

public class DatosUsuarios {

    private Map<String, String> usuarios = new HashMap<>();
    private Map<String, String> preguntasSeguridad = new HashMap<>();

    public DatosUsuarios() {
        // Ejemplo: Agregar algunos usuarios predefinidos para demostración
        usuarios.put("usuario1", "contraseña123");
        usuarios.put("usuario2", "clave456");
        usuarios.put("usuario3", "secreto789");

        // Ejemplo: Agregar algunas preguntas de seguridad predefinidas para demostración
        preguntasSeguridad.put("usuario1", "¿Cuál es el nombre de tu mascota?");
        preguntasSeguridad.put("usuario2", "¿Cuál es tu color favorito?");
        preguntasSeguridad.put("usuario3", "¿Cuál es tu película favorita?");

    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio_secion().setVisible(true);
            }
        });
    }

    public Map<String, String> getUsuarios() {
        return usuarios;
    }

    public Map<String, String> getPreguntasSeguridad() {
        return preguntasSeguridad;
    }
    
    
    
}