package PracticaDeParciales.Prefinal2020.ClasePrincipales;

import PracticaDeParciales.Prefinal2020.Filtros.Filtro;

import java.util.List;

public abstract class Seguro {
    protected int numeroPoliza;
    private String descripcion;
    protected float montoAsegurado;
    private int dniDuenio;


    public Seguro(int numeroPoliza, String descripcion, float montoAsegurado, int dniDuenio) {
        this.numeroPoliza = numeroPoliza;
        this.descripcion = descripcion;
        this.montoAsegurado = montoAsegurado;
        this.dniDuenio = dniDuenio;
    }

    public Seguro(int dniDuenio) {
        this.dniDuenio = dniDuenio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDniDuenio() {
        return dniDuenio;
    }

    public void setDniDuenio(int dniDuenio) {
        this.dniDuenio = dniDuenio;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }
    public abstract float getCostoPoliza();
    public abstract int getNumeroPoliza();
    public abstract float getMontoAsegurado();
    public abstract List<Seguro> buscar(Filtro filtro);
    @Override
    public boolean equals(Object obj) {
        try{
            Seguro s= (Seguro) obj;
            return (this.numeroPoliza==s.getNumeroPoliza()) && (this.dniDuenio==s.getDniDuenio());
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Seguro{" +
                "numeroPoliza=" + numeroPoliza +
                ", descripcion='" + descripcion + '\'' +
                ", montoAsegurado=" + montoAsegurado +
                ", dniDuenio=" + dniDuenio +
                '}';
    }
}
