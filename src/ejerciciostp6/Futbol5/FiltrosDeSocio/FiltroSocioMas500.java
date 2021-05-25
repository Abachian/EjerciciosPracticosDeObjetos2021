package ejerciciostp6.Futbol5.FiltrosDeSocio;

import ejerciciostp6.Futbol5.ClasesPrincipales.Socio;

public class FiltroSocioMas500 implements FiltroSocio {
    @Override
    public boolean cumple(Socio s1) {
        for (int i=0; i<s1.getAlquileres().size();i++){
            if(s1.getAlquileres().get(i).getValorAlquiler()>500)
                return true;
        }
        return false;

    }
}
