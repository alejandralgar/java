package tiendaparking.modelo;

public class Chofer_modelo {

    // PASO 3 — Atributos: TODOS private
    private String nombre_chofer  = "";
    private String apellido_chofer = "";
    private String cedula_chofer   = "";
    private String licencia = "";

    // PASO 2 — Constructor: recibe los datos iniciales
    public Chofer_modelo(String dato_nombre,
                          String dato_apellido,
                          String dato_cedula,
                          String datoLicencia) {
        this.nombre_chofer   = dato_nombre;
        this.apellido_chofer = dato_apellido;
        this.cedula_chofer   = dato_cedula;
        this.licencia = datoLicencia;
    }

    public String getNombre_chofer() {
        return nombre_chofer;
    }

    public void setNombre_chofer(String nombre_chofer) {
        this.nombre_chofer = nombre_chofer;
    }

    public String getApellido_chofer() {
        return apellido_chofer;
    }

    public void setApellido_chofer(String apellido_chofer) {
        this.apellido_chofer = apellido_chofer;
    }

    public String getCedula_chofer() {
        return cedula_chofer;
    }

    public void setCedula_chofer(String cedula_chofer) {
        this.cedula_chofer = cedula_chofer;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

  
}