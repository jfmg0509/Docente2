// CLASE CAMION
class Camion extends Vehiculo {
    private int valorPeajeEje = 1;
    private int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        if (numeroEjes <= 0)
            throw new IllegalArgumentException("El número de ejes debe ser mayor que cero.");
        this.numeroEjes = numeroEjes;
    }

    @Override
    public int getValorPeaje() {
        return valorPeajeEje * numeroEjes;
    }

    public void setValorPeajeEje(int valor) {
        if (valor < 0)
            throw new IllegalArgumentException("El valor por eje no puede ser negativo.");
        this.valorPeajeEje = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("Camión - Placa: " + placa + " - Ejes: " + numeroEjes);
    }
}