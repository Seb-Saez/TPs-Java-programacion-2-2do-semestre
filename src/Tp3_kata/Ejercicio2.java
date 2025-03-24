package Tp3_kata;

public class Ejercicio2 {
    public static class mascotas {
        String nombre;
        String especie;
        int edad;

        // Constructor
        public mascotas(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }

        // mostrar info
        public void mostrarInfo() {
            System.out.println("Nombre de la mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad);
        }

        // metodo cumplir años
        public void cumplirAnios() {
            System.out.println("Feliz cumple mascotita, tu anterior edad era: " + edad);
            edad += 1;
            System.out.println("Tu nueva edad es: " + edad);
        }

        // Getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        mascotas mascota1 = new mascotas("Luna", "Perro", 13);

        mascota1.mostrarInfo();

        mascota1.cumplirAnios();
    }
}
