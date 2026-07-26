
package tiendaparking.modelo;

/**
 *
 * @author Anamaria
 */
public class PasajeroModelo {
    String nombreCompleto = "";
    String cedula = "";
    
    //Constructor ->Parametros
    public PasajeroModelo(String datoNombreCompleto, String datoCedula){
        this.nombreCompleto = datoNombreCompleto;
        this.cedula = datoCedula;
    }
    //GET Y SET
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
