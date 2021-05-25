package PracticaDeParciales.Parcial2019.ClasesPrincipales;

import PracticaDeParciales.Parcial2019.Condiciones.Criterio;

import java.util.ArrayList;
import java.util.List;

public class Paquete extends Envio {

    private String direccionRemitente;
    private String direccionDestinatario;
    private boolean retiradoEnSucursal;
    private double peso;
    private String remitente;
    private String destinatario;

    @Override
    public String getRemitente() {
        return remitente;
    }

    @Override
    public String getDestinatario() {
        return destinatario;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    @Override
    public String getDireccionDestino() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }

    public boolean isRetiradoEnSucursal() {
        return retiradoEnSucursal;
    }

    public void setRetiradoEnSucursal(boolean retiradoEnSucursal) {
        this.retiradoEnSucursal = retiradoEnSucursal;
    }

    public Paquete(int idTracking, double peso, String ciudad, String remitente, String direccionRemitente, String direccionDestinatario, boolean retiradoEnSucursal) {
        super(idTracking, ciudad);
        this.direccionRemitente = direccionRemitente;
        this.direccionDestinatario = direccionDestinatario;
        this.retiradoEnSucursal = retiradoEnSucursal;
        this.peso=peso;
        this.remitente=remitente;
    }

    @Override
    public List<Envio> cumple(Criterio c) {
        List<Envio> resultado= new ArrayList<Envio>();
        if (c.cumple(this))
            resultado.add(this);
        return resultado;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }
    @Override
    public void setIdTracking(int idTracking) {
        super.idTracking= idTracking;
    }

    @Override
    public Envio copiaRestringida(Criterio c) {
        if(c.cumple(this)) {
            return new Paquete(this.idTracking, this.peso, this.ciudad,
                    this.remitente, this.direccionRemitente,
                    this.direccionDestinatario, this.retiradoEnSucursal);
        }
        return null;
    }


    @Override
    public String toString() {
        return "Paquete{" + super.toString() +
                "direccionRemitente='" + direccionRemitente + '\'' +
                ", direccionDestinatario='" + direccionDestinatario + '\'' +
                ", retiradoEnSucursal=" + retiradoEnSucursal +
                ", peso=" + peso +
                ", remitente='" + remitente + '\'' +
                ", destinatario='" + destinatario + '\'' +
                '}';
    }
}