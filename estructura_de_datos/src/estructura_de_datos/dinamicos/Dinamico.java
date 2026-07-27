package estructura_de_datos.dinamicos;

public class Dinamico {
    public String[] lista_nombres;

    // Constructor: debe llamarse igual que la clase y con mayúscula
    public Dinamico() {
        this.lista_nombres = new String[3];
        this.lista_nombres[0] = "Ana";
        this.lista_nombres[1] = "Luis";
        this.lista_nombres[2] = "María";
    }

    // Método para imprimir la información
    public void imprimir_info() {
        for (int i = 0; i < this.lista_nombres.length; i++) {
            System.out.println("Dato cliente: " + this.lista_nombres[i]);
        }
    }

    // Método que llama al anterior
    public void imprimir_dos() {
        this.imprimir_info();
    }
}

