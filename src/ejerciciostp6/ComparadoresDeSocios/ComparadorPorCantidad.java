package ejerciciostp6.ComparadoresDeSocios;

import ejerciciostp6.ClasesPrincipales.Cancha;
import ejerciciostp6.ClasesPrincipales.Socio;

public class ComparadorPorCantidad extends ComparadorSocio{
    Cancha canchaAContar;
    @Override
    public int compararSocios(Socio s1, Socio s2) {
        return s1.cantidadAlquilada(canchaAContar)- s2.cantidadAlquilada(canchaAContar);
    }
}
