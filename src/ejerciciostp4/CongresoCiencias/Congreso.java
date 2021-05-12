package ejerciciostp4.CongresoCiencias;
import java.util.ArrayList;
import java.util.List;

public class Congreso {
    private String nombre;
    private List<Evaluador> evaluadores= new ArrayList<>();
    private List<Trabajo> trabajos= new ArrayList<>();
    private List<Trabajo> trabajosGenerales= new ArrayList<>();
    private List<Trabajo> trabajosExpertos= new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Evaluador> getEvaluadores()
    {
        List<Evaluador> retorno= new ArrayList<Evaluador>();
        for (int i=0; i< this.evaluadores.size(); i++)
            retorno.add(this.evaluadores.get(i));
        return retorno;
    }
    public List<Trabajo> getTrabajos()
    {
        List<Trabajo> retorno= new ArrayList<Trabajo>();
        for (int i=0; i< this.trabajos.size(); i++)
            retorno.add(this.trabajos.get(i));
        return retorno;
    }
    public List<Trabajo> getTrabajosGenerales()
    {
        List<Trabajo> retorno= new ArrayList<Trabajo>();
        for (int i=0; i< this.trabajosGenerales.size(); i++)
            retorno.add(this.trabajosGenerales.get(i));
        return retorno;
    }
    public List<Trabajo> getTrabajosExpertos()
    {
        List<Trabajo> retorno= new ArrayList<Trabajo>();
        for (int i=0; i< this.trabajosExpertos.size(); i++)
            retorno.add(this.trabajosExpertos.get(i));
        return retorno;
    }

    public Congreso (String nombre)
    {
        this.nombre=nombre;
    }
    public void addLote(Trabajo trabajo)
    {
        this.trabajos.add(trabajo);
    }
    public void addCereal(Evaluador evaluador)
    {
        this.evaluadores.add(evaluador);
    }
    public void addTrabajoExperto (Trabajo trabajoExperto)
    {
        if (!(this.trabajosExpertos.contains(trabajoExperto)))
            this.trabajosExpertos.add(trabajoExperto);
    }
    public void addMineralesSecundarios (Trabajo trabajoGeneral)
    {
        if (!(this.trabajosGenerales.contains(trabajoGeneral)))
            this.trabajosGenerales.add(trabajoGeneral);
    }
    public boolean esExperto(Evaluador evaluador)
    {
        for (int i=0; i< this.trabajosExpertos.size();i++)
        {
            if(!(evaluador.getTemas().contains(this.trabajosExpertos.get(i))))
                return false;
        }
        return true;
    }

}
