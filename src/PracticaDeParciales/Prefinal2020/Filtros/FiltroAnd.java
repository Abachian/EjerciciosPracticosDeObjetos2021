package PracticaDeParciales.Prefinal2020.Filtros;

import PracticaDeParciales.Prefinal2020.ClasePrincipales.Seguro;

public class FiltroAnd implements Filtro {
    Filtro f1;
    Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Seguro s) {
        return f1.cumple(s) && f2.cumple(s);
    }
}
