package ejerciciostp4.SistemaDeSiembra;

public class Pastura extends Cereal {
    private static double tamanioRequerido=50;
    public Pastura(String nombre)
    {
        super(nombre);
    }
    @Override
    public boolean aceptaLote(Lote lote)
    {
        boolean cumpleMinerales=super.aceptaLote(lote);
        if ((cumpleMinerales) && (lote.getCantidadHectareas()>=50))
            return true;
        else
            return false;
    }

}
