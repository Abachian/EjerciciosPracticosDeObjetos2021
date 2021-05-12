package ejerciciostp4.CongresoCiencias;

import java.util.ArrayList;
import java.util.List;

public class Evaluador extends Elemento {
    String nombreEvaluador;
    List <Trabajo> trabajos;

    public String getNombreEvaluador() {
        return nombreEvaluador;
    }

    public void setNombreEvaluador(String nombreEvaluador) {
        this.nombreEvaluador = nombreEvaluador;
    }

    public Evaluador (String nombreEvaluador)
    {
        super();
        this.nombreEvaluador= nombreEvaluador;
        this.trabajos=new ArrayList<Trabajo>();
    }
    public void addTrabajo(Trabajo trabajo)
    {
        if(trabajo.evaluadorApto(this))
            this.trabajos.add(trabajo);
    }
    public List<Trabajo> getTrabajos()
    {
        List<Trabajo> retorno= new ArrayList<Trabajo>();
        for (int i=0; i< this.trabajos.size();i++)
            retorno.add(this.trabajos.get(i));
        return retorno;
    }
    public int cantTrabajos()
    {
        return this.trabajos.size();
    }
    @Override
    public String toString() {
        return "Evaluador{" +
                "nombre='" + nombreEvaluador + '\'' +
                ", trabajos =" + trabajos +
                '}';
    }
}
