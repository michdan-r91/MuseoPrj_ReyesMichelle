
/**
 * Representa a una persona y su boleto asignado para ingresar al museo
 * cada perona tiene un nombre e identificacion 
 * 
 * @author (Michelle Reyes Flores) 
 * @version (1.0)
 */
public class Persona {
    private String nombre;
    private String identificacion;
    private BoletoMuseo miBoleto;
    
    /**
     * Constructor de la clase Persona
     * inicializa con el nombre e identificacion de la persona
     * @parametro nombre nombre de la persona
     * @parametro  ident identificación de la persona
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }
    
    /** 
     * Establece el nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Establece la identificacion de la persona
     * @paremetro pIdentificacion nueva identificación de la persona
     */
    public void setIdentidicacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }
    
    /**
     * Asigna un boleto de museo a la persona
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }
    
    /**
     * Consulta el número del boleto asignado a la persona 
     * @return número del boleto asignado
     */
    public int consultarMiNumeroDeBoleto () {
        return miBoleto.getNumeroBoleto();
    }
    
    /**
     * Retorna una representación en cadena de la persona,
     * incluye su nombre, identificación y si tiene boleto asignado.
     * 
     * @return una cadena con los datos de la persona
     */
    public String toString() {
        String msg = "Persona\n";
        msg += " Nombre: " + nombre +  "\n";
        msg += " Identificacion: " + identificacion + "\n";
        if (miBoleto != null) {
            msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() +  "\n";
        } else {
            msg += " Boleto asignado: (ninguno)\n";
        }
        return msg;
    }
}
