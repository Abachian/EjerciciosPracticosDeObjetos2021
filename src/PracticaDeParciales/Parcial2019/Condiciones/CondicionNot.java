package PracticaDeParciales.Parcial2019.Condiciones;

import PracticaDeParciales.Parcial2019.ClasesPrincipales.Envio;

public class CondicionNot implements Criterio{
    Criterio c1;
    @Override
    public boolean cumple(Envio e) {
    return (!c1.cumple(e));
    }
}
