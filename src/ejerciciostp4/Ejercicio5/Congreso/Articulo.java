
package ejerciciostp4.Ejercicio5.Congreso;
import java.util.*;

import ejerciciostp4.Ejercicio5.Producto;

//solo si agrega atributos o nueva funcionalidad
public class Articulo extends Producto {

    public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	private String autor;
    private int paginas;
	
    public Articulo (String titulo) {
    	super(titulo);
    }
    
}
