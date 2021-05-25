package PracticaDeParciales.Parcial2020.Filtros;

import PracticaDeParciales.Parcial2020.ClasesBasicas.Encriptador;
import PracticaDeParciales.Parcial2020.ClasesBasicas.Memo;

public class FiltroPorEncriptador implements Filtro{
    private Encriptador encriptadorBuscado;

    @Override
    public boolean cumple(Memo m) {
        if (m.getEncriptador().equals(encriptadorBuscado))
            return true;
        return false;
    }
}
