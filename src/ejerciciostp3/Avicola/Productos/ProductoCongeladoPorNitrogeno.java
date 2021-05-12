package ejerciciostp3.Avicola.Productos;

import java.util.Date;

public class ProductoCongeladoPorNitrogeno extends ProductoFrio {
    private String metedoCongelacion;
    private int tiempoExposicion;
    public String getMetedoCongelacion() {
        return metedoCongelacion;
    }

    public int getTiempoExposicion() {
        return tiempoExposicion;
    }

    public ProductoCongeladoPorNitrogeno(Date fechaVencimiento, Date fechaEnvasado,
                                         int nroLote, String granjaOrigen, int codigoSupervision,
                                         int temperaturaRecomendada, String metedoCongelacion, int tiempoExposicion)
    {
        super(fechaVencimiento, fechaEnvasado, nroLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
        this.metedoCongelacion = metedoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoPorNitrogeno{" + super.toString() +
                "metedoCongelacion='" + metedoCongelacion + '\'' +
                ", tiempoExposicion=" + tiempoExposicion +
                '}';
    }
}
