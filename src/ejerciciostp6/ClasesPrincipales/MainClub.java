package ejerciciostp6.ClasesPrincipales;

import ejerciciostp6.ComparadoresDeSocios.ComparadorSocioPorApellido;
import ejerciciostp6.FiltrosDeSocio.FiltroSocioPorCuota;
import ejerciciostp6.FiltrosDeSocio.FlitroSocio;

import java.time.LocalDate;
import java.util.Date;

public class MainClub {
    public static void main(String[] args) {
        Club club= new Club("La20");
        Socio s1= new Socio("Federico","Abachian",50,true);
        Socio s2= new Socio("Joaquin","Abachian",22,true);
        Socio s3= new Socio("Jeremias","Verde",80,false);
        LocalDate d1= LocalDate.of(2021,1,6);  ;
        LocalDate d2= LocalDate.of(2021,1,5);
        LocalDate d3= LocalDate.of(2021,10,8);
        Cancha c1= new Cancha(d1,1, 150);
        Cancha c2= new Cancha(d2,5, 200);
        Cancha c3= new Cancha(d3,2, 150);
        s1.agregarAlquiler(c1);
        s2.agregarAlquiler(c2);
        s3.agregarAlquiler(c3);
        club.agregarSocio(s1);
        club.agregarSocio(s2);
        club.agregarSocio(s3);
        ComparadorSocioPorApellido com= new ComparadorSocioPorApellido();
        FiltroSocioPorCuota f= new FiltroSocioPorCuota();
        club.getSocios(com,f);
        System.out.println( club.getSocios(com,f));

    }
}
