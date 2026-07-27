package estructura_de_datos.estaticos;


public class Estaticos {
    public static String[] lista_nombres;
    
    public Estaticos(){
              // Inicializar array estático con tamaño 3
        Estaticos.lista_nombres = new String[3];
        Estaticos.lista_nombres[0] = "Samanta";
        Estaticos.lista_nombres[1] = "Castañeda";
        Estaticos.lista_nombres[2] = "Lina";
    }
    
    public static void imprimir_datos(){
        for (int i = 0; i < Estaticos.lista_nombres.length; i++) {
            System.out.println("Dato cliente: " + Estaticos.lista_nombres[i]);
        }
    }
}
