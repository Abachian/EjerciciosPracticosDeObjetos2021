package ejerciciostp6.FiltrosDeSocio;

import ejerciciostp6.ClasesPrincipales.Socio;

public class FiltroSocioPorCuota implements FlitroSocio{
    @Override
    public boolean cumple(Socio s1) {
        return s1.isUltimacuotaPaga();
    }
}
