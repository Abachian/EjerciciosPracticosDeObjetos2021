package ejerciciostp3.Avicola.Productos;

import java.util.Date;

public class ProductoFresco extends Producto{
    private String nombreProducto;
    public String getNombreProducto() {
        return nombreProducto;
    }

    public ProductoFresco(Date fechaVencimiento, Date fechaEnvasado, int nroLote, String granjaOrigen, String nombreProducto) {
        super(fechaVencimiento, fechaEnvasado, nroLote, granjaOrigen);
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + super.toString()+ ", nombreProducto= "+ nombreProducto+ '}';
    }
}
