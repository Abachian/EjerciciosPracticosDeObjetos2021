package ejerciciostp6.FiltrosDeSocio;

import ejerciciostp6.ClasesPrincipales.Socio;

public class FiltroSocioMenores implements FlitroSocio {
    @Override
    public boolean cumple(Socio s1) {
        return s1.getEdad()<18;
    }
}
