package ejerciciostp3.Avicola.Productos;

import java.util.Date;

public class ProductoCongeladoPorAire extends ProductoFrio {
    private double nitrogeno;
    private double oxigeno;
    private double dioxidoCarbono;
    private double vaporDeAgua;

    public double getNitrogeno() {
        return nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public double getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public double getVaporDeAgua() {
        return vaporDeAgua;
    }

    public ProductoCongeladoPorAire(Date fechaVencimiento, Date fechaEnvasado, int nroLote, String granjaOrigen,
                                    int codigoSupervision, int temperaturaRecomendada, double nitrogeno, double oxigeno,
                                    double dioxidoCarbono, double vaporDeAgua)
    {
        super(fechaVencimiento, fechaEnvasado, nroLote, granjaOrigen, codigoSupervision, temperaturaRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporDeAgua = vaporDeAgua;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoPorAire{" +
                super.toString()+
                " nitrogeno=" + nitrogeno +
                ", oxigeno=" + oxigeno +
                ", dioxidoCarbono=" + dioxidoCarbono +
                ", vaporDeAgua=" + vaporDeAgua +
                '}';
    }
}
