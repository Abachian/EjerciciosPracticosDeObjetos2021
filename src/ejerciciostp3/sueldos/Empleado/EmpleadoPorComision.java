package ejerciciostp3.sueldos.Empleado;

import java.util.StringJoiner;

public class EmpleadoPorComision extends EmpleadoFijo{
    int cantidadVentas;
    double comisionPorVenta;
    public EmpleadoPorComision (String nombre, String apellido, double sueldo) {
        super(nombre, apellido, sueldo);
    }
    public EmpleadoPorComision (String nombre, String apellido, double sueldo, int cantidadVentas, double comisionPorVenta)
    {
        super(nombre,apellido,sueldo);
        this.cantidadVentas=cantidadVentas;
        this.comisionPorVenta=comisionPorVenta;
    }
    public double getSueldo() {
        return super.getSueldo()+ this.comisionPorVenta* this.cantidadVentas;
    }
}
