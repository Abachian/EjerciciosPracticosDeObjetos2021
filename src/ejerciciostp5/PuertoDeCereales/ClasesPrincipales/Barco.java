package ejerciciostp5.PuertoDeCereales.ClasesPrincipales;

public class Barco extends Transporte {

    public Barco(int capacidad, String nombreBarco) {
       super(capacidad, nombreBarco);
    }

    @Override
    public String toString() {
        return "Barco{" +
                "capacidad=" + this.getCapacidad() +
                ", nombreBarco='" + this.getNombre()+ '\'' +
                '}';
    }
}
