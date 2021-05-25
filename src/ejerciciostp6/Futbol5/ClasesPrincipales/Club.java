package ejerciciostp6.Futbol5.ClasesPrincipales;

import ejerciciostp6.Futbol5.ComparadoresDeSocios.ComparadorSocio;
import ejerciciostp6.Futbol5.FiltrosDeSocio.FiltroSocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Club  {
    private String nombreClub;
    private List<Socio> socios;
    private List<Cancha> canchas;

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public Club(String nombreClub) {
        this.nombreClub = nombreClub;
        this.canchas= new ArrayList<Cancha>();
        this.socios= new ArrayList<Socio>();
    }
    public void agregarSocio(Socio s)
    {
        if(!socios.contains(s))
            socios.add(s);
    }
    public void agregarCancha(Cancha c)
    {
        if(!canchas.contains(c))
            canchas.add(c);
    }
    public List<Socio>getSocios(ComparadorSocio c, FiltroSocio f)
    {
        List<Socio> resultado= new ArrayList<Socio>();
        for(int i=0; i<socios.size(); i++)
            resultado.addAll(socios.get(i).cumple(f));
        Collections.sort(resultado,c);
        return resultado;
    }


    @Override
    public String toString() {
        return "Club{" +
                "nombreClub='" + nombreClub + '\'' +
                ", socios=" + socios +
                ", canchas=" + canchas +
                '}';
    }
}
