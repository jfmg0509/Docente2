// CLASE CAMION: representa un camión que hereda de la clase abstracta Vehiculo
class Camion extends Vehiculo {
    // Valor que se cobra por cada eje del camión (por defecto: $1 por eje)
    private int valorPeajeEje = 1;

    // Número de ejes del camión
    private int numeroEjes;

    // Constructor que recibe la placa y el número de ejes del camión
    public Camion(String placa, int numeroEjes) {
        // Llama al constructor de la clase base (Vehiculo) para validar y asignar la placa
        super(placa);

        // Validación: el número de ejes debe ser mayor que cero
        if (numeroEjes <= 0)
            throw new IllegalArgumentException("El número de ejes debe ser mayor que cero.");

        // Asignación del número de ejes
        this.numeroEjes = numeroEjes;
    }

    // Método que calcula el valor del peaje según el número de ejes
    @Override
    public int getValorPeaje() {
        return valorPeajeEje * numeroEjes;
    }

    // Método para modificar el valor que se cobra por eje
    public void setValorPeajeEje(int valor) {
        // Validación: no se permite valor negativo por eje
        if (valor < 0)
            throw new IllegalArgumentException("El valor por eje no puede ser negativo.");

        this.valorPeajeEje = valor;
    }

    // Método que imprime la información del camión
    @Override
    public void imprimir() {
        System.out.println("La placa del camión es: " + placa + " Tiene: " + numeroEjes + " ejes.");
    }
}