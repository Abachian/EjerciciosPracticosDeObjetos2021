package ejerciciostp4.CongresoCiencias;

import java.util.List;

public class Trabajo extends Elemento {
    public String nombreTrabajo;

    public String getNombreTrabajo() {
        return nombreTrabajo;
    }

    public void setNombreTrabajo(String nombreTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
    }

    public Trabajo(String nombreTrabajo) {
        super();
        this.nombreTrabajo = nombreTrabajo;
    }

    public boolean evaluadorApto(Evaluador evaluador) {
        List<String> listaTrabajo = this.getTemas();
        for (int i = 0; i < listaTrabajo.size(); i++) {
            if (!evaluador.sabeTema(listaTrabajo.get(i)))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "nombre='" + nombreTrabajo + '\'' +
                ", temasTratados=" + this.getTemas() +
                '}';
    }
}
