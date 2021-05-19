package ejerciciostp4.FabricaDeMuebles.Condiciones;

import ejerciciostp4.FabricaDeMuebles.ClasesPrincipales.PedidoDeMueble;

public class CriterioAnd implements Criterio {
    private Criterio c1;
    private Criterio c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(PedidoDeMueble m) {
        return c1.cumple(m) && c2.cumple(m);
    }
}
