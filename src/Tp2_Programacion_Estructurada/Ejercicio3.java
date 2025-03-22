package Tp2_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio3 {

    public static void ingresarEdad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad < 12){
            System.out.println("Eres un niño");
        } else if (edad < 18){
            System.out.println("Eres un adolescente");
        } else if (edad < 60){
            System.out.println("Eres un adulto");
        } else{
            System.out.println("Eres un adulto mayor");
        }

        }




    public static void main(String[] args){
        ingresarEdad();
    }
}
