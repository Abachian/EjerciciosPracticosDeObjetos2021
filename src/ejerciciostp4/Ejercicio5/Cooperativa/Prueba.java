/*
 * Prueba.java
 *
 * Created on August 28, 2003, 5:24 PM
 */

package ejerciciostp4.Ejercicio5.Cooperativa;

import ejerciciostp4.Ejercicio5.Administrador;

public class Prueba {
    
    /** Creates a new instance of Prueba */
    public Prueba() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrador c=new Administrador();
        c.addPropiedad("A");
        
        
        Cereal trigo=new Cereal("Trigo");
        Cereal girasol=new Cereal("Girasol");
        trigo.addPropiedad("A");
        trigo.addPropiedad("B");
        trigo.addPropiedad("C");
        girasol.addPropiedad("A");
        
        c.add(trigo);
        c.add(girasol);
        
        Lote l1=new Lote("Lote 1");
        Lote l2=new Lote("Lote 2");
        Lote l3=new Lote("Lote 3");
        l1.addPropiedad("A");
        l2.addPropiedad("B"); l2.addPropiedad("C");
        l3.addPropiedad("A"); l3.addPropiedad("B"); l3.addPropiedad("C");
        
        c.add(l1); c.add(l2); c.add(l3);
        
        
        System.out.println(c.productosPara(l1));
        System.out.println(c.productosPara(l2));
        System.out.println(c.productosPara(l3));
        
        System.out.println(c.recursosPara(trigo));
        System.out.println(c.recursosPara(girasol));
         
    }
    
}
