package ejerciciostp4.SistemaDeSiembra;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
    private List<Lote> lotes= new ArrayList<>();
    private List<Cereal> cereales= new ArrayList<>();
    private List<Mineral> mineralesPrimarios= new ArrayList<>();
    private List<Mineral> mineralesSecundarios= new ArrayList<>();
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Lote> getLotes()
    {
        List<Lote> retorno= new ArrayList<Lote>();
        for (int i=0; i< this.lotes.size(); i++)
            retorno.add(this.lotes.get(i));
        return retorno;
    }
    public List<Cereal> getCereal()
    {
        List<Cereal> retorno= new ArrayList<Cereal>();
        for (int i=0; i< this.cereales.size(); i++)
            retorno.add(this.cereales.get(i));
        return retorno;
    }
    public List<Mineral> getMineralesPrimarios()
    {
        List<Mineral> retorno= new ArrayList<Mineral>();
        for (int i=0; i< this.mineralesPrimarios.size(); i++)
            retorno.add(this.mineralesPrimarios.get(i));
        return retorno;
    }
    public List<Mineral> getMineralesSecundarios()
    {
        List<Mineral> retorno= new ArrayList<Mineral>();
        for (int i=0; i< this.mineralesSecundarios.size(); i++)
            retorno.add(this.mineralesSecundarios.get(i));
        return retorno;
    }

    public Cooperativa (String nombre)
    {
        this.nombre=nombre;
    }
    public void addLote(Lote lote)
    {
        this.lotes.add(lote);
    }
    public void addCereal(Cereal cereal)
    {
        this.cereales.add(cereal);
    }
    public void addMineralesPrimarios (Mineral mineral)
    {
        if (!(this.mineralesPrimarios.contains(mineral)))
            this.mineralesPrimarios.add(mineral);
    }
    public void addMineralesSecundarios (Mineral mineral)
    {
        if (!(this.mineralesSecundarios.contains(mineral)))
            this.mineralesSecundarios.add(mineral);
    }
    public boolean esEspecial(Lote l)
    {
        for (int i=0; i< this.mineralesPrimarios.size();i++)
        {
            if(!(lotes.contains(this.mineralesPrimarios.get(i))))
                return false;
        }
        return true;
    }
}
