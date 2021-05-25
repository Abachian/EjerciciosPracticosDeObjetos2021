package PracticaDeParciales.Condiciones;

import PracticaDeParciales.ClasesPrincipales.Envio;
import PracticaDeParciales.ClasesPrincipales.Paquete;

public class ComboServicios implements Criterio{
    private int pesoMaximo;
    @Override
    public boolean cumple(Envio e) {
       return ((Paquete)e).getPeso()< pesoMaximo;
    }
}
