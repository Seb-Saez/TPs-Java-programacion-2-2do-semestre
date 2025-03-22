package Tp2_Programacion_Estructurada;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        do {
            System.out.print("Ingrese un número entero (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }

        } while (numero != 0);

        System.out.println("La suma de los números pares es: " + sumaPares);
        scanner.close();
    }
}
