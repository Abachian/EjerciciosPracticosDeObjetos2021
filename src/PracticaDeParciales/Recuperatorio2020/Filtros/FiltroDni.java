package PracticaDeParciales.Recuperatorio2020.Filtros;

import PracticaDeParciales.Recuperatorio2020.ClasePrincipales.Seguro;

public class FiltroDni implements Filtro {
    private int DniBuscado;

    public FiltroDni(int dniBuscado) {
        DniBuscado = dniBuscado;
    }

    @Override
    public boolean cumple(Seguro s) {
        return s.getDniDuenio()==DniBuscado;
    }
}
