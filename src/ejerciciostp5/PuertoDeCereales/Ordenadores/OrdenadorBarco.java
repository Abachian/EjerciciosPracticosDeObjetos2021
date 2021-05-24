package ejerciciostp5.PuertoDeCereales.Ordenadores;

import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Barco;
import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Transporte;

import java.util.Comparator;

public class OrdenadorBarco implements Comparator<Barco> {
    OrdenadorBarco sig;
    public int compare (Barco t1, Barco t2)
    {
        int resultado= this.compararBarco(t1,t2);
        if ((resultado==0) && (sig!=null)) // si da 0 significa que los Transportes son iguales
            return sig.compare(t1,t2);
        return resultado;
    }
    public OrdenadorBarco()
    {
        sig=null;
    }
    public OrdenadorBarco(OrdenadorBarco siguiente){sig=siguiente;}

    public int compararBarco(Barco b1,Barco b2)
    {
       return  b1.getCapacidad() - b2.getCapacidad();
    }
}
