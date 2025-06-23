// CLASE PRINCIPAL - SISTEMA DE PEAJE
// Esta clase ejecuta el programa que permite registrar vehículos en un peaje y mostrar el total recaudado

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaPeaje {
    public static void main(String[] args) {
        // Se utiliza Scanner para capturar datos ingresados por el usuario desde la consola
        Scanner scanner = new Scanner(System.in);
        Peaje peaje;

        try {
            // Solicita los datos iniciales del peaje
            System.out.print("Ingrese el lugar del peaje: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el nombre del peaje: ");
            String departamento = scanner.nextLine();

            // Se crea un objeto de tipo Peaje con los datos ingresados
            peaje = new Peaje(nombre, departamento);

            // ==== Ingreso de Carros ====
            System.out.print("¿Cuántos carros ingresarán?: ");
            int numCarros = scanner.nextInt();
            scanner.nextLine(); // Limpia el salto de línea pendiente del buffer

            // Ciclo para registrar cada carro
            for (int i = 1; i <= numCarros; i++) {
                System.out.print("Ingrese la placa del carro " + i + ": ");
                String placa = scanner.nextLine();
                peaje.añadirVehiculo(new Carro(placa));
            }

            // ==== Ingreso de Motos ====
            System.out.print("¿Cuántas motos ingresarán?: ");
            int numMotos = scanner.nextInt();
            scanner.nextLine();

            // Ciclo para registrar cada moto
            for (int i = 1; i <= numMotos; i++) {
                System.out.print("Ingrese la placa de la moto " + i + ": ");
                String placa = scanner.nextLine();
                peaje.añadirVehiculo(new Moto(placa));
            }

            // ==== Ingreso de Camiones ====
            System.out.print("¿Cuántos camiones ingresarán?: ");
            int numCamiones = scanner.nextInt();
            scanner.nextLine();

            // Ciclo para registrar cada camión con su número de ejes
            for (int i = 1; i <= numCamiones; i++) {
                System.out.print("Ingrese la placa del camión " + i + ": ");
                String placa = scanner.nextLine();

                System.out.print("Ingrese el número de ejes del camión: ");
                int ejes = scanner.nextInt();
                scanner.nextLine();

                // Se crea y registra el camión en el peaje
                peaje.añadirVehiculo(new Camion(placa, ejes));
            }

            // Imprime el resumen general del peaje
            peaje.imprimir();

        } catch (InputMismatchException e) {
            // Captura errores de formato cuando se espera un número pero se ingresa otro tipo de dato
            System.err.println("Error: Debe ingresar un valor numérico válido.");
        } catch (IllegalArgumentException e) {
            // Captura errores provocados por validaciones lógicas en el sistema
            System.err.println("Entrada inválida: " + e.getMessage());
        } catch (Exception e) {
            // Captura cualquier otro error inesperado
            System.err.println("Error inesperado: " + e.getMessage());
        } finally {
            // Cierra el escáner para liberar recursos
            scanner.close();
        }
    }
}