package tiendaparking.vista;

import java.util.Scanner;

/**
 * Vista encargada de capturar por consola (Scanner) los datos
 * del carro, motor, chofer y pasajero para la HU-01.
 */
public class VistaRegistro {

    private Scanner sc = new Scanner(System.in, java.nio.charset.StandardCharsets.UTF_8);

    public void mostrarBienvenida() {
        System.out.println("==============================");
        System.out.println("  REGISTRO DE FICHA DE VIAJE ");
        System.out.println("==============================");
    }

    // Orden del arreglo: [placa, marca, color/modelo]
    public String[] capturarCarro() {
        System.out.println("\n--- DATOS DEL CARRO ---");
        System.out.print("Placa: ");
        String placa = sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo/Color: ");
        String modelo = sc.nextLine();
        return new String[]{placa, marca, modelo};
    }

    // Orden del arreglo: [numero_serie, tipo]
    public String[] capturarMotor() {
        System.out.println("\n--- DATOS DEL MOTOR ---");
        System.out.print("Numero de serie: ");
        String serie = sc.nextLine();
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        return new String[]{serie, tipo};
    }

    // Orden del arreglo: [cedula, nombre, apellido, licencia]
    public String[] capturarChofer() {
        System.out.println("\n--- DATOS DEL CHOFER ---");
        System.out.print("Cedula: ");
        String cedula = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Licencia: ");
        String licencia = sc.nextLine();
        return new String[]{cedula, nombre, apellido, licencia};
    }

    // Orden del arreglo: [cedula, nombreCompleto]
    public String[] capturarPasajero() {
        System.out.println("\n--- DATOS DEL PASAJERO ---");
        System.out.print("Cedula: ");
        String cedula = sc.nextLine();
        System.out.print("Nombre completo: ");
        String nombre = sc.nextLine();
        return new String[]{cedula, nombre};
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrar() {
        sc.close();
    }
}
