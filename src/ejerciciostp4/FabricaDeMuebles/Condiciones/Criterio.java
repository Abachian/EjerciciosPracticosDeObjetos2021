package ejerciciostp4.FabricaDeMuebles.Condiciones;

import ejerciciostp4.FabricaDeMuebles.PedidoDeMueble;

import java.util.Comparator;

public interface Criterio  {

    public abstract boolean cumple(PedidoDeMueble p1);
}
