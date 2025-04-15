package Tp4_OrientacionObjetos;

public class Empleado {
    // Atributos privados
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático
    private static int totalEmpleados = 0;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor con nombre y puesto solamente
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // Salario por defecto
        totalEmpleados++;
    }

    // Sobrecarga del método actualizarSalario - con porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    // Sobrecarga del método actualizarSalario - con cantidad fija
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return "Empleado ID: " + id + " | Nombre: " + nombre + " | Puesto: " + puesto + " | Salario: $" + salario;
    }

    // Método estático para mostrar el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}