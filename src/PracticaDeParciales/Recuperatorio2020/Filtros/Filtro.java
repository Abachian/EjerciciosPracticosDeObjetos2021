package PracticaDeParciales.Recuperatorio2020.Filtros;

import PracticaDeParciales.Recuperatorio2020.ClasePrincipales.Seguro;

public interface Filtro {
    public abstract boolean cumple(Seguro s);
}
