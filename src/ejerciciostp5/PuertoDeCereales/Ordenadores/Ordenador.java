package ejerciciostp5.PuertoDeCereales.Ordenadores;

import ejerciciostp5.PuertoDeCereales.ClasesPrincipales.Transporte;

import java.util.Comparator;

public abstract class Ordenador implements Comparator<Transporte> {
    Ordenador sig;
    public int compare (Transporte t1, Transporte t2)
    {
        int resultado= this.compararTransporte(t1,t2);
        if ((resultado==0) && (sig!=null)) // si da 0 significa que los Transportes son iguales
            return sig.compare(t1,t2);
        return resultado;
    }
    public abstract int compararTransporte(Transporte t1, Transporte t2);

}
