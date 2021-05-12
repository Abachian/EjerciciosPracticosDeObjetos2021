package ejerciciostp3.alarma;

public class Luz {
    private boolean prendida;
    private boolean apagada;

    public boolean isPrendida() {
        return prendida;
    }

    public void setPrendida(boolean prendida) {
        this.prendida = prendida;
    }

    public boolean isApagada() {
        return apagada;
    }

    public void setApagada(boolean apagada) {
        this.apagada = apagada;
    }
    public Luz()
    {
        this.apagada=true;
        this.prendida=false;
    }
    public void Encender()
    {
        setPrendida(true);
        setApagada(false);
    }
}
