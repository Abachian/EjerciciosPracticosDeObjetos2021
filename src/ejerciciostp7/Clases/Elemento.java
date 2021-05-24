package ejerciciostp7.Clases;

import ejerciciostp7.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public abstract class Elemento {
    private String nombre;
    private float porcentaje;

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Elemento(String nombre, float porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    public abstract List<String> getContraIndicaciones();
    public abstract List<String> getAccionesTerapeuticas();
    public abstract List<Elemento> apto(Condicion c);
    public abstract List<String> getNombreElemento();
    public abstract float getPorcentaje(String drogaBuscada);
}
