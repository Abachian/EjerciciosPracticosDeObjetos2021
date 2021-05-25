package ejerciciostp6.FiltrosDeSocio;

import ejerciciostp6.ClasesPrincipales.Socio;

public class FiltroSocioAnd implements FiltroSocio {
    private FiltroSocio c1;
    private FiltroSocio c2;

    @Override
    public boolean cumple(Socio s1) {
        return (c1.cumple(s1)&& c2.cumple(s1));
    }
}
