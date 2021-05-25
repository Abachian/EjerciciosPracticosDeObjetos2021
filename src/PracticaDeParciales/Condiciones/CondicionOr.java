package PracticaDeParciales.Condiciones;

import PracticaDeParciales.ClasesPrincipales.Envio;
import ejerciciostp7.Clases.Elemento;
import ejerciciostp7.Condiciones.Condicion;

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
