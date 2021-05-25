package PracticaDeParciales.ClasesPrincipales;

import PracticaDeParciales.Condiciones.ComboPostal;
import PracticaDeParciales.Condiciones.Criterio;

import java.util.ArrayList;
import java.util.List;

public class Compania {
    private List<Envio> enviosCompania;
    private  String nombre;

    public Compania(String nombre) {
        this.nombre = nombre;
        this.enviosCompania= new ArrayList<Envio>();
    }
    public void agregarEnvio(Envio envio)
    {
        enviosCompania.add(envio);
    }

    public static void main(String[] args) {
        Paquete p1= new Paquete(5,3,"Tandil","Octavio", "ElDique",
                "LaTuje", false);
        Paquete p2= new Paquete(1,5,"Tandil","Fede", "LasTunitas",
                "LaTuje", true);
        Paquete p3= new Paquete(4,5,"Tandil","Abachi", "LaTermi",
                "LaTuje", false);
        Criterio cri= new ComboPostal("Tandil");
        Combo c1= new Combo(7,"Tandil",cri);
        Combo c2= new Combo(8,"Tandil",cri);
        c2.agregarEnvio(p3);
        c1.agregarEnvio(p1);
        c1.agregarEnvio(p2);
        c1.agregarEnvio(c2);
        System.out.println(c1.cumple(cri));


    }
}

