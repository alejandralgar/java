package tiendaparking.modelo;

public class Carro_modelo {

    // PASO 3 — Atributos: TODOS private
    private String  placa_carro     = "";
    private String  marca_carro     = "";
    private String  color_carro     = "";
    private double  gasolina_carro  = 0.0;
    private double  tanque_maximo   = 60.0;
    private boolean encendido       = false;
    private String  chofer_asignado = "Sin asignar";

    // PASO 2 — Constructor
    public Carro_modelo(String dato_placa,
                         String dato_marca,
                         String dato_color,
                         double dato_gasolina) {
        this.placa_carro    = dato_placa;
        this.marca_carro    = dato_marca;
        this.color_carro    = dato_color;
        this.gasolina_carro = dato_gasolina;
    }

   
    //get y set

    public String getPlaca_carro() {
        return placa_carro;
    }

    public void setPlaca_carro(String placa_carro) {
        this.placa_carro = placa_carro;
    }

    public String getMarca_carro() {
        return marca_carro;
    }

    public void setMarca_carro(String marca_carro) {
        this.marca_carro = marca_carro;
    }

    public String getColor_carro() {
        return color_carro;
    }

    public void setColor_carro(String color_carro) {
        this.color_carro = color_carro;
    }

    public double getGasolina_carro() {
        return gasolina_carro;
    }

    public void setGasolina_carro(double gasolina_carro) {
        this.gasolina_carro = gasolina_carro;
    }

    public double getTanque_maximo() {
        return tanque_maximo;
    }

    public void setTanque_maximo(double tanque_maximo) {
        this.tanque_maximo = tanque_maximo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getChofer_asignado() {
        return chofer_asignado;
    }

    public void setChofer_asignado(String chofer_asignado) {
        this.chofer_asignado = chofer_asignado;
    }
    
    //CRUD
    public void buscar_placa(String info_placa_carro){
        //SQL consultas aquí
        System.out.println("Buscamos placa...");
    }
    
    public void registrar_placa(){
        //SQL consultas aquí
        System.out.println("Registrar placa...");
    }
    
    public void eliminarPlaca(){
        //SQL escribir consultas aquí
        System.out.println("Eliminar placa...");
    }
}