package ejerciciostp6.Futbol5.ComparadoresDeSocios;

import ejerciciostp6.Futbol5.ClasesPrincipales.Socio;

import java.util.Comparator;

public abstract class ComparadorSocio implements Comparator<Socio> {
    ComparadorSocio sig;

    public ComparadorSocio(ComparadorSocio sig) {
        this.sig = sig;
    }
    public ComparadorSocio()
    {
        this.sig=null;
    }

    public int compare(Socio s1, Socio s2)
    {
        int resultado = this.compararSocios(s1, s2);
        if((resultado==0)&&(sig!=null))
            return sig.compare(s1,s2);
        return resultado;
    }
    public abstract int compararSocios(Socio s1, Socio s2);
}
