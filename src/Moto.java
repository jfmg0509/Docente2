// CLASE MOTO: representa una moto, hereda de la clase abstracta Vehiculo
class Moto extends Vehiculo {
    // Valor fijo del peaje para las motos (por defecto: $1)
    private int valorPeaje = 1;

    // Constructor que recibe la placa de la moto y la pasa al constructor de Vehiculo
    public Moto(String placa) {
        super(placa); // Llama al constructor de la clase base para validar y asignar la placa
    }

    // Método que devuelve el valor del peaje para la moto
    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    // Método para establecer un nuevo valor de peaje para la moto
    public void setValorPeaje(int valor) {
        // Validación: el valor no puede ser negativo
        if (valor < 0)
            throw new IllegalArgumentException("El valor del peaje no puede ser negativo.");
        this.valorPeaje = valor;
    }

    // Método que imprime la información de la moto (placa)
    @Override
    public void imprimir() {
        System.out.println("La placa de la moto es: " + placa);
    }
}