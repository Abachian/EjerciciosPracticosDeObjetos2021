package PracticaDeParciales.Condiciones;

import PracticaDeParciales.ClasesPrincipales.Envio;

public class MismoRemitente implements Criterio {
    private String remitente;
    @Override
    public boolean cumple(Envio e) {
        return e.getRemitente().equals(remitente);
    }
}
