package ejerciciostp3.alarma;

public class Timbre {
    private boolean encendido;
    private boolean apagado;

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isApagado() {
        return apagado;
    }

    public void setApagado(boolean apagado) {
        this.apagado = apagado;
    }
    public Timbre()
    {
        this.apagado=true;
        this.encendido=false;
    }
    public void sonar()
    {
        setEncendido(true);
        setApagado(false);
    }
}
