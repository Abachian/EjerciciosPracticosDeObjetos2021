package PracticaDeParciales.Recuperatorio2020.ClasePrincipales;

import PracticaDeParciales.Recuperatorio2020.Filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class SeguroAutomotorVida extends Seguro{
    private int porcentajeDeMonto;
    private float valorFijoPoliza;

    public SeguroAutomotorVida(int numeroPoliza, String descripcion, float montoAsegurado, int dniDuenio, int porcentajeDeMonto, float valorFijoPoliza) {
        super(numeroPoliza, descripcion, montoAsegurado, dniDuenio);
        this.porcentajeDeMonto = porcentajeDeMonto;
        this.valorFijoPoliza = valorFijoPoliza;
    }

    public int getPorcentajeDeMonto() {
        return porcentajeDeMonto;
    }

    public float getValorFijoPoliza() {
        return valorFijoPoliza;
    }

    @Override
    public int getNumeroPoliza() {
        return this.numeroPoliza;
    }

    @Override
    public float getMontoAsegurado() {
        return this.montoAsegurado;
    }

    @Override
    public float getCostoPoliza() {
        return (this.getValorFijoPoliza()+ (this.getMontoAsegurado()*this.getPorcentajeDeMonto())/100);
    }

    @Override
    public List<Seguro> buscar(Filtro filtro) {
        List<Seguro> resultado= new ArrayList<Seguro>();
        if(filtro.cumple(this))
            resultado.add(this);
        return resultado;
    }

    @Override
    public String toString() {
        return "SeguroAutomotorVida{" + super.toString() +
                "porcentajeDeMonto=" + porcentajeDeMonto +
                ", valorFijoPoliza=" + valorFijoPoliza +
                '}';
    }
}
