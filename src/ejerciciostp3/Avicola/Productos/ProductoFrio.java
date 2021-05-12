package ejerciciostp3.Avicola.Productos;

import java.util.Date;

public class ProductoFrio extends Producto{
    private int codigoSupervision;
    private int temperaturaRecomendada;

    public int getCodigoSupervision() {
        return codigoSupervision;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public ProductoFrio(Date fechaVencimiento, Date fechaEnvasado, int nroLote, String granjaOrigen, int codigoSupervision, int temperaturaRecomendada) {
        super(fechaVencimiento, fechaEnvasado, nroLote, granjaOrigen);
        this.codigoSupervision = codigoSupervision;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public String toString() {
        return "ProductoFrio{" + super.toString()+ ", codigoSupervision=" + codigoSupervision +
                ", temperaturaRecomendada=" + temperaturaRecomendada +
                '}';
    }
}
