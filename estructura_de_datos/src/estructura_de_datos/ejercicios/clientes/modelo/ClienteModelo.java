
package estructura_de_datos.ejercicios.clientes.modelo;


public class ClienteModelo {
    
    private String nombre;
    private String cedula;
    
    //constructor
    public ClienteModelo(String InfoNombre, String InfoCedula){
        this.nombre = InfoNombre;
        this.cedula = InfoCedula;
    }
    //Metodos de encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
     //Metodo para ver datos
    public void VerInfo(){
        System.out.println("Nombre " + this.nombre);
        System.out.println("Cedula " + this.cedula);
    }
    
  
}
