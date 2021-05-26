package PracticaDeParciales.Parcial2020.Filtros;

import PracticaDeParciales.Parcial2020.ClasesBasicas.Memo;

public class FiltroAnd implements Filtro{
    Filtro f1;
    Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean cumple(Memo m) {
        return f1.cumple(m) && f2.cumple(m);
    }
}
