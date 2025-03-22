package Tp2_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio2 {

    public static void ingresarNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa el primer numero:");
        int num1 = scanner.nextInt();
        System.out.println("Por favor ingresa el segundo numero:");
        int num2 = scanner.nextInt();
        System.out.println("Por favor ingresa el tercer numero:");
        int num3 = scanner.nextInt();

        int mayor = num1;
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        }

        System.out.println("El numero mayor es: " + mayor);
    }

    public static void main(String[] args){
        ingresarNum();
    }
}
