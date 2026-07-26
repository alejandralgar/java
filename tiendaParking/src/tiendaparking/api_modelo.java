
package tiendaparking;

/**
 *
 * @author Anamaria
 */
public class api_modelo {
    private String root = "";
    private String contraseña = "";
    private String host = "";
    private String puerto = "";
    private String url = "";
    
    //Constructor -> parametros
    public api_modelo(String dato_usuario, String dato_contraseña, String dato_host, String dato_puerto, String dato_url) {
        //Datos dinamicos
        this.root = dato_usuario;
        this.contraseña = dato_contraseña;
        this.host = dato_host;
        this.puerto = dato_puerto;
        this.url = dato_url;
    }
    
    //get y set

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    //Reglas de negocio, para manipular la conexion a la base de datos
    public boolean validar_conexion (){
        if(this.contraseña.equals("123456789")){
            return true;
        } else {
            return false;
        }
    }
    
    public void desconexion(){
       System.out.println("Desconexion realizada...");

    }
    
    //Si el cliente existe -> regla de negocio -> en la Base de datos
    public void buscar_chofer(String info_cedula){
        System.out.println("El cliente si existe");
    }
}
