package ejerciciostp3.alarmasensorial;

public class Sensor {
    private String zonaControlada;
    private boolean Activado;
    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean ventanaAbierta;

    public boolean isVidrioRoto() {
        return vidrioRoto;
    }

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isVentanaAbierta() {
        return ventanaAbierta;
    }

    public void setVentanaAbierta(boolean ventanaAbierta) {
        this.ventanaAbierta = ventanaAbierta;
    }

    public String getZonaControlada() {
        return zonaControlada;
    }

    public void setZonaControlada(String zonaControlada) {
        this.zonaControlada = zonaControlada;
    }

    public boolean isActivado() {
        return Activado;
    }

    public void setActivado(boolean activado) {
        Activado = activado;
    }
    public void ActivarSensor() {
        if ((isPuertaAbierta() == true) || (isVentanaAbierta() == true) || (isVidrioRoto() == true))
            setActivado(true);
    }
    public Sensor(String zona)
    {
        this.Activado=false;
        this.zonaControlada=zona;
        this.ventanaAbierta=false;
        this.puertaAbierta=false;
        this.vidrioRoto=false;
    }
}
