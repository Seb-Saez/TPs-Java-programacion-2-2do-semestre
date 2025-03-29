package Tp3_kata;

public class Ejercicio3_5 {
    public static class NaveEspacial {
        // Atributos privados
        private String nombre;
        private int combustible;
        private static final int MAX_COMBUSTIBLE = 100;

        // Constructor
        public NaveEspacial(String nombre, int combustible) {
            this.nombre = nombre;
            this.combustible = Math.min(combustible, MAX_COMBUSTIBLE); // Evita sobrepasar el límite
        }

        // Método para despegar
        public void despegar() {
            if (combustible >= 10) {
                combustible -= 10;
                System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
            } else {
                System.out.println("Error: Combustible insuficiente para despegar.");
            }
        }

        // Método para avanzar
        public void avanzar(int distancia) {
            if (combustible >= distancia) {
                combustible -= distancia;
                System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
            } else {
                System.out.println("Error: Combustible insuficiente para avanzar esa distancia.");
            }
        }

        // Método para recargar combustible
        public void recargarCombustible(int cantidad) {
            if (combustible + cantidad > MAX_COMBUSTIBLE) {
                combustible = MAX_COMBUSTIBLE;
                System.out.println("El combustible se ha recargado al máximo (100 unidades).");
            } else {
                combustible += cantidad;
                System.out.println("Combustible recargado. Nuevo nivel: " + combustible);
            }
        }

        // Método para mostrar el estado actual de la nave
        public void mostrarEstado() {
            System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de NaveEspacial con 50 unidades de combustible
        NaveEspacial nave1 = new NaveEspacial("Explorer", 50);

        // Intentar avanzar 60 unidades sin recargar (debe fallar)
        nave1.avanzar(60);

        // Recargar 40 unidades de combustible
        nave1.recargarCombustible(40);

        // Intentar avanzar 60 unidades nuevamente (ahora debe funcionar)
        nave1.avanzar(60);

        // Mostrar el estado actual de la nave
        nave1.mostrarEstado();
    }
}
