package ejerciciostp4.FabricaDeMuebles.Condiciones;

import ejerciciostp4.FabricaDeMuebles.ClasesPrincipales.PedidoDeMueble;

public interface Criterio  {

    public abstract boolean cumple(PedidoDeMueble p1);
}
