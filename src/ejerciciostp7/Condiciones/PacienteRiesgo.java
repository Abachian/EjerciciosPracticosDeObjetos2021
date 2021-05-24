package ejerciciostp7.Condiciones;

import ejerciciostp7.Clases.Droga;
import ejerciciostp7.Clases.Elemento;

import java.util.ArrayList;
import java.util.List;

public class PacienteRiesgo implements Condicion{
    private String nombre;
    private Droga drogaAdversa;
    private List<String> sintomas;

    public String getNombre() {
        return nombre;
    }

    public Droga getDrogaAdversa() {
        return drogaAdversa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDrogaAdversa(Droga drogaAdversa) {
        this.drogaAdversa = drogaAdversa;
    }

    public PacienteRiesgo(String nombre, Droga drogaAdversa) {
        this.nombre = nombre;
        this.drogaAdversa = drogaAdversa;
        this.sintomas= new ArrayList<String>();
    }
    public void agregarSintoma(String sintoma)
    {
        if(!sintomas.contains(sintoma))
        {
            sintomas.add(sintoma);
        }
    }

    @Override
    public String toString() {
        return "PacienteRiesgo{" +
                "nombre='" + nombre + '\'' +
                ", drogaAdversa=" + drogaAdversa +
                '}';
    }

    @Override
    public boolean cumple(Elemento e) {
        return (!e.getNombreElemento().contains(drogaAdversa)) &&
                (!e.getContraIndicaciones().containsAll(sintomas));
    }
}
