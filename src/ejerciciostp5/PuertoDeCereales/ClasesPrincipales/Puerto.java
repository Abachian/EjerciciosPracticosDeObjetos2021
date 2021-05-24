package ejerciciostp5.PuertoDeCereales.ClasesPrincipales;

import com.sun.corba.se.impl.ior.ObjectAdapterIdArray;
import ejerciciostp4.FabricaDeMuebles.ClasesPrincipales.PedidoDeMueble;
import ejerciciostp4.FabricaDeMuebles.Comparadores.ComparadorMueble;
import ejerciciostp4.FabricaDeMuebles.Condiciones.Criterio;
import ejerciciostp5.PuertoDeCereales.Ordenadores.OrdenadorBarco;
import ejerciciostp5.PuertoDeCereales.Ordenadores.OrdenadorCamion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Puerto {
    private List<Barco> barcos;
    private List<Camion> camiones;
    private String nombrePuerto;
    private OrdenadorBarco ordB;
    private OrdenadorCamion ordC;

    public OrdenadorCamion getOrdC() {
        return ordC;
    }

    public OrdenadorBarco getOrdB() {
        return ordB;
    }

    public void setOrdB(OrdenadorBarco ordB) {
        this.ordB = ordB;
    }

    public void setOrdC(OrdenadorCamion ordC) {
        this.ordC = ordC;
    }

    public String getNombrePuerto() {
        return nombrePuerto;
    }

    public void setNombrePuerto(String nombrePuerto) {
        this.nombrePuerto = nombrePuerto;
    }

    public Puerto(String nombrePuerto) {
        this.barcos = new ArrayList<Barco>();
        this.camiones = new ArrayList<Camion>();
        this.nombrePuerto = nombrePuerto;
    }
    public void addBarcos(Barco b)
    {
        if(!(this.barcos.contains(b)))
            barcos.add(b);
    }
    public void addCamion(Camion c)
    {
        if(!(this.camiones.contains(c)))
            camiones.add(c);
    }
    public List<Camion>ListadoCamiones()
    {
        List<Camion> resultado= new ArrayList<Camion>();
        for (int i=0; i<camiones.size();i++){
            resultado.add(camiones.get(i));
        }
        Collections.sort(resultado,this.getOrdC());
        return resultado;
    }
    public List<Barco>ListadoBarco()
    {
        List<Barco> resultado= new ArrayList<Barco>();
        for (int i=0; i<barcos.size();i++){
            resultado.add(barcos.get(i));
        }
        Collections.sort(resultado,this.getOrdB());
        return resultado;
    }
    public void imprimirC(List<Camion> cs) {
        for (int i = 0; i < cs.size(); i++) {
           cs.get(i).toString();
        }
    }  public void imprimirB(List<Barco> cs) {
        for (int i = 0; i < cs.size(); i++) {
           cs.get(i).toString();
        }
    }
    @Override
    public String toString() {
        return "Puerto{" +
                "barcos=" + barcos +
                ", camiones=" + camiones +
                ", nombrePuerto='" + nombrePuerto + '\'' +
                ", ordB=" + ordB +
                ", ordC=" + ordC +
                '}';
    }

}
