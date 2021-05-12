package ejerciciostp3.alarma;

public class Alarma {
    private boolean vidrioRoto;
    private boolean puertaAbierta;
    private boolean ventanaAbierta;
    private Timbre alarmasonora;

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
    public Alarma()
    {
        this.vidrioRoto=false;
        this.ventanaAbierta=false;
        this.puertaAbierta=false;
        this.alarmasonora= new Timbre();
    }
    public boolean Comprobar()
    {
        if ((isPuertaAbierta()== true) || (isVentanaAbierta()==true) || (isVidrioRoto()==true))
            return true;
        else
            return false;
    }
    public void HacerSonar()
    {
        if(Comprobar()==true) {
            alarmasonora.sonar();
        }
    }

}
