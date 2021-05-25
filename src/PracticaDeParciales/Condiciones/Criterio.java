package PracticaDeParciales.Condiciones;

import PracticaDeParciales.ClasesPrincipales.Envio;

public interface Criterio {
    public abstract boolean cumple(Envio e);
}
