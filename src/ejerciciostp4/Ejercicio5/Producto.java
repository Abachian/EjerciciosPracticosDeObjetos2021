/*
 * Cereal.java
 *
 * Created on August 28, 2003, 5:00 PM
 */

package ejerciciostp4.Ejercicio5;
import java.util.*;



public class Producto {

    protected List<String> propiedadesReq;
    private String nombre;
    
    public String toString() {
        return nombre;
    }
    
    /** Creates a new instance of Cereal */
    public Producto(String nombre) {
    	propiedadesReq=new ArrayList<String>();
        this.nombre=nombre;
    }
    
    public void addPropiedad(String requerida) {
    	propiedadesReq.add(requerida);
    }
   
    public boolean apto(Recurso r) {
    	for (String prop: propiedadesReq) {
    		if (! r.tienePropiedad(prop)) return false;
    	}
        
        return true;
    }
    
}
