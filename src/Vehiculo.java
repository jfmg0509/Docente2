// CLASE ABSTRACTA VEHICULO
abstract class Vehiculo {
    protected String placa;

    // Constructor que valida que la placa no sea nula ni vacía
    public Vehiculo(String placa) {
        if (placa == null || placa.trim().isEmpty())
            throw new IllegalArgumentException("La placa no puede estar vacía.");
        this.placa = placa;
    }

    // Método abstracto que debe devolver el valor del peaje según el tipo de vehículo
    public abstract int getValorPeaje();

    // Método abstracto para imprimir la información del vehículo
    public abstract void imprimir();

    public String getPlaca() {
        return placa;
    }
}