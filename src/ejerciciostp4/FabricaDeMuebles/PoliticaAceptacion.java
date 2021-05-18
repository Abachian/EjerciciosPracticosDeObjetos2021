package ejerciciostp4.FabricaDeMuebles;

import java.util.Date;

public class PoliticaAceptacion {
    private int numeroPolitica;
    private PedidoDeMueble pedidoAceptado;
    public PoliticaAceptacion(int numeroPolitica, int costoEstimado, String material, long fechaDePedido,
                              long fechaMaximaEntrega, String lugarDeEntrega)
    {
        this.numeroPolitica=numeroPolitica;
        this.pedidoAceptado.setCostoEstimado(costoEstimado);
        this.pedidoAceptado.setFechaDePedido(fechaDePedido);
        this.pedidoAceptado.setFechaMaximaEntrega(fechaMaximaEntrega);
        this.pedidoAceptado.setLugarDeEntrega(lugarDeEntrega);
        this.pedidoAceptado.setMaterial(material);
    }
    public boolean aceptado(PedidoDeMueble p)
    {
        if ((this.pedidoAceptado.getMueble()==null) || (p.getMueble().equals(this.pedidoAceptado.getMueble())))
            if ((this.pedidoAceptado.getMaterial()==null) || (p.getMaterial().equals(this.pedidoAceptado.getMaterial())))
                if((this.pedidoAceptado.getLugarDeEntrega()==null) || (p.getLugarDeEntrega().equals(this.pedidoAceptado.getLugarDeEntrega())))
                    if((this.pedidoAceptado.getFechaMaximaEntrega()==-1) || (p.getFechaMaximaEntrega().equals(this.pedidoAceptado.getFechaMaximaEntrega())))
    }
}
