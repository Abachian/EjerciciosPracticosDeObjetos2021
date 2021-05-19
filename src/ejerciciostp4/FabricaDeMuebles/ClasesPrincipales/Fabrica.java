package ejerciciostp4.FabricaDeMuebles.ClasesPrincipales;

import ejerciciostp4.FabricaDeMuebles.Comparadores.ComparadorMueble;
import ejerciciostp4.FabricaDeMuebles.Condiciones.Criterio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fabrica {
    private String nombreFabrica;
    private List<PedidoDeMueble> pedidosAEspera;
    private List<PedidoDeMueble> pedidosARealizar;
    private List<PoliticaAceptacion> politcasDeAceptacion;
    private List<Fabrica> fabricasAsociadas;
    private List<ComparadorMueble> criterioDePrioridad;

    public String getNombreFabrica() {
        return nombreFabrica;
    }

    public void setNombreFabrica(String nombreFabrica) {
        this.nombreFabrica = nombreFabrica;
    }
    public Fabrica (String nombreFabrica)
    {
        this.nombreFabrica=nombreFabrica;
        this.pedidosAEspera= new ArrayList<PedidoDeMueble>();
        this.politcasDeAceptacion= new ArrayList<PoliticaAceptacion>();
        this.fabricasAsociadas= new ArrayList<Fabrica>();
    }
    public void addPedidoAEspera(PedidoDeMueble p)
    {
        if(!pedidosAEspera.contains(p))
            pedidosAEspera.add(p);
    }
    public List<PedidoDeMueble>PedidosOrdenados(Criterio c, ComparadorMueble m)
    {
        List<PedidoDeMueble> resultado= new ArrayList<PedidoDeMueble>();
        for (int i=0; i<=pedidosARealizar.size();i++){
            PedidoDeMueble muebleActual= pedidosAEspera.get(i);
            resultado.addAll(muebleActual.cumple(c));
        }
        Collections.sort(resultado,m);
        return resultado;
    }

}
