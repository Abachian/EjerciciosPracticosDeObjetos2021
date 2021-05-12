/*
 * Pastura.java
 *
 * Created on August 28, 2003, 5:01 PM
 */

package ejerciciostp4.Ejercicio5.Cooperativa;

import ejerciciostp4.Ejercicio5.Recurso;

public class Pastura extends Cereal {
    
    /** Creates a new instance of Pastura */
    public Pastura(String nombre) {
        super(nombre);
    }
    
    public boolean apto(Recurso l) {
        return super.apto(l) && ! ((Lote)l).isTuvoPastura();
    }
    
}
