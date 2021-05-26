package PracticaDeParciales.Parcial2020.ClasesBasicas;

import PracticaDeParciales.Parcial2020.Filtros.Filtro;

import java.util.List;

public abstract class Elemento {
    private Encriptador encriptador;

    public Encriptador getEncriptador() {
        return encriptador;
    }

    public void setEncriptador(Encriptador encriptador) {
        this.encriptador = encriptador;
    }

    public Elemento(Encriptador encriptador) {
        this.encriptador = encriptador;
    }

    public abstract int getCantPalabras();
    public abstract Elemento traducir(Encriptador e);
    public abstract List<Memo> cumple(Filtro f);
}
