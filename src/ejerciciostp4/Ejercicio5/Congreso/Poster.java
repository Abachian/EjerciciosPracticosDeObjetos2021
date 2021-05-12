package ejerciciostp4.Ejercicio5.Congreso;

import java.util.Enumeration;
import ejerciciostp4.Ejercicio5.Recurso;


public class Poster extends Articulo {
    
    
    public Poster(String nombre) {
        super(nombre);
    }
    
    public boolean apto(Recurso rec) {
    	for (String prop: propiedadesReq) {
    		if ( rec.tienePropiedad(prop)) return true;
    	}
  
    	return false;

    }
    
}
