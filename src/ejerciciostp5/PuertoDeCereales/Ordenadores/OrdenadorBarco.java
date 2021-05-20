package ejerciciostp5.PuertoDeCereales.Ordenadores;

import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Barco;
import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Transporte;

public class OrdenadorBarco extends Ordenador{
    public OrdenadorBarco()
    {
        sig=null;
    }
    public OrdenadorBarco(Ordenador siguiente){sig=siguiente;}
    @Override
    public int compararTransporte(Transporte b1, Transporte b2)
    {
       return  (((Barco)(b1)).getCapacidad() - ((Barco)(b2)).getCapacidad());
    }
}
