package ejerciciostp3.alarmasensorial;

public class ejec {
    public static void main (String args[]) {
        AlarmaSensorial casa = new AlarmaSensorial();
        Sensor s1 = new Sensor("cocina");
        Sensor s2 = new Sensor("cuarto");
        Sensor s3 = new Sensor("baño");
        casa.addSensor(s1);
        casa.addSensor(s2);
        casa.addSensor(s3);
        if (casa.enOrden() == true) {
            System.out.println("peligro");
        }
    }
}
