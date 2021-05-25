package ejerciciostp6.Futbol5.ClasesPrincipales;

import java.time.LocalDate;

public class Cancha {
    private LocalDate fechaDeAlquiler;
    private int idCancha;
    private double valorAlquiler;

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public int getIdCancha() {
        return idCancha;
    }

    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public double getValorAlquiler() {
        return valorAlquiler;
    }

    public void setValorAlquiler(double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public Cancha(LocalDate fechaDeAlquiler, int idCancha, double valorAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.idCancha = idCancha;
        this.valorAlquiler = valorAlquiler;
    }

    @Override
    public String toString() {
        return "Canchas{" +
                "fechaDeAlquiler=" + fechaDeAlquiler +
                ", idCancha=" + idCancha +
                ", valorAlquiler=" + valorAlquiler +
                '}';
    }
}
