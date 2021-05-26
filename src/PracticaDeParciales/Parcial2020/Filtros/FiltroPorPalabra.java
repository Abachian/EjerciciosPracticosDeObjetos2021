package PracticaDeParciales.Parcial2020.Filtros;

import PracticaDeParciales.Parcial2020.ClasesBasicas.Memo;

public class FiltroPorPalabra implements Filtro{
   private String palabraBuscada;

    public FiltroPorPalabra(String palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    @Override
    public boolean cumple(Memo m) {
        if(m.getPalabras().contains(this.palabraBuscada))
            return true;
        return false;
    }
}
