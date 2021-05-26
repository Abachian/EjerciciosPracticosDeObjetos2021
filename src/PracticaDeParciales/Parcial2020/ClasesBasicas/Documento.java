package PracticaDeParciales.Parcial2020.ClasesBasicas;

import PracticaDeParciales.Parcial2020.Filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class Documento extends Elemento {
    private String autor;
    private List<Elemento> componentes;
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Documento(Encriptador encriptador, String autor) {
        super(encriptador);
        this.autor = autor;
    }
    public void agregarComponente(Elemento componente)
    {
        if(!componentes.contains(componente))
            componentes.add(componente);
    }
    @Override
    public int getCantPalabras() {
        int resultado = 0;
        for (int i = 0; i < componentes.size(); i++)
            resultado+=(componentes.get(i).getCantPalabras());
        return resultado;
    }

    @Override
    public Elemento traducir(Encriptador e) {
        Documento resultado=new Documento(this.getEncriptador(),getAutor());
        for (int i=0; i<componentes.size();i++)
        {
            resultado.agregarComponente(componentes.get(i).traducir(e));
        }
        return resultado;
    }

    @Override
    public List<Memo> cumple(Filtro f) {
        List<Memo> resultado= new ArrayList<Memo>();
        for (int i=0; i<componentes.size();i++){
            Elemento componenteActual= componentes.get(i);
            resultado.addAll(componenteActual.cumple(f));
        }
        return resultado;
    }
}
