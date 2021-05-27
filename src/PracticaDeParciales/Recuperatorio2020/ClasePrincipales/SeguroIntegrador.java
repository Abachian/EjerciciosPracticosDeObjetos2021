package PracticaDeParciales.Recuperatorio2020.ClasePrincipales;

import PracticaDeParciales.Recuperatorio2020.Filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class SeguroIntegrador extends Seguro {
    private List<Seguro> seguros;

    public SeguroIntegrador(int dniDuenio) {
        super(dniDuenio);
        this.seguros = new ArrayList<Seguro>();
    }

    public void agregarSeguro(Seguro s)
    {
        if(!seguros.contains(s))
            seguros.add(s);
    }
    @Override
    public float getMontoAsegurado() {
        int resultado=0;
        for (int i=0;i<seguros.size();i++){
            resultado+= seguros.get(i).getMontoAsegurado();
        }
        return resultado;
    }

    @Override
    public int getNumeroPoliza() {
        int resultado=0;
        for (int i=0; i<this.seguros.size();i++){
            if(this.seguros.get(i).getNumeroPoliza()>resultado)
                resultado=this.seguros.get(i).getNumeroPoliza();
        }
        return resultado;
    }

    @Override
    public float getCostoPoliza() {
        float resultado=0;
        for (int i=0;i<seguros.size();i++)
        {
            resultado+= seguros.get(i).getCostoPoliza();
        }
        return resultado;
    }

    @Override
    public List<Seguro> buscar(Filtro filtro) {
        List<Seguro> resultado= new ArrayList<Seguro>();
        for (int i=0;i<this.seguros.size();i++){
            Seguro seguroActual= seguros.get(i);
            resultado.addAll(seguroActual.buscar(filtro));
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "SeguroIntegrador{" + super.toString() +
                "seguros=" + seguros +
                '}';
    }
}
