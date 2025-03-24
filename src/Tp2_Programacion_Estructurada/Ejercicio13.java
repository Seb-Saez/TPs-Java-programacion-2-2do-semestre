package Tp2_Programacion_Estructurada;

public class Ejercicio13 {



    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0); // comenzamos desde el índice 0

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarPreciosRecursivoModificado(precios, 0);
    }

    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);

        mostrarPreciosRecursivo(precios, indice + 1);
    }

    public static void mostrarPreciosRecursivoModificado(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);

        mostrarPreciosRecursivoModificado(precios, indice + 1);
    }

    }
