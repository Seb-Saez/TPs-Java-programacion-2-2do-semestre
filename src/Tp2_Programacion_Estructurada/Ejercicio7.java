package Tp2_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio7 {

    private static void pedirNota() {
        int nota = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Por favor ingrese una nota entre 0 y 10 en numeros enteros");
            nota = scanner.nextInt();
            if (nota <=10 && nota >=0){
                System.out.println("Nota guardada correctamente, la nota es: " + nota);
            } else{
                System.out.println("Error al guardar la nota, debe ingresar un valor entre 0 y 10 entero. La nota ingresada es: " + nota);
            }
        } while (nota < 0 || nota > 10);
    }
    public static void main(String[] args){
        pedirNota();
    }

}
