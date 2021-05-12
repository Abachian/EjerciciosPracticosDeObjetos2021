package ejerciciostp3.Avicola.Productos;

import java.util.Date;

public class ProductoCongeladoPorAgua extends ProductoFrio{
   private double salinidad;

    public double getSalinidad() {
        return salinidad;
    }

    public ProductoCongeladoPorAgua(Date fechaVencimiento, Date fechaEnvasado, int nroLote,
                                    String granjaOrigen, int codigoSupervision,
                                    int temperaturaRecomendada, double salinidad)
    {
        super(fechaVencimiento, fechaEnvasado, nroLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoPorAgua{" + super.toString() +
                " salinidad=" + salinidad +
                '}';
    }
}
