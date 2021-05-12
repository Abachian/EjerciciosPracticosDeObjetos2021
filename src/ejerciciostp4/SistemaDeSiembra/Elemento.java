package ejerciciostp4.SistemaDeSiembra;

import java.util.ArrayList;
import java.util.List;

public abstract class Elemento
{
    private List<Mineral> minerales;
    public Elemento ()
    {
        this.minerales = new ArrayList<>();
    }
    public void addMineral(Mineral mineral) {
        if (!minerales.contains(mineral))
            minerales.add(mineral);
    }
    public List<Mineral> getMinerales() {
        List<Mineral> resultado = new ArrayList<Mineral>();
        for (int i = 0; i < minerales.size(); i++)
            resultado.add(minerales.get(i));
        return resultado;
    }
    public boolean contieneMineral (Mineral mineral)
    {
        return  minerales.contains(mineral);
    }
}
