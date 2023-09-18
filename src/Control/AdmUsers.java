package Control;
import java.util.ArrayList;
import model.*;

public class AdmUsers {
    private ArrayList<User> list_users = new ArrayList<>();
    
    public ArrayList<User> getList_users() {
        return list_users;
    }

    public void setList_users(ArrayList<User> list_users) {
        this.list_users = list_users;
    }
    
    public void fillList() {
        // Habría que hacer luego para que lea desde un archivo
        // Por ahora se crea como listado quemado en código
        list_users.add(new User(1, "admin", "12345", "¿Cuál es el nombre de tu mascota?", "1"));
        list_users.add(new User(2, "ealvarado", "12345", "¿Cuál es tu color favorito?", "2"));
        list_users.add(new User(3, "lfernandez", "12345", "¿Cuál es tu película favorita?", "3"));
        list_users.add(new User(4, "lcalero", "12345", "¿Qué me invento?", "4"));
    }
    
    public void saveUser(User user) {
        // Si es necesario, habría que hacer luego para que guarde el usuario modificado.
        // Por ejemplo, si se le actualiza la contraseña.
    }
}