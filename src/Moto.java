class Moto extends Vehiculo {
    private int valorPeaje = 1;

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(int valorPeaje) {
        if (valorPeaje < 0)
            throw new IllegalArgumentException("El valor del peaje no puede ser negativo");
        this.valorPeaje = valorPeaje;
    }

    @Override
    public void imprimir() {
        System.out.println("Moto - Placa: " + placa);
    }
}