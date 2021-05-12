/*
 * Lote.java
 *
 * Created on August 28, 2003, 5:00 PM
 */

package ejerciciostp4.Ejercicio5.Cooperativa;
import java.util.*;


import ejerciciostp4.Ejercicio5.Recurso;

public class Lote extends Recurso {
    
     private boolean tuvoPastura;
    
    
    public boolean isTuvoPastura() {
		return tuvoPastura;
	}


	public void setTuvoPastura(boolean tuvoPastura) {
		this.tuvoPastura = tuvoPastura;
	}


	public Lote(String name) {
        super(name);
    }
    
    
    
    
}
