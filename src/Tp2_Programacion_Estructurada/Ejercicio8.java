package Tp2_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio8 {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal = precioBase + (precioBase*(impuesto/100)) - (precioBase * (descuento/100));
        System.out.println("El precio final es: " + precioFinal);
        return precioFinal;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio de su producto");
        double precioBase = scanner.nextDouble();
        System.out.println("ingrese el impuesto en porcentaje, por ej 10 para un 10%");
        double impuesto = scanner.nextDouble();
        System.out.println("ingrese el descuento en porcentaje, por ej 10 para un 10%");
        double descuento = scanner.nextDouble();

        calcularPrecioFinal( precioBase,impuesto , descuento);
    }
}
