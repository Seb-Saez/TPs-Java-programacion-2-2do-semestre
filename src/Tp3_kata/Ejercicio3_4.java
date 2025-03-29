package Tp3_kata;

public class Ejercicio3_4 {
    public static class Gallina {
        // Atributos privados
        private int idGallina;
        private int edad;
        private int huevosPuestos;

        // Constructor
        public Gallina(int idGallina, int edad) {
            this.idGallina = idGallina;
            this.edad = edad;
            this.huevosPuestos = 0;
        }

        // Método para poner un huevo
        public void ponerHuevo() {
            huevosPuestos++;
        }

        // Método para envejecer
        public void envejecer() {
            edad++;
        }

        // Método para mostrar el estado de la gallina
        public void mostrarEstado() {
            System.out.println("ID: " + idGallina + " | Edad: " + edad + " anios | Huevos puestos: " + huevosPuestos);
        }
    }
        public static void main(String[] args) {
            // Crear dos gallinas con identificadores únicos
            Gallina gallina1 = new Gallina(1, 2);
            Gallina gallina2 = new Gallina(2, 3);

            // Cada gallina pone al menos un huevo
            gallina1.ponerHuevo();
            gallina2.ponerHuevo();

            // Cada gallina envejece un año
            gallina1.envejecer();
            gallina2.envejecer();

            // Mostrar el estado de cada gallina
            gallina1.mostrarEstado();
            gallina2.mostrarEstado();
        }
    }



