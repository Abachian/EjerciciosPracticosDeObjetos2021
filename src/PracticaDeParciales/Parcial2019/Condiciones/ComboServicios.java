package PracticaDeParciales.Parcial2019.Condiciones;

import PracticaDeParciales.Parcial2019.ClasesPrincipales.Envio;
import PracticaDeParciales.Parcial2019.ClasesPrincipales.Paquete;

public class ComboServicios implements Criterio{
    private int pesoMaximo;
    @Override
    public boolean cumple(Envio e) {
       return ((Paquete)e).getPeso()< pesoMaximo;
    }
}
