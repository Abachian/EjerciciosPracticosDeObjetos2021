package ejerciciostp3.sistemabancario;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Banco {
    private String nombre;
    private List<Cliente> clientes= new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Banco(String nombre)
    {
        this.nombre= nombre;
    }
    public void agregarCliente(Cliente nuevo)
    {
        if (!clientes.contains(nuevo))
            clientes.add(nuevo);
        else
            System.out.println("Cliente ya registrado");
    }
    public void listarSaldo(int idCliente, int numerocaja) {
        for (int i = 0; i < clientes.size(); i++)
            if (clientes.get(i).getIdcliente() == idCliente) {
                System.out.println(clientes.get(i).getSaldo(numerocaja));
            }
    }
    public void EliminarCliente(Cliente aBorrar) {
       if (clientes.contains(aBorrar))
           clientes.remove(aBorrar);
       else
           System.out.println("El cliente no existe en la base de datos");

    }
}
