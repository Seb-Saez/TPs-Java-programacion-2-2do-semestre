package Tp2_Programacion_Estructurada;

public class Ejercicio12 {
    public static void main(String[] args) {
        // declaracion array
        double[] precios = {20, 50, 75, 300, 10};

        System.out.println("Precios originales:");

        // Usamos un bucle for each para recorrer el array y mostrar cada precio
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        precios[2] = 129;

        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
