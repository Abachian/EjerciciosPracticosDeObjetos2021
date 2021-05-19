package ejerciciostp4.FabricaDeMuebles.ClasesPrincipales;

public class PoliticaAceptacion {
    private int numeroPolitica;
    private PedidoDeMueble pedidoAceptado;
    public PoliticaAceptacion(int numeroPolitica, int costoEstimado, String material, int fechaDePedido,
                              int fechaMaximaEntrega, String lugarDeEntrega)
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
                    if((this.pedidoAceptado.getFechaMaximaEntrega()==-1) || (p.getFechaMaximaEntrega()==this.pedidoAceptado.getFechaMaximaEntrega()))
                       if((this.pedidoAceptado.getFechaDePedido()==-1) || (p.getFechaDePedido()==this.pedidoAceptado.getFechaDePedido()))
                                return true;
        return false;
    }
}
