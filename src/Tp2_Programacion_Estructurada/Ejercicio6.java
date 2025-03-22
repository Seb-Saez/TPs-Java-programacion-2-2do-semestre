package Tp2_Programacion_Estructurada;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 10; i++){
            System.out.println("Ingrese un numero por favor");

            int num = scanner.nextInt();

            if (num > 0){
                positivos+=1;
            } else if (num == 0) {
                ceros+=1;
            } else negativos += 1;
        }
        System.out.println("La cantidad de positivos es: " + positivos);
        System.out.println("La cantidad de negativos es: " + negativos);
        System.out.println("La cantidad de ceros es: " + ceros);
    }
}
