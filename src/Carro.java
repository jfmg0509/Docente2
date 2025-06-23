// CLASE CARRO
class Carro extends Vehiculo {
    private int valorPeaje = 2;

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(int valor) {
        if (valor < 0)
            throw new IllegalArgumentException("El valor del peaje no puede ser negativo.");
        this.valorPeaje = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("Carro - Placa: " + placa);
    }
}