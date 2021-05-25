package PracticaDeParciales.Condiciones;

import PracticaDeParciales.ClasesPrincipales.Envio;

public class ComboPostal implements Criterio{
    private String ciudad;

    public ComboPostal(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public boolean cumple(Envio e) {
        if(e.getCiudad().equals(ciudad))
            return true;
        return false;
    }
}
