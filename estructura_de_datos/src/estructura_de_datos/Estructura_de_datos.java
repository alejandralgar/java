package estructura_de_datos;

import estructura_de_datos.dinamicos.Dinamico;
import estructura_de_datos.ejercicios.clientes.controller.ClienteController;
import estructura_de_datos.ejercicios.clientes.modelo.ClienteModelo;
import estructura_de_datos.estaticos.Estaticos;
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
        
        //ejercicios.clientes
        // clientes
        Scanner obj_teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre: ");
        String nombre_cliente = obj_teclado.nextLine();
        System.out.println("Escriba la cédula: ");
        String cedula_cliente = obj_teclado.nextLine();

        ClienteModelo obj_cliente = new ClienteModelo(nombre_cliente, cedula_cliente);

        // Crear controlador y usarlo
        ClienteController obj_lista = new ClienteController();
        obj_lista.agregar_cliente(obj_cliente);
        obj_lista.ver_info();
        
        
    }
    
}
