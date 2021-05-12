/*
 * Lote.java
 *
 * Created on August 28, 2003, 5:00 PM
 */

package ejerciciostp4.Ejercicio5.Congreso;
import java.util.*;
import ejerciciostp4.Ejercicio5.Recurso;

//solo si agrega atributos o nueva funcionalidad

public class Evaluador extends Recurso {
	
	private int edad;
	private String Institucion;
	
	
	public Evaluador(String name) {
    super(name);    
    }


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getInstitucion() {
		return Institucion;
	}


	public void setInstitucion(String institucion) {
		Institucion = institucion;
	}
    
        
}
