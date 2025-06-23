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
            throw new IllegalArgumentException("Nombre y departamento no pueden estar vacíos");
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public void añadirVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null)
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        vehiculos.add(vehiculo);
        totalPeaje += vehiculo.getValorPeaje();

        if (vehiculo instanceof Carro) totalCarros++;
        else if (vehiculo instanceof Moto) totalMotos++;
        else if (vehiculo instanceof Camion) totalCamiones++;
    }

    public void imprimir() {
        System.out.println("\n--- Reporte del Peaje ---");
        for (Vehiculo v : vehiculos) {
            v.imprimir();
        }
        System.out.println("Total carros: " + totalCarros);
        System.out.println("Total motos: " + totalMotos);
        System.out.println("Total camiones: " + totalCamiones);
        System.out.println("Total peaje recaudado: $" + totalPeaje);
    }
}