package Tp2_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // precio
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        // categoría
        System.out.print("Ingrese la categoría del producto (A, B o C): *no se haga el chistoso con otra letra ");
        String categoria = scanner.next().toUpperCase();

        double descuento = 0.0;
        double porcentajeDescuento = 0.0;

        // decuento x categoria
        if (categoria.equals("A")) {
            porcentajeDescuento = 0.1;
        } else if (categoria.equals("B")) {
            porcentajeDescuento = 0.15;
        } else if (categoria.equals("C")) {
            porcentajeDescuento = 0.2;
        } else {
            System.out.println("Categoría inválida. No se aplica descuento por chistoso.");
            porcentajeDescuento = -0.15;
        }

        // calcular el precio final
        descuento = (precioOriginal * porcentajeDescuento);
        double precioFinal = precioOriginal - descuento;

        System.out.println("Descuento aplicado: " + (porcentajeDescuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);

        scanner.close();
    }
}
