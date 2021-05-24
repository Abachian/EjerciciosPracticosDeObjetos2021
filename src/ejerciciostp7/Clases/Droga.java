package ejerciciostp7.Clases;

import ejerciciostp7.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Droga extends Elemento {
    private List<String> accionesTerapeuticas;
    private List<String> contraIndicaciones;



    public Droga(String nombre,float porcentaje) {
        super(nombre,porcentaje);
        this.accionesTerapeuticas= new ArrayList<String>();
        this.contraIndicaciones= new ArrayList<String>();
    }
    public void agregarAccion(String accionTerapeutica)
    {
        if (!this.accionesTerapeuticas.contains(accionTerapeutica))
            this.accionesTerapeuticas.add(accionTerapeutica);
    }
    public void contraindicacion(String contra)
    {
        if (!this.accionesTerapeuticas.contains(contra))
            this.accionesTerapeuticas.add(contra);
    }

    @Override
    public List<String> getContraIndicaciones() {
        List<String> resultado=new ArrayList<String>();
        resultado.addAll(contraIndicaciones);
        return resultado;
    }

    @Override
    public List<String> getAccionesTerapeuticas() {
        List<String> resultado=new ArrayList<String>();
        resultado.addAll(accionesTerapeuticas);
        return resultado;
    }

    @Override
    public List<Elemento> apto(Condicion c) {
        List<Elemento> resultado = new ArrayList<Elemento>();
        if (c.cumple(this))
            resultado.add(this);
        return resultado;
    }

    @Override
    public List<String> getNombreElemento() {
        List<String> resultado= new ArrayList<String>();
        resultado.add(this.getNombre());
        return resultado;
    }

    @Override
    public float getPorcentaje(String drogaBuscada) {
        if(this.getNombre().equals(drogaBuscada))
            return (this.getPorcentaje());
        return 0;}
}
