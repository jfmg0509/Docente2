import java.util.*;

// Clase base abstracta para vehículos
abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        if (placa == null || placa.isEmpty())
            throw new IllegalArgumentException("La placa no puede estar vacía");
        this.placa = placa;
    }

    public abstract int getValorPeaje();
    public abstract void imprimir();

    public String getPlaca() {
        return placa;
    }
}