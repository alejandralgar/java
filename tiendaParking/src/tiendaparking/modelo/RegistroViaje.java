
package tiendaparking.modelo;

/**
 *
 * @author Anamaria
 */
public class RegistroViaje {
    String chofer = "";
    String pasajero = "";
    String carro = "";
    String motor = "";
    
    //Constructor -> Parametros
    public RegistroViaje(String datoChofer, String datoPasajero, String datoCarro, String datoMotor){
        this.chofer = datoChofer;
        this.pasajero = datoPasajero;
        this.carro = datoCarro;
        this.motor = datoMotor;
    }
    
    //Get y set

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    //Validar datos
    public boolean validarDatos(){
        return carro != null && motor != null && chofer != null && pasajero != null;
    }
}
