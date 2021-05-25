package PracticaDeParciales.Parcial2020.ClasesBasicas;

import PracticaDeParciales.Parcial2020.Filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class Memo extends Elemento {
    protected List<String> palabras;

    public Memo(Encriptador encriptador, List<String> palabras) {
        super(encriptador);
        this.palabras = new ArrayList<String>();
    }

    public void agregarPalabra(String palabra)
    {
        if (!palabras.contains(palabra))
            palabras.add(palabra);
    }
    public List<String> getPalabras()
    {
        List<String> resultado= new ArrayList<String>();
        resultado.addAll(palabras);
        return resultado;
    }
    @Override
    public int getCantPalabras() {
        return palabras.size();
    }

    @Override
    public Elemento traducir(Encriptador e) {
        Memo resultado= new Memo(e,this.getPalabras());
        for (int i=0; i<palabras.size();i++)
        {
            String traducida= this.getEncriptador().traducir(e,palabras.get(i));
            resultado.agregarPalabra(traducida);
        }
        return resultado;

    }

    @Override
    public List<Memo> cumple(Filtro f) {
        List<Memo> resultado= new ArrayList<Memo>();
        if(f.cumple(this))
            resultado.add(this);
        return resultado;
    }
}
