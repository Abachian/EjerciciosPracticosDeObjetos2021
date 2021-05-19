package ejerciciostp4.FabricaDeMuebles.Condiciones;

import ejerciciostp4.FabricaDeMuebles.ClasesPrincipales.PedidoDeMueble;

public class CriterioNot implements Criterio {
    private Criterio c1;

    public CriterioNot(Criterio c1) {
        this.c1 = c1;
    }

    public boolean cumple(PedidoDeMueble m) {
        return !c1.cumple(m);
    }
}