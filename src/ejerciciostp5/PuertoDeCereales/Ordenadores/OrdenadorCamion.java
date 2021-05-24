package ejerciciostp5.PuertoDeCereales.Ordenadores;

import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Barco;
import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Camion;
import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Transporte;

import java.util.Comparator;
import java.util.Date;

public class OrdenadorCamion implements Comparator<Camion> {
    OrdenadorCamion sig;
    public int compare (Camion t1, Camion t2)
    {
        int resultado= this.compararCamion(t1,t2);
        if ((resultado==0) && (sig!=null)) // si da 0 significa que los Transportes son iguales
            return sig.compare(t1,t2);
        return resultado;
    }
    public OrdenadorCamion()
    {
        sig=null;
    }
    public OrdenadorCamion(OrdenadorCamion siguiente){sig=siguiente;}
    public int compararCamion(Camion c1, Camion c2)
    {
        Date fechaAux= c2.getFechaDeCarga();
        return  c1.getFechaDeCarga().compareTo(fechaAux);
    }
}

