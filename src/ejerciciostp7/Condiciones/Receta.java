package ejerciciostp7.Condiciones;

import ejerciciostp7.Clases.Elemento;
import ejerciciostp7.Clases.Medicamento;

import java.util.List;

public class Receta implements Condicion{
    private Enfermedad e1;
    private String nombre;

    public Receta(Enfermedad e1, String nombre) {
        this.e1 = e1;
        this.nombre = nombre;
    }
    @Override
    public boolean cumple(Elemento e) {
        return (e.getAccionesTerapeuticas().containsAll(e1.getEstadoPatologicos()));
    }
}
