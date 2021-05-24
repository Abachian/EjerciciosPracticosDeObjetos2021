package ejerciciostp7.Condiciones;

import ejerciciostp7.Clases.Droga;
import ejerciciostp7.Clases.Elemento;
import ejerciciostp7.Clases.Medicamento;

public class CondicionPorcentaje implements Condicion{
    private float porcentajePedido;
    private Droga drogaBuscada;

    public CondicionPorcentaje(float porcentajePedido, Droga drogaBuscada) {
        this.porcentajePedido = porcentajePedido;
        this.drogaBuscada = drogaBuscada;
    }

    @Override
    public boolean cumple(Elemento e) {
        return (((Medicamento)e).getPorcentaje(this.drogaBuscada.getNombre())<this.porcentajePedido);

    }
}
