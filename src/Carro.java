// CLASE CARRO: representa un carro, hereda de la clase abstracta Vehiculo
class Carro extends Vehiculo {
    // Valor fijo del peaje para los carros (por defecto: $2)
    private int valorPeaje = 2;

    // Constructor que recibe la placa del carro y la pasa al constructor de Vehiculo
    public Carro(String placa) {
        super(placa);  // Valida y asigna la placa en la clase base
    }

    // Método que devuelve el valor del peaje para el carro
    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    // Método para establecer un nuevo valor de peaje para el carro
    public void setValorPeaje(int valor) {
        // Validación: el valor del peaje no debe ser negativo
        if (valor < 0)
            throw new IllegalArgumentException("El valor del peaje no puede ser negativo.");
        this.valorPeaje = valor;
    }

    // Método que imprime la información del carro (solo la placa)
    @Override
    public void imprimir() {
        System.out.println("La placa del carro es: " + placa);
    }
}