package ejerciciostp6.FiltrosDeSocio;

import ejerciciostp6.ClasesPrincipales.Cancha;
import ejerciciostp6.ClasesPrincipales.Socio;

import java.util.List;

public class FiltroSocioCancha implements FlitroSocio {
    Cancha canchaBuscada;
    @Override
    public boolean cumple(Socio s1) {
        if(s1.getAlquileres().contains(canchaBuscada))
            return true;
        return false;
    }
}
