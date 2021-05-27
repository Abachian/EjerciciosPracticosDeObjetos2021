package PracticaDeParciales.Prefinal2020.ClasePrincipales;

import PracticaDeParciales.Prefinal2020.Filtros.Filtro;
import PracticaDeParciales.Prefinal2020.Filtros.FiltroDescripcionExacta;
import PracticaDeParciales.Prefinal2020.Filtros.FiltroPorPalabra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aseguradora {
    private String nombre;
    private List<Seguro> seguros;

    public Aseguradora(String nombre) {
        this.nombre = nombre;
        this.seguros= new ArrayList<Seguro>();
    }
    public void agregarSeguro(Seguro s)
    {
        if(!seguros.contains(s))
            seguros.add(s);
    }
    public List<Seguro> listarSeguros(Filtro f)
    {
        List<Seguro> resultado= new ArrayList<Seguro>();
        for (int i=0;i<this.seguros.size();i++){
            Seguro seguroActual= seguros.get(i);
            resultado.addAll(seguroActual.buscar(f));
        }
        return resultado;
    }

    public static void main(String[] args) {
        Aseguradora A= new Aseguradora("LaSegunda");
        LocalDate f1= LocalDate.of(1998,2,25);
        SeguroAutomotorVida sa1= new SeguroAutomotorVida(414,"Toyotal", 15000, 4, 25, 300);
        SeguroDecremental s1d= new SeguroDecremental(412, "Toyota", 800, 3,f1,30);
        SeguroIntegrador si= new SeguroIntegrador(41438762);
        si.agregarSeguro(sa1);
        si.agregarSeguro(s1d);
        A.agregarSeguro(si);
        FiltroDescripcionExacta filtro= new FiltroDescripcionExacta("Toyota");
        System.out.println(A.listarSeguros(filtro));
    }
}
