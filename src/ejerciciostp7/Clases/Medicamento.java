package ejerciciostp7.Clases;

import ejerciciostp7.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Medicamento extends Elemento {
    private List<Elemento> componentes;

    public Medicamento(String nombre, float porcentaje) {
        super(nombre, porcentaje);
        this.componentes = new ArrayList<Elemento>();
    }

    public void agregarComponente(Elemento elemento) {
        if (!componentes.contains(elemento))
            componentes.add(elemento);
    }

    @Override
    public List<String> getContraIndicaciones() {
        List<String> resultado = new ArrayList<String>();
        for (int i = 0; i < componentes.size(); i++) {
            if (!resultado.contains(componentes.get(i)))
                resultado.addAll(componentes.get(i).getContraIndicaciones());
        }
        return resultado;
    }

    @Override
    public List<String> getAccionesTerapeuticas() {
        List<String> resultado = new ArrayList<String>();
        for (int i = 0; i < componentes.size(); i++) {
            if (!resultado.contains(componentes.get(i)))
                resultado.addAll(componentes.get(i).getAccionesTerapeuticas());
        }
        return resultado;
    }

    @Override
    public List<Elemento> apto(Condicion c) {
        List<Elemento> resultado = new ArrayList<Elemento>();
        for (int i = 0; i < componentes.size(); i++) {
            Elemento componenteActual = componentes.get(i);
            resultado.addAll(componenteActual.apto(c));
        }
        return resultado;

    }

    @Override
    public List<String> getNombreElemento() {
        List<String> resultado = new ArrayList<String>();
        for (int i = 0; i < componentes.size(); i++) {
            Elemento componenteActual = componentes.get(i);
            resultado.addAll(componenteActual.getNombreElemento());
        }
        return resultado;
    }

    @Override
    public float getPorcentaje(String drogaBuscada) {
        float resultado=0;
        for (int i=0; i<componentes.size();i++){
            Elemento actual=componentes.get(i);
            float porcentajeActual= actual.getPorcentaje();
            resultado+= porcentajeActual* actual.getPorcentaje(drogaBuscada);
        }
        return resultado;
    }
}
