package ejerciciostp4.CongresoCiencias;

import java.util.ArrayList;
import java.util.List;

public class Elemento {
    private List<String> temas;
    public Elemento()
    {
        this.temas= new ArrayList<String>();
    }
    public void addTema(String tema)
    {
        if(!(this.temas.contains(tema)))
            this.temas.add(tema);
    }
    public List<String> getTemas()
    {
        List<String> resultado=new ArrayList<String>();
        for (int i=0; i<this.temas.size();i++)
            resultado.add(this.temas.get(i));
        return resultado;
    }
    public boolean sabeTema(String tema)
    {
        return this.temas.contains(tema);
    }
}
