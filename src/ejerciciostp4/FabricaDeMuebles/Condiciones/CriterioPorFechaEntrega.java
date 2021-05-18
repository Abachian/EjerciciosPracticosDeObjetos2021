package ejerciciostp4.FabricaDeMuebles.Condiciones;

import ejerciciostp4.FabricaDeMuebles.Condiciones.Criterio;
import ejerciciostp4.FabricaDeMuebles.PedidoDeMueble;

public class CriterioPorFechaEntrega implements Criterio {
    long fechaProxima;
    public CriterioPorFechaEntrega (long f)
    {
        fechaProxima=f;
    }
    @Override
    public boolean cumple(PedidoDeMueble p1)
    {
        return p1.getFechaMaximaEntrega()< fechaProxima;
    }
}

