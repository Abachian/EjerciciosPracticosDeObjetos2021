package ejerciciostp4.FabricaDeMuebles.Condiciones;

import ejerciciostp4.FabricaDeMuebles.ClasesPrincipales.PedidoDeMueble;

public class CriterioPorMasCaro implements Criterio {
    int precio;
    public CriterioPorMasCaro(int p)
    {
        precio=p;
    }
    @Override
    public boolean cumple(PedidoDeMueble p1)
    {
        return p1.getCostoEstimado()<precio;
    }
}
