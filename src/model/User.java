package model;
import java.time.LocalDate;

public class User {
    private final int code;
    private String login;
    private String password;
    private String recoveryQuestion;
    private String recoveryAnswer;
    private final LocalDate create_date;
    private LocalDate write_date;
    private boolean active;
public static String user_update = "";


    public int getCode() {
        return code;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        this.setWrite_date(LocalDate.now());
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        this.setWrite_date(LocalDate.now());
    }

    public String getRecoveryQuestion() {
        return recoveryQuestion;
    }

    public void setRecoveryQuestion(String recoveryQuestion) {
        this.recoveryQuestion = recoveryQuestion;
    }

    public String getRecoveryAnswer() {
        return recoveryAnswer;
    }

    public void setRecoveryAnswer(String recoveryAnswer) {
        this.recoveryAnswer = recoveryAnswer;
    }

    public LocalDate getCreate_date() {
        return create_date;
    }

    public LocalDate getWrite_date() {
        return write_date;
    }

    public void setWrite_date(LocalDate write_date) {
        this.write_date = write_date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
        this.setWrite_date(LocalDate.now());
    }

    public User(int code, String login, String password,
            String recoveryQuestion, String recoveryAnswer) {
        this.code = code;
        this.login = login;
        this.password = password;
        this.recoveryQuestion = recoveryQuestion;
        this.recoveryAnswer = recoveryAnswer;
        this.active = true;
        LocalDate date_now = LocalDate.now();
        this.create_date = date_now;
        this.write_date = date_now;
    }

    @Override
    public String toString() {
        return "Código: " + code + 
                "\nUsuario: " + login +
                "\nContraseña: " + password + 
                "\nPregunta para recuperación: " + recoveryQuestion + 
                "\nRespuesta: " + recoveryAnswer + 
                "\nFecha de creación: " + create_date + 
                "\nFecha de modificación: " + write_date +
                "\nEstado: " + (active? "Activo": "Inactivo");
    }
}