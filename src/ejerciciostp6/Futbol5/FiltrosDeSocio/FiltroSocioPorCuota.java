package ejerciciostp6.Futbol5.FiltrosDeSocio;

import ejerciciostp6.Futbol5.ClasesPrincipales.Socio;

public class FiltroSocioPorCuota implements FiltroSocio {
    @Override
    public boolean cumple(Socio s1) {
        return s1.isUltimacuotaPaga();
    }
}
