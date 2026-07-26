
package tiendaparking.modelo;

/**
 *
 * @author Anamaria
 */
public class Motor_modelo {
    private String numero_serie = "";
    private String tipo = "";
    
    //Constructor -> parametros
    public Motor_modelo (String dato_numero_serie, String dato_tipo){
        this.numero_serie = dato_numero_serie;
        this.tipo = dato_tipo;
    }
    
     // PASO 4 — GET: obtener datos (siempre tienen return)
    public String getNumero_serie() {
        return numero_serie;      // ← return obligatorio
    }

    public String getTipo() {
        return tipo;
    }
    
      // PASO 4 — SET: asignar datos (siempre tienen parámetro)
    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie; // ← parámetro obligatorio
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
