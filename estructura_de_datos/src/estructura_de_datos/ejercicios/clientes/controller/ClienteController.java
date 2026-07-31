package estructura_de_datos.ejercicios.clientes.controller;

import estructura_de_datos.ejercicios.clientes.modelo.ClienteModelo;
import java.util.ArrayList;
import java.util.List;

//Ejercicio de listas dinamicas
public class ClienteController {
    // Inicializar lista dinámica
    public List<ClienteModelo> obj_lista_clientes;

    // Constructor
    public ClienteController() {
        this.obj_lista_clientes = new ArrayList<>();
    }

    //CRUD
    // Ver información de todos los clientes
    public void ver_info() {
        for (ClienteModelo cliente : this.obj_lista_clientes) {
            cliente.VerInfo();
        }
    }

    // Agregar un nuevo cliente
    public void agregar_cliente(ClienteModelo obj_clientes_nuevo) {
        this.obj_lista_clientes.add(obj_clientes_nuevo);
    }
    
    //Insertar en diferente posición
    public void insertar_en_posicion(int index, ClienteModelo cliente) {
    if (index >= 0 && index <= obj_lista_clientes.size()) {
        obj_lista_clientes.add(index, cliente);
    } else {
        System.out.println("Índice fuera de rango");
    }
    }

    //Obtenemos todos los clientes
    public ClienteModelo obtener_cliente(int index) {
    if (index >= 0 && index < obj_lista_clientes.size()) {
        return obj_lista_clientes.get(index);
    } else {
        System.out.println("Índice inválido");
        return null;
    }
    }
    
    //Remplazamos el cliente en cualquier posición
    public void reemplazar_cliente(int index, ClienteModelo nuevoCliente) {
    if (index >= 0 && index < obj_lista_clientes.size()) {
        obj_lista_clientes.set(index, nuevoCliente);
    } else {
        System.out.println("Índice inválido");
    }
    }

    
}
