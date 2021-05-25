package ejerciciostp6.Futbol5.ClasesPrincipales;

import ejerciciostp6.Futbol5.ComparadoresDeSocios.ComparadorPorCantidad;
import ejerciciostp6.Futbol5.FiltrosDeSocio.FiltroSocioCancha;

import java.time.LocalDate;

public class MainClub {
    public static void main(String[] args) {
        Club club= new Club("La20");
        Socio s1= new Socio("Federico","Abachian",12,true);
        Socio s2= new Socio("Joaquin","Abachian",15,true);
        Socio s3= new Socio("Jeremias","Verde",18,false);
        LocalDate d1= LocalDate.of(2021,1,6);
        LocalDate d2= LocalDate.of(2021,1,5);
        LocalDate d3= LocalDate.of(2021,10,8);
        Cancha c1= new Cancha(d1,1, 150);
        Cancha c2= new Cancha(d2,5, 200);
        Cancha c3= new Cancha(d3,2, 150);
        s1.agregarAlquiler(c1);
        s1.agregarAlquiler(c1);
        s2.agregarAlquiler(c1);
        s2.agregarAlquiler(c1);
        s2.agregarAlquiler(c1);
        s3.agregarAlquiler(c3);
        club.agregarSocio(s1);
        club.agregarSocio(s2);
        club.agregarSocio(s3);
        ComparadorPorCantidad com= new ComparadorPorCantidad(c1);
        FiltroSocioCancha f= new FiltroSocioCancha(c1);
        club.getSocios(com,f);
        System.out.println( club.getSocios(com,f));

    }
}
