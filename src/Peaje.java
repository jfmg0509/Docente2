// CLASE PEAJE
import java.util.ArrayList;
import java.util.List;

class Peaje {
    private String nombre;
    private String departamento;
    private int totalPeaje = 0;
    private int totalCamiones = 0;
    private int totalMotos = 0;
    private int totalCarros = 0;

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Peaje(String nombre, String departamento) {
        if (nombre == null || nombre.isEmpty() || departamento == null || departamento.isEmpty())
            throw new IllegalArgumentException("Nombre y departamento no pueden estar vacíos.");
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Agrega vehículo, calcula el peaje y actualiza contadores
    public void añadirVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null)
            throw new IllegalArgumentException("El vehículo no puede ser nulo.");

        vehiculos.add(vehiculo);
        totalPeaje += vehiculo.getValorPeaje();

        if (vehiculo instanceof Carro) totalCarros++;
        else if (vehiculo instanceof Moto) totalMotos++;
        else if (vehiculo instanceof Camion) totalCamiones++;
    }

    // Muestra el resumen de todos los vehículos y montos totales
    public void imprimir() {
        System.out.println("\n--- Reporte de ganancias del Peaje ---"+ nombre + " en " + departamento);
        for (Vehiculo v : vehiculos) {
            v.imprimir();
        }
        System.out.println("Número de carros que pasaron por el peaje: " + totalCarros);
        System.out.println("Número de motos que pasaron por el peaje: " + totalMotos);
        System.out.println("Número de camiones que pasaron por el peaje: " + totalCamiones);
        System.out.println("Total recaudado para el peaje " + nombre +" = USD " + totalPeaje);
    }
}