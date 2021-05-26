package PracticaDeParciales.Parcial2020.Filtros;

import PracticaDeParciales.Parcial2020.ClasesBasicas.Memo;

public class FiltroNot implements Filtro{
    Filtro f;

    public FiltroNot(Filtro f) {
        this.f = f;
    }

    @Override
    public boolean cumple(Memo m) {
        return !f.cumple(m);
    }
}
