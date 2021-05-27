package PracticaDeParciales.Prefinal2020.Filtros;

import PracticaDeParciales.Prefinal2020.ClasePrincipales.Seguro;

public class FiltroPorPalabra implements Filtro {
    private String palabraBuscada;

    public FiltroPorPalabra(String palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    @Override
    public boolean cumple(Seguro s) {
        if (s.getDescripcion().contains(palabraBuscada))
            return true;
        return false;
    }
}
