package ejerciciostp4.SistemaDeSiembra;

public class Mineral {
    private String nombre;
    private double porcentaje;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public Mineral (String nombre, double porcentaje)
    {
        this.nombre=nombre;
        this.porcentaje= porcentaje;
    }
}
