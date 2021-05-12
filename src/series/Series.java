package series;

import java.util.List;

public class Series {
    private String nombre;
    private List<Temporada> Temporadas;
    private int canttemporadas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Temporada> getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        Temporadas = temporadas;
    }

    public int getCanttemporadas() {
        return canttemporadas;
    }

    public void setCanttemporadas(int canttemporadas) {
        this.canttemporadas = canttemporadas;
    }
    public Series (String nombre)
    {
        this.nombre= nombre;
        this.canttemporadas=0;
        this.Temporadas=null;
    }
    public void agregarTemporada(Temporada temporada)
    {
        Temporadas.add(temporada);
        setCanttemporadas(getCanttemporadas()+1);
    }
    public int episodiosVistos()
    {
        int cantTotal=0;
        for (Temporada temp  : Temporadas){
            cantTotal+= temp.cantVistos();
        }
        return cantTotal;
    }
    public boolean vistaCompleta()
    {
        for (Temporada temp  : Temporadas){
            if(temp.vistaCompleta()==false){
                return false;
            }
        }
        return true;
    }
}

