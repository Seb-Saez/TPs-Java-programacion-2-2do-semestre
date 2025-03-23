package Tp2_Programacion_Estructurada;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio9 {


    public static double calcularEnvio(double peso, String zona){

        double precioKilo = 0;
        if (zona.equals("N")){
            precioKilo = 5;
        } else {
            precioKilo = 10;
        }

        double envio = precioKilo * peso;
        System.out.println("El costo del envio sera de: $" + envio);
        return envio;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio de su producto");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese el peso de su paquete");
        double peso = scanner.nextDouble();
        String zona = "U";
        do {
            System.out.println("Ingrese el tipo de envio: I para internacional o N para nacional");
            zona = scanner.next().toUpperCase();
        } while (!zona.equals("I") && !zona.equals("N"));


        double envio = calcularEnvio(peso, zona);

        double total = precio + envio;
        System.out.println("el total a pagar es: $" + total);
    }
}
