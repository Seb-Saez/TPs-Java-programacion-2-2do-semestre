package Tp5_UML_basico;

public class Usuario {
    private static int contadorUsuarios = 101;
    int userID;
    String nombre;

    public Usuario(String nombre) {
        this.userID = contadorUsuarios++;
        this.nombre = nombre;
    }

    public int getUserID() {
        return userID;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
