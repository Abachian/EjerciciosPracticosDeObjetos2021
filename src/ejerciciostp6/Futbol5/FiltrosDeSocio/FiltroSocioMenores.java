package ejerciciostp6.Futbol5.FiltrosDeSocio;

import ejerciciostp6.Futbol5.ClasesPrincipales.Socio;

public class FiltroSocioMenores implements FiltroSocio {
    @Override
    public boolean cumple(Socio s1) {
        return s1.getEdad()<18;
    }
}
