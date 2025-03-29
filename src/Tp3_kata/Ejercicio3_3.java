package Tp3_kata;
import java.time.Year; // Importamos para obtener el anio actual

public class Ejercicio3_3 {
    public static class Libro {
        // Atributos privados
        private String titulo;
        private String autor;
        private int anioPublicacion;

        // Constructor
        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            setAnioPublicacion(anioPublicacion); // Usamos el setter para aplicar validacion
        }

        // Métodos Getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAnioPublicacion() {
            return anioPublicacion;
        }

        // Método Setter con validacion
        public void setAnioPublicacion(int nuevoAnio) {
            int anioActual = Year.now().getValue(); // Obtiene el anio actual
            if (nuevoAnio >= 1900 && nuevoAnio <= anioActual) {
                this.anioPublicacion = nuevoAnio;
            } else {
                System.out.println("Error: Anio de publicacion invalido (debe ser entre 1900 y " + anioActual + ")");
            }
        }

        // Método para mostrar informacion del libro
        public void mostrarInfo() {
            System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | Anio de Publicacion: " + anioPublicacion);
        }

    }
        // Método main para probar la clase
        public static void main(String[] args) {
            // Crear un objeto de la clase Libro
            Libro libro1 = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez", 1967);
            libro1.mostrarInfo();

            // Intentar modificar el anio con un valor invalido
            libro1.setAnioPublicacion(1800); // Deberia mostrar error

            // Intentar modificar el anio con un valor valido
            libro1.setAnioPublicacion(2005);
            libro1.mostrarInfo(); // Mostrar informacion actualizada
        }
}
