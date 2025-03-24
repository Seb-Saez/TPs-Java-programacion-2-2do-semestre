package Tp3_kata;

public class Ejercicio1 {
    public static class Estudiante {
        String nombre;
        String apellido;
        String curso;
        double calificacion;

        // constructor
        public Estudiante(String nombre, String apellido, String curso, double calificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
        }

        // metodo para mostrar info
        public void mostrarInfo() {
            System.out.println(apellido + " " + nombre + " | Curso: " + curso + " | Calificación: " + calificacion);
        }

        // metodo p subir nota
        public void subirCalificacion(double puntos) {
            calificacion += puntos;
            if (calificacion > 10) {
                calificacion = 10;
            }
        }

        // metodo bajar nota
        public void bajarCalificacion(double puntos) {
            calificacion -= puntos;
            if (calificacion < 0) {
                calificacion = 0;
            }
        }
    }

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Ana", "García", "Matemáticas", 7.5);

        // mostrar info
        estudiante.mostrarInfo();

        // subir nota
        estudiante.subirCalificacion(2.0);
        estudiante.mostrarInfo();

        // bajar nota
        estudiante.bajarCalificacion(5.0);
        estudiante.mostrarInfo();
    }
}
