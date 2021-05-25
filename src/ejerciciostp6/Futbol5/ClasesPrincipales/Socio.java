package ejerciciostp6.Futbol5.ClasesPrincipales;

import java.util.ArrayList;
import java.util.List;
import ejerciciostp6.Futbol5.FiltrosDeSocio.FiltroSocio;
public class Socio {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean ultimacuotaPaga;
    private List<Cancha> alquileres;

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isUltimacuotaPaga() {
        return ultimacuotaPaga;
    }

    public void setUltimacuotaPaga(boolean ultimacuotaPaga) {
        this.ultimacuotaPaga = ultimacuotaPaga;
    }

    public Socio(String nombre, String apellido, int edad, boolean ultimacuotaPaga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ultimacuotaPaga = ultimacuotaPaga;
        this.alquileres= new ArrayList<Cancha>();
    }
    public void agregarAlquiler(Cancha c)
    {
        alquileres.add(c);
    }
    public boolean equals (Object o1)
    {
        try {
            Socio s= (Socio) o1;
            return nombre.equals(s.getNombre()) &&  apellido.equals(s.getApellido()) && edad== s.getEdad();
        }
        catch (Exception e){
            return false;}
    }
    public List<Socio> cumple(FiltroSocio f)
    {
        List<Socio> resultado= new ArrayList<Socio>();
        if(f.cumple(this))
            resultado.add(this);
        return resultado;
    }
    public List<Cancha> getAlquileres()
    {
        List<Cancha> resultado= new ArrayList<Cancha>();
        resultado.addAll(this.alquileres);
        return resultado;
    }
    public int cantidadAlquilada(Cancha cancha)
    {
        int contador= 0;
        for (int i=0; i<alquileres.size();i++)
        {
            if(alquileres.get(i).getIdCancha()==cancha.getIdCancha())
                contador++;
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", ultimacuotaPaga=" + ultimacuotaPaga +
                ", alquileres=" + alquileres +
                '}';
    }
}
