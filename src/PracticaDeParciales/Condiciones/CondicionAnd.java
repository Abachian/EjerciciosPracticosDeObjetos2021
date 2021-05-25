package PracticaDeParciales.Condiciones;

import PracticaDeParciales.ClasesPrincipales.Envio;

public class CondicionAnd implements Criterio {
    Criterio c1;
    Criterio c2;

    public CondicionAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Envio e) {
        return c1.cumple(e) && c2.cumple(e);
    }
}
