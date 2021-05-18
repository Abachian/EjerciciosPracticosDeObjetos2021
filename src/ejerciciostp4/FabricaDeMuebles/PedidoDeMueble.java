package ejerciciostp4.FabricaDeMuebles;

import ejerciciostp4.FabricaDeMuebles.Condiciones.Criterio;

import java.util.ArrayList;
import java.util.List;

public class PedidoDeMueble implements Criterio {
    private String mueble;
    private int costoEstimado;
    private String material;
    private long fechaDePedido;
    private long fechaMaximaEntrega;
    private String lugarDeEntrega;

    public String getMueble() {
        return mueble;
    }

    public void setMueble(String mueble) {
        this.mueble = mueble;
    }

    public int getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(int costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public long getFechaDePedido() {
        return fechaDePedido;
    }

    public void setFechaDePedido(long fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    public long getFechaMaximaEntrega() {
        return fechaMaximaEntrega;
    }

    public void setFechaMaximaEntrega(long fechaMaximaEntrega) {
        this.fechaMaximaEntrega = fechaMaximaEntrega;
    }

    public String getLugarDeEntrega() {
        return lugarDeEntrega;
    }

    public void setLugarDeEntrega(String lugarDeEntrega) {
        this.lugarDeEntrega = lugarDeEntrega;
    }
    public PedidoDeMueble(String mueble, int costoEstimado, String material, long fechaDePedido,
                          long fechaMaximaEntrega, String lugarDeEntrega)
    {
        this.mueble=mueble;
        this.costoEstimado=costoEstimado;
        this.material=material;
        this.fechaDePedido=fechaDePedido;
        this.fechaMaximaEntrega=fechaMaximaEntrega;
        this.lugarDeEntrega=lugarDeEntrega;
    }
    public boolean equals(Object o1)
    {
        try {
            PedidoDeMueble p= (PedidoDeMueble) o1;
            return (this.mueble.equals(p.getMueble()) && (this.lugarDeEntrega.equals(p.getLugarDeEntrega()))
        } catch (Exception e) {
            return false;
        }
    }
    public List<PedidoDeMueble> cumple(Criterio c)
    {
        List<PedidoDeMueble> resultado= new ArrayList<PedidoDeMueble>();
        if(c.cumple(this))
        {
            resultado.add(this);
        }
        return null;
    }
}

