package ejerciciostp3.sueldos.Empleado;

public class EmpleadoHorasExtra extends EmpleadoFijo {
    private int horasExtras;
    private double extraPorHora;

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getExtraPorHora() {
        return extraPorHora;
    }

    public void setExtraPorHora(double extraPorHora) {
        this.extraPorHora = extraPorHora;
    }

    public EmpleadoHorasExtra(String nombre, String apellido, double sueldo) {
        super(nombre, apellido, sueldo);
    }
    public EmpleadoHorasExtra(String nombre, String apellido, double sueldo, int horasExtras, double extraPorHora) {
        super(nombre, apellido, sueldo);
        this.horasExtras= horasExtras;
        this.extraPorHora= extraPorHora;
    }

    public double getSueldo() {
        return super.getSueldo() + (getExtraPorHora() * getHorasExtras());
    }
}