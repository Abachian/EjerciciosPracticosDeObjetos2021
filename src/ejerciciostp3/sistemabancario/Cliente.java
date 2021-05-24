package ejerciciostp3.sistemabancario;

import ejerciciostp3.sistemabancario.CajaAhorro;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idcliente;
    private String nombre;
    private String apellido;
    private int dni;
    private int contrasenia;
    private List<CajaAhorro> cuentas = new ArrayList<>();

    public List<CajaAhorro> getCuentas() {
        return cuentas;
    }

    public  void setCuentas(List<CajaAhorro> cuentas) {
        this.cuentas=cuentas;
    }
    public double getSaldo(int numerocuenta)
    {
        for (int i=0; i<cuentas.size(); i++){
            if (numerocuenta== i)
                return cuentas.get(i).getSaldo();

        }
        return -1;
    }
    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Cliente(String nombre, String apellido, int dni, int contrasenia, int idcliente) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.contrasenia = contrasenia;
        this.idcliente = idcliente;
    }

    public void darAltaCuenta(CajaAhorro caja) {
        cuentas.add(caja);
    }

    public void darBajaCuenta(CajaAhorro caja) {
        if (cuentas.contains(caja))
            cuentas.remove(caja);
        else
            System.out.println("no tiene esa caja");
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuentas=" + cuentas +
                '}';

    }
}