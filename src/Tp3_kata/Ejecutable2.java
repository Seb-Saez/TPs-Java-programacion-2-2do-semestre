package Tp3_kata;

public class Ejecutable2 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Estudiante estudiante1 = new Estudiante("Cinthia", "Rigoni", "Programacion", 7.5);

        estudiante1.mostrarInfo();

        estudiante1.subirCalificacion(9);
        System.out.println(estudiante1.getCalificacion());

        estudiante1.bajarCalificacion(4.5);
        System.out.println(estudiante1.getCalificacion());

    }
}
