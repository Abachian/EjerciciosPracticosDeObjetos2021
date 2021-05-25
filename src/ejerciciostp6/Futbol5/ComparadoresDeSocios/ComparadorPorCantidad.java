package ejerciciostp6.Futbol5.ComparadoresDeSocios;

import ejerciciostp6.Futbol5.ClasesPrincipales.Cancha;
import ejerciciostp6.Futbol5.ClasesPrincipales.Socio;

public class ComparadorPorCantidad extends ComparadorSocio{
    Cancha canchaAContar;

    public ComparadorPorCantidad(Cancha canchaAContar) {
        this.canchaAContar = canchaAContar;
    }

    @Override
    public int compararSocios(Socio s1, Socio s2) {
        return s1.cantidadAlquilada(canchaAContar)- s2.cantidadAlquilada(canchaAContar);
    }
}
