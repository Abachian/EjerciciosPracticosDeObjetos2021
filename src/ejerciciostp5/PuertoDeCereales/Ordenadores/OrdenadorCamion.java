package ejerciciostp5.PuertoDeCereales.Ordenadores;

import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Camion;
import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Transporte;

import java.util.Date;

public class OrdenadorCamion extends Ordenador{
    public OrdenadorCamion()
    {
        sig=null;
    }
    public OrdenadorCamion(Ordenador siguiente){sig=siguiente;}
    @Override
    public int compararTransporte(Transporte c1, Transporte c2)
    {
        Date fechaAux= ((Camion)(c2)).getFechaDeCarga();
        return  ((Camion)(c1)).getFechaDeCarga().compareTo(fechaAux);
    }
}

