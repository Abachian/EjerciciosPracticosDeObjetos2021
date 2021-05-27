package PracticaDeParciales.Prefinal2020.Filtros;

import PracticaDeParciales.Prefinal2020.ClasePrincipales.Seguro;

public class FiltroMonto implements Filtro {
    private float montoBuscado;

    public FiltroMonto(float montoBuscado) {
        this.montoBuscado = montoBuscado;
    }

    @Override
    public boolean cumple(Seguro s) {
        return s.getMontoAsegurado()== montoBuscado;
    }
}
