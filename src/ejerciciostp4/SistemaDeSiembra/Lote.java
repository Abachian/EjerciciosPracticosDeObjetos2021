package ejerciciostp4.SistemaDeSiembra;

public class Lote extends Elemento{
    private int cantidadHectareas;

    public void setCantidadHectareas(int cantidadHectareas) {
        this.cantidadHectareas = cantidadHectareas;
    }

    public int getCantidadHectareas() {
        return cantidadHectareas;
    }
    public Lote (int cantidadHectareas)
    {
        this.cantidadHectareas=cantidadHectareas;
    }
    public boolean aceptado(Cereal c)
    {
        return c.aceptaLote(this);
    }

}
