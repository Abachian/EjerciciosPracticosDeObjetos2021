package ejerciciostp6.ComparadoresDeSocios;

import ejerciciostp6.ClasesPrincipales.Socio;

public class ComparadorSocioPorEdad extends ComparadorSocio{
    @Override
    public int compararSocios(Socio s1, Socio s2) {
        return s1.getEdad()- s2.getEdad();
    }
}
