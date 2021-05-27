package PracticaDeParciales.Recuperatorio2020.ClasePrincipales;

import PracticaDeParciales.Recuperatorio2020.Filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeguroDecremental extends Seguro {
    private LocalDate anioInico;
    private int porcentajeDeMonto;

    public SeguroDecremental(int numeroPoliza, String descripcion, float montoAsegurado, int dniDuenio, LocalDate anioInico, int porcentajeDeMonto) {
        super(numeroPoliza, descripcion, montoAsegurado, dniDuenio);
        this.anioInico = anioInico;
        this.porcentajeDeMonto = porcentajeDeMonto;
    }

    public LocalDate getAnioInico() {
        return anioInico;
    }

    public void setAnioInico(LocalDate anioInico) {
        this.anioInico = anioInico;
    }

    public int getPorcentajeDeMonto() {
        return porcentajeDeMonto;
    }

    @Override
    public float getMontoAsegurado() {
        LocalDate fechaActual= LocalDate.now();
        float aux= fechaActual.getYear()-this.anioInico.getYear();
        return (this.montoAsegurado/aux);
    }

    @Override
    public int getNumeroPoliza() {
        return this.numeroPoliza;
    }

    @Override
    public float getCostoPoliza() {
        return (this.getMontoAsegurado()* this.getPorcentajeDeMonto())/ 100;
    }

    @Override
    public List<Seguro> buscar(Filtro filtro) {
        List<Seguro> resultado= new ArrayList<Seguro>();
        if(filtro.cumple(this))
            resultado.add(this);
        return resultado;
    }
}
