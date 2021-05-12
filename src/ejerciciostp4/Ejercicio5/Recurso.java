/*
 * Lote.java
 *
 * Created on August 28, 2003, 5:00 PM
 */

package ejerciciostp4.Ejercicio5;
import java.util.*;

public class Recurso {
    
    protected List<String> propiedades;
    private String nombre;
    
    
    public Recurso(String nombre) {
        this.nombre=nombre;
        propiedades=new ArrayList<String>();
        
    }
    
    public String toString() {
        return nombre;
    }
    
        
    public boolean tienePropiedad(String m) {
        return propiedades.contains(m);
    }
    
    public void addPropiedad(String m) {
    	propiedades.add(m);
    }
    
    
    
}
