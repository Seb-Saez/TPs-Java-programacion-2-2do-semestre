package Tp2_Programacion_Estructurada;

public class Ejercicio13 {

    // 100% hecho con chat GPT, no termino de entender el uso de la recursividad

    public static void main(String[] args) {
        // 1. Declarar e inicializar un array con los precios de algunos productos
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        // 2. Usar una función recursiva para mostrar los precios originales
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0); // comenzamos desde el índice 0

        // 3. Modificar el precio de un producto específico (índice 2)
        precios[2] = 129.99;

        // 4. Usar otra función recursiva para mostrar los precios modificados
        System.out.println("Precios modificados:");
        mostrarPreciosRecursivoModificado(precios, 0);
    }

    // Función recursiva para mostrar los precios originales
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        // Caso base: si el índice es igual al largo del array, detenemos la recursión
        if (indice >= precios.length) {
            return;
        }
        // Mostrar el precio actual
        System.out.println("Precio: $" + precios[indice]);

        // Llamar recursivamente a la función con el siguiente índice
        mostrarPreciosRecursivo(precios, indice + 1);
    }

    // Otra función recursiva (puede ser la misma que la anterior, pero por tu consigna usamos otra)
    public static void mostrarPreciosRecursivoModificado(double[] precios, int indice) {
        // Caso base
        if (indice >= precios.length) {
            return;
        }
        // Mostrar el precio actual
        System.out.println("Precio: $" + precios[indice]);

        // Llamada recursiva
        mostrarPreciosRecursivoModificado(precios, indice + 1);
    }

    }
}
