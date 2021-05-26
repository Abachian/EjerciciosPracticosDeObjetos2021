package PracticaDeParciales.Parcial2019.ClasesPrincipales;

import PracticaDeParciales.Parcial2019.Condiciones.Criterio;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Envio{
    private List<Envio> envios;
    private Criterio criterio;
    public Combo(int idTracking, String ciudad, Criterio c) {
        super(idTracking, ciudad);
        this.envios =new ArrayList<Envio>();
        this.criterio=c;
    }

    public void agregarEnvio (Envio e)
    {
        if (this.criterio.cumple(e))
            if(!this.envios.contains(e))
                e.setIdTracking(this.getIdTracking());
                envios.add(e);
    }

    @Override
    public List<Envio> cumple(Criterio c) {
        List<Envio> resultado= new ArrayList<Envio>();
        for (int i=0;i<envios.size();i++){
            Envio envioActual= envios.get(i);
            resultado.addAll(envioActual.cumple(c));
        }
        return resultado;
    }

    @Override
    public double getPeso() {
        int resultado=0;
        for (int i=0;i<envios.size();i++)
        {
            resultado+=envios.get(i).getPeso();
        }
        return resultado;
    }
    @Override
    public String getRemitente() {
        return this.envios.get(0).getRemitente();
    }

    @Override
    public void setIdTracking(int idTracking) {
        super.setIdTracking(idTracking); //porque me lo cambio a mi mismo tambien
        for (int i = 0; i < envios.size(); i++) {
            envios.get(i).setIdTracking(idTracking);
        }
    }

    @Override
    public String getDestinatario() {
        return this.envios.get(0).getDestinatario();
    }

    @Override
    public String getDireccionDestino() {
        return this.envios.get(0).getDireccionDestino();
    }

    @Override
    public String toString() {
        return "Combo{" + super.toString() +
                "envios=" + envios +
                ", criterio=" + criterio +
                ", Destinatario=" + getDestinatario() +
                '}';
    }

    @Override
    public Envio copiaRestringida(Criterio c) {
        Combo aux = new Combo(this.getIdTracking(),this.ciudad, this.criterio);
        for (int i = 0; i < envios.size(); i++) {
            if (envios.get(i).copiaRestringida(c) != null){
                aux.agregarEnvio(envios.get(i).copiaRestringida(c));
            }
        }
        if (aux.getPeso()==0){
            return null;
        }
        return aux;
    }

}
