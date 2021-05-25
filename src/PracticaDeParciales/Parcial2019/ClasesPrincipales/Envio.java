package PracticaDeParciales.Parcial2019.ClasesPrincipales;

import PracticaDeParciales.Parcial2019.Condiciones.Criterio;

import java.util.List;

public abstract class Envio {
    protected int idTracking;
    protected String ciudad;

    public int getIdTracking() {
        return idTracking;
    }
    public void setIdTracking(int idTracking)
    {
        this.idTracking=idTracking;
    };

    public String getCiudad() {
        return ciudad;
    }

    public Envio(int idTracking, String ciudad) {
        this.idTracking = idTracking;
        this.ciudad = ciudad;
    }
    public abstract String getRemitente();
    public abstract String getDestinatario();
    public abstract String getDireccionDestino();
    public abstract double getPeso();
    public abstract List<Envio> cumple(Criterio c);
    public abstract Envio copiaRestringida(Criterio c);
    @Override
    public String toString() {
        return "Envio{" +
                "idTracking=" + idTracking +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
