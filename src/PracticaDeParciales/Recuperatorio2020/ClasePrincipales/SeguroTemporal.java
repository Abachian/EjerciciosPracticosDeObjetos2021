package PracticaDeParciales.Recuperatorio2020.ClasePrincipales;

import PracticaDeParciales.Recuperatorio2020.Filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeguroTemporal extends Seguro{
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    protected float valorFijoPoliza;

    public SeguroTemporal(int numeroPoliza, String descripcion, float montoAsegurado, int dniDuenio, LocalDate fechaInicio, LocalDate fechaFin, float valorFijoPoliza) {
        super(numeroPoliza, descripcion, montoAsegurado, dniDuenio);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valorFijoPoliza = valorFijoPoliza;
    }

    public float getValorFijoPoliza() {
        return valorFijoPoliza;
    }

    public void setValorFijoPoliza(float valorFijoPoliza) {
        this.valorFijoPoliza = valorFijoPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public boolean vigente()
    {
        LocalDate fechaActual= LocalDate.now();
        if((this.fechaInicio.isBefore(fechaActual)) && (this.fechaFin.isAfter(fechaActual)))
            return true;
        return false;
    }
    @Override
    public int getNumeroPoliza() {
        return this.numeroPoliza;
    }

    @Override
    public float getMontoAsegurado() {
        if (this.vigente())
            return this.montoAsegurado;
        return 0;
    }

    @Override
    public float getCostoPoliza() {

        if (this.vigente())
            return this.getValorFijoPoliza();
        return 0;
    }

    @Override
    public List<Seguro> buscar(Filtro filtro) {
        List<Seguro> resultado= new ArrayList<Seguro>();
        if(filtro.cumple(this))
            if (this.vigente())
                resultado.add(this);
        return resultado;

    }
}
