package series;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private String nombre;
    private List<Episodio> Episodios;
    private int cantepisodios;

    public int getCantepisodios() {
        return cantepisodios;
    }

    public void setCantepisodios(int cantepisodios) {
        this.cantepisodios = cantepisodios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Episodio> getEpisodios() {
        return Episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        Episodios = episodios;
    }

    public Temporada(String titulo) {
        this.nombre = titulo;
        Episodios = null;
        this.cantepisodios = 0;
    }

    public void agregarEpisodio(Episodio episodio) {
        Episodios.add(episodio);
        setCantepisodios(getCantepisodios() + 1);
    }

    public double calificacionprom() {
        double promedio = 0;
        for (Episodio ep : Episodios) {
            promedio += ep.getCalificacion();
        }
        return promedio;
    }
    public boolean vistaCompleta()
    {
        for (Episodio ep : Episodios){
            if(ep.isFlag()==false)
                return false;
        }
        return true;
    }
    public int cantVistos()
    {
        int cant=0;
        for (Episodio ep : Episodios)
        {
            if(ep.isFlag()==true){
                cant++;
            }
        }
        return cant;
    }

}
