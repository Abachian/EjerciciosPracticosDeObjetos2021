package ejerciciostp6.Futbol5.ComparadoresDeSocios;

import ejerciciostp6.Futbol5.ClasesPrincipales.Socio;

public class ComparadorSocioPorApellido extends ComparadorSocio{
    public ComparadorSocioPorApellido (ComparadorSocio siguiente)
    {
        super(siguiente);
    }
    public ComparadorSocioPorApellido() {
        super();
    }

    @Override
    public int compararSocios(Socio s1, Socio s2) {
        int resultado= s1.getApellido().compareTo(s2.getApellido());
        if (resultado==0)
            return s1.getNombre().compareTo(s2.getNombre());
        return resultado;
    }
}
