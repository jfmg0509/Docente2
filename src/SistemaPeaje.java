public class SistemaPeaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Peaje peaje;

        try {
            System.out.print("Ingrese el nombre del peaje: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el departamento: ");
            String departamento = scanner.nextLine();

            peaje = new Peaje(nombre, departamento);

            System.out.print("¿Cuántos carros ingresarán?: ");
            int numCarros = scanner.nextInt();
            scanner.nextLine();
            for (int i = 1; i <= numCarros; i++) {
                System.out.print("Ingrese la placa del carro " + i + ": ");
                String placa = scanner.nextLine();
                peaje.añadirVehiculo(new Carro(placa));
            }

            System.out.print("¿Cuántas motos ingresarán?: ");
            int numMotos = scanner.nextInt();
            scanner.nextLine();
            for (int i = 1; i <= numMotos; i++) {
                System.out.print("Ingrese la placa de la moto " + i + ": ");
                String placa = scanner.nextLine();
                peaje.añadirVehiculo(new Moto(placa));
            }

            System.out.print("¿Cuántos camiones ingresarán?: ");
            int numCamiones = scanner.nextInt();
            scanner.nextLine();
            for (int i = 1; i <= numCamiones; i++) {
                System.out.print("Ingrese la placa del camión " + i + ": ");
                String placa = scanner.nextLine();
                System.out.print("Ingrese el número de ejes del camión: ");
                int ejes = scanner.nextInt();
                scanner.nextLine();
                peaje.añadirVehiculo(new Camion(placa, ejes));
            }

            peaje.imprimir();

        } catch (InputMismatchException e) {
            System.err.println("Error: Debe ingresar un valor numérico válido.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error en los datos de entrada: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
