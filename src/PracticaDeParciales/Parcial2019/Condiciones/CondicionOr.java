package PracticaDeParciales.Parcial2019.Condiciones;

import PracticaDeParciales.Parcial2019.ClasesPrincipales.Envio;

public class CondicionOr implements Criterio {
    Criterio c1;
    Criterio c2;

    public CondicionOr(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Envio e) {
        return c1.cumple(e)|| c2.cumple(e);
    }
}
