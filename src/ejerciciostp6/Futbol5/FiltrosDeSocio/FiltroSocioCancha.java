package ejerciciostp6.Futbol5.FiltrosDeSocio;

import ejerciciostp6.Futbol5.ClasesPrincipales.Cancha;
import ejerciciostp6.Futbol5.ClasesPrincipales.Socio;

public class FiltroSocioCancha implements FiltroSocio {
    Cancha canchaBuscada;

    public FiltroSocioCancha(Cancha canchaBuscada) {
        this.canchaBuscada = canchaBuscada;
    }

    @Override
    public boolean cumple(Socio s1) {
        if(s1.getAlquileres().contains(canchaBuscada))
            return true;
        return false;
    }
}
