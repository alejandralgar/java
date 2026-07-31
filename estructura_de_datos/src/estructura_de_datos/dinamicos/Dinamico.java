package estructura_de_datos.dinamicos;

import java.util.ArrayList;

public class Dinamico {
    public ArrayList<String> lista_nombres;

    // Constructor: debe llamarse igual que la clase y con mayúscula
    public Dinamico() {
        this.lista_nombres = new ArrayList<>(); // lista dinámica, sin tamaño fijo
        this.lista_nombres.add("Ana");
        this.lista_nombres.add("Luis");
        this.lista_nombres.add("María");
    }

    // Método para imprimir la información
    public void imprimir_info() {
        for (int i = 0; i < this.lista_nombres.size(); i++) {
            System.out.println("Dato cliente: " + this.lista_nombres.get(i));
        }
    }

    // Método que llama al anterior
    public void imprimir_dos() {
        this.imprimir_info();
    }

    // ------- add(elemento): agrega al final de la lista -------
    public void agregarNombre(String nombre) {
        this.lista_nombres.add(nombre);
        System.out.println("Nombre agregado al final: " + nombre);
    }

    // ------- add(indice, elemento): inserta en una posición específica -------
    public void agregarNombreEnPosicion(int indice, String nombre) {
        this.lista_nombres.add(indice, nombre);
        System.out.println("Nombre '" + nombre + "' insertado en la posición " + indice);
    }

    // ------- get(indice): obtiene el elemento en una posición -------
    public String obtenerNombre(int indice) {
        String nombre = this.lista_nombres.get(indice);
        System.out.println("get(" + indice + ") -> " + nombre);
        return nombre;
    }

    // ------- set(indice, elemento): reemplaza el elemento de una posición -------
    public void reemplazarNombre(int indice, String nuevoNombre) {
        String anterior = this.lista_nombres.set(indice, nuevoNombre);
        System.out.println("Se reemplazó '" + anterior + "' por '" + nuevoNombre + "' en la posición " + indice);
    }

    // ------- remove(indice): elimina por posición -------
    public void eliminarPorIndice(int indice) {
        String eliminado = this.lista_nombres.remove(indice);
        System.out.println("remove(" + indice + ") eliminó: " + eliminado);
    }

    // ------- remove(elemento): elimina la primera aparición de ese elemento -------
    public void eliminarPorNombre(String nombre) {
        boolean eliminado = this.lista_nombres.remove(nombre);
        System.out.println("remove('" + nombre + "') -> " + eliminado);
    }

    // ------- size(): cantidad de elementos actuales -------
    public int contarNombres() {
        int total = this.lista_nombres.size();
        System.out.println("size() -> " + total);
        return total;
    }

    // ------- isEmpty(): verifica si la lista está vacía -------
    public boolean listaVacia() {
        boolean vacia = this.lista_nombres.isEmpty();
        System.out.println("isEmpty() -> " + vacia);
        return vacia;
    }

    // ------- contains(elemento): verifica si un elemento existe -------
    public boolean existeNombre(String nombre) {
        boolean existe = this.lista_nombres.contains(nombre);
        System.out.println("contains('" + nombre + "') -> " + existe);
        return existe;
    }

    // ------- indexOf(elemento): posición de la primera aparición -------
    public int buscarPosicion(String nombre) {
        int posicion = this.lista_nombres.indexOf(nombre);
        System.out.println("indexOf('" + nombre + "') -> " + posicion);
        return posicion;
    }

    // ------- clear(): borra todos los elementos -------
    public void limpiarLista() {
        this.lista_nombres.clear();
        System.out.println("Lista limpiada. Ahora está vacía: " + this.lista_nombres.isEmpty());
    }

    // ------- toArray(): convierte la lista dinámica en un array normal -------
    public String[] convertirAArray() {
        String[] arreglo = this.lista_nombres.toArray(new String[0]);
        System.out.println("toArray() -> array de tamaño " + arreglo.length);
        return arreglo;
    }
}