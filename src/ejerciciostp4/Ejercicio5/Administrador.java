/*
 * Cooperativa.java
 *
 * Created on August 28, 2003, 5:00 PM
 */

package ejerciciostp4.Ejercicio5;
import java.util.*;
import java.io.*;


public class Administrador {
    
    
    private List<Producto>  productos;
    private List<Recurso> recursos;
    private List<String> destacados;
    
    
    
    public Administrador() {
    	productos=new ArrayList<Producto>();
    	recursos=new ArrayList<Recurso>();
    	destacados=new ArrayList<String>();
        
    }
    
    
    
    public boolean esDestacado(Recurso r) {
    	for (String prop:destacados) {
    		if (r.tienePropiedad(prop)) return true;	
    	}
        return false;
    }
    
    public List<Producto> productosPara(Recurso rec) {
    	List<Producto> res= new ArrayList<Producto>();
    	for (Producto prod: productos) {
    		if (prod.apto(rec)) res.add(prod);
    	}
        
        return res;
    }
    
    public List<Recurso> recursosPara(Producto prod) {
    	List<Recurso> res= new ArrayList<Recurso>();
    	for (Recurso rec: recursos) {
    		if (prod.apto(rec)) res.add(rec);
    	}
        
        return res;
    }
    
    public void add(Recurso l) {
        recursos.add(l);
    }
    
    public void add(Producto c) {
    	productos.add(c);
    }
    public void addPropiedad(String prop) {
        destacados.add(prop);        
    }
}



