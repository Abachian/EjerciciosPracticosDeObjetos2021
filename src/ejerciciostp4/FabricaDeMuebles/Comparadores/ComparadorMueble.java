package ejerciciostp4.FabricaDeMuebles.Comparadores;

import ejerciciostp4.FabricaDeMuebles.ClasesPrincipales.PedidoDeMueble;

import java.util.Comparator;

public abstract class ComparadorMueble implements Comparator<PedidoDeMueble> {
    ComparadorMueble sig;

    public ComparadorMueble(ComparadorMueble sig) {
        this.sig = sig;
    }

    public int compare (PedidoDeMueble p1, PedidoDeMueble p2)
    {
        int resultado= this.compararMuebles(p1,p2);
        if ((resultado==0) && (sig!=null)) // si da 0 significa que los muebles son iguales
            return sig.compare(p1,p2);
        return resultado;
    }
    public abstract int compararMuebles(PedidoDeMueble p1, PedidoDeMueble p2);

}
