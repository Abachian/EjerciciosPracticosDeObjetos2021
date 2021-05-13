package ejerciciostp4.FabricaDeMuebles;

import java.util.Date;

public class PedidoDeMueble {
    private String mueble;
    private double costoEstimado;
    private String material;
    private Date fechaDePedido;
    private Date fechaMaximaEntrega;
    private String lugarDeEntrega;

    public String getMueble() {
        return mueble;
    }

    public void setMueble(String mueble) {
        this.mueble = mueble;
    }

    public double getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(double costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Date getFechaDePedido() {
        return fechaDePedido;
    }

    public void setFechaDePedido(Date fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    public Date getFechaMaximaEntrega() {
        return fechaMaximaEntrega;
    }

    public void setFechaMaximaEntrega(Date fechaMaximaEntrega) {
        this.fechaMaximaEntrega = fechaMaximaEntrega;
    }

    public String getLugarDeEntrega() {
        return lugarDeEntrega;
    }

    public void setLugarDeEntrega(String lugarDeEntrega) {
        this.lugarDeEntrega = lugarDeEntrega;
    }
    public PedidoDeMueble(String mueble, double costoEstimado, String material, Date fechaDePedido,
                          Date fechaMaximaEntrega, String lugarDeEntrega)
    {
        this.mueble=mueble;
        this.costoEstimado=costoEstimado;
        this.material=material;
        this.fechaDePedido=fechaDePedido;
        this.fechaMaximaEntrega=fechaMaximaEntrega;
        this.lugarDeEntrega=lugarDeEntrega;
    }

}

