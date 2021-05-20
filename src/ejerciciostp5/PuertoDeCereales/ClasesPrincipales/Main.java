package ejerciciostp5.PuertoDeCereales.ClasesPrincipales;

import ejerciciostp5.PuertoDeCereales.Ordenadores.OrdenadorCamion;

import java.util.Date;

public class Main {
    public static void main (String args[])
    {
        Puerto p= new Puerto("PortRoyal");
        Date f1= new Date(1998,1,9);
        Date f2= new Date(1998,12,9);
        Date f3= new Date(1998,5,9);
        Camion c1= new Camion(500,"camion1", f1);
        Camion c2= new Camion(600,"camion2", f2);
        Camion c3= new Camion(800,"camion3", f3);
        Barco b1 = new Barco(320, "barco1");
        Barco b2 = new Barco(500, "barco2");
        Barco b3 = new Barco(400, "barco3");
        OrdenadorCamion ord= new OrdenadorCamion();
        p.setOrdC(ord);
        p.addCamion(c1);
        p.addCamion(c2);
        p.addCamion(c3);
        p.addBarcos(b1);
        p.addBarcos(b2);
        p.addBarcos(b3);
        p.imprimirB(p.ListadoBarco());
    }
}
