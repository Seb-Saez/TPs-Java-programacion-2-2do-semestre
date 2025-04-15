package Tp4_OrientacionObjetos;

public class TestEmpleado {
    public static void main(String[] args) {
        // Crear empleados usando el constructor completo
        Empleado emp1 = new Empleado(101, "Laura Sánchez", "Gerente", 85000);
        Empleado emp2 = new Empleado(102, "Carlos Pérez", "Analista", 60000);

        // Crear empleados usando el constructor con nombre y puesto
        Empleado emp3 = new Empleado("Ana Torres", "Asistente");
        Empleado emp4 = new Empleado("Juan Gómez", "Diseñador");

        // Actualizar salario con porcentaje
        emp1.actualizarSalario(10); // Aumenta 10%
        emp3.actualizarSalario(5);  // Aumenta 5%

        // Actualizar salario con cantidad fija
        emp2.actualizarSalario(5000); // Aumenta $5000
        emp4.actualizarSalario(3000); // Aumenta $3000

        // Mostrar información de cada empleado
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());

        // Mostrar total de empleados creados
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}