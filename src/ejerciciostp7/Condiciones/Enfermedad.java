package ejerciciostp7.Condiciones;

import ejerciciostp7.Clases.Elemento;
import ejerciciostp7.Clases.Medicamento;
import ejerciciostp7.Condiciones.Condicion;

import java.util.ArrayList;
import java.util.List;

public class Enfermedad implements Condicion {
    private String nombre;
    private List<String> estadoPatologicos;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        estadoPatologicos= new ArrayList<String>();
    }
    public void agregarEstado(String estado)
    {
        if(!estadoPatologicos.contains(estado))
            estadoPatologicos.add(estado);
    }
    @Override
    public boolean cumple(Elemento e) {
        List<String> prospectoMedicamento = ((Medicamento)(e)).getAccionesTerapeuticas();
        return estadoPatologicos.containsAll(prospectoMedicamento);

    }
    public List<String> getEstadoPatologicos() {
        List<String> resultado = new ArrayList<String>();
        resultado.addAll(estadoPatologicos);
        return resultado;
    }
}

