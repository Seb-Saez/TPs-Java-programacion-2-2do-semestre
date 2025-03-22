package Tp2_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio1 {
   //static int anio; si no declaro la variable global la tengo que pasar como parametro y declararla local dentro de pediraño

    public static void verificarBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    public static void pediranio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un año por favor:");
        int anio = scanner.nextInt();
        verificarBisiesto(anio);
    }

    public static void main(String[] args) {
        pediranio();
    }
}
