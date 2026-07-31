package estructura_de_datos;

import estructura_de_datos.dinamicos.Dinamico;
import estructura_de_datos.estaticos.Estaticos;
import estructura_de_datos.ejercicios.clientes.controller.ClienteController;
import estructura_de_datos.ejercicios.clientes.modelo.ClienteModelo;
import java.util.Scanner;


public class Estructura_de_datos {

    
     public static void main(String[] args) {
         //todo lo dinamico
        Dinamico d = new Dinamico(); // objeto creado con new
        d.imprimir_info();           // imprime directamente
        d.imprimir_dos();            // imprime llamando al otro método
        
        //todo lo estatico es feo
        new Estaticos();           // inicializa el array
        Estaticos.imprimir_datos(); // imprime los datos
        
        //ejercicios.clientes  - array dinamicos
        // clientes
         Scanner sc = new Scanner(System.in);
        ClienteController controller = new ClienteController();

        int opcion;
        do {
            System.out.println("\n--- MENÚ CLIENTES ---");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Insertar cliente en posición");
            System.out.println("3. Obtener cliente por índice");
            System.out.println("4. Reemplazar cliente");
            System.out.println("5. Ver todos los clientes");
            System.out.println("0. Salir");
            System.out.print("Elija opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cédula: ");
                    String cedula = sc.nextLine();
                    controller.agregar_cliente(new ClienteModelo(nombre, cedula));
                    break;

                case 2:
                    System.out.print("Posición: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Cédula: ");
                    cedula = sc.nextLine();
                    controller.insertar_en_posicion(pos, new ClienteModelo(nombre, cedula));
                    break;

                case 3:
                    System.out.print("Índice: ");
                    int idx = sc.nextInt();
                    ClienteModelo cliente = controller.obtener_cliente(idx);
                    if (cliente != null) cliente.VerInfo();
                    break;

                case 4:
                    System.out.print("Índice a reemplazar: ");
                    idx = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Nueva cédula: ");
                    cedula = sc.nextLine();
                    controller.reemplazar_cliente(idx, new ClienteModelo(nombre, cedula));
                    break;

                case 5:
                    controller.ver_info();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);

        sc.close();
    
        
    }
    
}
