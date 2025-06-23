// CLASE PEAJE: representa una estación de peaje que registra vehículos y calcula lo recaudado

import java.util.ArrayList;
import java.util.List;

class Peaje {
    // Nombre de la estación de peaje
    private String nombre;

    // Departamento o cantón donde se encuentra la estación
    private String departamento;

    // Acumuladores del total recaudado y de cada tipo de vehículo
    private int totalPeaje = 0;
    private int totalCamiones = 0;
    private int totalMotos = 0;
    private int totalCarros = 0;

    // Lista de todos los vehículos que han pasado por el peaje
    private final List<Vehiculo> vehiculos = new ArrayList<>();

    // Constructor que inicializa el nombre y departamento del peaje con validación
    public Peaje(String nombre, String departamento) {
        if (nombre == null || nombre.isEmpty() || departamento == null || departamento.isEmpty())
            throw new IllegalArgumentException("Nombre y departamento no pueden estar vacíos.");
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Método para registrar un vehículo que pasa por el peaje
    public void añadirVehiculo(Vehiculo vehiculo) {
        // Verifica que el vehículo no sea nulo
        if (vehiculo == null)
            throw new IllegalArgumentException("El vehículo no puede ser nulo.");

        // Agrega el vehículo a la lista
        vehiculos.add(vehiculo);

        // Suma el valor del peaje correspondiente al total general
        totalPeaje += vehiculo.getValorPeaje();

        // Incrementa el contador según el tipo de vehículo
        if (vehiculo instanceof Carro) {
            totalCarros++;
        } else if (vehiculo instanceof Moto) {
            totalMotos++;
        } else if (vehiculo instanceof Camion) {
            totalCamiones++;
        }
    }

    // Método que imprime el reporte general de la estación de peaje
    public void imprimir() {
        System.out.println("\n--- Reporte de ganancias del Peaje --- " + nombre + " en " + departamento);

        // Muestra los datos de cada vehículo
        for (Vehiculo v : vehiculos) {
            v.imprimir();
        }

        // Muestra estadísticas de cantidad por tipo y total recaudado
        System.out.println("Número de carros que pasaron por el peaje: " + totalCarros);
        System.out.println("Número de motos que pasaron por el peaje: " + totalMotos);
        System.out.println("Número de camiones que pasaron por el peaje: " + totalCamiones);
        System.out.println("Total recaudado para el peaje " + nombre + " = USD " + totalPeaje);
    }
}