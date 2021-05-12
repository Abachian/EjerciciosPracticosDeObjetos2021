/*
 * Prueba.java
 *
 * Created on August 28, 2003, 5:24 PM
 */

package ejerciciostp4.Ejercicio5.Congreso;
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
        c.addPropiedad("java");
        
        
        Articulo a1=new Articulo("Programacion....");
        a1.addPropiedad("java");
        a1.addPropiedad("programacion");
        
        Articulo a2=new Articulo("Diseño....");
        a2.addPropiedad("objetos");
        a2.addPropiedad("programacion");
        
        c.add(a1);
        c.add(a2);
        
        Evaluador e1 = new Evaluador("Juan");
        e1.addPropiedad("java");
        e1.addPropiedad("programacion");

        Evaluador e2 = new Evaluador("Pedro");
        e2.addPropiedad("java");
        e2.addPropiedad("programacion");
        
        c.add(e1);
        c.add(e2);
        
        
        System.out.println(c.recursosPara(a1));
        
        System.out.println(c.productosPara(e1));
        
    
    }
    
}
