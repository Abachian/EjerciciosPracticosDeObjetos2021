package PracticaDeParciales.Parcial2019.Condiciones;

import PracticaDeParciales.Parcial2019.ClasesPrincipales.Envio;

public class MismoRemitente implements Criterio {
    private String remitente;
    @Override
    public boolean cumple(Envio e) {
        return e.getRemitente().equals(remitente);
    }
}
