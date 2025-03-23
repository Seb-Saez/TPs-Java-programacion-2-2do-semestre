package Tp2_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio11 {

    static double descuentoEspecial = 0.10;

    public static double cacularDescuento(double precio){
        double descuentoAplicado = precio * descuentoEspecial;
        return descuentoAplicado;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Usted posee un descuento del 10%");
        System.out.println("Ingrese el precio de su producto por favor");
        double precio = scanner.nextDouble();
        double descuento = cacularDescuento(precio);

        double nuevoPrecio = precio - descuento;

        System.out.println("El descuento es de: $" + descuento);
        System.out.println("El nuevo precio a pagar es de: $" + nuevoPrecio);


    }
}
