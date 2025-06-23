// CLASE ABSTRACTA VEHICULO
// Define la estructura común que deben seguir todos los tipos de vehículos (Carro, Moto, Camion)
abstract class Vehiculo {
    // Atributo protegido: placa del vehículo
    protected String placa;

    // Constructor que valida que la placa no sea nula ni esté vacía
    public Vehiculo(String placa) {
        if (placa == null || placa.trim().isEmpty())
            throw new IllegalArgumentException("La placa no puede estar vacía.");
        // Asigna la placa al atributo, después de quitar espacios innecesarios
        this.placa = placa.trim();
    }

    // Método abstracto que debe ser implementado por las subclases
    // Devuelve el valor del peaje correspondiente al tipo específico de vehículo
    public abstract int getValorPeaje();

    // Método abstracto que obliga a cada subclase a definir cómo se imprime su información
    public abstract void imprimir();

    // Devuelve la placa del vehículo (método accesible públicamente)
    public String getPlaca() {
        return placa;
    }
}