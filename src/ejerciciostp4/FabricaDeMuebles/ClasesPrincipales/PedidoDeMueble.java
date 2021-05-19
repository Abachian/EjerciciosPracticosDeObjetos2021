package ejerciciostp4.FabricaDeMuebles.ClasesPrincipales;

import ejerciciostp4.FabricaDeMuebles.Condiciones.Criterio;

import java.util.ArrayList;
import java.util.List;

public class PedidoDeMueble{
    private String mueble;
    private int costoEstimado;
    private String material;
    private int fechaDePedido;
    private int fechaMaximaEntrega;
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

    public int getFechaDePedido() {
        return fechaDePedido;
    }

    public void setFechaDePedido(int fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    public int getFechaMaximaEntrega() {
        return fechaMaximaEntrega;
    }

    public void setFechaMaximaEntrega(int fechaMaximaEntrega) {
        this.fechaMaximaEntrega = fechaMaximaEntrega;
    }

    public String getLugarDeEntrega() {
        return lugarDeEntrega;
    }

    public void setLugarDeEntrega(String lugarDeEntrega) {
        this.lugarDeEntrega = lugarDeEntrega;
    }
    public PedidoDeMueble(String mueble, int costoEstimado, String material, int fechaDePedido,
                          int fechaMaximaEntrega, String lugarDeEntrega)
    {
        this.mueble=mueble;
        this.costoEstimado=costoEstimado;
        this.material=material;
        this.fechaDePedido=fechaDePedido;
        this.fechaMaximaEntrega=fechaMaximaEntrega;
        this.lugarDeEntrega=lugarDeEntrega;
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

