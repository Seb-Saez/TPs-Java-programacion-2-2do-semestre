package Tp2_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio10 {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = 0;
        nuevoStock = stockActual + cantidadRecibida - cantidadVendida;
        return nuevoStock;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de stock actual que posee:");
        int stockActual = scanner.nextInt();
        System.out.println("Ingrese la cantidad de unidades vendidas");
        int cantidadVendida = scanner.nextInt();
        System.out.println("Ingrese la cantidad de reposicion de su producto");
        int cantidadRecibida = scanner.nextInt();

        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("La cantidad de stock actualizado es: " + nuevoStock);
    }
}
