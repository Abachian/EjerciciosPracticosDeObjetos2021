package PracticaDeParciales.Condiciones;

import PracticaDeParciales.ClasesPrincipales.Envio;

public class CondicionNot implements Criterio{
    Criterio c1;
    @Override
    public boolean cumple(Envio e) {
    return (!c1.cumple(e));
    }
}
