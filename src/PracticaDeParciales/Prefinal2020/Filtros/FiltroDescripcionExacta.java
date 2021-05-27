package PracticaDeParciales.Prefinal2020.Filtros;

import PracticaDeParciales.Prefinal2020.ClasePrincipales.Seguro;

public class FiltroDescripcionExacta implements Filtro {
    private String descrpicionBuscada;

    public FiltroDescripcionExacta(String descrpicionBuscada) {
        this.descrpicionBuscada = descrpicionBuscada;
    }

    @Override
    public boolean cumple(Seguro s) {
        if (s.getDescripcion().equals(descrpicionBuscada))
            return true;
        return false;
    }
}
