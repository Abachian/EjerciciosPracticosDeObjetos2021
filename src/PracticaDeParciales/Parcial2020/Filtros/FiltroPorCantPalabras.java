package PracticaDeParciales.Parcial2020.Filtros;

import PracticaDeParciales.Parcial2020.ClasesBasicas.Memo;

public class FiltroPorCantPalabras implements Filtro {
    private int cantidadMaxima;

    public FiltroPorCantPalabras(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    @Override
    public boolean cumple(Memo m) {
        if(m.getCantPalabras()<cantidadMaxima)
            return true;
        return false;
    }
}
