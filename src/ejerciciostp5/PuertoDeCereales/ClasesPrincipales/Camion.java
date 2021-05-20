package ejerciciostp5.PuertoDeCereales.ClasesPrincipales;

import java.util.Date;

public class Camion extends Transporte {
    private Date fechaDeCarga;
    public Date getFechaDeCarga() {
        return fechaDeCarga;
    }
    public void setFechaDeCarga(Date fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }

    public Camion(int capacidad, String nombreCamion, Date fechaDeCarga) {
        super(capacidad,nombreCamion);
        this.fechaDeCarga = fechaDeCarga;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "capacidad=" + this.getCapacidad() +
                ", nombreCamion=" + this.getNombre() +
                ", fechaDeCarga=" + fechaDeCarga +
                '}';
    }
}
