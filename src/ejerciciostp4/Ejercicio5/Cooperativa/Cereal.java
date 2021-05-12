/*
 * Cereal.java
 *
 * Created on August 28, 2003, 5:00 PM
 */

package ejerciciostp4.Ejercicio5.Cooperativa;


import ejerciciostp4.Ejercicio5.Producto;

//solo si agrega atributos o nueva funcionalidad

public class Cereal extends Producto{

    private float precio;    
	
    public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/** Creates a new instance of Cereal */
    public Cereal(String nombre) {
        super(nombre);
    }
       
    
}
