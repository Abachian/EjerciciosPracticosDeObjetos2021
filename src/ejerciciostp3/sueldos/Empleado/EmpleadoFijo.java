package ejerciciostp3.sueldos.Empleado;

public class EmpleadoFijo {
    String nombre;
    String apellido;
    double sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldobase) {
        this.sueldo = sueldobase;
    }


    public EmpleadoFijo(String nombre, String apellido, double sueldobase)
    {
        this.apellido=apellido;
        this.nombre=nombre;
        this.sueldo=sueldobase;

    }
    public String toString(){
        return "nombre: "+ this.nombre + "," + " apellido: " + this.apellido + "," + " sueldo base: " + this.sueldo;
    }
}
