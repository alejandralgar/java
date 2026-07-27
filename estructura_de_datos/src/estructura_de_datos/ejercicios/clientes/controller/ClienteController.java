package estructura_de_datos.ejercicios.clientes.controller;

import estructura_de_datos.ejercicios.clientes.modelo.ClienteModelo;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    // Inicializar lista dinámica
    public List<ClienteModelo> obj_lista_clientes;

    // Constructor
    public ClienteController() {
        this.obj_lista_clientes = new ArrayList<>();
    }

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
}
