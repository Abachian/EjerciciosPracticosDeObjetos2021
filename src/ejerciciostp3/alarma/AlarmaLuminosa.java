package ejerciciostp3.alarma;

public class AlarmaLuminosa extends Alarma{
    private Luz luces;
    public AlarmaLuminosa()
    {
        this.luces.setApagada(true);
        this.luces.setPrendida(false);

    }
    public void encender() {
        if (Comprobar() == true) {
            HacerSonar();
            luces.Encender();
        }
    }
}
