package ejerciciostp3.alarmasensorial;

import ejerciciostp3.alarma.Timbre;

import java.util.Vector;

public class AlarmaSensorial {
    private Vector<Sensor> Sensores;
    private Timbre timbre;

    public AlarmaSensorial()
    {
        this.Sensores= new Vector<Sensor>();
        this.timbre= new Timbre();
    }
    public void addSensor(Sensor sensor)
    {
        this.Sensores.add(sensor);
    }
    public void PrenderAlarma()
    {
        for (int i=0; i< Sensores.size(); i++)
        {
            if (Sensores.elementAt(i).isActivado())
                timbre.sonar();
                System.out.println(Sensores.get(i).getZonaControlada());
        }
    }
    public boolean enOrden()
    {
        for (int i=0; i< Sensores.size(); i++) {
            if ( Sensores.elementAt(i).isActivado())
                return false;
        }
        return true;
    }
}
